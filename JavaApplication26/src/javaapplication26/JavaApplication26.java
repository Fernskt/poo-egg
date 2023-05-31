/*
 Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
 */
package javaapplication26;

import Entidad.Pelicula;
import Servicio.PeliculaService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaService p = new PeliculaService();
        List<Pelicula> listaPeliculas = new ArrayList();

        Scanner leer = new Scanner(System.in);

        Boolean crearOtraPelicula = true;

        while (crearOtraPelicula) {
            Pelicula pelicula = p.crearPelicula();
            listaPeliculas.add(pelicula);

            System.out.println("Desea agregar otra película? (s/n)");
            String resp = leer.next();

            if (resp.equalsIgnoreCase("n")) {
                crearOtraPelicula = false;
            }
        }

        for (Pelicula lista : listaPeliculas) {
            System.out.println("Título: " + lista.getTitulo());
            System.out.println("Director: " + lista.getDirector());
            System.out.println("Duracion: " + lista.getDuracion());
            System.out.println("\n ------------------------------- \n");
        }

        System.out.println("Peliculas con duracion mayor a una hora");

        for (Pelicula lista : listaPeliculas) {
            if (lista.getDuracion() > 1) {

                System.out.println("Título: " + lista.getTitulo());
                System.out.println("\n ------------------------------- \n");
            }
        }
        
        

    }

}
