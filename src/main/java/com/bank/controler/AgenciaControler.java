package com.bank.controler;

import com.bank.model.Agencia;
import com.bank.repository.AgenciaRepository;
import com.bank.service.AgenciaService;
import com.bank.service.impl.AgenciaServiceImpl;

import java.util.List;

public class AgenciaControler {

    private AgenciaService service;

    public AgenciaControler(){
        service = new AgenciaServiceImpl();
    }


    public void adicionar(Agencia agencia) {
        service.adicionar(agencia);
    }


    public Agencia buscar(String idAgencia) {
        return service.buscar(idAgencia);
    }


    public Boolean Atualizar(String idAgencia, Agencia novaAgencia) {
        return service.Atualizar(idAgencia, novaAgencia);
    }


    public List<Agencia> buscarTodos() {
        return service.buscarTodos();
    }


    public Boolean remover(String idAgencia) {
        return service.remover(idAgencia);
    }
}



