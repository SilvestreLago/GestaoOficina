/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestaooficina.model;

import com.mycompany.gestaooficina.control.GerenciamentoServicos;
import com.mycompany.gestaooficina.persistence.ArmazenamentoArquivo;

/**
 *
 * @author silvestre
 */
public class Servico {
    private int codigo;
    private String nome;
    private String descricao;
    private String tempo;
    private double preco;

    public Servico(String nome, String descricao, String tempo, double preco) {
        this.codigo = GerenciamentoServicos.CODIGO;
        this.nome = nome;
        this.descricao = descricao;
        this.tempo = tempo;
        this.preco = preco;
        GerenciamentoServicos.CODIGO++;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public String visualizarServico(){
        String conteudo = "";
        conteudo = 
                "\n\nCodigo: " + this.codigo +
                "\nNome: " + this.nome + 
                "\nDescricao: " + this.descricao + 
                "\nTempo estimado: " + this.tempo +
                "\nPreço: " + this.preco;
        return conteudo;
    }

    //CONVERTE O SERVICO EM UMA LINHA DE TEXTO PARA GRAVACAO EM ARQUIVO
    public String paraLinha() {
        return this.codigo + "|"
                + ArmazenamentoArquivo.escaparCampo(this.nome) + "|"
                + ArmazenamentoArquivo.escaparCampo(this.descricao) + "|"
                + ArmazenamentoArquivo.escaparCampo(this.tempo) + "|"
                + this.preco;
    }

    //RECONSTROI UM SERVICO A PARTIR DE UMA LINHA LIDA DO ARQUIVO DE DADOS
    public static Servico apartirDeLinha(String linha) {
        String[] campos = ArmazenamentoArquivo.dividirCampos(linha);
        Servico servico = new Servico(campos[1], campos[2], campos[3], Double.parseDouble(campos[4]));
        servico.setCodigo(Integer.parseInt(campos[0]));
        return servico;
    }
    
}
