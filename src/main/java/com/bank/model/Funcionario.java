package com.bank.model;

public class Funcionario extends Pessoa {

    private String idFuncionario;
    private Setores setor;
    private Cargos cargo;

    public Funcionario (Setores setor, Cargos cargo){
        this.setor = setor;
        this.cargo = cargo;
    }

    public Funcionario(){

    }

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Setores getSetor() {
        return setor;
    }

    public void setSetor(Setores setor) {
        this.setor = setor;
    }

    public Cargos getCargo() {
        return cargo;
    }

    public void setCargo(Cargos cargo) {
        this.cargo = cargo;
    }
}
