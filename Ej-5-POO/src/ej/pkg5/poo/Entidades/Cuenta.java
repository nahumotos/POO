package ej.pkg5.poo.Entidades;

import java.util.Scanner;

public class Cuenta {

    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;

    public Cuenta() {

    }

    public Cuenta(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void crearCuenta() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese número de cuenta");
        this.numeroCuenta = leer.nextInt();
        System.out.println("Ingrese DNI");
        this.dniCliente = leer.nextLong();
        System.out.println("Ingrese saldo actual");
        this.saldoActual = leer.nextDouble();
    }

    public double ingresar(double ingreso) {
        return this.saldoActual = this.saldoActual + ingreso;
    }

    public double retirar(double retiro) {
        if (this.saldoActual < retiro) {
            System.out.println("La cuenta no tiene esa cantidad de dinero para realizar el retiro. La cuenta se vuelve a 0");
            return 0;
        } else {
            return this.saldoActual = this.saldoActual - retiro;
        }
    }

    public double extraccionRapida(double extraccion) {
        if (this.saldoActual * 0.20 < extraccion) {
            System.out.println("Error. No se puede extraer más del 20% del saldo. Extracción no realizada");
            return this.saldoActual;
        } else {
            return this.saldoActual = this.saldoActual - extraccion;
        }
    }

    public double consultarSaldo() {

        return this.saldoActual;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", dniCliente=" + dniCliente + ", saldoActual=" + saldoActual + '}';
    }

}
