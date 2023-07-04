/*
 Luego, en el main vamos a crear
un ArrayList de animales y los siguientes animales
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();
Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
método hacerRuido() de cada ítem.
 */
package guia12ejercicioej1;

import Entidades.Animal;
import Entidades.Gato;
import Entidades.Perro;
import java.util.ArrayList;

/**
 *
 * @author Pc
 */
public class Guia12EjercicioEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList();
        
        Animal a = new Animal();
        Animal b = new Perro("pointer",false,"perro",4,4);
        Animal c = new Gato(2,"naranja","Gato",1,3);
        
        animales.add(a);
        animales.add(b);
        animales.add(c);
        
        for (Animal animal : animales) {
            
            System.out.println("El " + animal.getTipoAnimal() + " hace " );   
            animal.hacerRuido();
            System.out.println("Y ");
            animal.hacerMuertito();
        
        }
    } 
}
