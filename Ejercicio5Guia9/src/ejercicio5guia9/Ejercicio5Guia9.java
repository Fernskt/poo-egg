/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5guia9;

import Entidades.Persona;
import Servicio.PersonaService;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ejercicio5Guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        PersonaService ps = new PersonaService();
        Persona persona = ps.crearPersona();
        
        System.out.println("Su edad es " +ps.calcularEdad(persona)); 
       System.out.println("Ingrese edad a comparar");
        int edad2 = leer.nextInt();
        
        String resp = ps.menorQue(persona, edad2) ? "La edad ingresada es menor a la edad de persona" : "La edad ingresada Es Mayor a la edad de la persona";
        
        System.out.println(resp); 
        
        ps.mostrarPersona(persona);
       
       
        
    }
    
}
