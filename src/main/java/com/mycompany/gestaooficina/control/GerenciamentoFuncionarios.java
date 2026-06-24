package com.mycompany.gestaooficina.control;

import com.mycompany.gestaooficina.model.Funcionario;
import com.mycompany.gestaooficina.model.TipoFuncionario;
import java.util.LinkedList;

public class GerenciamentoFuncionarios {
    private LinkedList<Funcionario> funcionarios;
    public static int CODIGO = 200;
    private static GerenciamentoFuncionarios instance = null;

    private GerenciamentoFuncionarios() {
        this.funcionarios = new LinkedList<Funcionario>();
    }

    public static GerenciamentoFuncionarios getInstance() {
        if (instance == null) {
            instance = new GerenciamentoFuncionarios();
        }
        return instance;
    }

    //BUSCAR FUNCIONARIO POR CODIGO
    public Funcionario buscarFuncionario(int codigo) {
        for (Funcionario func : this.funcionarios) {
            if (func.getCodigo() == codigo) {
                return func;
            }
        }
        return null;
    }

    //VISUALIZAR TODOS OS FUNCIONARIOS
    public String visualizarFuncionarios() {
        String conteudo = "";
        for (Funcionario func : this.funcionarios) {
            conteudo += func.visualizarFuncionario();
        }
        return conteudo;
    }

    //CADASTRAR UM NOVO FUNCIONARIO
    public void cadastrarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    //EDITAR UM FUNCIONARIO
    public void editarFuncionario(int codigo, String nome, String cpf, double salario, TipoFuncionario tipo) {
        for (Funcionario func : this.funcionarios) {
            if (codigo == func.getCodigo()) {
                func.setNome(nome);
                func.setCpf(cpf);
                func.setSalario(salario);
                func.setTipo(tipo);
                return;
            }
        }
    }

    //REMOVER UM FUNCIONARIO
    public void removerFuncionario(int codigo) {
        this.funcionarios.removeIf(func -> func.getCodigo() == codigo);
    }
}
