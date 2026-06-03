package com.bank.service.impl;

import com.bank.model.Agencia;
import com.bank.repository.AgenciaRepository;
import com.bank.repository.impl.AgenciaRepositoryImpl;
import com.bank.service.AgenciaService;

import java.util.List;

public class AgenciaServiceImpl implements AgenciaService {
    private AgenciaRepository repository;

    public AgenciaServiceImpl(){
        repository = new AgenciaRepositoryImpl();     //instanciando para utlizar os metodos do repository
    }

    @Override
    public void adicionar(Agencia agencia) {         //metodos que tem void nao tem return
        if (agencia.getCidadeAgencia() != null && agencia.getCidadeAgencia().length() > 5){
            repository.adicionar(agencia);
        }
        //to do
    }

    @Override
    public Agencia buscar(String idAgencia) {
        return repository.buscar(idAgencia);
    }

    @Override
    public Boolean Atualizar(String idAgencia, Agencia novaAgencia) {
        if (novaAgencia.getIdAgencia() != null && novaAgencia.getIdAgencia().length() > 4){
            return repository.Atualizar(idAgencia,novaAgencia);
        }
        return false;
    }

    @Override
    public List<Agencia> buscarTodos() {
        return repository.buscarTodos();
    }

    @Override
    public Boolean remover(String idAgencia) {
        return repository.remover(idAgencia);
    }
}
