package extra.extra.pkg3;

import extra.extra.pkg3.Entidades.Pass;
import java.util.Scanner;

public class ExtraExtra3 {

    public static void main(String[] args) {
        Pass pass = new Pass();
        String op;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("-------MENU--------");
            System.out.println("1. Ingresar contraseña");
            System.out.println("2. Consultar nivel de contraseña");
            System.out.println("3. Modificar contraseña");
            System.out.println("4. Modificar nombre");
            System.out.println("5. Modificar DNI");
            System.out.println("6. SALIR");
            System.out.println("Ingrese una opción del menú");
            op = leer.next();

            switch (op) {
                case "1":
                    pass.crearPass();
                    break;
                case "2":
                    pass.analizarPass();
                    break;
                case "3":
                    pass.modificarPass();
                    break;
                case "4":
                    pass.modificarNombre();
                    break;
                case "5":
                    pass.modificarDni();
                    break;
                case "6":
                    break;

            }
        } while (!op.equals("6"));

    }
}
