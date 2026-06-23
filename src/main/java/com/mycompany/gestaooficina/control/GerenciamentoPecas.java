/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestaooficina.control;

import com.mycompany.gestaooficina.model.Cliente;
import com.mycompany.gestaooficina.model.Peca;
import java.util.LinkedList;

/**
 *
 * @author silvestre
 */
public class GerenciamentoPecas {
    private LinkedList<Peca> pecas;
    public static int CODIGO = 200;
    private static GerenciamentoPecas instance = null;
    
    private GerenciamentoPecas(){
        this.pecas = new LinkedList<Peca>();
    }
    
    public static GerenciamentoPecas getInstance(){
        if(instance == null){
            instance = new GerenciamentoPecas();
        }
        return instance;
    }
    
    //BUSCAR CLIENTE POR PECA
    public Peca buscarPeca(int codigo){
        for(Peca peca: this.pecas){
            if(peca.getCodigo() == codigo){
                return peca;
            }
        }
        return null;
    }
    
    //VISUALIZAR TODAS AS PECAS
    public String visuzalizarPecas(){
        String conteudo = "";
        for (Peca peca: this.pecas){
            conteudo += peca.visualizarPeca();
        }
        return conteudo;
    }
    
    //CADASTRAR UMA NOVA PECA
    public void cadastrarPeca(Peca peca){
        this.pecas.add(peca);
    }
    
    //EDITAR UMA PECA
    public void editarPeca(int codigo, String nome, double preco, int quantidade){
        System.out.println("G = " + codigo);
        for (Peca peca: this.pecas){
            if(codigo == peca.getCodigo()){
                peca.setNome(nome);
                peca.setPreco(preco);
                peca.setQuantidade(quantidade);
                return;
            }
        }
    }
}
