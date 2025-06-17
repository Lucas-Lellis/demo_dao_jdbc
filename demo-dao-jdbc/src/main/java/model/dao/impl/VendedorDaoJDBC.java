package model.dao.impl;

import model.dao.VendedorDao;
import model.entidades.Vendedor;

import java.util.List;

public class VendedorDaoJDBC implements VendedorDao {

    @Override
    public void inserir(Vendedor obj) {

    }

    @Override
    public void atualizar(Vendedor obj) {

    }

    @Override
    public void apagar(Integer id) {

    }

    @Override
    public Vendedor acharPorId(Integer id) {
        return null;
    }

    @Override
    public List<Vendedor> acharTodos() {
        return List.of();
    }
}
