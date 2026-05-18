package com.bank.study;

import java.util.Scanner;

public class Condicoes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade < 18) {
            System.out.println(nome + " é menor de idade");
        } else if (idade >= 18 && idade <21) {
            System.out.println(nome + " é maior de idade");
        } else {
            System.out.println(nome + " é responsável por outras pessoas");
        }

        System.out.println(idade < 18? "ele é menor de idade": "Ele é maior de idade");  //ternário

        switch (idade){
            case 18:
                System.out.println("ele é maior de idade");
                break;
            case 21:
                System.out.println("Ele é responsavel por outras pessoas");
                break;
            default:
                System.out.println("Ele é menor de idade ");

        }





    }
}
