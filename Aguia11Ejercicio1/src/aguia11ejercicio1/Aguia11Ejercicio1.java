/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */

package aguia11ejercicio1;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;


public class Aguia11Ejercicio1 {

    
    public static void main(String[] args) {
        
        ArrayList<Perro>perros = new ArrayList();
        Scanner leer = new Scanner(System.in);
        
        // Crear perros
        Perro perro1 = new Perro("Max", "Labrador", 3, 40);
        Perro perro2 = new Perro("Bella", "Chihuahua", 2, 10);
 
        // Crear personas
        Persona persona1 = new Persona("Juan", "Perez", 30, "12345678");
        Persona persona2 = new Persona("Maria", "Gomez", 25, "87654321");
        
        System.out.println("Cual perro desea adoptar");
        System.out.println("Max, labrador de 3 años: Digite 1");
        System.out.println("Bella, Chihuahua de 2 años: Digite 2");
        
        perros.add(perro1);
        perros.add(perro2);
        
        
        for (Perro perro : perros) {
            System.out.println(perro);
        }
       
        
        
        
        
    }
}
        
        
    

