package Servicio;

import Comparadores.Comparadores;
import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PeliculaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public List<Pelicula> crearPelicula() {

       List<Pelicula>listaPeliculas = new ArrayList();

        Boolean crearOtraPelicula = true;

        while (crearOtraPelicula) {

            Pelicula p = new Pelicula();

            System.out.println("Ingrese el nombre de la película");
            p.setTitulo(leer.next());
            System.out.println("Ingrese el director de la película");
            p.setDirector(leer.next());
            System.out.println("Ingrese la dureción de la película en horas");
            p.setDuracion(leer.nextDouble());

            listaPeliculas.add(p);

            System.out.println("Desea agregar otra película? (s/n)");
            String resp = leer.next();

            if (resp.equalsIgnoreCase("n")) {
                crearOtraPelicula = false;
            }
        }
        return listaPeliculas;
    }
    
    public void mostrarPeliculas(List<Pelicula> listaPeliculas){
        
        for (Pelicula lista : listaPeliculas) {
            System.out.println("Título: " + lista.getTitulo());
            System.out.println("Director: " + lista.getDirector());
            System.out.println("Duracion: " + lista.getDuracion());
            System.out.println("\n ------------------------------- \n");
        }
        
    }
    
    public void mayor1Hora(List<Pelicula> listaPeliculas){
        
        System.out.println("Peliculas con duracion mayor a una hora: \n");
        
         for (Pelicula lista : listaPeliculas) {
            if (lista.getDuracion() > 1) {

                System.out.println("Título: " + lista.getTitulo() + " que dura: " + lista.getDuracion() + " horas");
                System.out.println("\n ------------------------------- \n");
            }
        }
    }
    
    public void ordenarDec(List<Pelicula> listaPelicula){
        
        System.out.println("Ordenada de forma descendiente por duracion");
        Collections.sort(listaPelicula, Comparadores.ordenarDuracion);
        mostrarPeliculas(listaPelicula);
        
    }
   
    public void ordenarCre(List<Pelicula> listaPelicula){
        System.out.println("Ordenada de forma Ascendiente por duracion");
        Collections.sort(listaPelicula, Comparadores.ordenarDuracionA);
        mostrarPeliculas(listaPelicula);
    }
    
    public void ordenarTitulo(List<Pelicula> listaPelicula){
        
        System.out.println("Lista Ordenada por Título");
        Collections.sort(listaPelicula, Comparadores.ordenarTitulo);
        mostrarPeliculas(listaPelicula);
        
    }
    
    public void ordenarirector(List<Pelicula> listaPelicula){
        
        System.out.println("Lista ordenada por Director");
        Collections.sort(listaPelicula, Comparadores.ordenarDirector);
        mostrarPeliculas(listaPelicula);
        
    }
}
