package extra.extra.pkg6.Entidades;

import java.util.Arrays;
import java.util.Scanner;

public class SopaDeLetras {

    Scanner sc = new Scanner(System.in);
    private String[][] matriz = {{"O", "E", "P", "E", "R", "R", "O", "T", "X", "Y"},
    {"L", "W", "R", "O", "L", "I", "V", "A", "Y", "U"},
    {"A", "U", "T", "O", "S", "D", "F", "T", "R", "K"},
    {"G", "J", "Y", "R", "C", "O", "V", "I", "D", "L"},
    {"L", "A", "P", "I", "Z", "T", "R", "H", "Y", "Ñ"},
    {"Ñ", "H", "F", "S", "C", "A", "S", "A", "S", "B"},
    {"S", "O", "L", "E", "S", "G", "V", "C", "N", "X"},
    {"V", "W", "Q", "B", "O", "M", "B", "A", "L", "P"},
    {"I", "U", "T", "I", "N", "T", "O", "Y", "S", "K"},
    {"L", "L", "J", "Y", "R", "M", "U", "N", "D", "O"}};

    private String palabraAEncontrar;

    String palabras[] = {"PERRO", "OLIVA", "AUTOS", "COVID", "LAPIZ", "CASAS", "SOLES", "BOMBA", "TINTO", "MUNDO"};

    public SopaDeLetras() {
        //crearSopaDeLetras();
    }

    public SopaDeLetras(String[][] matriz, String palabraAEncontrar) {
        this.matriz = matriz;
        this.palabraAEncontrar = palabraAEncontrar;
    }

    public String[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }

    public String getPalabraAEncontrar() {
        return palabraAEncontrar;
    }

    public void setPalabraAEncontrar(String palabraAEncontrar) {
        this.palabraAEncontrar = palabraAEncontrar;
    }

    @Override
    public String toString() {
        return "Ejercicio6{" + "matriz=" + Arrays.toString(matriz) + ", palabraAEncontrar=" + palabraAEncontrar + '}';
    }

    /*Crear métodos: ● Que el usuario ingrese una
 * palabra y la busque en la matriz. Deberá retornar en que posición de la
 * matriz inicia la palabra.*/
    public int[] buscarPalabra() {
        int[] vp = new int[2];
        System.out.println("Ingrese la palabra que desea buscar");
        palabraAEncontrar = sc.next();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {

                if (palabraAEncontrar.substring(0, 1).equals(matriz[i][j])) {
                    if (comprobar(i, j, palabraAEncontrar)) {
                        System.out.println("La palabra fue encontrada en la posicion " + i + " " + j);
                        vp[0] = i;
                        vp[1] = j;
                    }

                }

                if (i == 9 && j == 5 && !comprobar(i, j, palabraAEncontrar)) {
                    vp[0] = -1;
                    vp[1] = -1;
                    System.out.println("La palabra no fue encontrada");
                }
            }
        }
        return vp;
    }

    private boolean comprobar(int i, int j, String palabra) {
        boolean comprobar = true;
        for (int k = j; k < j + 5; k++) {
            if (comprobar && !matriz[i][k].equals(palabraAEncontrar.substring(k - j, k - j + 1))) {
                comprobar = false;

            }

        }
        return comprobar;
    }

    public void imprimirSopa() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println("");
        }

    }

    public void imprimirSopaInvertida() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + matriz[j][i]);
            }
            System.out.println("");
        }
    }

    public void reemplazarPalabra() {
        String palabraAModificar = sc.next();
        String nuevaPalabra = "";
        int i = 0;
        do {
            System.out.println("Ingrese la palabra que desea modificar");
            palabraAModificar = sc.next();
            i++;

        } while (!palabras[i - 1].equals(palabraAModificar) && i < 5);

        do {

            System.out.println("Elije la nueva palabra");

        } while (palabraAModificar.length() != 5);
        for (i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                if (palabraAModificar.substring(0, 1).equals(matriz[i][j])) {
                    if (comprobar(i, j, palabraAModificar)) {
                        System.out.println("La palabra fue encontrada en la posicion " + i + " " + j);
                        i = 10;
                        j = 6;
                    }

                }

                if (i == 10 && j == 6 && !comprobar(i, j, palabraAModificar)) {
                    System.out.println("La palabra no fue encontrada");
                }
            }
        }
    }

}
