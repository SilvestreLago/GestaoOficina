/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestaooficina.control;

import com.mycompany.gestaooficina.model.Cliente;
import com.mycompany.gestaooficina.model.Veiculo;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author silvestre
 */
public class GerenciamentoClientes {
    private LinkedList<Cliente> clientes;
    public static int CODIGO = 200;
    private static GerenciamentoClientes instance = null;
    
    private GerenciamentoClientes(){
        this.clientes = new LinkedList<Cliente>();
    }
    
    public static GerenciamentoClientes getInstance(){
        if (instance == null){
            instance = new GerenciamentoClientes();
        }
        return instance;
    }
    
    //BUSCAR CLIENTE POR CODIGO
    public Cliente buscarCliente(int codigo){
        for(Cliente cliente: this.clientes){
            if(cliente.getCodigo() == codigo){
                return cliente;
            }
        }
        return null;
    }
    
    //VISUALIZAR TODOS OS CLIENTES
    public String visualizarClientes(){
        String conteudo = "";
        for(Cliente cliente: this.clientes){
            conteudo += cliente.visualizarCliente();
        }
        return conteudo;
    }
    
    //CADASTRAR UM NOVO CLIENTE
    public void cadastrarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }
    
    //EDITAR UM CLIENTE
    public void editarCliente(int codigo, String nome, String cpf, String telefone, String email){
        for(Cliente cliente: this.clientes){
            if(codigo == cliente.getCodigo()){
                cliente.setNome(nome);
                cliente.setCpf(cpf);
                cliente.setTelefone(telefone);
                cliente.setEmail(email);
                return;
            }
        }
    }
    
    //REMOVER UM CLIENTE (E EM CASCATA OS VEICULOS E ORDENS DE SERVICO ATRELADOS A ELE)
    public void removerCliente(int codigo){
        //REMOVE EM CASCATA TODOS OS VEICULOS DO CLIENTE (que por sua vez removem as OS atreladas a eles)
        GerenciamentoVeiculos genVeiculos = GerenciamentoVeiculos.getInstance();
        List<Veiculo> veiculosDoCliente = genVeiculos.buscarVeiculosPorCliente(codigo);
        for (Veiculo veiculo : veiculosDoCliente) {
            genVeiculos.removerVeiculo(veiculo.getCodigo());
        }
        //GARANTE QUE NAO RESTEM ORDENS DE SERVICO LIGADAS DIRETAMENTE AO CLIENTE
        GerenciamentoOrdemServico.getInstance().removerOrdemServicoPorCliente(codigo);
        
        this.clientes.removeIf(cliente -> cliente.getCodigo() == codigo);
    }
    
}
