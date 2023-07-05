/*
 Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta.
 */
package guia12ejercicio1;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author Pc
 */
public class Guia12Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Animal perro1 = new Perro("perro","Comenunca", "Croquetas", 2, "Pitbull");
        perro1.alimentarse();
        Animal gato1 = new Gato("gatito","Mishufus", "Atún", 1, "Persa");
        gato1.alimentarse();
        Animal caballo1 = new Caballo("Caballito","Bola de Fraile", "Heno", 4, "Alazán");
        caballo1.alimentarse();
        
    }
    
}
