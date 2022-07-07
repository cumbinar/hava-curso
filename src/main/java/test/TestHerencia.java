
package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

/**
 *
 * @author educu
 */
public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Cumbi ", 500000);
        System.out.println("empleado1 = " + empleado1);
        
        Cliente cliente = new Cliente(new Date(), true, "Eduardo",'F', 62, "carrera 27 calle 9");
        System.out.println("cliente = " + cliente); //imprime los atributos de la clase hijo y clase padre
    }
}
