package com.bank.model;

import java.time.LocalDate;

public abstract class Pessoa {

    private String nome;
    private LocalDate dataDeNascimento;
    private String cpf;
    private String email;

    public Pessoa (String nome, LocalDate dataDeNascimento, String cpf, String email){
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.email = email;
    }

    public Pessoa (){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
