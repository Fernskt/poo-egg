/*
 Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package guia_11_relaciones_extras_ej_01;

import Entidades.Perro;
import Entidades.Persona;
import Service.AdopcionService;
import java.util.ArrayList;
import java.util.Scanner;

public class Guia_11_Relaciones_Extras_Ej_01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        AdopcionService as = new AdopcionService();
        String respuesta;
        ArrayList<Perro> perros = new ArrayList();
        ArrayList<Persona> personas = new ArrayList();
        Perro p1 = new Perro("Comenunca", "Galgo", 5, "L");
        Perro p2 = new Perro("Casiunperro", "Pila", 2, "S");
        Perro p3 = new Perro("Tuco", "Setter Irlandés", 2, "M");
        Perro p4 = new Perro("Pelado", "San Bernanrdo", 4, "XL");
        Perro p5 = new Perro("Firulais", "Pitbull Terrier", 1, "M");
        Perro p6 = new Perro("Coquito", "Rottwailler", 3, "XL");

        perros.add(p1);
        perros.add(p2);
        perros.add(p3);
        perros.add(p4);
        perros.add(p5);
        perros.add(p6);

        Persona persona = new Persona();//estaba declarado este Objeto persona pero no se utilizaba.
        //Lo vamos a utilizar para recibir la persona que retorna método crearPersona
        do {
            persona = as.crearPersona();
            as.mostrarPerrosDisponibles(perros);
            /*System.out.println("Ingrese el nombre del perro a adoptar: ");
            String opcion = scan.nextLine();*/ //se movio al metodo adoptar persona para evitar errores si usuario
            //ingresa nombre incorrecto de perro
            as.adoptarPerro(persona, /*opcion,*/ perros);
            personas.add(persona);
            System.out.println("Desea agregar a alguna persona más? (s/n)");
            respuesta = scan.nextLine();
            
        } while (respuesta.equalsIgnoreCase("s"));
        as.mostrarPersonaYPerro(personas);
    }

}
