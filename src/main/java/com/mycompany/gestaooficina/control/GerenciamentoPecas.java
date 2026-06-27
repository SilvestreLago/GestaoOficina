package com.mycompany.gestaooficina.control;

import com.mycompany.gestaooficina.model.Peca;
import com.mycompany.gestaooficina.persistence.ArmazenamentoArquivo;
import java.util.LinkedList;
import java.util.List;

/**
 * Classe de controle responsável por todas as operações sobre peças,
 * incluindo a leitura e a gravação automática dos dados no arquivo
 * {@value #ARQUIVO_DADOS}.
 */
public class GerenciamentoPecas {

    private static final String ARQUIVO_DADOS = "pecas.txt";
    private static final int CODIGO_INICIAL = 200;

    private final LinkedList<Peca> pecas;
    public static int CODIGO = CODIGO_INICIAL;
    private static GerenciamentoPecas instance = null;

    private GerenciamentoPecas() {
        this.pecas = new LinkedList<>();
        carregarDados();
    }

    public static GerenciamentoPecas getInstance() {
        if (instance == null) {
            instance = new GerenciamentoPecas();
        }
        return instance;
    }

    //CARREGA AS PECAS PERSISTIDAS NO ARQUIVO DE DADOS
    private void carregarDados() {
        List<String> linhas = ArmazenamentoArquivo.lerLinhas(ARQUIVO_DADOS);
        int maiorCodigo = CODIGO_INICIAL - 1;
        for (String linha : linhas) {
            try {
                Peca peca = Peca.apartirDeLinha(linha);
                this.pecas.add(peca);
                maiorCodigo = Math.max(maiorCodigo, peca.getCodigo());
            } catch (RuntimeException e) {
                // Linha inválida ou corrompida é ignorada.
            }
        }
        CODIGO = maiorCodigo + 1;
    }

    //GRAVA TODAS AS PECAS ATUAIS NO ARQUIVO DE DADOS
    private void persistirDados() {
        List<String> linhas = new LinkedList<>();
        for (Peca peca : this.pecas) {
            linhas.add(peca.paraLinha());
        }
        ArmazenamentoArquivo.escreverLinhas(ARQUIVO_DADOS, linhas);
    }

    //BUSCAR PECA POR CODIGO
    public Peca buscarPeca(int codigo) {
        for (Peca peca : this.pecas) {
            if (peca.getCodigo() == codigo) {
                return peca;
            }
        }
        return null;
    }

    //VISUALIZAR TODAS AS PECAS
    public String visuzalizarPecas() {
        String conteudo = "";
        for (Peca peca : this.pecas) {
            conteudo += peca.visualizarPeca();
        }
        return conteudo;
    }

    //CADASTRAR UMA NOVA PECA
    public void cadastrarPeca(Peca peca) {
        this.pecas.add(peca);
        persistirDados();
    }

    //EDITAR UMA PECA
    public void editarPeca(int codigo, String nome, double preco, int quantidade) {
        for (Peca peca : this.pecas) {
            if (codigo == peca.getCodigo()) {
                peca.setNome(nome);
                peca.setPreco(preco);
                peca.setQuantidade(quantidade);
                persistirDados();
                return;
            }
        }
    }

    //REMOVER UMA PECA
    public void removerPeca(int codigo) {
        this.pecas.removeIf(peca -> peca.getCodigo() == codigo);
        persistirDados();
    }

}
