package com.mycompany.gestaooficina.control;

import com.mycompany.gestaooficina.model.Servico;
import com.mycompany.gestaooficina.persistence.ArmazenamentoArquivo;
import java.util.LinkedList;
import java.util.List;

/**
 * Classe de controle responsável por todas as operações sobre serviços,
 * incluindo a leitura e a gravação automática dos dados no arquivo
 * {@value #ARQUIVO_DADOS}.
 */
public class GerenciamentoServicos {

    private static final String ARQUIVO_DADOS = "servicos.txt";
    private static final int CODIGO_INICIAL = 200;

    private final LinkedList<Servico> servicos;
    public static int CODIGO = CODIGO_INICIAL;
    private static GerenciamentoServicos instance = null;

    private GerenciamentoServicos() {
        this.servicos = new LinkedList<>();
        carregarDados();
    }

    public static GerenciamentoServicos getInstance() {
        if (instance == null) {
            instance = new GerenciamentoServicos();
        }
        return instance;
    }

    //CARREGA OS SERVICOS PERSISTIDOS NO ARQUIVO DE DADOS
    private void carregarDados() {
        List<String> linhas = ArmazenamentoArquivo.lerLinhas(ARQUIVO_DADOS);
        int maiorCodigo = CODIGO_INICIAL - 1;
        for (String linha : linhas) {
            try {
                Servico servico = Servico.apartirDeLinha(linha);
                this.servicos.add(servico);
                maiorCodigo = Math.max(maiorCodigo, servico.getCodigo());
            } catch (RuntimeException e) {
                // Linha inválida ou corrompida é ignorada.
            }
        }
        CODIGO = maiorCodigo + 1;
    }

    //GRAVA TODOS OS SERVICOS ATUAIS NO ARQUIVO DE DADOS
    private void persistirDados() {
        List<String> linhas = new LinkedList<>();
        for (Servico servico : this.servicos) {
            linhas.add(servico.paraLinha());
        }
        ArmazenamentoArquivo.escreverLinhas(ARQUIVO_DADOS, linhas);
    }

    //BUSCAR SERVIÇO POR CODIGO
    public Servico buscarServico(int codigo) {
        for (Servico servico : this.servicos) {
            if (servico.getCodigo() == codigo) {
                return servico;
            }
        }
        return null;
    }

    //VISUALIZAR TODOS OS SERVIÇOS
    public String visualizarServicos() {
        String conteudo = "";
        for (Servico servico : this.servicos) {
            conteudo += servico.visualizarServico();
        }
        return conteudo;
    }

    //CADASTRAR UM NOVO SERVIÇO
    public void cadastrarServico(Servico servico) {
        this.servicos.add(servico);
        persistirDados();
    }

    //EDITAR UM SERVIÇO
    public void editarServico(int codigo, String nome, String descricao, String tempo, double preco) {
        for (Servico servico : this.servicos) {
            if (codigo == servico.getCodigo()) {
                servico.setNome(nome);
                servico.setDescricao(descricao);
                servico.setTempo(tempo);
                servico.setPreco(preco);
                persistirDados();
                return;
            }
        }
    }

    //REMOVER UM SERVIÇO
    public void removerServico(int codigo) {
        this.servicos.removeIf(servico -> servico.getCodigo() == codigo);
        persistirDados();
    }

}
