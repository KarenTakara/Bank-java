package com.bank.repository;

import com.bank.model.Agencia;

import java.util.List;

public interface AgenciaRepository {
    public void adicionar (Agencia agencia);

    public Agencia buscar (String idAgencia);

    public Boolean Atualizar (String idAgencia, Agencia novaAgencia);

    public List<Agencia> buscarTodos ();

    public Boolean remover (String idAgencia);



}
