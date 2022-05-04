package br.com.consultorio.entity;

public enum Sexo {

    masculino("Masculino"),
    feminino("Feminino"),
    outro("Outro");

    public final String valor;

    private Sexo(String valor){
        this.valor = valor;
    }}
