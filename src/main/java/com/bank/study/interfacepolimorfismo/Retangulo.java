package com.bank.study.interfacepolimorfismo;

public class Retangulo implements Calculo {

    private double lado;
    private double altura;

    public Retangulo (double lado, double altura){
        this.lado = lado;
        this.altura = altura;
    }


    @Override
    public double calcularArea() {
        return this.lado * this.altura;
    }
}
