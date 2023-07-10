/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ejercicio4;

import Entidades.Circulo;
import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Guia12Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Circulo circulo1 = new Circulo();
        Rectangulo rectangulo1 = new Rectangulo();
                
        
        System.out.println("Círculo");
        System.out.println("Ingrese el valor del radio");
        circulo1.setRadio(leer.nextDouble());
        
      
       
        System.out.println("____________________________");
        System.out.println("Área del Círculo: \n" + circulo1.calcularArea());   
        System.out.println("Perímetro del círculo: \n" + circulo1.calcularPerimetro());
        System.out.println("____________________________");
        
        
        System.out.println("Rectangulo");
        System.out.println("Ingrese el valor de la base y altura del rectangulo:");
        rectangulo1.setBase(leer.nextDouble());
        rectangulo1.setAltura(leer.nextDouble());
        
        System.out.println("____________________________");
        System.out.println("Área del Rectangulo: \n" + rectangulo1.calcularArea());   
        System.out.println("Perímetro del Rectangulo: \n" + rectangulo1.calcularPerimetro());
        System.out.println("____________________________");
        
        
    }
    
}
