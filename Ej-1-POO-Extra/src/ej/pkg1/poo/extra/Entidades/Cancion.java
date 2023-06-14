package ej.pkg1.poo.extra.Entidades;

import java.util.Scanner;

public class Cancion {

    private String titulo;
    private String autor;

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Cancion() {
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCancion() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCancion(String cancion) {
        this.autor = cancion;
    }

    public void crearCancion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese título");
        this.titulo = leer.next();
        System.out.println("Ingrese autor");
        this.autor = leer.next();
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", autor=" + autor + '}';
    }
}
