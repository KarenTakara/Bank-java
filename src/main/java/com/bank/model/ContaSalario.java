package com.bank.model;

public class ContaSalario extends Contas{

    private double salario;
    private String empresaPagadora;

    public ContaSalario(double salario, String empresaPagadora){
        this.salario = salario;
        this.empresaPagadora = empresaPagadora;
    }

    public ContaSalario(){

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEmpresaPagadora() {
        return empresaPagadora;
    }

    public void setEmpresaPagadora(String empresaPagadora) {
        this.empresaPagadora = empresaPagadora;
    }
}
