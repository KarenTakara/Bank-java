package com.bank.study.dados;

public class Vetores {

    public static void main(String[] args) {

        String nomes[] = new String [5];
        nomes[0] = "Angelica";
        nomes[1] = "Maria";
        nomes[2] = "Joana";


        for (int i =0; i < nomes.length; i++) {
            System.out.println(nomes[i]);

        }

        nomes[1] = "Karen";
        nomes[0] = null;
    }
}
