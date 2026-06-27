package com.mycompany.gestaooficina.exception;


public class PecaSemEstoqueException extends Exception {

    private final int codigoPeca;

    public PecaSemEstoqueException(int codigoPeca) {
        super("Estoque esgotado para a peça de código " + codigoPeca + ".");
        this.codigoPeca = codigoPeca;
    }

    public PecaSemEstoqueException(int codigoPeca, String mensagem) {
        super(mensagem);
        this.codigoPeca = codigoPeca;
    }

    public int getCodigoPeca() {
        return codigoPeca;
    }
}
