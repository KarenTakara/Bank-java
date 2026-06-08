package com.bank.gui;

import com.bank.controler.AgenciaControler;
import com.bank.model.Agencia;

import java.util.List;
import java.util.Scanner;

public class AgenciaGui {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AgenciaControler controler = new AgenciaControler();

        while (true){
            System.out.println("[1] Adicionar agencia");
            System.out.println("[2] Buscar todos");
            System.out.println("[3] Remover agencia");
            System.out.println("[4] Buscar agencia");
            System.out.println("[5] Atualizar agencia");
            System.out.println("[0] Sair do menu");

            int menu = sc.nextInt();

            if (menu == 0){
                break;
            } else if (menu == 1) {
                System.out.println("Digite o nome da agencia: ");
                String nomeAgencia = sc.next();
                System.out.println("Digite a cidade da agencia: ");
                String cidadeAgencia = sc.next();
                Agencia agencia = new Agencia(nomeAgencia, cidadeAgencia);
                try{
                    controler.adicionar(agencia);
                }catch (RuntimeException e){
                    System.err.println(e.getMessage());    //err deixa a mensagem em vermelho
                }



            } else if (menu == 2) {
                List<Agencia> agencias = controler.buscarTodos();
                agencias.forEach(agencia -> {
                    System.out.println(agencia.getNomeAgencia());
                });
            }
            //to do
        }
    }
}
