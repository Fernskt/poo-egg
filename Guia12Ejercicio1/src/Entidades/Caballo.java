/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Pc
 */
public class Caballo extends Animal{
    
    public Caballo(String animal, String nombre, String alimento, int edad, String raza) {
        super(animal, nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("Hola!! soy un " + animal + " y me alimento de "+ alimento);
    }
    
}
