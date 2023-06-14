package ej.pkg9.poo;

import ej.pkg9.poo.Entidades.Matematica;

public class Ej9POO {

    public static void main(String[] args) {
        Matematica num1 = new Matematica(Math.random() * 10, Math.random() * 10);
        num1.devolverMayor();
        num1.calcularPotencia();
        num1.calcularRaiz();
    }

}
