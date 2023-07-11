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
public class Velero extends Barco {
    
    private final int numMastil;

    public Velero(String matricula, double eslora, int anioFabricacion, int numMastil) {
        super(matricula, eslora, anioFabricacion);
        this.numMastil = numMastil;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + numMastil; 
         
    }
    
    
    
}
