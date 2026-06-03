package com.bank.study.interfacepolimorfismo;

public class Quadrado implements Calculo{

    private double lado;


    public Quadrado(double lado){
        this.lado = lado;

    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
