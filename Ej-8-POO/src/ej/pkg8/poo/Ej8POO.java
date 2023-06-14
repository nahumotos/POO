package ej.pkg8.poo;

import ej.pkg8.poo.Entidades.Cadena;
import java.util.Scanner;

public class Ej8POO {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena c1 = new Cadena();
        c1.crearCadena();
        System.out.println("Cantidad de vocales de la frase ingresada: " + c1.mostrarVocales());
        System.out.println("La frase invertida es: " + c1.invertirFrase());
        System.out.println("Ingrese una letra para saber cuantas veces se repite");
        c1.vecesRepetido(leer.next());
        System.out.println("Ingrese una nueva frase para comparar su longitud con la frase que compone la clase");
        c1.compararLongitud(leer.next());
        System.out.println("Ingrese una nueva frase para unirla con la frase que compone la clase");
        c1.unirFrase(leer.next());
        System.out.println("Ingrese un caracter para reemplazar las letras 'a'");
        c1.reemplazar(leer.next());
        System.out.println("Ingrese una letra para ver si se encuentra dentro de la frase");
        c1.contiene(leer.next());

    }

}
