package com.bank.service;

import com.bank.model.Agencia;

import java.util.List;

public interface AgenciaService {
    public void adicionar (Agencia agencia);

    public Agencia buscar (String idAgencia);

    public Boolean Atualizar (String idAgencia, Agencia novaAgencia);

    public List<Agencia> buscarTodos ();

    public Boolean remover (String idAgencia);
}
