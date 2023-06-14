package ej.pkg12.poo.Entidades;

import java.util.Date;

public class Persona {

    private String nombre;
    private Date fechaNac;
    private int anio;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int calcularEdad() {

        Date fechaActual = new Date();
        anio = fechaActual.getYear() - fechaNac.getYear();
        return anio;

    }

    public boolean menorQue(int edad) {

        if (anio < edad) {
            return true;

        } else {
            return false;
        }

    }

    public String mostrarPersona(String nombre, Date fechaNac) {
        return "Persona{" + "nombre=" + nombre + ", fechaNac=" + fechaNac + ", anio=" + anio + '}';
    }

}
