package com.bank.study;

import com.bank.model.Cargos;

public class TesteEnum {
    public static void main(String[] args) {

        System.out.println(Cargos.CAIXA.getAbrev());

        for (Cargos c: Cargos.values()){
            System.out.println(c.getAbrev());
            System.out.println(c);
            System.out.println(c.getMin());
            System.out.println(c.getMax());
        }
    }
}
