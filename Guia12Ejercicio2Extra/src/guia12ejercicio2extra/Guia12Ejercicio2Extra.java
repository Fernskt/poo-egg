/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ejercicio2extra;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author Pc
 */
public class Guia12Ejercicio2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int contecho = 0;
        int sintecho = 0;

        Polideportivo p1 = new Polideportivo("elpoli", true, 160.50, 5, 300);
        Polideportivo p2 = new Polideportivo("Islas Malvinas", false, 100, 10, 200);
        //(int numOficinas, int cantPersonasXOficina, int numPisos, double ancho, double alto, double largo)
        EdificioDeOficinas eo1 = new EdificioDeOficinas(0, 0, 0, 50, 100, 20.5);
        EdificioDeOficinas eo2 = new EdificioDeOficinas(0, 0, 0, 80, 165, 30.2);
        Polideportivo p3 = new Polideportivo("elpoli de Calzada", true, 160.50, 5, 300);

        ArrayList<Edificio> edificios = new ArrayList();

        edificios.add(p1);
        edificios.add(p2);
        edificios.add(p3);
        edificios.add(eo1);
        edificios.add(eo2);

        for (Edificio edificio : edificios) {

            if (edificio instanceof Polideportivo) {
                System.out.println("Polideportivo '" + ((Polideportivo) edificio).getNombre() + "'");

                System.out.println("La superficie del Polideportivo es: " + edificio.calcularSuperficie() + " Mts2");
                System.out.println("El volúmen total del Polideportivo es: " + edificio.calcularVolumen() + " Mts3");
             

                if (((Polideportivo) edificio).getTechado()) {
                    System.out.println("Es un polideportivo techado");
                    contecho++;
                } else {
                    System.out.println("Es un poli abierto!");
                    sintecho++;
                }
                   System.out.println("______________________________");
                System.out.println("");

            } else if (edificio instanceof EdificioDeOficinas) {
                System.out.println("Edificio de oficinas");
                System.out.println("La superficie del Edificio de Oficinas es: " + edificio.calcularSuperficie() + " Mts2");
                System.out.println("El volúmen total del Edificio de Oficinas es: " + edificio.calcularVolumen() + " Mts3");
                ((EdificioDeOficinas) edificio).cantPersonas();
            }

        }
        System.out.println("");
        System.out.println("______________________________");
        System.out.println("");
        System.out.println("La cantidad de polideportivos techados es: " + contecho);
        System.out.println("La cantidad de polideportivos Abiertos es: " + sintecho);
        System.out.println("");

    }

}
