package com.bank.model;

public enum Cargos {

    GERENTE("G", 1000, 2000), CAIXA("C", 500, 800), DIRETOR("D", 3000, 4000), TERCEIRO("T", 900, 1500);

    private String abrev;
    private double min;
    private double max;

    Cargos(String abrev, double min, double max) {
        this.abrev = abrev;
        this.min = min;
        this.max = max;
    }

    public String getAbrev() {
        return abrev;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }
}
