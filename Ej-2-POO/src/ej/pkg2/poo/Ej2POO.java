package ej.pkg2.poo;

import ej.pkg2.poo.Entidades.Circunferencia;

public class Ej2POO {

    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia();
        c1.crearCircunferencia();
        System.out.println("El area es ");
        System.out.println(Math.round(c1.area()));
        System.out.println("El perimetro es ");
        System.out.println(Math.round(c1.perimetro()));

    }

}
