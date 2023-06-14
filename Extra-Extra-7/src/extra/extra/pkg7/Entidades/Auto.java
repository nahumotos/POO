package extra.extra.pkg7.Entidades;

import java.util.Scanner;

public class Auto {

    Scanner leer = new Scanner(System.in);

    public String nombre;
    public int fechavec;
    public String color;
    public String modelo;
    public int km = 7500;

    public Auto() {
    }

    public Auto(String nombre, int fechavec, String color, String modelo, int km) {
        this.nombre = nombre;
        this.fechavec = fechavec;
        this.color = color;
        this.modelo = modelo;
        this.km = km;
    }

    public void cargarFicha() {
        System.out.println("Ingrese nombre");
        nombre = leer.next();
        System.out.println("Ingrese fecha de vencimiento del carnet");
        fechavec = leer.nextInt();
        System.out.println("Ingrese color");
        color = leer.next();
        System.out.println("Ingrese modelo");
        modelo = leer.next();
        System.out.println("KM en motor:" + km);
    }

    public String modificarTitularidad() {
        String nuevon = "";
        System.out.println("Ingrese nuevo nombre");
        nuevon = leer.next();
        return this.nombre = nuevon;
    }

    public int trayectoRecorrido() {
        int tr = 0;
        System.out.println("Ingrese trayecto recorrido");
        tr = leer.nextInt();
        return this.km = tr;
    }

    public void serviceAuto() {
        if (km < 10000) {
            System.out.println("No será necesario realizar el service");
        } else {
            System.out.println("Será necesario realizar el service");
        }
    }

    @Override
    public String toString() {
        return "Auto{" + "leer=" + leer + ", nombre=" + nombre + ", fechavec=" + fechavec + ", color=" + color + ", modelo=" + modelo + ", km=" + km + '}';
    }
}
