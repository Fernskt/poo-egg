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
public class PersonalDeServicio extends Empleado {
    
    private String puesto;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(String puesto, int anioInicio, int numDespacho, String nombre, String apellido, int dni, String EstadoCivil) {
        super(anioInicio, numDespacho, nombre, apellido, dni, EstadoCivil);
        this.puesto = puesto;
    }
    
    
    
}
