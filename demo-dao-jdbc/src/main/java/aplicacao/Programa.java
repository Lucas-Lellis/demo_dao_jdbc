package aplicacao;

import model.dao.FabricaDao;
import model.dao.VendedorDao;
import model.entidades.Departamento;
import model.entidades.Vendedor;

import java.time.LocalDate;

public class Programa {

    public static void main(String[] args) {

        VendedorDao vendedorDao = FabricaDao.criarVendedorDao();
        Vendedor vendedor = vendedorDao.acharPorId(3);

        System.out.println(vendedor);
    }
}
