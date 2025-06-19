package model.dao.impl;

import db.DB;
import db.DbException;
import model.dao.DepartamentoDao;
import model.entidades.Departamento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartamentoDaoJDBC implements DepartamentoDao {

    private Connection conn;

    public DepartamentoDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void inserir(Departamento obj) {

    }

    @Override
    public void atualizar(Departamento obj) {

    }

    @Override
    public void apagar(Integer id) {

    }

    @Override
    public Departamento acharPorId(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT * FROM department " +
                        "WHERE Id = ? "
            );

            st.setInt(1, id);
            rs = st.executeQuery();

            if (rs.next()) {
                Departamento dep = instanciarDepartamento(rs);
                return dep;
            }
            return null;
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public List<Departamento> acharTodos() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT * FROM department " +
                        "ORDER BY Id "
            );

            rs = st.executeQuery();

            List<Departamento> list = new ArrayList<>();

            while (rs.next()) {
                Departamento dep = instanciarDepartamento(rs);
                list.add(dep);
            }
            return list;
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    private Departamento instanciarDepartamento(ResultSet rs) throws SQLException {
        Departamento dep = new Departamento();
        dep.setId(rs.getInt("Id"));
        dep.setNome(rs.getString("Name"));
        return dep;
    }
}
