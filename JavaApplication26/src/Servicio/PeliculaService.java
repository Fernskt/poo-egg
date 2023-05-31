
package Servicio;

import Entidad.Pelicula;
import java.util.Scanner;


public class PeliculaService {
    
    Scanner leer = new Scanner(System.in);
    
    public Pelicula crearPelicula(){
        
        Pelicula p = new Pelicula();
        
        System.out.println("Ingrese el nombre de la película");
        p.setTitulo(leer.next());
        System.out.println("Ingrese el director de la película");
        p.setDirector(leer.next());
        System.out.println("Ingrese la dureción de la película en horas");
        p.setDuracion(leer.nextInt());
        
        return p;
    }
    
}
