package com.mycompany.gestaooficina.model;

import com.mycompany.gestaooficina.control.GerenciamentoVeiculos;
import com.mycompany.gestaooficina.persistence.ArmazenamentoArquivo;

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

    public String getResumo() {
        return "Veiculo #" + codigo + " — " + placa + " (Modelo: " + modelo + ")";
    }
    
    public String visualizarVeiculo() {
        return "\n\nCodigo: " + this.codigo +
               "\nCod. Cliente: " + this.codigoCliente +
               "\nPlaca: " + this.placa +
               "\nModelo: " + this.modelo +
               "\nMarca: " + this.marca +
               "\nAno: " + this.ano +
               "\nQuilometragem: " + this.quilometragem;
    }

    public String paraLinha() {
        return this.codigo + "|"
                + this.codigoCliente + "|"
                + ArmazenamentoArquivo.escaparCampo(this.placa) + "|"
                + ArmazenamentoArquivo.escaparCampo(this.modelo) + "|"
                + ArmazenamentoArquivo.escaparCampo(this.marca) + "|"
                + ArmazenamentoArquivo.escaparCampo(this.ano) + "|"
                + ArmazenamentoArquivo.escaparCampo(this.quilometragem);
    }

    public static Veiculo apartirDeLinha(String linha) {
        String[] campos = ArmazenamentoArquivo.dividirCampos(linha);
        Veiculo veiculo = new Veiculo(Integer.parseInt(campos[1]), campos[2], campos[3], campos[4], campos[5], campos[6]);
        veiculo.setCodigo(Integer.parseInt(campos[0]));
        return veiculo;
    }
}
