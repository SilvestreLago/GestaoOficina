/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestaooficina.model;

import com.mycompany.gestaooficina.control.GerenciamentoClientes;

/**
 *
 * @author silvestre
 */
public class Cliente {
    private int codigo;
    private String nome;
    private String telefone;
    private int cpf;
    private String email;

    public Cliente(String nome, String telefone, int cpf, String email) {
        this.codigo = GerenciamentoClientes.CODIGO;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
        GerenciamentoClientes.CODIGO++;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //FUNÇÃO PARA VISUALIZAR AS INFORMAÇÕES DO CLIENTE
    public String visualizarCliente(){
        String conteudo = "";
        conteudo = 
                "\n\nCodigo: " + this.codigo +
                "\nNome: " + this.nome +
                "\nCPF: " + this.cpf + 
                "\nTelefone: " + this.telefone +
                "\nEmail: " + this.email;
        return conteudo;
    }
    
    
}
