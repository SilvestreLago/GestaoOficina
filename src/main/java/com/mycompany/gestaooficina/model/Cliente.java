/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestaooficina.model;

import com.mycompany.gestaooficina.control.GerenciamentoClientes;
import com.mycompany.gestaooficina.persistence.ArmazenamentoArquivo;

/**
 *
 * @author silvestre
 */
public class Cliente {
    private int codigo;
    private String nome;
    private String telefone;
    private String cpf;
    private String email;

    public Cliente(String nome, String telefone, String cpf, String email) {
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
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

    //CONVERTE O CLIENTE EM UMA LINHA DE TEXTO PARA GRAVACAO EM ARQUIVO
    public String paraLinha() {
        return this.codigo + "|"
                + ArmazenamentoArquivo.escaparCampo(this.nome) + "|"
                + ArmazenamentoArquivo.escaparCampo(this.telefone) + "|"
                + ArmazenamentoArquivo.escaparCampo(this.cpf) + "|"
                + ArmazenamentoArquivo.escaparCampo(this.email);
    }

    //RECONSTROI UM CLIENTE A PARTIR DE UMA LINHA LIDA DO ARQUIVO DE DADOS
    public static Cliente apartirDeLinha(String linha) {
        String[] campos = ArmazenamentoArquivo.dividirCampos(linha);
        Cliente cliente = new Cliente(campos[1], campos[2], campos[3], campos[4]);
        cliente.setCodigo(Integer.parseInt(campos[0]));
        return cliente;
    }
    
    
}
