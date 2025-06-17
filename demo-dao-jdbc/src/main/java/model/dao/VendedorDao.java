package model.dao;

import model.entidades.Vendedor;

import java.util.List;

public interface VendedorDao {

    void insert(Vendedor obj);
    void update(Vendedor obj);
    void delete(Integer id);
    Vendedor findById(Integer id);
    List<Vendedor> findAll();
}
