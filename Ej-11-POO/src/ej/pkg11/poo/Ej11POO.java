package ej.pkg11.poo;

import java.util.Date;
import java.util.Scanner;

public class Ej11POO {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dia, mes, anio;
        System.out.println("Ingrese el día");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        mes = leer.nextInt();
        System.out.println("Ingrese el año");
        anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        Date fechaActual = new Date();
        System.out.println(fecha.getDate() + "/" + (fecha.getMonth() + 1) + "/" + fecha.getYear() + 1900);
        System.out.println("La diferencia entre el año ingresado y el actual es " + (fechaActual.getYear() - (fecha.getYear())));

    }

}
