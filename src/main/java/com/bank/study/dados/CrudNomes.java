package com.bank.study.dados;

import java.util.Scanner;

public class CrudNomes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String alimentos[] = new String[10];
        int contador = 0;



        while(true){
            System.out.println("1- Adicionar alimento do carrinho");
            System.out.println("2- Remover alimento do carrinho");
            System.out.println("3- Ver o carrinho");
            System.out.println("4- Atualizar um produto");
            System.out.println("5- verificar se o produto existe");
            System.out.println("Digite 0 para encerrar o programa");

            int menu = sc.nextInt();

            if (menu == 0){
                System.out.println("O programa esta sendo encerrado");
                break;
            } else if (menu ==1) {
                System.out.println("Informe o alimento que deseja adicionar: ");
                alimentos[contador] = sc.nextLine();
                contador ++;

            } else if (menu == 3) {
                for (int i = 0; i< alimentos.length; i++){
                    System.out.println(alimentos[i]);
                }
            } else if (menu == 5) {
                boolean existe= false;
                System.out.println("Digite o nome do alimento que voce queira verificar se existe:");
                String alimento = sc.next();
                for (int i = 0; i < alimentos.length; i++){
                    if (alimentos[i] .equals(alimento)){         //se for String, utilizar .equals ao em vez de "=="
                        System.out.println("Esse produto já existe");
                        existe = true;
                        break;
                    }
                }

                if (!existe) {
                    System.out.println("Esse produto não existe");
                }
            } else if (menu == 2) {
                boolean existe = false;
                System.out.println("Informe o alimento que deseja remover");
                String alimento = sc.next();
                for (int i = 0; i < alimentos.length; i++){
                    if (alimentos[i] .equals(alimento)){
                        existe = true;
                        alimentos[i] = alimentos[contador-1];
                        alimentos[contador-1] =null;
                        contador --;
                    }
                }
                if (!existe) {
                    System.out.println("Esse produto não existe");
                }
            } else if (menu == 4) {
                boolean existe = false;
                System.out.println("Informe o nome do alimento que deseja atualizar: ");
                String alimento = sc.next();

                for (int i = 0; i < alimentos.length; i++){
                    if (alimentos[i] .equals(alimento)){
                        existe = true;

                        System.out.println("Informe o novo alimento que deseja adicionar");
                        String alimentoNovo = sc.next();

                        alimentos[i] = alimentoNovo;
                    }
                }
                if (!existe) {
                    System.out.println("Esse produto não existe");
                }

            }
        }









    }
}
