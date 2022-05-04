package br.com.consultorio.entity;

public enum StatusAgenda {

    pendente("Pendente"),
    aprovado("Aprovado"),
    rejeitado("Rejeitado"),
    cancelado("Cancelado"),
    compareceu("Compareceu"),
    nao_compareceu("Não Compareceu");

    public final String valor;

    private StatusAgenda(String valor){
        this.valor = valor;
    }

}
