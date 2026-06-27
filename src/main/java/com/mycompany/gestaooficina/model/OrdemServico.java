package com.mycompany.gestaooficina.model;

import com.mycompany.gestaooficina.control.GerenciamentoOrdemServico;
import com.mycompany.gestaooficina.persistence.ArmazenamentoArquivo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class OrdemServico {

    private static final DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    private int codigo;
    private int codigoVeiculo;
    private int codigoCliente;
    private int codigoMecanico;
    private int codigoPeca;
    private int codigoServico;
    private StatusOrdemServico status;
    private String dataAbertura;

    public OrdemServico(int codigoVeiculo, int codigoCliente, int codigoMecanico, int codigoPeca, int codigoServico) {
        this.codigo = GerenciamentoOrdemServico.CODIGO;
        this.codigoVeiculo = codigoVeiculo;
        this.codigoCliente = codigoCliente;
        this.codigoMecanico = codigoMecanico;
        this.codigoPeca = codigoPeca;
        this.codigoServico = codigoServico;
        this.status = StatusOrdemServico.ABERTA;
        this.dataAbertura = LocalDateTime.now().format(FORMATO_DATA);
        GerenciamentoOrdemServico.CODIGO++;
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public int getCodigoVeiculo() { return codigoVeiculo; }
    public void setCodigoVeiculo(int codigoVeiculo) { this.codigoVeiculo = codigoVeiculo; }

    public int getCodigoCliente() { return codigoCliente; }
    public void setCodigoCliente(int codigoCliente) { this.codigoCliente = codigoCliente; }

    public int getCodigoMecanico() { return codigoMecanico; }
    public void setCodigoMecanico(int codigoMecanico) { this.codigoMecanico = codigoMecanico; }

    public int getCodigoPeca() { return codigoPeca; }
    public void setCodigoPeca(int codigoPeca) { this.codigoPeca = codigoPeca; }

    public int getCodigoServico() { return codigoServico; }
    public void setCodigoServico(int codigoServico) { this.codigoServico = codigoServico; }

    public StatusOrdemServico getStatus() { return status; }
    public void setStatus(StatusOrdemServico status) { this.status = status; }

    public String getDataAbertura() { return dataAbertura; }
    public void setDataAbertura(String dataAbertura) { this.dataAbertura = dataAbertura; }

    public String getResumo() {
        return "OS #" + codigo + " — " + status + " (" + dataAbertura + ")";
    }
    
    public String visualizarOrdemServico() {
        return "\n\nCodigo OS: " + this.codigo +
               "\nCod. Veiculo: " + this.codigoVeiculo +
               "\nCod. Cliente: " + this.codigoCliente +
               "\nCod. Mecanico: " + this.codigoMecanico +
               "\nCod. Peca: " + this.codigoPeca +
               "\nCod. Servico: " + this.codigoServico +
               "\nStatus: " + this.status.getDescricao() +
               "\nData de abertura: " + this.dataAbertura;
    }

    public String paraLinha() {
        return this.codigo + "|"
                + this.codigoVeiculo + "|"
                + this.codigoCliente + "|"
                + this.codigoMecanico + "|"
                + this.codigoPeca + "|"
                + this.codigoServico + "|"
                + this.status.name() + "|"
                + ArmazenamentoArquivo.escaparCampo(this.dataAbertura);
    }

    public static OrdemServico apartirDeLinha(String linha) {
        String[] campos = ArmazenamentoArquivo.dividirCampos(linha);
        OrdemServico os = new OrdemServico(
                Integer.parseInt(campos[1]),
                Integer.parseInt(campos[2]),
                Integer.parseInt(campos[3]),
                Integer.parseInt(campos[4]),
                Integer.parseInt(campos[5]));
        os.setCodigo(Integer.parseInt(campos[0]));
        if (campos.length > 6 && !campos[6].isEmpty()) {
            os.setStatus(StatusOrdemServico.fromString(campos[6]));
        }
        if (campos.length > 7) {
            os.setDataAbertura(campos[7]);
        }
        return os;
    }
}
