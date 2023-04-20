/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in);
   

    public Persona crearPersona() {
         Persona persona = new Persona();
        System.out.println("Ingrese su nombre");
        persona.setNombre(leer.next());
        System.out.println("Ingrese su edad");
        persona.setEdad(leer.nextInt());

        System.out.println("Ingrese sexo (H, M, O)");
        persona.setSexo(Character.toLowerCase(leer.next().charAt(0)));
        char sexo = persona.getSexo();

        while (sexo != 'h' && sexo != 'm' && sexo != 'o') {
            System.out.println("Opcion incorrecta Ingrese sexo nuevamente (H, M, O)");
            persona.setSexo(Character.toLowerCase(leer.next().charAt(0)));
            sexo = persona.getSexo();
        }

        System.out.println("Ingrese peso y Altura");
        persona.setPeso(leer.nextDouble());
        persona.setAltura(leer.nextDouble());
        return persona;
    }

    public boolean esMayorDeEdad(Persona persona) {
        int edad = persona.getEdad();
        return edad >= 18;
    }

    public int calcularIMC(Persona persona) {

        /*Método calcularIMC(): calculara si la persona está en su peso ideal 
        (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un 
        valor menor que 20, significa que la persona está por debajo de su peso 
        ideal y la función devuelve un -1. Si la fórmula da por resultado 
        un número entre 20 y 25 (incluidos), significa que la persona está en 
        su peso ideal y la función devuelve un 0. Finalmente, si el resultado 
        de la fórmula es un valor mayor que 25 significa que la persona tiene 
        sobrepeso, y la función devuelve un 1.
         */
        double peso = persona.getPeso();
        double altura = persona.getAltura();
        
        double imc = peso/(Math.pow(altura,2));
        
        if(imc<20){
           // System.out.println("Estas bajo de peso");
            return-1;
        }else if(imc>=20 && imc<=25){
           // System.out.println("Estas en tu peso ideal");
            return 0;
        }else{
           // System.out.println("Estás excedido de peso");
            return 1;
        }

    }
   

}
