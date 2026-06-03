package com.bank.study.dados;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTeste {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();   //FIFO

        nomes.add("Maria");
        nomes.add("Carlos");
        nomes.add("Julia");
        nomes.add("Julia");

        Set<String> nomeSet = new HashSet<>();      //Nao permite repeti-los
        for (int i = 0; i < nomes.size(); i++){

            nomeSet.add(nomes.get(i));
        }


        nomeSet.forEach(nome ->{     //desorganizado mas nao repetido
            System.out.println(nome);
        });



    }
}
