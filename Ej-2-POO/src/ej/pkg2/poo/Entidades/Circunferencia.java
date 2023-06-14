package ej.pkg2.poo.Entidades;

import java.util.Scanner;

public class Circunferencia {

    // atributo
    public double radio;

    // constructor
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {

    }

    // setter (modifica el estado del objeto)
    public void setRadio(double radio) {
        this.radio = radio;
    }

    // getter (muestra el estado del objeto)
    public double getRadio() {
        return radio;
    }

    // metodo crearcircunferencia
    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese radio");
        this.radio = leer.nextDouble();
    }

    //metodo area
    public double area() {

        return (Math.PI * this.radio * this.radio);
    }

    //metodo perimetro
    public double perimetro() {
        return (Math.PI * 2 * this.radio);
    }

}
