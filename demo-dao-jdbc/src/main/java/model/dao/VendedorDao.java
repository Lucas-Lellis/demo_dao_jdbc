package model.dao;

import model.entidades.Departamento;
import model.entidades.Vendedor;

import java.util.List;

public interface VendedorDao {

    void inserir(Vendedor obj);
    void atualizar(Vendedor obj);
    void apagar(Integer id);
    Vendedor acharPorId(Integer id);
    List<Vendedor> acharTodos();
    List<Vendedor> acharPorDepartamento(Departamento departamento);
}
