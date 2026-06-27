package com.mycompany.gestaooficina.control;

import com.mycompany.gestaooficina.model.Cliente;
import com.mycompany.gestaooficina.model.Veiculo;
import com.mycompany.gestaooficina.persistence.ArmazenamentoArquivo;
import java.util.LinkedList;
import java.util.List;

/**
 * Classe de controle responsável por todas as operações sobre clientes,
 * incluindo a leitura e a gravação automática dos dados no arquivo
 * {@value #ARQUIVO_DADOS}.
 */
public class GerenciamentoClientes {

    private static final String ARQUIVO_DADOS = "clientes.txt";
    private static final int CODIGO_INICIAL = 200;

    private final LinkedList<Cliente> clientes;
    public static int CODIGO = CODIGO_INICIAL;
    private static GerenciamentoClientes instance = null;

    private GerenciamentoClientes() {
        this.clientes = new LinkedList<>();
        carregarDados();
    }

    public static GerenciamentoClientes getInstance() {
        if (instance == null) {
            instance = new GerenciamentoClientes();
        }
        return instance;
    }

    //CARREGA OS CLIENTES PERSISTIDOS NO ARQUIVO DE DADOS
    private void carregarDados() {
        List<String> linhas = ArmazenamentoArquivo.lerLinhas(ARQUIVO_DADOS);
        int maiorCodigo = CODIGO_INICIAL - 1;
        for (String linha : linhas) {
            try {
                Cliente cliente = Cliente.apartirDeLinha(linha);
                this.clientes.add(cliente);
                maiorCodigo = Math.max(maiorCodigo, cliente.getCodigo());
            } catch (RuntimeException e) {
                // Linha inválida ou corrompida é ignorada para não impedir a inicialização do sistema.
            }
        }
        CODIGO = maiorCodigo + 1;
    }

    //GRAVA TODOS OS CLIENTES ATUAIS NO ARQUIVO DE DADOS
    private void persistirDados() {
        List<String> linhas = new LinkedList<>();
        for (Cliente cliente : this.clientes) {
            linhas.add(cliente.paraLinha());
        }
        ArmazenamentoArquivo.escreverLinhas(ARQUIVO_DADOS, linhas);
    }

    //BUSCAR CLIENTE POR CODIGO
    public Cliente buscarCliente(int codigo) {
        for (Cliente cliente : this.clientes) {
            if (cliente.getCodigo() == codigo) {
                return cliente;
            }
        }
        return null;
    }

    //VISUALIZAR TODOS OS CLIENTES
    public String visualizarClientes() {
        String conteudo = "";
        for (Cliente cliente : this.clientes) {
            conteudo += cliente.visualizarCliente();
        }
        return conteudo;
    }

    //CADASTRAR UM NOVO CLIENTE
    public void cadastrarCliente(Cliente cliente) {
        this.clientes.add(cliente);
        persistirDados();
    }

    //EDITAR UM CLIENTE
    public void editarCliente(int codigo, String nome, String cpf, String telefone, String email) {
        for (Cliente cliente : this.clientes) {
            if (codigo == cliente.getCodigo()) {
                cliente.setNome(nome);
                cliente.setCpf(cpf);
                cliente.setTelefone(telefone);
                cliente.setEmail(email);
                persistirDados();
                return;
            }
        }
    }

    //REMOVER UM CLIENTE (E EM CASCATA OS VEICULOS E ORDENS DE SERVICO ATRELADOS A ELE)
    public void removerCliente(int codigo) {
        //REMOVE EM CASCATA TODOS OS VEICULOS DO CLIENTE (que por sua vez removem as OS atreladas a eles)
        GerenciamentoVeiculos genVeiculos = GerenciamentoVeiculos.getInstance();
        List<Veiculo> veiculosDoCliente = genVeiculos.buscarVeiculosPorCliente(codigo);
        for (Veiculo veiculo : veiculosDoCliente) {
            genVeiculos.removerVeiculo(veiculo.getCodigo());
        }
        //GARANTE QUE NAO RESTEM ORDENS DE SERVICO LIGADAS DIRETAMENTE AO CLIENTE
        GerenciamentoOrdemServico.getInstance().removerOrdemServicoPorCliente(codigo);

        this.clientes.removeIf(cliente -> cliente.getCodigo() == codigo);
        persistirDados();
    }

}
