/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

import EjerciciosEntidades.Libro;

/**
 *
 * @author Pc
 */
public class EjemploLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Libro miLibro = new Libro();
       miLibro.cargarLibro();
       miLibro.mostrarLibro();
    }
    
}
