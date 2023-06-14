package ej.pkg4.poo;

import ej.pkg4.poo.Entidades.Rectangulo;

public class Ej4POO {

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        r1.crearRectangulo();
        System.out.println("La superficie del rectángulo es ");
        System.out.println(r1.superficie());
        System.out.println("El perímetro del rectángulo es ");
        System.out.println(r1.perimetro());
        System.out.println("El dibujo del rectángulo es ");
        r1.dibujo();
    }

}
