/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class PersonaService {
    Scanner leer = new Scanner(System.in);
    
    //Método crearPersona que pida al usuario Nombre y fecha 
    //de nacimiento de la persona a crear. Retornar el objeto Persona creado.

    public Persona crearPersona(){
        
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        
        System.out.println("Ingrese su año de nacimiento");
        int anio = leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese su dia de nacimiento");
        int dia = leer.nextInt();
        
        Date fechaNac = new Date(anio-1900,mes-1,dia);
        
        
        return new Persona(nombre, fechaNac);
        
    }
    
    //Método calcularEdad que calcule la edad del usuario utilizando el atributo
    //de fecha de nacimiento y la fecha actual.
    
    public int calcularEdad(Persona persona){
        
        Date fechaActual = new Date();
        
          int cumple = fechaActual.getYear() - persona.getFechaNac().getYear();
       
       int mes = fechaActual.getMonth() - persona.getFechaNac().getMonth();
       
       int dia = fechaActual.getDate()  - persona.getFechaNac().getDate();
       
        if (mes < 0) {
            cumple-=1;
        }else if(dia<0 && mes==0){
            cumple-=1;
        }
       
        return cumple;
        
    }
    
    //Método menorQue recibe como parámetro una Persona y una edad. Retorna 
    //true si la persona es menor que la edad consultada o false 
////////////    //en caso contrario.
    
    public boolean menorQue(Persona persona, int edad){
        
        return edad < calcularEdad(persona);
    }
    
    //Método mostrarPersona que muestra la información de la 
    //persona deseada.
    
    public void mostrarPersona(Persona persona){
        
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de Nacimiento "+ persona
                .getFechaNac().getDate() +"/" +(persona
                .getFechaNac().getMonth()+1)+"/"+ persona
                .getFechaNac().getYear());
       
    }

}
