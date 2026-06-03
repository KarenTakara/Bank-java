package com.bank.model;

public class Cliente extends Pessoa {

    private String idCliente;
    private int score;


    public Cliente (String idCliente, int score){
        this.idCliente = idCliente;
        this.score = score;
    }

    public Cliente(){

    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
