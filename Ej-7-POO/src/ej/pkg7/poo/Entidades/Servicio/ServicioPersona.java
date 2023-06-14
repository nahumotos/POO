package ej.pkg7.poo.Entidades.Servicio;

import ej.pkg7.poo.Entidades.Persona;
import java.util.Scanner;

public class ServicioPersona {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        System.out.println("Ingrese nombre:");
        String nombre = leer.next();

        System.out.println("Ingrese edad:");
        int edad = leer.nextInt();

        String sexo = "";
        do {
            System.out.println("Ingrese sexo(H:hombre,M:mujer,O:otro)");
            sexo = leer.next();
        } while (!(sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("O")));

        System.out.println("Ingrese su peso en (kg):");
        float peso = leer.nextFloat();

        System.out.println("Ingrese su altura en (m)");
        float altura = leer.nextFloat();

        return new Persona(nombre, edad, sexo, peso, altura);
    }

}
