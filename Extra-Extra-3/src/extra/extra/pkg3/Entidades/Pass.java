package extra.extra.pkg3.Entidades;

import java.util.Scanner;

public class Pass {

    Scanner leer = new Scanner(System.in);

    private String pass;
    private String nombre;
    private int dni;

    public Pass(String nombre, int dni) {

        this.nombre = nombre;
        this.dni = dni;
    }

    public Pass() {
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void crearPass() {
        String passCreada = "";

        do {

            System.out.println("Ingrese la contraseña");
            passCreada = leer.next();
            if (passCreada.length() == 10) {
                setPass(passCreada);
            } else {
                System.out.println("Contraseña no válida. Ingrese nuevamente");
            }

        } while (passCreada.length() != 10);

    }

    public void analizarPass() {
        int cont = 0;
        for (int i = 0; i < pass.length(); i++) {

            if (pass.substring(i, i + 1).equals("a")) {
                cont++;
            }
        }
        if (this.pass.contains("z")) {
            System.out.println("Nivel Medio");
        } else if (this.pass.contains("z") && cont >= 2) {
            System.out.println("Nivel Alto");
        } else {
            System.out.println("Nivel Bajo");
        }
    }

    public void modificarPass() {
        String clave;

        do {
            System.out.println("Ingrese la contraseña actual");
            clave = leer.next();
            if (clave.equals(this.pass)) {
                crearPass();
                clave = this.pass;
            }
        } while (!clave.equals(this.pass));
    }

    public void modificarNombre() {
        String clave;

        do {
            System.out.println("Ingrese la contraseña");
            clave = leer.next();
            if (clave.equals(pass)) {
                System.out.println("Ingrese su nombre");
                setNombre(leer.next());
            }
        } while (!clave.equals(pass));
    }

    public void modificarDni() {
        String clave;

        do {
            System.out.println("Ingrese la contraseña");
            clave = leer.next();
            if (clave.equals(pass)) {
                System.out.println("Ingrese su DNI");
                setDni(leer.nextInt());
            }
        } while (!clave.equals(pass));
    }
}
