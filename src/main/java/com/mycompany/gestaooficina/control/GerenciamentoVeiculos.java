package com.mycompany.gestaooficina.control;

import com.mycompany.gestaooficina.model.Veiculo;
import java.util.LinkedList;
import java.util.List;

public class GerenciamentoVeiculos {
    private LinkedList<Veiculo> veiculos;
    public static int CODIGO = 200;
    private static GerenciamentoVeiculos instance = null;

    private GerenciamentoVeiculos() {
        this.veiculos = new LinkedList<Veiculo>();
    }

    public static GerenciamentoVeiculos getInstance() {
        if (instance == null) {
            instance = new GerenciamentoVeiculos();
        }
        return instance;
    }

    //BUSCAR VEICULO POR CODIGO
    public Veiculo buscarVeiculo(int codigo) {
        for (Veiculo veiculo : this.veiculos) {
            if (veiculo.getCodigo() == codigo) {
                return veiculo;
            }
        }
        return null;
    }

    //BUSCAR TODOS OS VEICULOS DE UM CLIENTE
    public List<Veiculo> buscarVeiculosPorCliente(int codigoCliente) {
        List<Veiculo> resultado = new LinkedList<Veiculo>();
        for (Veiculo veiculo : this.veiculos) {
            if (veiculo.getCodigoCliente() == codigoCliente) {
                resultado.add(veiculo);
            }
        }
        return resultado;
    }

    //VISUALIZAR TODOS OS VEICULOS
    public String visualizarVeiculos() {
        String conteudo = "";
        for (Veiculo veiculo : this.veiculos) {
            conteudo += veiculo.visualizarVeiculo();
        }
        return conteudo;
    }

    //CADASTRAR UM NOVO VEICULO
    public void cadastrarVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
    }

    //EDITAR UM VEICULO
    public void editarVeiculo(int codigo, int codigoCliente, String placa, String modelo, String marca, String ano, String quilometragem) {
        for (Veiculo veiculo : this.veiculos) {
            if (codigo == veiculo.getCodigo()) {
                veiculo.setCodigoCliente(codigoCliente);
                veiculo.setPlaca(placa);
                veiculo.setModelo(modelo);
                veiculo.setMarca(marca);
                veiculo.setAno(ano);
                veiculo.setQuilometragem(quilometragem);
                return;
            }
        }
    }

    //REMOVER UM VEICULO (E EM CASCATA AS ORDENS DE SERVICO ATRELADAS A ELE)
    public void removerVeiculo(int codigo) {
        this.veiculos.removeIf(v -> v.getCodigo() == codigo);
        GerenciamentoOrdemServico.getInstance().removerOrdemServicoPorVeiculo(codigo);
    }
}
