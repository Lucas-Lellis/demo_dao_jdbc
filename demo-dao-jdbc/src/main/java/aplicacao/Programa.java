package aplicacao;

import model.dao.FabricaDao;
import model.dao.VendedorDao;
import model.entidades.Departamento;
import model.entidades.Vendedor;
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

    }
}
