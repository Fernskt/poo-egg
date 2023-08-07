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
public class Profesor extends Empleado {
    
    private String departamento;

    public Profesor() {
    }

    public Profesor(String departamento, int anioInicio, int numDespacho, String nombre, String apellido, int dni, String EstadoCivil) {
        super(anioInicio, numDespacho, nombre, apellido, dni, EstadoCivil);
        this.departamento = departamento;
    }

   
   public void cambioDepartamento(String nuevoDepartamento){
       this.departamento = nuevoDepartamento;
   }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("Departamento: " + departamento);
    }
    
   
    
}
