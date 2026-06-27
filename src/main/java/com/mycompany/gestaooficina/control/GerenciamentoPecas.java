package com.mycompany.gestaooficina.control;

import com.mycompany.gestaooficina.exception.PecaSemEstoqueException;
import com.mycompany.gestaooficina.model.Peca;
import com.mycompany.gestaooficina.persistence.ArmazenamentoArquivo;
import java.util.LinkedList;
import java.util.List;


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

    private void persistirDados() {
        List<String> linhas = new LinkedList<>();
        for (Peca peca : this.pecas) {
            linhas.add(peca.paraLinha());
        }
        ArmazenamentoArquivo.escreverLinhas(ARQUIVO_DADOS, linhas);
    }

    public Peca buscarPeca(int codigo) {
        for (Peca peca : this.pecas) {
            if (peca.getCodigo() == codigo) {
                return peca;
            }
        }
        return null;
    }
    
    public Peca buscarPeca(String nome) {
        if (nome == null || nome.isBlank()) {
            return null;
        }
        String busca = nome.toLowerCase().trim();
        for (Peca peca : this.pecas) {
            if (peca.getNome().toLowerCase().equals(busca)) {
                return peca;
            }
        }
        return null;
    }


    public void validarEstoque(int codigoPeca) throws PecaSemEstoqueException {
        Peca peca = buscarPeca(codigoPeca);
        if (peca == null || peca.getQuantidade() <= 0) {
            throw new PecaSemEstoqueException(codigoPeca);
        }else{
            peca.setQuantidade(peca.getQuantidade() -1);
        }
    }

    public String visuzalizarPecas() {
        String conteudo = "";
        for (Peca peca : this.pecas) {
            conteudo += peca.visualizarPeca();
        }
        return conteudo;
    }
    
     public String resumirPecas() {
        String resumo = "";
        for (Peca cliente : this.pecas) {
            resumo += cliente.getResumo() + "\n"; 
        }
        return resumo;
    }

    public void cadastrarPeca(Peca peca) {
        this.pecas.add(peca);
        persistirDados();
    }

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

    public void removerPeca(int codigo) {
        this.pecas.removeIf(peca -> peca.getCodigo() == codigo);
        persistirDados();
    }
}
