package extra.extra.pkg1.Entidades;

import java.util.Scanner;

public class Servicio {

    private int n1;
    private int n2;
    private int d1;
    private int d2;
    private int d;
    private int n;

    public Servicio() {
    }

    public Servicio(int n1, int n2, int d1, int d2) {
        this.n1 = n1;
        this.n2 = n2;
        this.d1 = d1;
        this.d2 = d2;
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public int getD1() {
        return d1;
    }

    public int getD2() {
        return d2;
    }

    public int getD() {
        return d;
    }

    public int getN() {
        return n;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void setD1(int d1) {
        this.d1 = d1;
    }

    public void setD2(int d2) {
        this.d2 = d2;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void setN(int n) {
        this.n = n;
    }

    Scanner leer = new Scanner(System.in);

    public void sumar(Servicio f) {
        int den = f.getD1() * f.getD2();
        int num = (den / f.getD1()) * (f.getN1()) + (den / f.getD2()) * (f.getN2());
        f.setN(num);
        f.setD(den);
        System.out.println(num + "/" + den);
    }

    public void restar(Servicio f) {
        int den = f.getD1() * f.getD2();
        int num = (den / f.getD1()) * (f.getN1()) - (den / f.getD2()) * (f.getN2());
        f.setN(num);
        f.setD(den);
        System.out.println(num + "/" + den);
    }

    public void multiplicar(Servicio f) {
        int den = f.getD1() * f.getD2();
        int num = f.getN1() * f.getN2();
        f.setN(num);
        f.setD(den);
        System.out.println(num + "/" + den);
    }

    public void dividir(Servicio f) {
        int den = f.getD1() * f.getN2();
        int num = f.getD2() * f.getN1();
        f.setN(num);
        f.setD(den);
        System.out.println(num + "/" + den);
    }

    public void reducir(Servicio f) {
        int num = f.getN();
        int den = f.getD();
        int entero = 0;

        do {
            if (num >= den) {
                num = num - den;
                entero++;
            }
        } while (num >= den);

        if (entero != 0) {

            if (num == 0) {
                System.out.println("La fraccion reducida es: " + entero);
            } else {
                System.out.println("La fraccion reducida es: " + entero + "+ (" + num + "/" + den + ")");
            }

        } else {
            System.out.println("La fraccion reducida es: " + num + "/" + den);
        }

    }
}
