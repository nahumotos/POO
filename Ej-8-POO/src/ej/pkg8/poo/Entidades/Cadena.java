package ej.pkg8.poo.Entidades;

import java.util.Scanner;

public class Cadena {

    private String frase;
    private int longitud;

    public Cadena() {
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void crearCadena() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase");
        this.frase = leer.next();
    }

    public int mostrarVocales() {
        int acu = 0;
        // charAt: Retorna el carácter especificado en la posición index
        for (int i = 0; i < this.frase.length(); i++) {
            if ((this.frase.charAt(i) == 'a') || (this.frase.charAt(i) == 'e') || (this.frase.charAt(i) == 'i') || (this.frase.charAt(i) == 'o') || (this.frase.charAt(i) == 'u')) {
                acu++;
            }
        }
        return acu;
    }

    public String invertirFrase() {
        // convierte la string dada en una secuencia de caracteres
        char[] ch = frase.toCharArray();
        int c = 0;
        int f = ch.length - 1;
        char temp;
        while (f > c) {
            temp = ch[c];
            ch[c] = ch[f];
            ch[f] = temp;
            f--;
            c++;
        }
        return new String(ch);
    }

    public void vecesRepetido(String letra) {
        int posicion, cont = 0;
        posicion = this.frase.indexOf(letra);
        // indexOf devuelve la posición, mediante un número entero, de una cadena
        while (posicion != -1) {
            cont++;
            posicion = this.frase.indexOf(letra, posicion + 1);
        }
        System.out.println("El caracter " + letra + " se repite unas " + cont + " veces");
    }

    public void compararLongitud(String frase) {
        this.longitud = this.frase.length();
        int length2 = frase.length();
        System.out.println("La frase que compone la clase tiene " + this.longitud + " caracteres");
        System.out.println("La frase nueva ingresada por el usuario tiene " + length2 + " caracteres");
        if (this.longitud == length2) {
            System.out.println("Las longitudes son iguales");
        } else {
            System.out.println("Las longitudes son distintas");
        }
    }

    public void unirFrase(String frase) {
        System.out.println(this.frase + frase);
    }

    public void reemplazar(String letra) {
        String frasenueva = this.frase.replace("a", letra);
        System.out.println(frasenueva);
    }

    public void contiene(String letra) {
        boolean contain = true;
        if (this.frase.contains(letra)) {
            System.out.println(contain);
        } else {
            System.out.println(false);
        }
    }

}
