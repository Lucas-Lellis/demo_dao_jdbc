package aplicacao;

import model.dao.FabricaDao;
import model.dao.VendedorDao;
import model.entidades.Departamento;
import model.entidades.Vendedor;

import java.sql.Date;
import java.util.List;

public class Programa {

    public static void main(String[] args) {

        VendedorDao vendedorDao = FabricaDao.criarVendedorDao();

        System.out.println("=== TESTE 1: Vendedor AcharPorID ===");
        Vendedor vendedor = vendedorDao.acharPorId(3);
        System.out.println(vendedor);

        System.out.println("\n === TESTE 2: Vendedor AcharPorDepartamento ===");
        Departamento dep = new Departamento(2, null);
        List<Vendedor> list = vendedorDao.acharPorDepartamento(dep);
        for (Vendedor obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n === TESTE 3: Vendedor AcharTodos ===");
        list = vendedorDao.acharTodos();
        for (Vendedor obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n === TESTE 4: Vendedor Inserir ===");
        Vendedor newVendedor = new Vendedor(null, "Luke", "luke@gmail.com", new Date(System.currentTimeMillis()),
                4000.0, dep);
        vendedorDao.inserir(newVendedor);
        System.out.println("INSERIDO! Novo ID = " + newVendedor.getId());

        System.out.println("\n === TESTE 5: Vendedor Atualizar ===");
        vendedor = vendedorDao.acharPorId(1);
        vendedor.setNome("Maria Silva");
        vendedorDao.atualizar(vendedor);
        System.out.println("ATUALIZADO COMPLETA!");
    }
}
