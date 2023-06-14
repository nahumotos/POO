
package Entidades;

public class Raices {
   public Double a,b,c;

    public Raices() {
    }

    public Raices(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Double Discriminante (){
        
        return Math.pow(b,2)-4*a*c;
    }
  
    public boolean tieneRaices(){
        
       return Discriminante()>0; 
    }
    public boolean tieneRaiz(){
        
        return Discriminante()==0;
    }
    public void obtenerRaices(){
        double raiz1, raiz2;
        if (tieneRaices()) {
        
            raiz1 = (-b+Math.sqrt(Discriminante ())/(2*a));
            raiz2 = (-b-Math.sqrt(Discriminante ())/(2*a));
            System.out.println("La Raiz 1 da como resultado: "+(double) Math.round(raiz1*100d)/100);
            System.out.println("La Raiz 2 da como resultado: "+(double) Math.round(raiz2*100d)/100);
            
        }
        
    }
    public void obtenerRaiz(){  
        double raiz1;
        if (tieneRaiz()) {
            raiz1 = -b/(2*a);
            System.out.println("El resultado de la raiz da: "+(double) Math.round(raiz1*100d)/100);
        }

                
    }
    public void calcular(){
        if (tieneRaices()) {
            obtenerRaices();
        }else if(tieneRaiz()){        
            obtenerRaiz();
    }else{
            System.out.println(" No tiene solucion! ");       
    }
   }
   
    
 }