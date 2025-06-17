package aplicacao;

import model.entidades.Departamento;
import model.entidades.Vendedor;

import java.time.LocalDate;

public class Programa {

    public static void main(String[] args) {

        Departamento obj = new Departamento(1, "Livros");
        Vendedor vendedor = new Vendedor(21, "Jason", "jason@gmail.com", LocalDate.of(2005,
                04, 23), 3000.0 , obj);
        System.out.println(vendedor);
    }
}
