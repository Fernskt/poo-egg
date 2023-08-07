/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Empleado extends Persona {
    
    protected int anioInicio;
    protected int numDespacho;
    
    Scanner leer = new Scanner(System.in);
    
    public Empleado() {
    }

    public Empleado(int anioInicio, int numDespacho, String nombre, String apellido, int dni, String EstadoCivil) {
        super(nombre, apellido, dni, EstadoCivil);
        this.anioInicio = anioInicio;
        this.numDespacho = numDespacho;
    }

    public void reasignacionDespacho(int nuevoNumDespacho){
        this.numDespacho = nuevoNumDespacho;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("Año de inicio en la escuela: " + anioInicio);
        System.out.println("Número de despacho: " + numDespacho);
    }
    
    
    
}
