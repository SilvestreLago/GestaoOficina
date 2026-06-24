package com.mycompany.gestaooficina.model;

public enum TipoFuncionario {
    MECANICO("Mecanico"),
    ATENDENTE("Atendente");

    private final String descricao;

    TipoFuncionario(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }

    //CONVERTE UMA STRING (ex: vinda de formulario) PARA O ENUM CORRESPONDENTE
    public static TipoFuncionario fromString(String texto) {
        for (TipoFuncionario tipo : TipoFuncionario.values()) {
            if (tipo.descricao.equalsIgnoreCase(texto) || tipo.name().equalsIgnoreCase(texto)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Tipo de funcionario invalido: " + texto);
    }
}
