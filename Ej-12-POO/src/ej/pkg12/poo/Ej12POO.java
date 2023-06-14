package ej.pkg12.poo;

import ej.pkg12.poo.Entidades.Persona;
import ej.pkg12.poo.Entidades.Servicio.ServicioPersona;

public class Ej12POO {

    public static void main(String[] args) {

        ServicioPersona sp = new ServicioPersona();
        Persona p1 = sp.crearPersona();
        Persona p2 = sp.crearPersona();
        Persona p3 = sp.crearPersona();
        Persona p4 = sp.crearPersona();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }

}
