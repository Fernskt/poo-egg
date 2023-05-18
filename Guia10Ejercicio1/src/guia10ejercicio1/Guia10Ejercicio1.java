/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Guia10Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> razasPerros = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        
        Boolean continuar = true;
        
        while (continuar) {
        System.out.println("Ingrese una raza de perro: ");
        String raza = leer.nextLine();
        
        razasPerros.add(raza);
        
            System.out.println("¿Desea continuar Y/N?");
            String opcion = leer.next();
            if (opcion.equalsIgnoreCase("n")) {
                continuar = false;
            }
            
    }
       
        for (String razas : razasPerros) {
            System.out.println("Raza: " + razas);
        }
        
    }
    
}
