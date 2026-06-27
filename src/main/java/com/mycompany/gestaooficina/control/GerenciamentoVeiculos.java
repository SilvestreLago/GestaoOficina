package com.mycompany.gestaooficina.control;

import com.mycompany.gestaooficina.model.Veiculo;
import com.mycompany.gestaooficina.persistence.ArmazenamentoArquivo;
import java.util.LinkedList;
import java.util.List;


public class GerenciamentoVeiculos {

    private static final String ARQUIVO_DADOS = "veiculos.txt";
    private static final int CODIGO_INICIAL = 200;

    private final LinkedList<Veiculo> veiculos;
    public static int CODIGO = CODIGO_INICIAL;
    private static GerenciamentoVeiculos instance = null;

    private GerenciamentoVeiculos() {
        this.veiculos = new LinkedList<>();
        carregarDados();
    }

    public static GerenciamentoVeiculos getInstance() {
        if (instance == null) {
            instance = new GerenciamentoVeiculos();
        }
        return instance;
    }

    private void carregarDados() {
        List<String> linhas = ArmazenamentoArquivo.lerLinhas(ARQUIVO_DADOS);
        int maiorCodigo = CODIGO_INICIAL - 1;
        for (String linha : linhas) {
            try {
                Veiculo veiculo = Veiculo.apartirDeLinha(linha);
                this.veiculos.add(veiculo);
                maiorCodigo = Math.max(maiorCodigo, veiculo.getCodigo());
            } catch (RuntimeException e) {
                // Linha inválida ou corrompida é ignorada.
            }
        }
        CODIGO = maiorCodigo + 1;
    }

    private void persistirDados() {
        List<String> linhas = new LinkedList<>();
        for (Veiculo veiculo : this.veiculos) {
            linhas.add(veiculo.paraLinha());
        }
        ArmazenamentoArquivo.escreverLinhas(ARQUIVO_DADOS, linhas);
    }

    public Veiculo buscarVeiculo(int codigo) {
        for (Veiculo veiculo : this.veiculos) {
            if (veiculo.getCodigo() == codigo) {
                return veiculo;
            }
        }
        return null;
    }
    
     public Veiculo buscarVeiculo(String nome) {
        if (nome == null || nome.isBlank()) {
            return null;
        }
        String busca = nome.toLowerCase().trim();
        for (Veiculo veiculo : this.veiculos) {
            if (veiculo.getPlaca().toLowerCase().equals(busca)) {
                return veiculo;
            }
        }
        return null;
    }

    public List<Veiculo> buscarVeiculosPorCliente(int codigoCliente) {
        List<Veiculo> resultado = new LinkedList<>();
        for (Veiculo veiculo : this.veiculos) {
            if (veiculo.getCodigoCliente() == codigoCliente) {
                resultado.add(veiculo);
            }
        }
        return resultado;
    }

    public String visualizarVeiculos() {
        String conteudo = "";
        for (Veiculo veiculo : this.veiculos) {
            conteudo += veiculo.visualizarVeiculo();
        }
        return conteudo;
    }
    
     public String resumirVeiculos() {
        String resumo = "";
        for (Veiculo veiculo : this.veiculos) {
            resumo += veiculo.getResumo() + "\n"; 
        }
        return resumo;
    }

    public void cadastrarVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
        persistirDados();
    }

    public void editarVeiculo(int codigo, int codigoCliente, String placa, String modelo, String marca, String ano, String quilometragem) {
        for (Veiculo veiculo : this.veiculos) {
            if (codigo == veiculo.getCodigo()) {
                veiculo.setCodigoCliente(codigoCliente);
                veiculo.setPlaca(placa);
                veiculo.setModelo(modelo);
                veiculo.setMarca(marca);
                veiculo.setAno(ano);
                veiculo.setQuilometragem(quilometragem);
                persistirDados();
                return;
            }
        }
    }

    public void removerVeiculo(int codigo) {
        this.veiculos.removeIf(v -> v.getCodigo() == codigo);
        GerenciamentoOrdemServico.getInstance().removerOrdemServicoPorVeiculo(codigo);
        persistirDados();
    }
}
