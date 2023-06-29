package Service;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AdopcionService {

    Scanner scan = new Scanner(System.in).useDelimiter("\n"); // se agrego useDelimiter
    ArrayList<Persona> personas = new ArrayList();
    ArrayList<Perro> perros = new ArrayList();

    public Persona crearPersona() {
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre de la persona: ");
        persona.setNombre(scan.next()); // se cambio scan.next por scan.nextLine y con useDelimiter pide el 2do nombre
        System.out.println("Ingrese el apellido: ");
        persona.setApellido(scan.next());
        System.out.println("Ingrese la edad: ");
        persona.setEdad(scan.nextInt());
        System.out.println("Ingrese el número de documento: ");
        persona.setDni(scan.nextLong());
        return persona; //está bien que retorne la persona pero no se recibía en el main
    }

    public void mostrarPerrosDisponibles(ArrayList<Perro> perros) {
        System.out.println("Perros disponibles para adoptar: ");
        for (int i = 0; i < perros.size(); i++) {
            Perro perro = perros.get(i);
            System.out.println(perro.getNombre());
        }
    }

    public void adoptarPerro(Persona persona,/* String opcion, */ArrayList<Perro> perros) {
        
        boolean nombreValido = true;
        String opcion = "";
        do {//se creo do while para evitar error de que usuario ingrese perro incorrecto y para que
            // funcione condicion de while it.hasNext(), se modifico ubicacion de la declaracion de Iterator dentro
            // de do while ya que fuera no se reiniciaba
            Iterator<Perro> it = perros.iterator();
            System.out.println("Ingrese el nombre del perro a adoptar: ");
            opcion = scan.next();
            while (it.hasNext() && nombreValido) {
                Perro perro = it.next();
                System.out.println(perro.getNombre());
                if (perro.getNombre().equalsIgnoreCase(opcion)) {
                    persona.setPerro(perro);
                    it.remove();
                    nombreValido = false;
                    System.out.println("Felicitaciones, adoptaste a " + perro.getNombre());
                    break;
                }
            }
            if (nombreValido) {
                System.out.println("El perro no se encuentra en la lista.");
                System.out.println("Ingrese un nombre válido. ");
            }
        } while (nombreValido);
    }

    public void mostrarPersonaYPerro(ArrayList<Persona> personas) {
        System.out.println("Lista de personas con su nuevo amigo pulgoso: ");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
