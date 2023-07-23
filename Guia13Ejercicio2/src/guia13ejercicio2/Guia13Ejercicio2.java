/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13ejercicio2;

/**
 *
 * @author Pc
 */
public class Guia13Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     Arreglo a1 = new Arreglo(3);
     
     a1.Cargar(1, 3);
     a1.Cargar(2, 6);
     a1.Cargar(3, 3);
     
        System.out.println(a1.leer(0));
        System.out.println(a1.leer(2));
        System.out.println(a1.leer(6));
        
     
     
        
        
        
    }
    
}
