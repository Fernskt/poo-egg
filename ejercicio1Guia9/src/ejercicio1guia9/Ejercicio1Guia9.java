/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1guia9;

import Entidades.Cadena;
import servicio.CadenaServicio;

/**
 *
 * @author Pc
 */
public class Ejercicio1Guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaServicio c = new CadenaServicio();

        Cadena cadena = c.crearCadena();
        //System.out.println(cadena.toString());

        System.out.println("La cantidad de vocales es: " + c.mostrarVocales(cadena));

        System.out.println("Cadena invertida: ");

        c.invertirFrase(cadena);

        System.out.println("Veces letra repetida");

        c.vecesRepetido(cadena);

        System.out.println("comparar longitudes");

        c.compararLongitud(cadena);

        System.out.println(c.unirFrase(cadena));

        c.reemplazar(cadena);

    }

}
