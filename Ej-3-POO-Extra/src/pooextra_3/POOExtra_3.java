
package pooextra_3;

import Entidades.Raices;
import java.util.Scanner;


public class POOExtra_3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese los 3 valores: ");
        Raices R1 = new Raices (leer.nextDouble(),leer.nextDouble(),leer.nextDouble());
        
        R1.calcular();
   
    }
    
}
