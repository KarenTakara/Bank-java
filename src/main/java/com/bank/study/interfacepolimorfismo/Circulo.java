package com.bank.study.interfacepolimorfismo;

public class Circulo implements Calculo{

    private double raio;
    private static final double PI = 3.14;

    public Circulo (double raio){      //nao preciso adicionar double PI, pois ele eh um elemento fixo
        this.raio = raio;
    }


    @Override
    public double calcularArea() {
        return PI * (raio*raio);
    }
}
