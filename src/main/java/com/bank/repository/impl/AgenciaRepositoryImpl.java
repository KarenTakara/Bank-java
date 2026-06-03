package com.bank.repository.impl;

import com.bank.model.Agencia;
import com.bank.repository.AgenciaRepository;

import java.util.ArrayList;
import java.util.List;

public class AgenciaRepositoryImpl implements AgenciaRepository {

    private List<Agencia> dataBase = new ArrayList<>();


    @Override
    public void adicionar(Agencia agencia) {
        dataBase.add(agencia);
    }

    @Override
    public Agencia buscar(String idAgencia) {
        for (int i = 0; i < dataBase.size(); i ++){

            Agencia agencia = dataBase.get(i);
            if (agencia.getIdAgencia().equals(idAgencia)){
                return agencia;
            }
        }
        return null;
    }

    @Override                                                           //controller - distribui as tarefas
    public Boolean Atualizar(String idAgencia, Agencia novaAgencia) {      //service - regra de negocio
        for (int i = 0; i < dataBase.size(); i ++){                     //repository - base de dados

            Agencia agencia = dataBase.get(i);
            if (agencia.getIdAgencia().equals(idAgencia)){

                dataBase.set(i, novaAgencia);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Agencia> buscarTodos (){
        return dataBase;
    }

    @Override
    public Boolean remover(String idAgencia) {
        for (int i = 0; i < dataBase.size(); i++){

            Agencia agencia = dataBase.get(i);
            if (agencia.getIdAgencia().equals(idAgencia)){
                dataBase.remove(i);
                return true;
            }
        }
        return false;
    }
}
