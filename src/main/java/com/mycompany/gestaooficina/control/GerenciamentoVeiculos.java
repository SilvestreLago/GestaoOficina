package com.mycompany.gestaooficina.control;

import com.mycompany.gestaooficina.model.Veiculo;
import com.mycompany.gestaooficina.persistence.ArmazenamentoArquivo;
import java.util.LinkedList;
import java.util.List;

/**
 * Classe de controle responsável por todas as operações sobre veículos,
 * incluindo a leitura e a gravação automática dos dados no arquivo
 * {@value #ARQUIVO_DADOS}.
 */
public class GerenciamentoVeiculos {

    private static final String ARQUIVO_DADOS = "veiculos.txt";
    private static final int CODIGO_INICIAL = 200;

    private final LinkedList<Veiculo> veiculos;
    public static int CODIGO = CODIGO_INICIAL;
    private static GerenciamentoVeiculos instance = null;

    private GerenciamentoVeiculos() {
        this.veiculos = new LinkedList<>();
        carregarDados();
    }

    public static GerenciamentoVeiculos getInstance() {
        if (instance == null) {
            instance = new GerenciamentoVeiculos();
        }
        return instance;
    }

    //CARREGA OS VEICULOS PERSISTIDOS NO ARQUIVO DE DADOS
    private void carregarDados() {
        List<String> linhas = ArmazenamentoArquivo.lerLinhas(ARQUIVO_DADOS);
        int maiorCodigo = CODIGO_INICIAL - 1;
        for (String linha : linhas) {
            try {
                Veiculo veiculo = Veiculo.apartirDeLinha(linha);
                this.veiculos.add(veiculo);
                maiorCodigo = Math.max(maiorCodigo, veiculo.getCodigo());
            } catch (RuntimeException e) {
                // Linha inválida ou corrompida é ignorada.
            }
        }
        CODIGO = maiorCodigo + 1;
    }

    //GRAVA TODOS OS VEICULOS ATUAIS NO ARQUIVO DE DADOS
    private void persistirDados() {
        List<String> linhas = new LinkedList<>();
        for (Veiculo veiculo : this.veiculos) {
            linhas.add(veiculo.paraLinha());
        }
        ArmazenamentoArquivo.escreverLinhas(ARQUIVO_DADOS, linhas);
    }

    //BUSCAR VEICULO POR CODIGO
    public Veiculo buscarVeiculo(int codigo) {
        for (Veiculo veiculo : this.veiculos) {
            if (veiculo.getCodigo() == codigo) {
                return veiculo;
            }
        }
        return null;
    }

    //BUSCAR TODOS OS VEICULOS DE UM CLIENTE
    public List<Veiculo> buscarVeiculosPorCliente(int codigoCliente) {
        List<Veiculo> resultado = new LinkedList<>();
        for (Veiculo veiculo : this.veiculos) {
            if (veiculo.getCodigoCliente() == codigoCliente) {
                resultado.add(veiculo);
            }
        }
        return resultado;
    }

    //VISUALIZAR TODOS OS VEICULOS
    public String visualizarVeiculos() {
        String conteudo = "";
        for (Veiculo veiculo : this.veiculos) {
            conteudo += veiculo.visualizarVeiculo();
        }
        return conteudo;
    }

    //CADASTRAR UM NOVO VEICULO
    public void cadastrarVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
        persistirDados();
    }

    //EDITAR UM VEICULO
    public void editarVeiculo(int codigo, int codigoCliente, String placa, String modelo, String marca, String ano, String quilometragem) {
        for (Veiculo veiculo : this.veiculos) {
            if (codigo == veiculo.getCodigo()) {
                veiculo.setCodigoCliente(codigoCliente);
                veiculo.setPlaca(placa);
                veiculo.setModelo(modelo);
                veiculo.setMarca(marca);
                veiculo.setAno(ano);
                veiculo.setQuilometragem(quilometragem);
                persistirDados();
                return;
            }
        }
    }

    //REMOVER UM VEICULO (E EM CASCATA AS ORDENS DE SERVICO ATRELADAS A ELE)
    public void removerVeiculo(int codigo) {
        this.veiculos.removeIf(v -> v.getCodigo() == codigo);
        GerenciamentoOrdemServico.getInstance().removerOrdemServicoPorVeiculo(codigo);
        persistirDados();
    }
}
