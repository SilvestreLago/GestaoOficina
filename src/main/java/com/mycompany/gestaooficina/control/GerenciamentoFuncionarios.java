package com.mycompany.gestaooficina.control;

import com.mycompany.gestaooficina.model.Cliente;
import com.mycompany.gestaooficina.model.Funcionario;
import com.mycompany.gestaooficina.model.TipoFuncionario;
import com.mycompany.gestaooficina.persistence.ArmazenamentoArquivo;
import java.util.LinkedList;
import java.util.List;


public class GerenciamentoFuncionarios {

    private static final String ARQUIVO_DADOS = "funcionarios.txt";
    private static final int CODIGO_INICIAL = 200;

    private final LinkedList<Funcionario> funcionarios;
    public static int CODIGO = CODIGO_INICIAL;
    private static GerenciamentoFuncionarios instance = null;

    private GerenciamentoFuncionarios() {
        this.funcionarios = new LinkedList<>();
        carregarDados();
    }

    public static GerenciamentoFuncionarios getInstance() {
        if (instance == null) {
            instance = new GerenciamentoFuncionarios();
        }
        return instance;
    }

    private void carregarDados() {
        List<String> linhas = ArmazenamentoArquivo.lerLinhas(ARQUIVO_DADOS);
        int maiorCodigo = CODIGO_INICIAL - 1;
        for (String linha : linhas) {
            try {
                Funcionario funcionario = Funcionario.apartirDeLinha(linha);
                this.funcionarios.add(funcionario);
                maiorCodigo = Math.max(maiorCodigo, funcionario.getCodigo());
            } catch (RuntimeException e) {
                // Linha inválida ou corrompida é ignorada.
            }
        }
        CODIGO = maiorCodigo + 1;
    }

    private void persistirDados() {
        List<String> linhas = new LinkedList<>();
        for (Funcionario funcionario : this.funcionarios) {
            linhas.add(funcionario.paraLinha());
        }
        ArmazenamentoArquivo.escreverLinhas(ARQUIVO_DADOS, linhas);
    }

    public Funcionario buscarFuncionario(int codigo) {
        for (Funcionario func : this.funcionarios) {
            if (func.getCodigo() == codigo) {
                return func;
            }
        }
        return null;
    }
    
    public Funcionario buscarFuncionario(String nome) {
        if (nome == null || nome.isBlank()) {
            return null;
        }
        String busca = nome.toLowerCase().trim();
        for (Funcionario funcionario : this.funcionarios) {
            if (funcionario.getNome().toLowerCase().equals(busca)) {
                return funcionario;
            }
        }
        return null;
    }

    public String visualizarFuncionarios() {
        String conteudo = "";
        for (Funcionario func : this.funcionarios) {
            conteudo += func.visualizarFuncionario();
        }
        return conteudo;
    }
    
    public String resumirFuncionarios() {
        String resumo = "";
        for (Funcionario funcionario : this.funcionarios) {
            resumo += funcionario.verResumo() + "\n";
        }
        return resumo;
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
        persistirDados();
    }

    public void editarFuncionario(int codigo, String nome, String cpf, double salario, TipoFuncionario tipo) {
        for (Funcionario func : this.funcionarios) {
            if (codigo == func.getCodigo()) {
                func.setNome(nome);
                func.setCpf(cpf);
                func.setSalario(salario);
                func.setTipo(tipo);
                persistirDados();
                return;
            }
        }
    }

    public void removerFuncionario(int codigo) {
        this.funcionarios.removeIf(func -> func.getCodigo() == codigo);
        persistirDados();
    }
}
