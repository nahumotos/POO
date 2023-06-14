
package Entidades;

import java.util.Scanner;

public class NIF {
    Scanner leer = new Scanner(System.in);
    private long DNI;
    private String letra;

    public NIF(long DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public NIF() {
    }

    public long getDNI() {
        return DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    public void crearNif(){
       
        System.out.println("Ingrese su DNI");
        DNI= leer.nextLong();
        String[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
  
         int posicion= (int) DNI%23;
         
         letra = letras [posicion];    
        }
    public void mostrar(){
        System.out.println("El NIF es: " + DNI + "-" + letra);
    }
}
