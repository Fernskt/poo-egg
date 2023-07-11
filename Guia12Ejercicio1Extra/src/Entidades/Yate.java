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
public class Yate extends BarcoMotor {
    
    private final int numCamarote;

    public Yate(String matricula, double eslora, int anioFabricacion, int potenciaCV,int numCamarote) {
        super(matricula, eslora, anioFabricacion, potenciaCV);
        this.numCamarote = numCamarote;
    }

   

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV + numCamarote; //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
