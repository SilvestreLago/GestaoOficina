package com.mycompany.gestaooficina.model;

/**
 * Representa as possíveis situações em que uma Ordem de Serviço pode se
 * encontrar durante seu ciclo de vida dentro da oficina.
 */
public enum StatusOrdemServico {
    ABERTA("Aberta"),
    EM_ANDAMENTO("Em andamento"),
    CONCLUIDA("Concluída"),
    CANCELADA("Cancelada");

    private final String descricao;

    StatusOrdemServico(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }

    //CONVERTE UMA STRING (ex: vinda de formulario ou de arquivo) PARA O ENUM CORRESPONDENTE
    public static StatusOrdemServico fromString(String texto) {
        for (StatusOrdemServico status : StatusOrdemServico.values()) {
            if (status.descricao.equalsIgnoreCase(texto) || status.name().equalsIgnoreCase(texto)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Status de ordem de serviço inválido: " + texto);
    }
}
