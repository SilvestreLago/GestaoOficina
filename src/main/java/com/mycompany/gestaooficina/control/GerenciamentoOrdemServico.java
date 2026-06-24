package com.mycompany.gestaooficina.control;

import com.mycompany.gestaooficina.model.OrdemServico;
import java.util.LinkedList;

public class GerenciamentoOrdemServico {
    private LinkedList<OrdemServico> ordensServico;
    public static int CODIGO = 200;
    private static GerenciamentoOrdemServico instance = null;

    private GerenciamentoOrdemServico() {
        this.ordensServico = new LinkedList<OrdemServico>();
    }

    public static GerenciamentoOrdemServico getInstance() {
        if (instance == null) {
            instance = new GerenciamentoOrdemServico();
        }
        return instance;
    }

    //BUSCAR ORDEM DE SERVICO POR CODIGO
    public OrdemServico buscarOrdemServico(int codigo) {
        for (OrdemServico os : this.ordensServico) {
            if (os.getCodigo() == codigo) {
                return os;
            }
        }
        return null;
    }

    //VISUALIZAR TODAS AS ORDENS DE SERVICO
    public String visualizarOrdensServico() {
        String conteudo = "";
        for (OrdemServico os : this.ordensServico) {
            conteudo += os.visualizarOrdemServico();
        }
        return conteudo;
    }

    //CADASTRAR UMA NOVA ORDEM DE SERVICO
    public void cadastrarOrdemServico(OrdemServico os) {
        this.ordensServico.add(os);
    }

    //EDITAR UMA ORDEM DE SERVICO
    public void editarOrdemServico(int codigo, int codigoVeiculo, int codigoCliente, int codigoMecanico, int codigoPeca, int codigoServico) {
        for (OrdemServico os : this.ordensServico) {
            if (codigo == os.getCodigo()) {
                os.setCodigoVeiculo(codigoVeiculo);
                os.setCodigoCliente(codigoCliente);
                os.setCodigoMecanico(codigoMecanico);
                os.setCodigoPeca(codigoPeca);
                os.setCodigoServico(codigoServico);
                return;
            }
        }
    }

    //REMOVER UMA ORDEM DE SERVICO
    public void removerOrdemServico(int codigo) {
        this.ordensServico.removeIf(os -> os.getCodigo() == codigo);
    }

    //REMOVER EM CASCATA TODAS AS ORDENS DE SERVICO DE UM VEICULO (usado quando o veiculo e removido)
    public void removerOrdemServicoPorVeiculo(int codigoVeiculo) {
        this.ordensServico.removeIf(os -> os.getCodigoVeiculo() == codigoVeiculo);
    }

    //REMOVER EM CASCATA TODAS AS ORDENS DE SERVICO DE UM CLIENTE (usado quando o cliente e removido)
    public void removerOrdemServicoPorCliente(int codigoCliente) {
        this.ordensServico.removeIf(os -> os.getCodigoCliente() == codigoCliente);
    }
}
