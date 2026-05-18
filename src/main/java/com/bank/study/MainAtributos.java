package com.bank.study;

import java.util.Scanner;

public class MainAtributos {

    public static void main(String[] args) {

        PessoaTeste p = new PessoaTeste();


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        sc.nextLine();
        System.out.println("Digite a sua cidade: ");
        String cidade = sc.nextLine();

        p.setNome(nome);
        p.setIdade(idade);
        p.setCidades(cidade);
        PessoaTeste.sobrenome = "Silva";    //Static pertence a classe


        System.out.println(p.getCidades() + " " + p.getIdade() + " " + p.getNome());



    }
}
