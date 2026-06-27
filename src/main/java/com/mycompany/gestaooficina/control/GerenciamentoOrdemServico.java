package com.mycompany.gestaooficina.control;

import com.mycompany.gestaooficina.model.OrdemServico;
import com.mycompany.gestaooficina.model.Peca;
import com.mycompany.gestaooficina.model.Servico;
import com.mycompany.gestaooficina.model.StatusOrdemServico;
import com.mycompany.gestaooficina.persistence.ArmazenamentoArquivo;
import java.util.LinkedList;
import java.util.List;

/**
 * Classe de controle responsável por todas as operações sobre ordens de
 * serviço, incluindo a leitura e a gravação automática dos dados no
 * arquivo {@value #ARQUIVO_DADOS}.
 */
public class GerenciamentoOrdemServico {

    private static final String ARQUIVO_DADOS = "ordens_servico.txt";
    private static final int CODIGO_INICIAL = 200;

    private final LinkedList<OrdemServico> ordensServico;
    public static int CODIGO = CODIGO_INICIAL;
    private static GerenciamentoOrdemServico instance = null;

    private GerenciamentoOrdemServico() {
        this.ordensServico = new LinkedList<>();
        carregarDados();
    }

    public static GerenciamentoOrdemServico getInstance() {
        if (instance == null) {
            instance = new GerenciamentoOrdemServico();
        }
        return instance;
    }

    //CARREGA AS ORDENS DE SERVICO PERSISTIDAS NO ARQUIVO DE DADOS
    private void carregarDados() {
        List<String> linhas = ArmazenamentoArquivo.lerLinhas(ARQUIVO_DADOS);
        int maiorCodigo = CODIGO_INICIAL - 1;
        for (String linha : linhas) {
            try {
                OrdemServico os = OrdemServico.apartirDeLinha(linha);
                this.ordensServico.add(os);
                maiorCodigo = Math.max(maiorCodigo, os.getCodigo());
            } catch (RuntimeException e) {
                // Linha inválida ou corrompida é ignorada.
            }
        }
        CODIGO = maiorCodigo + 1;
    }

    //GRAVA TODAS AS ORDENS DE SERVICO ATUAIS NO ARQUIVO DE DADOS
    private void persistirDados() {
        List<String> linhas = new LinkedList<>();
        for (OrdemServico os : this.ordensServico) {
            linhas.add(os.paraLinha());
        }
        ArmazenamentoArquivo.escreverLinhas(ARQUIVO_DADOS, linhas);
    }

    //BUSCAR ORDEM DE SERVICO POR CODIGO
    public OrdemServico buscarOrdemServico(int codigo) {
        for (OrdemServico os : this.ordensServico) {
            if (os.getCodigo() == codigo) {
                return os;
            }
        }
        return null;
    }

    //VISUALIZAR TODAS AS ORDENS DE SERVICO
    public String visualizarOrdensServico() {
        String conteudo = "";
        for (OrdemServico os : this.ordensServico) {
            conteudo += os.visualizarOrdemServico();
        }
        return conteudo;
    }

    //CADASTRAR UMA NOVA ORDEM DE SERVICO
    public void cadastrarOrdemServico(OrdemServico os) {
        this.ordensServico.add(os);
        persistirDados();
    }

    //EDITAR UMA ORDEM DE SERVICO
    public void editarOrdemServico(int codigo, int codigoVeiculo, int codigoCliente, int codigoMecanico, int codigoPeca, int codigoServico, StatusOrdemServico status) {
        for (OrdemServico os : this.ordensServico) {
            if (codigo == os.getCodigo()) {
                os.setCodigoVeiculo(codigoVeiculo);
                os.setCodigoCliente(codigoCliente);
                os.setCodigoMecanico(codigoMecanico);
                os.setCodigoPeca(codigoPeca);
                os.setCodigoServico(codigoServico);
                os.setStatus(status);
                persistirDados();
                return;
            }
        }
    }

    //ALTERAR APENAS O STATUS DE UMA ORDEM DE SERVICO (ex.: avançar o atendimento)
    public void alterarStatusOrdemServico(int codigo, StatusOrdemServico novoStatus) {
        for (OrdemServico os : this.ordensServico) {
            if (codigo == os.getCodigo()) {
                os.setStatus(novoStatus);
                persistirDados();
                return;
            }
        }
    }

    //CALCULA O VALOR TOTAL DE UMA ORDEM DE SERVICO SOMANDO A PECA E O SERVICO VINCULADOS
    public double calcularValorTotal(OrdemServico os) {
        double total = 0.0;
        if (os == null) {
            return total;
        }
        Peca peca = GerenciamentoPecas.getInstance().buscarPeca(os.getCodigoPeca());
        if (peca != null) {
            total += peca.getPreco();
        }
        Servico servico = GerenciamentoServicos.getInstance().buscarServico(os.getCodigoServico());
        if (servico != null) {
            total += servico.getPreco();
        }
        return total;
    }

    //REMOVER UMA ORDEM DE SERVICO
    public void removerOrdemServico(int codigo) {
        this.ordensServico.removeIf(os -> os.getCodigo() == codigo);
        persistirDados();
    }

    //REMOVER EM CASCATA TODAS AS ORDENS DE SERVICO DE UM VEICULO (usado quando o veiculo e removido)
    public void removerOrdemServicoPorVeiculo(int codigoVeiculo) {
        this.ordensServico.removeIf(os -> os.getCodigoVeiculo() == codigoVeiculo);
        persistirDados();
    }

    //REMOVER EM CASCATA TODAS AS ORDENS DE SERVICO DE UM CLIENTE (usado quando o cliente e removido)
    public void removerOrdemServicoPorCliente(int codigoCliente) {
        this.ordensServico.removeIf(os -> os.getCodigoCliente() == codigoCliente);
        persistirDados();
    }
}
