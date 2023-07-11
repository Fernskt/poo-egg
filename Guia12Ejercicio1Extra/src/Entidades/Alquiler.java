/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Pc
 */
public class Alquiler {
    
    private final String nombreCliente;
    private final String documentoCliente;
    private final LocalDate fechaAlquiler;
    private final LocalDate fechaDevolucion;
    private final int posicionAmarre;
    private final Barco barco;

    public Alquiler(String nombreCliente, String documentoCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }
    
    public double calcularPrecio(){
        
        long numDias = ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);
        double modulo = barco.calcularModulo();
        
        return numDias * modulo;
    }
    
}
