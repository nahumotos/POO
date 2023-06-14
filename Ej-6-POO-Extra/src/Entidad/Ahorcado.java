package Entidad;

import java.util.Scanner;

public class Ahorcado {

    private String[] palabra;
    private int letrasEncontradas;
    private int cantJugadasMaximas;
    private String[] palabraParcial;     //muestra guiones en las letras no descubiertas

    public Ahorcado() {
        this.palabra = null;
        this.letrasEncontradas = 0;
        this.cantJugadasMaximas = 0;
    }

    public Ahorcado(String[] palabra, int letrasEncontradas, int cantJugadasMaximas) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.cantJugadasMaximas = cantJugadasMaximas;
    }

    public void crearJuego(String palabraAhoracado, int cantJugadasMaximas) {

        this.palabra = new String[palabraAhoracado.length()];
        palabraParcial = new String[palabraAhoracado.length()];
        this.cantJugadasMaximas = cantJugadasMaximas;
        for (int i = 0; i < palabraAhoracado.length(); i++) {
            palabra[i] = palabraAhoracado.substring(i, i + 1);
            palabraParcial[i] = "_";
        }
        this.letrasEncontradas = 0;

    }

    public void longitud() {
        System.out.println("La palabra tiene " + palabra.length + " letras");
    }

    public void buscar(String letra) {
        boolean banderaEncontrada = false;
        for (int i = 0; i < palabra.length; i++) {
            if (letra.equals(palabra[i])) {
                banderaEncontrada = true;

            }
        }

        if (banderaEncontrada) {
            System.out.println("Mensaje: La letra pertenece a la palabra");
        } else {
            System.out.println("Mensaje: La letra no pertenece a la palabra");
        }
    }

    public boolean encontradas(String letra) {
        boolean banderaEncontrada = false;

        int letraEncontradaCantidad = 0;
        for (int i = 0; i < palabra.length; i++) {
            if (letra.equals(palabra[i])) {
                if (!letra.equals(palabraParcial[i])) {
                    letrasEncontradas++;
                    letraEncontradaCantidad++;
                }
                palabraParcial[i] = letra;
                banderaEncontrada = true;
            }
        }
        if (!banderaEncontrada) {
            cantJugadasMaximas--;
        } else {
        }

        System.out.println("Faltan encontrar " + ((palabra.length - letrasEncontradas)) + " letras");
        return banderaEncontrada;
    }

    public void intentos() {
        if (cantJugadasMaximas != 0) {
            System.out.println("Tiene " + cantJugadasMaximas + " intentos");
        } else {
            System.out.println("No tiene mas intentos");
        }

    }

    public void juego() {
        String letra = null;
        boolean seguir = true;
        Scanner leer = new Scanner(System.in);
        System.out.println("Juego del ahorcado: ");
        longitud();
        intentos();
        mostrarPalabraParcial();
        do {
            System.out.println("Ingrese letra...");
            letra = leer.next();
            buscar(letra);
            if (encontradas(letra)) {
                mostrarPalabraParcial();
            }

            intentos();
            if (palabra.length == letrasEncontradas) {
                System.out.println("Usted encontro la palabra!!!");
                seguir = false;
            }
            if (cantJugadasMaximas == 0) {
                mostrarPalabraParcial();
                System.out.println("Perdiste!");
                seguir = false;
            }

        } while (seguir);

    }

    private void mostrarPalabraParcial() {
        for (int i = 0; i < palabraParcial.length; i++) {
            System.out.print(palabraParcial[i] + " ");
        }
        System.out.println("");
    }

}
