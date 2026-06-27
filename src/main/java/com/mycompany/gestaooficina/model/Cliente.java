package com.mycompany.gestaooficina.model;

import com.mycompany.gestaooficina.control.GerenciamentoClientes;
import com.mycompany.gestaooficina.persistence.ArmazenamentoArquivo;


public class Cliente extends Pessoa {

    private String telefone;
    private String email;

    public Cliente(String nome, String telefone, String cpf, String email) {
        super(nome, cpf);
        this.codigo    = GerenciamentoClientes.CODIGO;
        this.telefone  = telefone;
        this.email     = email;
        GerenciamentoClientes.CODIGO++;
    }

    public Cliente(String nome, String cpf) {
        this(nome, "", cpf, "");
    }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getResumo() {
        return "Cliente #" + codigo + " — " + nome + " (CPF: " + cpf + ")";
    }

    public String visualizarCliente() {
        return "\n\nCodigo: "   + this.codigo    +
               "\nNome: "      + this.nome      +
               "\nCPF: "       + this.cpf       +
               "\nTelefone: "  + this.telefone  +
               "\nEmail: "     + this.email;
    }

    public String paraLinha() {
        return this.codigo + "|"
                + ArmazenamentoArquivo.escaparCampo(this.nome)     + "|"
                + ArmazenamentoArquivo.escaparCampo(this.telefone) + "|"
                + ArmazenamentoArquivo.escaparCampo(this.cpf)      + "|"
                + ArmazenamentoArquivo.escaparCampo(this.email);
    }

    public static Cliente apartirDeLinha(String linha) {
        String[] campos = ArmazenamentoArquivo.dividirCampos(linha);
        Cliente cliente = new Cliente(campos[1], campos[2], campos[3], campos[4]);
        cliente.setCodigo(Integer.parseInt(campos[0]));
        return cliente;
    }
}
