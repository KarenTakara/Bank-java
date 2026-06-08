package com.bank.repository.impl;

import com.bank.model.Funcionario;
import com.bank.repository.FuncionariosRepository;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepitoryImpl implements FuncionariosRepository {

   private Funcionario[] funcionarios = new Funcionario[50];
    int i;

    @Override
    public void Adicionar(Funcionario funcionario) {     //void nao tem retorno
        funcionarios[i] = funcionario;
        i++;
    }

    @Override
    public Funcionario Buscar(String cpf) {
        for (Funcionario funcionario: funcionarios){
            if (cpf.equals())
        }


        for (int i = 0, i)
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
