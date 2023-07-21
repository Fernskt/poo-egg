/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ejercicio2;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Pc
 */
public class Guia12Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Lavadora(int carga, double precio, String color, char consumoEnergetico, double peso)
        //Televisor(int resolucion, String sintonizadorTDT, double precio, String color, char consumoEnergetico, double peso)
        double suma = 0;
        double precioFinal;
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        

        Lavadora lavadora1 = new Lavadora(50, "Lavadora", 1000, "negro", 'a', 25);
        Lavadora lavadora2 = new Lavadora(45, "Lavadora", 1000, "gris", 't', 55);
        Televisor tv1 = new Televisor(1070, "si", "Televisor", 1000, "verde", 'c', 20);
        Televisor tv2 = new Televisor(720, "no", "Televisor", 1000, "blanco", 'b', 20);

        electrodomesticos.add(lavadora1);
        electrodomesticos.add(lavadora2);
        electrodomesticos.add(tv1);
        electrodomesticos.add(tv2);

        for (Electrodomestico electrodomestico1 : electrodomesticos) {
           
            precioFinal = electrodomestico1.precioFinal();
            electrodomestico1.comprobarColor();
           electrodomestico1.comprobarConsumoEnergetico();
            System.out.println("El precio final del/la " + electrodomestico1.getTipo() + " de C/E tipo ("+ electrodomestico1.getConsumoEnergetico() + ") color " + electrodomestico1.getColor() + " es $" + precioFinal);
            System.out.println("");
            suma+=precioFinal;

        }

        System.out.println("");
        System.out.println("____________________________________________");
        System.out.println("");
        System.out.println("El precio TOTAL de la compra es: $" + suma);
        System.out.println("");

    }

}
