package com.bank.service.impl;

import com.bank.model.Funcionario;
import com.bank.repository.FuncionariosRepository;
import com.bank.repository.impl.FuncionarioRepositoryImpl;
import com.bank.service.FuncionarioService;

import java.util.List;

public class FuncionarioServiceImpl implements FuncionarioService {

    private FuncionariosRepository repository;

    public FuncionarioServiceImpl (){
        repository = new FuncionarioRepositoryImpl();
    }


    @Override
    public void Adicionar(Funcionario funcionario) {
        if (funcionario.getCpf())
        repository.Adicionar(funcionario);
    }

    @Override
    public Funcionario Buscar(String cpf) {
        return null;
    }

    @Override
    public List<Funcionario> BuscarTodos() {
        return List.of();
    }

    @Override
    public Boolean Atualizar(String cpf, Funcionario novoFuncionario) {
        return null;
    }

    @Override
    public Boolean Remover(String cpf) {
        return null;
    }
}
