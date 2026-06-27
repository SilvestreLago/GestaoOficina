package com.mycompany.gestaooficina.exception;

public class CredenciaisInvalidasException extends Exception {

    public CredenciaisInvalidasException() {
        super("Usuario ou senha incorretos.");
    }

}
