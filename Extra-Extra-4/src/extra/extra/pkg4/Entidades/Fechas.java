package extra.extra.pkg4.Entidades;

import java.util.Scanner;

public class Fechas {

    public int dia;
    public int mes;
    public int año;

    public Fechas() {
    }

    Scanner leer = new Scanner(System.in);

    public void fecha() {
        System.out.println("Ingrese el año");
        año = leer.nextInt();
        System.out.println("Ingrese el mes");
        mes = leer.nextInt();
        System.out.println("Ingrese el dia");
        dia = leer.nextInt();

        if (año < 1900 || año > 2021) {
            System.out.println("El año ingresado no se encuentra entre el 1900 y el 2021");
            System.out.print("Año por defecto:");
            System.out.println(año = 1900);
        }

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("El mes tiene 31 días");
                if (dia > 31) {
                    System.out.println("dia incorrecto");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("El mes tiene 30 días");
                if (dia > 30) {
                    System.out.println("dia incorrecto");
                }
                break;
            case 2:
                System.out.println("El mes tiene 28 días o 29 si es año bisiesto");
                if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
                    if (dia > 29) {
                        System.out.println("dia incorrecto");
                    }
                } else {
                    if (dia > 28) {
                        System.out.println("dia incorrecto");
                    }
                }
                break;
            default:
                System.out.println("mes incorrecto");
        }
    }

    public void diaAnterior() {
        if (dia == 1 && mes == 1) {
            System.out.println("El día anterior es el 31/12/" + (año--));
        }
        switch (mes) {
            case 5:
            case 7:
            case 10:
            case 12:
                if (dia == 1) {
                    System.out.println("El día anterior es el 30/" + (mes - 1) + "/" + año);
                } else {
                    System.out.println("El día anterior es el " + (dia - 1) + "/" + mes + "/" + año);
                }
                break;
            case 2:
            case 4:
            case 6:
            case 8:
            case 9:
            case 11:
                if (dia == 1) {
                    System.out.println("El día anterior es el 31/" + (mes - 1) + "/" + año);
                } else {
                    System.out.println("El día anterior es el " + (dia - 1) + "/" + mes + "/" + año);
                }
                break;
            case 3:
                if (dia == 1) {
                    if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
                        System.out.println("El día anterior es el 29/" + (mes - 1) + "/" + año);
                    } else {
                        System.out.println("El día anterior es el 28/2/" + año);
                    }
                } else {
                    System.out.println("El día anterior es el " + (dia - 1) + "/" + mes + "/" + año);
                }
                break;
        }
    }

    public void diaPosterior() {
        int n = 1;
        if (dia == 31 && mes == 12) {
            System.out.println("El día siguiente es el 1/1/" + (año++));
        }

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (dia == 31) {
                    System.out.println("El día siguiente es el 1/" + (mes + n) + "/" + año);
                } else {
                    System.out.println("El día siguiente es el " + (dia + n) + "/" + mes + "/" + año);
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (dia == 30) {
                    System.out.println("El día siguiente es el 1/" + (mes + n) + "/" + año);
                } else {
                    System.out.println("El día siguiente es el " + (dia + n) + "/" + mes + "/" + año);
                }
                break;
            case 2:
                if (dia == 28) {
                    if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
                        System.out.println("El día siguiente es el 29/" + mes + "/" + año);
                    } else {
                        System.out.println("El día siguiente es el 1/3/" + año);
                    }
                    if (dia == 29) {
                        if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
                            System.out.println("El día siguiente es el 1/" + (mes + n) + "/" + año);
                        } else {
                            System.out.println("El día no existe");
                        }
                    } else {
                        System.out.println("El día siguiente es el " + (dia + n) + "/" + mes + "/" + año);
                    }
                }
        }
    }

    public void esBisiesto() {
        if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }
}
