package aplicacao;

import model.dao.FabricaDao;
import model.dao.VendedorDao;
import model.entidades.Departamento;
import model.entidades.Vendedor;

import java.time.LocalDate;

public class Programa {

    public static void main(String[] args) {

        Departamento obj = new Departamento(1, "Livros");
        Vendedor vendedor = new Vendedor(21, "Jason", "jason@gmail.com", LocalDate.of(2005,
                04, 23), 3000.0 , obj);

        VendedorDao vendedorDao = FabricaDao.criarVendedorDao();
        
        System.out.println(vendedor);
    }
}
