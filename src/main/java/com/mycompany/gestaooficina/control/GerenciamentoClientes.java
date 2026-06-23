/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestaooficina.control;

import com.mycompany.gestaooficina.model.Cliente;
import java.util.LinkedList;

/**
 *
 * @author silvestre
 */
public class GerenciamentoClientes {
    private LinkedList<Cliente> clientes;
    public static int CODIGO = 200;
    private static GerenciamentoClientes instance = null;
    
    private GerenciamentoClientes(){
        this.clientes = new LinkedList<Cliente>();
    }
    
    public static GerenciamentoClientes getInstance(){
        if (instance == null){
            instance = new GerenciamentoClientes();
        }
        return instance;
    }
    
    //BUSCAR CLIENTE POR CODIGO
    public Cliente buscarCliente(int codigo){
        for(Cliente cliente: this.clientes){
            if(cliente.getCodigo() == codigo){
                return cliente;
            }
        }
        return null;
    }
    
    //VISUALIZAR TODOS OS CLIENTES
    public String visualizarClientes(){
        String conteudo = "";
        for(Cliente cliente: this.clientes){
            conteudo += cliente.visualizarCliente();
        }
        return conteudo;
    }
    
    //CADASTRAR UM NOVO CLIENTE
    public void cadastrarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }
    
    //EDITAR UM CLIENTE
    public void editarCliente(int codigo, String nome, String cpf, String telefone, String email){
        for(Cliente cliente: this.clientes){
            if(codigo == cliente.getCodigo()){
                cliente.setNome(nome);
                cliente.setCpf(cpf);
                cliente.setTelefone(telefone);
                cliente.setEmail(email);
                return;
            }
        }
    }
    
}
