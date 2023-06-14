package ej.pkg5.poo;

import ej.pkg5.poo.Entidades.Cuenta;
import java.util.Scanner;

public class Ej5POO {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Cuenta c1 = new Cuenta();
        c1.crearCuenta();
        System.out.println("Escriba importe a ingresar en su cuenta");
        c1.ingresar(leer.nextDouble());
        System.out.println("Ingrese importe a retirar en su cuenta");
        c1.retirar(leer.nextDouble());
        System.out.println("Ingrese importe a extraer en su cuenta");
        c1.extraccionRapida(leer.nextDouble());
        System.out.println("Consulte Saldo");
        System.out.println(c1.consultarSaldo());
        System.out.println("Consulte los Datos de la cuenta");
        System.out.println(c1.toString());
    }

}
