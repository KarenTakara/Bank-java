package com.bank.study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        for (int i = 0; i <=9; i++){
            System.out.println(i);

        }

        List<String> nomes = new ArrayList<>();
        nomes.add("Maria");
        nomes.add("Joao");
        nomes.add("Julia");
        nomes.add("Yuri");

        for ( int i = 0; i < nomes.size(); i++){
            String nome = nomes.get(i);
            System.out.println(nome);
        }

        for (String nome: nomes){
            System.out.println(nome);
        }

        nomes.forEach(nome -> {
            System.out.println(nome);
        });
    }
}
