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
public final class Polideportivo extends Edificio {
    
    private String nombre;
    private Boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, Boolean techado, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

 
    
}
