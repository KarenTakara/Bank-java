package com.bank.study.dados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Produto>produtos = new ArrayList<>();

        while(true) {

            System.out.println("[1] Adicionar produto");
            System.out.println("[2] Deletar produto");
            System.out.println("[3] Atualizar Produto");
            System.out.println("[4] Ver os produtos selecionados");
            System.out.println("[5] Verificar se o produto existe");
            System.out.println("Digite 0 para encerrar o programa");

            int menu = sc.nextInt();

            if (menu == 0) {
                break;
            }

            else if (menu == 1) {

                System.out.println("Informe o nome do produto: ");
                String nome = sc.next();

                System.out.println("Informe o tipo do produto: ");
                String tipo = sc.next();

                System.out.println("Informe o valor do produto: ");
                double preco = sc.nextDouble();

                produtos.add(new Produto(nome, tipo, preco));
            }

            else if (menu == 2) {
                System.out.println("Informe o nome do produto que deseja deletar: ");
                String produto = sc.next();

                for (int i = 0; i < produtos.size(); i++) {
                    if (produtos.get(i).getNome().equals(produto)) {

                    }
                }
            }

            else if (menu == 3) {
                System.out.println("Informe o produto que deseja atualizar");
                String produto = sc.next();

                System.out.println("Informe o novo produto: ");
                String novoProduto = sc.next();

                for (int i = 0; i < produtos.size(); i++) {


                    //if (produtos.get(i).getNome().equals(produto)) {
                    //    produtos.get(i).setNome(novoProduto);
                    //}

                    Produto p = produtos.get(i);
                    if (p.getNome().equals(produto)) {
                        produtos.get(i).setNome(novoProduto);

                    }
                }
            }

            else if (menu == 4) {
                for (int i = 0; i < produtos.size(); i++){
                    System.out.println(produtos.get(i));
                }
            }

            else if (menu == 5) {
                System.out.println("Informe o produto que deseja verificar se existe: ");
                String produto = sc.next();

                for (int i = 0; i< produtos.size() ; i++){
                    Produto p = produtos.get(i);       //help

                    if (p.getNome().equals(produto)){
                        System.out.println("Esse produto já existe!");
                    }
                    else {
                        System.out.println("Esse produto não existe");
                    }
                }

            }

            else if (menu == 0) {
                System.out.println("O programa está prestes a encerrar");
                break;
            }
        }
    }
}
