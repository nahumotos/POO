
package ej.pkg12.poo.Entidades.Servicio;

import ej.pkg12.poo.Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class ServicioPersona {
    
    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {

        System.out.println("Ingrese nombre");
        String nombre = leer.next();

        System.out.println("Ingrese fecha de nacimiento");
        System.out.println("Día");
        int dia = leer.nextInt();
        System.out.println("Mes");
        int mes = leer.nextInt();
        System.out.println("Año");
        int anio = leer.nextInt();

        Date fechaNac = new Date(anio - (1900), mes - (1), dia);
        return new Persona(nombre, fechaNac);
    }


}
