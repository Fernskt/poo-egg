/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Interfaces.NewInterface;

/**
 *
 * @author Pc
 */
public class Perro extends Animal implements NewInterface {
    
   
    private String raza;
    private boolean tieneCola;

    public Perro(String raza, boolean tieneCola, String tipoAnimal, int edad, int patas) {
        super(tipoAnimal, edad, patas);
        this.raza = raza;
        this.tieneCola = tieneCola;
    }

   

    @Override
    public void hacerRuido() {
        System.out.println("Guau-guau!");
    }

    @Override
    public void hacerMuertito() {
        System.out.println("Este no sabe hacer el muertito");
    }
    
    
    
    
}
