package com.mycompany.gestaooficina.model;

import com.mycompany.gestaooficina.control.GerenciamentoFuncionarios;
import com.mycompany.gestaooficina.persistence.ArmazenamentoArquivo;

public class Funcionario {
    private int codigo;
    private String nome;
    private String cpf;
    private double salario;
    private TipoFuncionario tipo;

    public Funcionario(String nome, String cpf, double salario, TipoFuncionario tipo) {
        this.codigo = GerenciamentoFuncionarios.CODIGO;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.tipo = tipo;
        GerenciamentoFuncionarios.CODIGO++;
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public TipoFuncionario getTipo() { return tipo; }
    public void setTipo(TipoFuncionario tipo) { this.tipo = tipo; }

    public String visualizarFuncionario() {
        return "\n\nCodigo: " + this.codigo +
               "\nNome: " + this.nome +
               "\nCPF: " + this.cpf +
               "\nSalario: " + this.salario +
               "\nTipo: " + this.tipo;
    }

    //CONVERTE O FUNCIONARIO EM UMA LINHA DE TEXTO PARA GRAVACAO EM ARQUIVO
    public String paraLinha() {
        return this.codigo + "|"
                + ArmazenamentoArquivo.escaparCampo(this.nome) + "|"
                + ArmazenamentoArquivo.escaparCampo(this.cpf) + "|"
                + this.salario + "|"
                + this.tipo.name();
    }

    //RECONSTROI UM FUNCIONARIO A PARTIR DE UMA LINHA LIDA DO ARQUIVO DE DADOS
    public static Funcionario apartirDeLinha(String linha) {
        String[] campos = ArmazenamentoArquivo.dividirCampos(linha);
        Funcionario funcionario = new Funcionario(campos[1], campos[2],
                Double.parseDouble(campos[3]), TipoFuncionario.fromString(campos[4]));
        funcionario.setCodigo(Integer.parseInt(campos[0]));
        return funcionario;
    }
}
