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

        boolean aux = true;
        ArrayList<Perro> perros1 = new ArrayList();
        ArrayList<Perro> perros2 = new ArrayList();

        Scanner leer = new Scanner(System.in);

        // Crear perros
        Perro perro1 = new Perro("Max", "Labrador", 3, "Grande");
        Perro perro2 = new Perro("Bella", "Chihuahua", 2, "Pequeño");

        // Crear personas
        Persona persona1 = new Persona("Juan", "Perez", 30, "12345678");
        Persona persona2 = new Persona("Maria", "Gomez", 25, "87654321");

        while (aux) {
            
            System.out.println("¿Cual perro desea adoptar?");
            System.out.println("___________________________________________");
            System.out.println("1) Max, labrador de 3 años: Digite 1");
            System.out.println("2) Bella, Chihuahua de 2 años: Digite 2");
            System.out.println("___________________________________________");
            
            int opcion = leer.nextInt();
            
            if (opcion == 1) {
                perros1.add(perro1);
                persona1.setPerros(perros1);
                perros2.add(perro2);
                persona2.setPerros(perros2);
                aux = false;
            } else if (opcion == 2) {
                perros2.add(perro2);
                persona1.setPerros(perros2);
                perros1.add(perro1);
                persona2.setPerros(perros1);
                aux = false;
            } else {
                System.out.println("Opcion Invalida");
                
            }

        }

        System.out.println(persona1);
        System.out.println(persona2);

    }
}
