package model.dao;

import model.entidades.Departamento;

import java.util.List;

public interface DepartamentoDao {

    void inserir(Departamento obj);
    void atualizar(Departamento obj);
    void apagar(Integer id);
    Departamento acharPorId(Integer id);
    List<Departamento> acharTodos();
}
