/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestaooficina.model;

import com.mycompany.gestaooficina.control.GerenciamentoPecas;
import com.mycompany.gestaooficina.persistence.ArmazenamentoArquivo;

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
    
    public String getResumo() {
        return "Peca #" + codigo + " — " + nome + " (R$: " + preco + ")";
    }
    
    public String visualizarPeca(){
        String conteudo = "";
        conteudo = 
                "\n\nCodigo: " + this.codigo +
                "\nNome: " + this.nome +
                "\nPreco: " + this.preco +
                "\nQuantidade: " + this.quantidade;
        return conteudo;
    }
    
    public String paraLinha() {
        return this.codigo + "|"
                + ArmazenamentoArquivo.escaparCampo(this.nome) + "|"
                + this.preco + "|"
                + this.quantidade;
    }

    public static Peca apartirDeLinha(String linha) {
        String[] campos = ArmazenamentoArquivo.dividirCampos(linha);
        Peca peca = new Peca(campos[1], Double.parseDouble(campos[2]), Integer.parseInt(campos[3]));
        peca.setCodigo(Integer.parseInt(campos[0]));
        return peca;
    }
}
