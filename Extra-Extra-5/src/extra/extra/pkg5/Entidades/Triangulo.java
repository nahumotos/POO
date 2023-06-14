package extra.extra.pkg5.Entidades;

public class Triangulo {

    public double l1;
    public double l2;

    public Triangulo() {
    }

    public Triangulo(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public double getL1() {
        return l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double calcularArea() {
        // fórmula de Heron
        double permitad = (this.l1 + this.l2 + this.l2) / 2;
        double area = (Math.sqrt(permitad * (permitad - this.l1) * (permitad - this.l2) * (permitad - this.l2)));
        return ((double) Math.round(area * 100d) / 100d);
    }

    public double calcularPerimetro() {
        double per = (this.l1 + this.l2 + this.l2);
        return ((double) Math.round(per * 100d) / 100d);
    }

    @Override
    public String toString() {
        return "Triangulo{" + "l1=" + l1 + ", l2=" + l2 + '}';
    }
}
