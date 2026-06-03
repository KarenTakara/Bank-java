package com.bank.study.interfacepolimorfismo;

public class Triangulo implements Calculo{

    private double lado;
    private double altura;

    public Triangulo (double lado, double altura){
        this.lado = lado;
        this.altura = altura;
    }


    @Override
    public double calcularArea() {
        return (lado * altura) / 2;
    }
}
