/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestaooficina.control;

import com.mycompany.gestaooficina.model.Servico;
import java.util.LinkedList;

/**
 *
 * @author silvestre
 */
public class GerenciamentoServicos {
    private LinkedList<Servico> servicos;
    public static int CODIGO = 200;
    private static GerenciamentoServicos instance = null;
    
    private GerenciamentoServicos(){
        this.servicos = new LinkedList<Servico>();
    }
    
    public static GerenciamentoServicos getInstance(){
        if(instance == null){
            instance = new GerenciamentoServicos();
        }
        return instance;
    }
    
    //BUSCAR SERVIÇO POR CODIGO
    public Servico buscarServico(int codigo){
        for(Servico servico: this.servicos){
            if(servico.getCodigo() == codigo){
                return servico;
            }
        }
        return null;
    }
    
    //VISUALIZAR TODOS OS SERVIÇOS
    public String visualizarServicos(){
        String conteudo = "";
        for(Servico servico: this.servicos){
            conteudo += servico.visualizarServico();
        }
        return conteudo;
    }
    
    //CADASTRAR UM NOVO SERVIÇO
    public void cadastrarServico(Servico servico){
        this.servicos.add(servico);
    }
    
    //EDITAR UM SERVIÇO
    public void editarServico(int codigo, String nome, String descricao, String tempo, double preco){
        for(Servico servico: this.servicos){
            if(codigo == servico.getCodigo()){
                servico.setNome(nome);
                servico.setDescricao(descricao);
                servico.setTempo(tempo);
                servico.setPreco(preco);
                return;
            }
        }
    }

    //REMOVER UM SERVIÇO
    public void removerServico(int codigo){
        this.servicos.removeIf(servico -> servico.getCodigo() == codigo);
    }
    
}
