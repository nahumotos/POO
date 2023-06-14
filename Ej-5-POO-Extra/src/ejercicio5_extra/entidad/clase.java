
package ejercicio5_extra.entidad;

import java.util.Scanner;

public class clase {

    public clase() {
    }
    
    Scanner sc = new Scanner(System.in);
   public void adivinar() {
        String[] array = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = array[(int) (Math.random() * 12)];
        String mes;
        do {
            System.out.println("Ingrese un mes");
            mes = sc.nextLine();
            if (mes.equals(mesSecreto)) {
                System.out.println("¡Ha acertado!");
            } else {
                System.out.println("No ha acertado");
            }
        } while (!mes.equals(mesSecreto));
   }
    
}
