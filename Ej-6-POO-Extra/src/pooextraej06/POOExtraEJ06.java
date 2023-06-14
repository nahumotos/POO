
package pooextraej06;

import Entidad.Ahorcado;
import java.util.Scanner;

public class POOExtraEJ06 {

    public static void main(String[] args) {
        String palabraAhorcado;
        int intentos ;
        Scanner leer = new Scanner(System.in);

        System.out.println("Juego del ahorcado, ingrese una palabra a para encontrar...");
        palabraAhorcado = leer.next();
        System.out.println("Ingrese numero de intentos");
        intentos = leer.nextInt();
        Ahorcado ahorcado = new Ahorcado();
        ahorcado.crearJuego(palabraAhorcado, intentos);
        
        ahorcado.juego();  
        
    }
    
}
