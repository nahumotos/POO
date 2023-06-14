package ej.pkg7.poo;

import ej.pkg7.poo.Entidades.Persona;
import ej.pkg7.poo.Entidades.Servicio.ServicioPersona;

public class Ej7POO {

    public static void main(String[] args) {
        ServicioPersona sp = new ServicioPersona();
//  int p1IMC,p2IMC,p3IMC,p4IMC; //IMC de cada persona
//  boolean p1MayorDeEdad,p2MayorDeEdad,p3MayorDeEdad,p4MayorDeEdad;  //Es mayor de edad de cada persona(True/False)

        int pesoBajo = 0, pesoIdeal = 0, pesoSuperior = 0;
        int contMayorEdad = 0;

        int tam = 4;                                      //cantidad de personas
        Persona[] p = new Persona[tam];
        for (int i = 0; i < p.length; i++) {
            p[i] = sp.crearPersona();
        }

        int[] arrayIMC = new int[tam];                    // guardo los 4 IMC
        boolean[] arrayEsMayorDeEdad = new boolean[tam];  // guardo las 4 edades

        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].toString());
        }

        for (int i = 0; i < p.length; i++) {
            System.out.println("");
            System.out.println("Calcular IMC de " + p[i].getNombre());
            arrayIMC[i] = p[i].calcularIMC();
            System.out.println("IMC =" + arrayIMC[i]);
            imc(p[i]);                                              // sout de IMC con valores int de retorno
            arrayEsMayorDeEdad[i] = p[i].esMayorDeEdad();
            System.out.println(p[i].getNombre() + " usted es mayor de edad? " + arrayEsMayorDeEdad[i]);
        }
        for (int i = 0; i < p.length; i++) {
            if (arrayIMC[i] == -1) {
                pesoBajo++;
            }
            if (arrayIMC[i] == 0) {
                pesoIdeal++;
            }
            if (arrayIMC[i] == 1) {
                pesoSuperior++;
            }
            if (arrayEsMayorDeEdad[i]) {
                contMayorEdad++;
            }
        }
        System.out.println("");
        System.out.println("Porcentaje de personas con peso bajo " + (float) ((pesoBajo * 100 / tam)) + "%");
        System.out.println("Porcentaje de personas con peso ideal " + (float) ((pesoIdeal * 100 / tam)) + "%");
        System.out.println("Porcentaje de personas con sobrepeso " + (float) ((pesoSuperior * 100 / tam)) + "%");
        System.out.println("");
        System.out.println("Porcentaje de personas mayores de edad " + (float) ((contMayorEdad * 100 / tam)) + "%");
        System.out.println("Porcentaje de personas menores de edad " + (float) (((tam - contMayorEdad) * 100 / tam)) + "%");
    }

    private static void imc(Persona p) {
        int resultado = p.calcularIMC();
        int l = 0;
        switch (resultado) {
            case -1:
                System.out.println(p.getNombre() + " usted tiene bajo peso");
                break;
            case 0:
                System.out.println(p.getNombre() + " usted esta en el peso ideal");
                break;
            default:
                System.out.println(p.getNombre() + " usted tiene sobrepeso");
                break;
        }
    }

}
