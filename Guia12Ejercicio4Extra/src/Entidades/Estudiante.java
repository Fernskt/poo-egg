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
public class Estudiante extends Persona {

    private String curso;

    public Estudiante() {
    }

    public Estudiante(String curso, String nombre, String apellido, int dni, String EstadoCivil) {
        super(nombre, apellido, dni, EstadoCivil);
        this.curso = curso;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("Curso: " + curso);
    }
    
  
    
 
    
}
