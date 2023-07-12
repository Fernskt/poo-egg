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
public abstract class Alojamiento {
    
   protected String nombre;
    protected String nombreCalle;
    protected int numeroCalle;
    protected String localidad;
    protected String encargado;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String nombreCalle, int numeroCalle, String localidad, String encargado) {
        this.nombre = nombre;
        this.nombreCalle = nombreCalle;
        this.numeroCalle = numeroCalle;
        this.localidad = localidad;
        this.encargado = encargado;
    }
    
    
    
    
}
