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
public class Gato extends Animal implements NewInterface{
    
    private int cantColor;
    private String colorOjos;



    public Gato(int cantColor, String colorOjos, String tipoAnimal, int edad, int patas) {
        super(tipoAnimal, edad, patas);
        this.cantColor = cantColor;
        this.colorOjos = colorOjos;
    }

    @Override
    public void hacerRuido() {
        System.out.println("Miauuuuuu!!");
    }

    @Override
    public void hacerMuertito() {
        System.out.println("Este si sabe hacer el muertito");
    }
   
    
}
