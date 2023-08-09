/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Array {
    Scanner leer = new Scanner(System.in);
    private String[] arreglo = new String[5];

    public Array(String[] arreglo) {
        this.arreglo = arreglo;
    }

    public Array() {
    }
    
    
    public void electrodomésticos(Array e){
        
       try {
            
             for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingese electrodomésticos");
            e.arreglo[i] =leer.next();
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(e.arreglo[i]);
        }
            
        } catch (ArrayIndexOutOfBoundsException ex) {
            
            System.out.println("Índice fuera de rango: Hasta  " + ex.getMessage());
            System.out.println("Error: " + ex.fillInStackTrace());
            
       }

    }
    
}
