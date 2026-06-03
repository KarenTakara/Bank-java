package com.bank.model;

public abstract class Contas {

    private int numeroConta;
    private String banco;
    private double saldo;
    private String cpf;

    public Contas(int numeroConta, String banco, double saldo, String cpf){
        this.numeroConta = numeroConta;
        this. banco = banco;
        this.saldo = saldo;
        this.cpf = cpf;
    }

    public Contas(){

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
