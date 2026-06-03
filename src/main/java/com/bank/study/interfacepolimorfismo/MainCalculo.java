package com.bank.study.interfacepolimorfismo;

public class MainCalculo {
    public static void main(String[] args) {


        Calculo [] calculos = new Calculo[4];
        calculos[0] = new Quadrado(5);
        calculos[1] = new Retangulo(5, 2);
        calculos[2] = new Circulo(3);
        calculos[3] = new Triangulo(2, 3);

        for (int i = 0; i < calculos.length; i++){
            System.out.println(calculos[i].calcularArea());
        }
    }
}
