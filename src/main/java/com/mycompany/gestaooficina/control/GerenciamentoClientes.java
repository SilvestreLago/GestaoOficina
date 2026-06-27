package com.mycompany.gestaooficina.control;

import com.mycompany.gestaooficina.model.Cliente;
import com.mycompany.gestaooficina.model.Veiculo;
import com.mycompany.gestaooficina.persistence.ArmazenamentoArquivo;
import java.util.LinkedList;
import java.util.List;

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

    private void carregarDados() {
        List<String> linhas = ArmazenamentoArquivo.lerLinhas(ARQUIVO_DADOS);
        int maiorCodigo = CODIGO_INICIAL - 1;
        for (String linha : linhas) {
            try {
                Cliente cliente = Cliente.apartirDeLinha(linha);
                this.clientes.add(cliente);
                maiorCodigo = Math.max(maiorCodigo, cliente.getCodigo());
            } catch (RuntimeException e) {
                // Linha inválida ou corrompida é ignorada.
            }
        }
        CODIGO = maiorCodigo + 1;
    }

    private void persistirDados() {
        List<String> linhas = new LinkedList<>();
        for (Cliente cliente : this.clientes) {
            linhas.add(cliente.paraLinha());
        }
        ArmazenamentoArquivo.escreverLinhas(ARQUIVO_DADOS, linhas);
    }


    public Cliente buscarCliente(int codigo) {
        for (Cliente cliente : this.clientes) {
            if (cliente.getCodigo() == codigo) {
                return cliente;
            }
        }
        return null;
    }

    public Cliente buscarCliente(String nome) {
        if (nome == null || nome.isBlank()) {
            return null;
        }
        String busca = nome.toLowerCase().trim();
        for (Cliente cliente : this.clientes) {
            if (cliente.getNome().toLowerCase().equals(busca)) {
                return cliente;
            }
        }
        return null;
    }

    public String visualizarClientes() {
        String conteudo = "";
        for (Cliente cliente : this.clientes) {
            conteudo += cliente.visualizarCliente();
        }
        return conteudo;
    }
    
    public String resumirClientes() {
        String resumo = "";
        for (Cliente cliente : this.clientes) {
            resumo += cliente.getResumo() + "\n"; 
        }
        return resumo;
    }

    public void cadastrarCliente(Cliente cliente) {
        this.clientes.add(cliente);
        persistirDados();
    }

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

    public void removerCliente(int codigo) {
        GerenciamentoVeiculos genVeiculos = GerenciamentoVeiculos.getInstance();
        List<Veiculo> veiculosDoCliente = genVeiculos.buscarVeiculosPorCliente(codigo);
        for (Veiculo veiculo : veiculosDoCliente) {
            genVeiculos.removerVeiculo(veiculo.getCodigo());
        }
        GerenciamentoOrdemServico.getInstance().removerOrdemServicoPorCliente(codigo);
        this.clientes.removeIf(cliente -> cliente.getCodigo() == codigo);
        persistirDados();
    }
}
