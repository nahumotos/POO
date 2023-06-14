package ej.pkg6.poo.Entidades;

public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {

    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera() {
        System.out.println("Se ha igualado la cantidad actual con la capacidad máxima");
        this.cantidadActual = this.capacidadMaxima;
    }

    public int servirTaza(int taza) {
        if (taza > this.cantidadActual) {
            System.out.println("La taza está llena: " + this.cantidadActual);
            return this.cantidadActual = 0;
        } else {
            System.out.println("La taza se llenó");
            return this.cantidadActual -= taza;
        }
    }

    public void vaciarCafetera() {
        System.out.println("Se vació la cafetera");
        this.cantidadActual = 0;
    }

    public void agregarCafe(int carga) {
        if (this.cantidadActual + carga > this.capacidadMaxima) {
            System.out.println("La cafetera está llena a su capacidad máxima");
        } else {
            this.cantidadActual += carga;
        }
    }

}
