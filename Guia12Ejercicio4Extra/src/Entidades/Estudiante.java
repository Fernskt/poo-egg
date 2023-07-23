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
public class Estudiante extends Persona {

    private String curso;
    
    Scanner leer = new Scanner(System.in);
    
    @Override
    public String cambiarEstadoCivil() {
        System.out.println("Ingrese el estado civil del/la estudiante:");
        return leer.next();
    }
    
}
