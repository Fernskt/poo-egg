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
public final class Camping extends AExtrahoteleros {
    
     private int capacidadCarpas;
    private int banosDisp;
    private boolean tieneRest;

    public Camping() {
    }
    
    public Camping(int capacidadCarpas, int banosDisp, boolean tieneRest, boolean esPrivado, double m2, String nombre, String nombreCalle, int numeroCalle, String localidad, String encargado) {
        super(esPrivado, m2, nombre, nombreCalle, numeroCalle, localidad, encargado);
        this.capacidadCarpas = capacidadCarpas;
        this.banosDisp = banosDisp;
        this.tieneRest = tieneRest;
    }
    
    
    
}
