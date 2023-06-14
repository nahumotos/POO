package extra.extra.pkg5;

import extra.extra.pkg5.Entidades.Servicio.ServicioTriangulo;
import extra.extra.pkg5.Entidades.Triangulo;

public class ExtraExtra5 {

    public static void main(String[] args) {
        ServicioTriangulo st = new ServicioTriangulo();

        Triangulo[] t = new Triangulo[4];

        
        for (int i = 0; i < t.length; i++) {
            t[i] = st.crearTriangulo();
        }

        double[] arrayArea = new double[4];

        double[] arrayPer = new double[4];

        for (int i = 0; i < t.length; i++) {
            System.out.println("");
            System.out.println("El área del triangulo " + i + " es: " + t[i].calcularArea());
            arrayArea[i] = t[i].calcularArea();
            System.out.println("El perímetro del triangulo " + i + " es: " + t[i].calcularPerimetro());
            arrayPer[i] = t[i].calcularPerimetro();
        }

        Double areaMayor = t[0].calcularArea();
        int pos = 0;
        for (int i = 1; i < t.length; i++) {
            if (arrayArea[i] > areaMayor) {
                pos = i;
            }
        }

        System.out.println("Trangulo de area mayor es: " + t[pos].toString() + " y sus datos son: " + " área= " + t[pos].calcularArea() + " perímetro= " + t[pos].calcularPerimetro());
    }
}
