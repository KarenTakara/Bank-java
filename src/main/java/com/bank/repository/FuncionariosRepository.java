package com.bank.repository;

import com.bank.model.Funcionario;
import com.bank.model.Setores;

import java.util.List;

public interface FuncionariosRepository {

    public void Adicionar (Funcionario funcionario);

    public Funcionario Buscar (String cpf);

    public List<Funcionario> BuscarTodos ();

    public Boolean Atualizar (String cpf, Funcionario novoFuncionario);       //String cpf oq vou utilizar para buscar, e o novoFuncionario oq vou atualizar

    public Boolean Remover (String cpf);

}
