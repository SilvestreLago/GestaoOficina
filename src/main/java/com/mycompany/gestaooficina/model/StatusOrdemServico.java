package com.mycompany.gestaooficina.model;


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

    public static StatusOrdemServico fromString(String texto) {
        for (StatusOrdemServico status : StatusOrdemServico.values()) {
            if (status.descricao.equalsIgnoreCase(texto) || status.name().equalsIgnoreCase(texto)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Status de ordem de serviço inválido: " + texto);
    }
}
