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
public abstract class Persona {
    
    protected String nombre;
    protected String apellido;
    protected int dni;
    protected String estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int dni, String EstadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estadoCivil = EstadoCivil;
    }
    
    public void  cambiarEstadoCivil(String nuevoEstadoCivil){
        this.estadoCivil = nuevoEstadoCivil;
    };
    
    public void mostrarInformacion(){
        
        System.out.println("Nombre y apellido: " + nombre + " "+apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Estado civil: " + estadoCivil);
        
    }
    
    
    
}
