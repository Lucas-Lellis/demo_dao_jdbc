package model.dao;

import model.entidades.Departamento;

import java.util.List;

public interface DepartamentoDao {

    void insert(Departamento obj);
    void update(Departamento obj);
    void delete(Integer id);
    Departamento findById(Integer id);
    List<Departamento> findAll();
}
