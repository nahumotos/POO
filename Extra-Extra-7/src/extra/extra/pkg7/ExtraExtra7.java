package extra.extra.pkg7;

import extra.extra.pkg7.Entidades.Auto;

public class ExtraExtra7 {

    public static void main(String[] args) {
        Auto a = new Auto();
        a.cargarFicha();
        a.modificarTitularidad();
        a.trayectoRecorrido();
        a.serviceAuto();
        System.out.println(a.toString());
    }

}
