/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ejercicio2;

import Entidades.Electrodomestico;
import Entidades.Lavadora;




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
        
     Lavadora electrodomestico = new Lavadora();
     electrodomestico.crearLavadora();
    
      
        System.out.println("El precio de electrodomestico es $" +electrodomestico.precioFinal());
        System.out.println("El color del electrodomestico es: "+ electrodomestico.getColor());
       
    }
    
}
