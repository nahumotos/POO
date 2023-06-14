package ej.pkg3.poo;

import ej.pkg3.poo.Entidades.Operacion;

public class Ej3POO {

    public static void main(String[] args) {
        Operacion op = new Operacion();
        op.crearOperacion();
        System.out.println("La suma de los números da como resultado");
        op.sumar();
        System.out.println("La resta de los números da como resultado");
        System.out.println(op.restar());
        System.out.println("La multiplicación de los números da como resultado");
        System.out.println(op.multiplicar());
        System.out.println("La división de los números da como resultado");
        System.out.println(op.dividir());

    }

}
