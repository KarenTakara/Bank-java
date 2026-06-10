package com.bank.repository.impl;

import com.bank.model.Funcionario;
import com.bank.repository.FuncionariosRepository;

import java.util.Arrays;
import java.util.List;

public class FuncionarioRepositoryImpl implements FuncionariosRepository {

    private Funcionario[] funcionarios = new Funcionario[50];
    int i;

    @Override
    public void Adicionar(Funcionario funcionario) {     //void nao tem retorno
        funcionarios[i] = funcionario;
        i++;
    }

    @Override
    public Funcionario Buscar(String cpf) {
        for (Funcionario funcionario : funcionarios) {
            if (cpf.equals(funcionario.getCpf())) {
                return funcionario;
            }
        }
        return null;
    }

    @Override
    public List<Funcionario> BuscarTodos() {
        List<Funcionario> lista = Arrays.asList(funcionarios);   //transformar vetor em lista
        return lista;
    }

    @Override
    public Boolean Atualizar(String cpf, Funcionario novoFuncionario) {
        for (Funcionario funcionario : funcionarios) {
            if (cpf.equals(funcionario.getCpf())) {
                funcionario = novoFuncionario;
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean Remover(String cpf) {
        for (Funcionario funcionario : funcionarios) {
            if (cpf.equals(funcionario.getCpf())) {
                funcionario = null;
                return true;
            }
        }
        return false;
    }
}
