package com.mycompany.gestaooficina.model;

import com.mycompany.gestaooficina.control.GerenciamentoFuncionarios;

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
}
