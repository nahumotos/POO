package extra.extra.pkg1;

import extra.extra.pkg1.Entidades.Servicio;
import java.util.Scanner;

public class ExtraExtra1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numerador y denominador de la 1era fracción");
        int n1 = leer.nextInt();
        int d1 = leer.nextInt();
        System.out.println("Ingrese el numerador y denominador de la 2da fracción");
        int n2 = leer.nextInt();
        int d2 = leer.nextInt();

        Servicio f = new Servicio(n1, n2, d1, d2);

        int op;

        do {
            System.out.println("MENU");
            System.out.println("1- SUMAR");
            System.out.println("2- RESTAR");
            System.out.println("3- MULTPLICAR");
            System.out.println("4- DIVIDIR");
            System.out.println("5- SALIR");
            System.out.println("Ingrese operación a realizar");
            op = leer.nextInt();

            switch (op) {
                case 1:

                    f.sumar(f);
                    f.reducir(f);
                    break;
                case 2:
                    f.restar(f);
                    f.reducir(f);
                    break;
                case 3:
                    f.multiplicar(f);
                    f.reducir(f);
                    break;
                case 4:
                    f.dividir(f);
                    f.reducir(f);
                    break;
                case 5:

                    break;
                default:
            }
        } while (op != 5);
    }
}
