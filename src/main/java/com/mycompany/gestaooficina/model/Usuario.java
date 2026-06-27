package com.mycompany.gestaooficina.model;

import com.mycompany.gestaooficina.persistence.ArmazenamentoArquivo;

/**
 * Representa um usuário do sistema, responsável por acessar a tela de
 * login. A senha nunca é armazenada em texto puro: apenas o seu hash
 * (SHA-256) é persistido em arquivo, gerado pela classe de controle
 * {@code GerenciamentoUsuarios}.
 */
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

    //CONVERTE O USUARIO EM UMA LINHA DE TEXTO PARA GRAVACAO EM ARQUIVO
    public String paraLinha() {
        return ArmazenamentoArquivo.escaparCampo(this.login) + "|" + this.senhaHash;
    }

    //RECONSTROI UM USUARIO A PARTIR DE UMA LINHA LIDA DO ARQUIVO DE DADOS
    public static Usuario apartirDeLinha(String linha) {
        String[] campos = ArmazenamentoArquivo.dividirCampos(linha);
        return new Usuario(campos[0], campos[1]);
    }
}
