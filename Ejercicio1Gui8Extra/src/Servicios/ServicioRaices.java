package Servicios;

import Entidades.Raices;
import java.util.Scanner;

public class ServicioRaices {

    Scanner leer = new Scanner(System.in);

    Raices r = new Raices();

    public Raices crearRaices() {

        System.out.println("Ingrese A");
        r.setA(leer.nextDouble());
        System.out.println("Ingrese B");
        r.setB(leer.nextDouble());
        System.out.println("Ingrese C");
        r.setC(leer.nextDouble());
        System.out.println("La ecuacion creada es: " + r.getA() + "x2 + " + r.getB() + " * x + " + r.getC() + " = 0 ");
        return r;
    }

    public double getDiscriminante(Raices r) {

        return Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC());

    }

    public boolean tieneRaices(Raices r) {
        System.out.println(getDiscriminante(r) > 0);
        return getDiscriminante(r) > 0;

    }

    public boolean tieneRaiz(Raices r) {
        System.out.println(getDiscriminante(r) == 0);
        return getDiscriminante(r) == 0;
    }

    public void obtenerRaices(Raices r) {
        if (tieneRaices(r)) {
            System.out.println("Tiene dos posibles soluciones y son: ");
            System.out.println("La raiz x1 = " + (-r.getB() + Math.pow((Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC()), 0.5)) / (2 * r.getA()));
            System.out.println("La raiz x2 = " + (-r.getB() - Math.pow((Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC()), 0.5)) / (2 * r.getA()));
        }
    }

    public void obtenerRaiz(Raices r) {
        if (tieneRaiz(r)) {
            System.out.println("La ecuacion tiene solucion y su raiz es: " + (-r.getB() / 2 * r.getA()));
        }
    }

    public void calcular(Raices r) {

        if (tieneRaices(r)) {
            obtenerRaices(r);
        } else if (tieneRaiz(r)) {
                    obtenerRaiz(r);
                } else {
            System.out.println("No es posible resolverlo");
        }

    }
}
