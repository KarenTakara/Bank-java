package com.bank.study.dados;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {

        Map<String,String> nomes = new java.util.HashMap<>();

        nomes.put("73746236","Maria");
        nomes.put("73746200","Carlos");
        nomes.put("73746255","Joao");


        for(String key: nomes.keySet()){
            System.out.println(key);
            System.out.println(nomes.get(key));
        }

        System.out.println("\n");
        for (String value: nomes.values()){
            System.out.println(value);

        }

        System.out.println("\n");
        for (Map.Entry<String,String> entry: nomes.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        nomes.put("73746236", "Kaka");

        System.out.println("\n");
        nomes.forEach((key,value) -> {
            System.out.println(key);
            System.out.println(value);
        });

        System.out.println(nomes.get("73746236"));

    }
}
