package ej.pkg2.poo.extra.Entidades;

import java.util.Scanner;

public class Puntos {

    public double x1;
    public double y1;
    public double x2;
    public double y2;

    public Puntos() {
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public void crearPuntos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese número x1");
        x1 = leer.nextDouble();
        System.out.println("Ingrese número x2");
        x2 = leer.nextDouble();
        System.out.println("Ingrese número y1");
        y1 = leer.nextDouble();
        System.out.println("Ingrese número y2");
        y2 = leer.nextDouble();
    }

    public double calcularDevolver() {
        double restax = this.x2 - this.x1;
        double restay = this.y2 - this.y1;
        double pot = Math.pow(restax, 2) + Math.pow(restay, 2);
        double result = Math.sqrt(pot);
        System.out.println(result);
        return result;
    }
}
