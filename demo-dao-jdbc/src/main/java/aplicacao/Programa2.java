package aplicacao;

import model.dao.DepartamentoDao;
import model.dao.FabricaDao;
import model.entidades.Departamento;

import java.util.List;

public class Programa2 {

    public static void main(String[] args) {

        DepartamentoDao departamentoDao = FabricaDao.criarDepartamentoDao();

        System.out.println("=== TESTE 1: Departamento AcharTodos ===");
        List<Departamento> list = departamentoDao.acharTodos();
        for (Departamento dep : list) {
            System.out.println(dep);
        }

        System.out.println("\n=== TESTE 2: Departamento AcharPorId ===");
        Departamento dep = departamentoDao.acharPorId(2);
        System.out.println(dep);
    }
}
