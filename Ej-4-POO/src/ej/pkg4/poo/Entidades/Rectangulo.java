package ej.pkg4.poo.Entidades;

import java.util.Scanner;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectángulo");
        this.base = leer.nextInt();
        System.out.println("Ingrese la altura del rectángulo");
        this.altura = leer.nextInt();
    }

    public int superficie() {
        return (this.base * this.altura);
    }

    public int perimetro() {
        return ((this.base + this.altura) * 2);
    }

    public void dibujo() {
        for (int j = 0; j < this.altura; j++) {
            for (int i = 0; i < this.base; i++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

}
