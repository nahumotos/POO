package Entidades;

import java.util.Scanner;

public class Libro {

    // atributos
    public int ISBN;
    public String titulo;
    public String autor;
    public int numeropag;

    // constructor vacio
    public Libro() {

    }

    // constructor con todos los atributos pasados por parámetro
    public Libro(int ISBN, String titulo, String autor, int numeropag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeropag = numeropag;
    }

    public void cargarLibro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el ISBN del libro");
        this.ISBN = leer.nextInt();
        System.out.println("Ingrese el título del libro");
        this.titulo = leer.next();
        System.out.println("Ingrese el autor del libro");
        this.autor = leer.next();
        System.out.println("Ingrese el número de páginas del libro");
        this.numeropag = leer.nextInt();
    }

    // Método 
    @Override
    public String toString() {
        return "Libro" + " ISBN = " + ISBN + ", titulo = " + titulo + ", autor = " + autor + ", numeropag = " + numeropag;
    }

}
