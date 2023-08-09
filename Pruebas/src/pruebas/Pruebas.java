/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import Entidad.Array;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Array e = new Array();
        e.electrodomésticos(e);
        
    //    division();
    

    }

    public static void division() {
        Scanner leer = new Scanner(System.in);
        try {

            System.out.println("Ingrese el primer número");
            int num1 = leer.nextInt();
            System.out.println("Ingrese el segundo número");
            int num2 = leer.nextInt();

            double resultado = num1 / num2;

            System.out.println("El resultado de la division es: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero :( " + e.getMessage());
            System.out.println(e.fillInStackTrace());
            System.out.println("Error: " + e.toString());
        } finally {
            leer.close();
        }

    }
    
    

}
