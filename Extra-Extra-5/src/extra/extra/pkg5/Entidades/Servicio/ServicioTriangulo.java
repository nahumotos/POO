
package extra.extra.pkg5.Entidades.Servicio;

import extra.extra.pkg5.Entidades.Triangulo;
import java.util.Scanner;

public class ServicioTriangulo {
       Scanner leer = new Scanner(System.in);

    public Triangulo crearTriangulo() {
        System.out.println("Ingrese el tamaño del lado desigual del triángulo isósceles");
        double l1 = leer.nextDouble();
        System.out.println("Ingrese el tamaño de los lados iguales del triángulo isósceles");
        double l2 = leer.nextDouble();
        System.out.println("");
        return  new Triangulo(l1,l2);
    }
    
}
