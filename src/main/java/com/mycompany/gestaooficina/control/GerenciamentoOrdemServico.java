package com.mycompany.gestaooficina.control;

import com.mycompany.gestaooficina.exception.PecaSemEstoqueException;
import com.mycompany.gestaooficina.model.OrdemServico;
import com.mycompany.gestaooficina.model.Peca;
import com.mycompany.gestaooficina.model.Servico;
import com.mycompany.gestaooficina.model.StatusOrdemServico;
import com.mycompany.gestaooficina.persistence.ArmazenamentoArquivo;
import java.util.LinkedList;
import java.util.List;


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

    private void persistirDados() {
        List<String> linhas = new LinkedList<>();
        for (OrdemServico os : this.ordensServico) {
            linhas.add(os.paraLinha());
        }
        ArmazenamentoArquivo.escreverLinhas(ARQUIVO_DADOS, linhas);
    }

    public OrdemServico buscarOrdemServico(int codigo) {
        for (OrdemServico os : this.ordensServico) {
            if (os.getCodigo() == codigo) {
                return os;
            }
        }
        return null;
    }

    public String visualizarOrdensServico() {
        String conteudo = "";
        for (OrdemServico os : this.ordensServico) {
            conteudo += os.visualizarOrdemServico();
        }
        return conteudo;
    }
    
    public String resumirOs() {
        String resumo = "";
        for (OrdemServico cliente : this.ordensServico) {
            resumo += cliente.getResumo() + "\n"; 
        }
        return resumo;
    }

    public void cadastrarOrdemServico(OrdemServico os) throws PecaSemEstoqueException {
        GerenciamentoPecas.getInstance().validarEstoque(os.getCodigoPeca());
        this.ordensServico.add(os);
        persistirDados();
    }

    public void editarOrdemServico(int codigo, int codigoVeiculo, int codigoCliente,
            int codigoMecanico, int codigoPeca, int codigoServico, StatusOrdemServico status) {
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

    public void alterarStatusOrdemServico(int codigo, StatusOrdemServico novoStatus) {
        for (OrdemServico os : this.ordensServico) {
            if (codigo == os.getCodigo()) {
                os.setStatus(novoStatus);
                persistirDados();
                return;
            }
        }
    }

    public void removerOrdemServico(int codigo) {
        this.ordensServico.removeIf(os -> os.getCodigo() == codigo);
        persistirDados();
    }

    public void removerOrdemServicoPorVeiculo(int codigoVeiculo) {
        this.ordensServico.removeIf(os -> os.getCodigoVeiculo() == codigoVeiculo);
        persistirDados();
    }

    public void removerOrdemServicoPorCliente(int codigoCliente) {
        this.ordensServico.removeIf(os -> os.getCodigoCliente() == codigoCliente);
        persistirDados();
    }
}
