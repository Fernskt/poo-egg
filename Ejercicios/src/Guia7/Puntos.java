/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

import EjerciciosExtraEntidades.PuntosE;

/**
 *
 * @author Pc
 */
public class Puntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    PuntosE puntos = new PuntosE();
    puntos.crearPuntos();
    double distancia = puntos.calcularDistancia();
    System.out.println("La distancia entre los dos puntos es: " + distancia);
    }
    
}
