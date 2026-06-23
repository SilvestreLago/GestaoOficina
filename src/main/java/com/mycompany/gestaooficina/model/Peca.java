/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestaooficina.model;

import com.mycompany.gestaooficina.control.GerenciamentoPecas;

/**
 *
 * @author silvestre
 */
public class Peca {
    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public Peca(String nome, double preco, int quantidade) {
        this.codigo = GerenciamentoPecas.CODIGO;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        GerenciamentoPecas.CODIGO++;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    //FUNCAO PARA VISUALIZAR AS INFORMACOES DA PECA
    public String visualizarPeca(){
        String conteudo = "";
        conteudo = 
                "\n\nCodigo: " + this.codigo +
                "\nNome: " + this.nome +
                "\nPreco: " + this.preco +
                "\nQuantidade: " + this.quantidade;
        return conteudo;
    }
}
