package com.mycompany.gestaooficina.model;

import com.mycompany.gestaooficina.control.GerenciamentoVeiculos;

public class Veiculo {
    private int codigo;
    private int codigoCliente;
    private String placa;
    private String modelo;
    private String marca;
    private String ano;
    private String quilometragem;

    public Veiculo(int codigoCliente, String placa, String modelo, String marca, String ano, String quilometragem) {
        this.codigo = GerenciamentoVeiculos.CODIGO;
        this.codigoCliente = codigoCliente;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.quilometragem = quilometragem;
        GerenciamentoVeiculos.CODIGO++;
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public int getCodigoCliente() { return codigoCliente; }
    public void setCodigoCliente(int codigoCliente) { this.codigoCliente = codigoCliente; }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getAno() { return ano; }
    public void setAno(String ano) { this.ano = ano; }

    public String getQuilometragem() { return quilometragem; }
    public void setQuilometragem(String quilometragem) { this.quilometragem = quilometragem; }

    public String visualizarVeiculo() {
        return "\n\nCodigo: " + this.codigo +
               "\nCod. Cliente: " + this.codigoCliente +
               "\nPlaca: " + this.placa +
               "\nModelo: " + this.modelo +
               "\nMarca: " + this.marca +
               "\nAno: " + this.ano +
               "\nQuilometragem: " + this.quilometragem;
    }
}
