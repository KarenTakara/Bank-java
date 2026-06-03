package com.bank.model;

public abstract class ContaPremium extends Contas{

    private int pontos;
    private final double anuidade = 300;

    public ContaPremium (int pontos){
        this.pontos = pontos;
    }

    public ContaPremium(){

    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public double getAnuidade() {
        return anuidade;
    }
}
