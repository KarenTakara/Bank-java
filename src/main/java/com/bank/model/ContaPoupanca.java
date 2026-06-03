package com.bank.model;

public abstract class ContaPoupanca extends Contas{

    private double juros;
    private static double selic;


    public ContaPoupanca(double juros){
        this.juros = juros;

    }

    public ContaPoupanca(){

    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public static double getSelic() {
        return selic;
    }

    public static void setSelic(double selic) {
        ContaPoupanca.selic = selic;
    }
}
