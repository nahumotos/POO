package ej.pkg10.poo;

import java.util.Arrays;

public class Ej10POO {

    public static void main(String[] args) {
        int[] va  = new int[50];
        for (int i = 0; i < 50; i++) {
            va[i] = (int) (Math.random() * 100);
        }

        System.out.println("Arreglo A");
        System.out.println(Arrays.toString(va));
        Arrays.sort(va);
        System.out.println("Arreglo A ordenado de menor a mayor");
        System.out.println(Arrays.toString(va));
        System.out.println("Se copian los primeros 10 números ordenados del arreglo A al arreglo B de 20 elementos, y se rellenan los 10 últimos elementos con valores de 0 a 5.");

        int[] vb = Arrays.copyOf(va, 20);
        for (int i = 10; i < 20; i++) {
            vb[i] = (int) (Math.random() * 6);
        }
        System.out.println(Arrays.toString(vb));
        System.out.println("");
    }

}
