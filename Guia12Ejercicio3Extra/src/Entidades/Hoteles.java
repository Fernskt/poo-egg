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
public class Hoteles extends Alojamiento {
    
    protected int cantHabitaciones;
    protected int numCamas;
    protected int cantPisos;
    protected double precioHabitaciones;

    public Hoteles() {
    }

    public Hoteles(int cantHabitaciones, int numCamas, int cantPisos, String nombre, String nombreCalle, int numeroCalle, String localidad, String encargado) {
        super(nombre, nombreCalle, numeroCalle, localidad, encargado);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
    }
    
    public double precioHabitacion(){
        return 50;
    }
    
    
}
