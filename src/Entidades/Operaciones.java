/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Ejercicios.Operacion;

/**
 *
 * @author Pc
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Operacion operacion = new Operacion();
        operacion.crearOperacion();

        System.out.println("la suma es: " + operacion.sumar());
        System.out.println("la resta es: " + operacion.restar());

        System.out.println("la multiplicacion es: " + operacion.multiplicar());

        System.out.println("la division es: " + operacion.dividir());

    }
    
}
