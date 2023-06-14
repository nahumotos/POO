package ej.pkg7.poo.Entidades;

public class Persona {
    //atributos

    private String nombre;
    private int edad;
    private String sexo; //H,M,O
    private float peso;
    private float altura;
    //constructor

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    //metodos
    public int calcularIMC() {
        int imc = (int) (peso / (altura * altura));
        if (imc < 20) {
            return -1;  //bajo del peso ideal
        } else if (imc >= 20 && imc <= 25) {
            return 0;   //peso iedal
        } else {
            return 1; //sobrepeso
        }
    }

    public boolean esMayorDeEdad() {
        if (edad > 18) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Nombre = " + nombre + "\n" + "Edad = " + edad + "\n" + "Sexo =" + sexo + "\n" + "Peso =" + peso + "\n" + "Altura =" + altura + "\n";
    }

}
