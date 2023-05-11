/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador1;

import Entidad.Estudiante;

/**
 *
 * @author Pc
 */
public class Integrador1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estudiante[] estudiantes = new Estudiante[8];
        estudiantes[0] = new Estudiante("Juan", 7.5);
        estudiantes[1] = new Estudiante("Maria", 8.0);
        estudiantes[2] = new Estudiante("Pedro", 6.5);
        estudiantes[3] = new Estudiante("Luisa", 9.0);
        estudiantes[4] = new Estudiante("Ana", 7.0);
        estudiantes[5] = new Estudiante("Carlos", 8.5);
        estudiantes[6] = new Estudiante("Sofia", 6.0);
        estudiantes[7] = new Estudiante("Jose", 9.5);
        
        double suma = 0;
        
        for (int i = 0; i < estudiantes.length; i++) {
            suma+=estudiantes[i].getNota();
        }
        
        double promedio = suma / estudiantes.length;
        
        System.out.println("El promedio de las notas es " + promedio);
        
        for (int i = 0; i < estudiantes.length; i++) {
            if(estudiantes[i].getNota() > promedio){
                System.out.println("El estudiante " + estudiantes[i].getNombre()+" con "+estudiantes[i].getNota()+ ", recibió una nota mayor al promedio del curso");
            }
        }
        
    }
    
    
    
  
}
