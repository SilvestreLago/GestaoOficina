package com.mycompany.gestaooficina.model;

import com.mycompany.gestaooficina.control.GerenciamentoFuncionarios;
import com.mycompany.gestaooficina.persistence.ArmazenamentoArquivo;

public class Funcionario extends Pessoa {

    private double salario;
    private TipoFuncionario tipo;

    public Funcionario(String nome, String cpf, double salario, TipoFuncionario tipo) {
        super(nome, cpf);
        this.codigo  = GerenciamentoFuncionarios.CODIGO;
        this.salario = salario;
        this.tipo    = tipo;
        GerenciamentoFuncionarios.CODIGO++;
    }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public TipoFuncionario getTipo() { return tipo; }
    public void setTipo(TipoFuncionario tipo) { this.tipo = tipo; }
    
    public String verResumo() {
        return "Funcionário #" + codigo + " — " + nome
                + " (" + tipo.getDescricao() + ")";
    }
    
    public String visualizarFuncionario() {
        return "\n\nCodigo: "  + this.codigo  +
               "\nNome: "     + this.nome    +
               "\nCPF: "      + this.cpf     +
               "\nSalario: "  + this.salario +
               "\nTipo: "     + this.tipo;
    }


    public String paraLinha() {
        return this.codigo + "|"
                + ArmazenamentoArquivo.escaparCampo(this.nome) + "|"
                + ArmazenamentoArquivo.escaparCampo(this.cpf)  + "|"
                + this.salario + "|"
                + this.tipo.name();
    }

    public static Funcionario apartirDeLinha(String linha) {
        String[] campos = ArmazenamentoArquivo.dividirCampos(linha);
        Funcionario f = new Funcionario(campos[1], campos[2],
                Double.parseDouble(campos[3]), TipoFuncionario.fromString(campos[4]));
        f.setCodigo(Integer.parseInt(campos[0]));
        return f;
    }
}
