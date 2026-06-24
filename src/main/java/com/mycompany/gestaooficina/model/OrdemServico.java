package com.mycompany.gestaooficina.model;

import com.mycompany.gestaooficina.control.GerenciamentoOrdemServico;

public class OrdemServico {
    private int codigo;
    private int codigoVeiculo;
    private int codigoCliente;
    private int codigoMecanico;
    private int codigoPeca;
    private int codigoServico;

    public OrdemServico(int codigoVeiculo, int codigoCliente, int codigoMecanico, int codigoPeca, int codigoServico) {
        this.codigo = GerenciamentoOrdemServico.CODIGO;
        this.codigoVeiculo = codigoVeiculo;
        this.codigoCliente = codigoCliente;
        this.codigoMecanico = codigoMecanico;
        this.codigoPeca = codigoPeca;
        this.codigoServico = codigoServico;
        GerenciamentoOrdemServico.CODIGO++;
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public int getCodigoVeiculo() { return codigoVeiculo; }
    public void setCodigoVeiculo(int codigoVeiculo) { this.codigoVeiculo = codigoVeiculo; }

    public int getCodigoCliente() { return codigoCliente; }
    public void setCodigoCliente(int codigoCliente) { this.codigoCliente = codigoCliente; }

    public int getCodigoMecanico() { return codigoMecanico; }
    public void setCodigoMecanico(int codigoMecanico) { this.codigoMecanico = codigoMecanico; }

    public int getCodigoPeca() { return codigoPeca; }
    public void setCodigoPeca(int codigoPeca) { this.codigoPeca = codigoPeca; }

    public int getCodigoServico() { return codigoServico; }
    public void setCodigoServico(int codigoServico) { this.codigoServico = codigoServico; }

    public String visualizarOrdemServico() {
        return "\n\nCodigo OS: " + this.codigo +
               "\nCod. Veiculo: " + this.codigoVeiculo +
               "\nCod. Cliente: " + this.codigoCliente +
               "\nCod. Mecanico: " + this.codigoMecanico +
               "\nCod. Peca: " + this.codigoPeca +
               "\nCod. Servico: " + this.codigoServico;
    }
}
