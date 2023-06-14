package ej.pkg9.poo.Entidades;

public class Matematica {

    private double n1;
    private double n2;

    public Matematica() {

    }

    public Matematica(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public void devolverMayor() {
        System.out.println(n1);
        System.out.println(n2);
        if (n1 > n2) {
            System.out.println(n1 + " es el mayor");
        } else {
            System.out.println(n2 + " es el mayor");
        }
    }

    public void calcularPotencia() {
        n1 = Math.round(n1);
        n2 = Math.round(n2);
        if (n1 > n2) {
            System.out.println(n1 + " elevado por el número " + n2 + " es igual a " + Math.pow(n1, n2));
        } else {
            System.out.println(n2 + " elevado por el número " + n1 + " es igual a " + Math.pow(n2, n1));
        }
    }

    public void calcularRaiz() {
        n1 = Math.round(n1);
        n2 = Math.round(n2);
        if (n1 < n2) {
            System.out.println("La raíz cuadrada de " + n1 + " es igual a " + Math.sqrt(Math.round(n1)));
        } else {
            System.out.println("La raíz cuadrada de " + n1 + " es igual a " + Math.sqrt(Math.round(n2)));
        }
    }

}
