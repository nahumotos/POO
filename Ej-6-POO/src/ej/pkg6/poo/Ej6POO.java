package ej.pkg6.poo;

import ej.pkg6.poo.Entidades.Cafetera;
import java.util.Scanner;

public class Ej6POO {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Capacidad Máxima y Carga Actual de la Cafetera");
        Cafetera c1 = new Cafetera(leer.nextInt(), leer.nextInt());

        c1.llenarCafetera();
        System.out.println("Sírvase una taza de café");
        c1.servirTaza(leer.nextInt());
        System.out.println("Cantidad actual de la cafetera: " + c1.getCantidadActual());
        c1.vaciarCafetera();
        System.out.println("Cantidad actual de la cafetera: " + c1.getCantidadActual());
        System.out.println("Agregue cantidad de café:");
        c1.agregarCafe(leer.nextInt());
        System.out.println("Cantidad actual de la cafetera: " + c1.getCantidadActual());

    }

}
