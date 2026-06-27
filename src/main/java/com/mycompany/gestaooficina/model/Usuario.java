package com.mycompany.gestaooficina.model;

import com.mycompany.gestaooficina.persistence.ArmazenamentoArquivo;


public class Usuario {

    private String login;
    private String senhaHash;

    public Usuario(String login, String senhaHash) {
        this.login = login;
        this.senhaHash = senhaHash;
    }

    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    public String getSenhaHash() { return senhaHash; }
    public void setSenhaHash(String senhaHash) { this.senhaHash = senhaHash; }

    public String paraLinha() {
        return ArmazenamentoArquivo.escaparCampo(this.login) + "|" + this.senhaHash;
    }

    public static Usuario apartirDeLinha(String linha) {
        String[] campos = ArmazenamentoArquivo.dividirCampos(linha);
        return new Usuario(campos[0], campos[1]);
    }
}
