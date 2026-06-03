package com.bank.model;

public class Agencia {

    private String idAgencia;
    private String nomeAgencia;
    private String cidadeAgencia;

    public Agencia(String idAgencia, String nomeAgencia, String cidadeAgencia){
        this.cidadeAgencia = cidadeAgencia;
        this.idAgencia = idAgencia;
        this.nomeAgencia = nomeAgencia;
    }

    public Agencia(){

    }

    public String getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(String idAgencia) {
        this.idAgencia = idAgencia;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public String getCidadeAgencia() {
        return cidadeAgencia;
    }

    public void setCidadeAgencia(String cidadeAgencia) {
        this.cidadeAgencia = cidadeAgencia;
    }
}
