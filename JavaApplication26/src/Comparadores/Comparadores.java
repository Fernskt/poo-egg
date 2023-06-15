/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparadores;

import Entidad.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Pc
 */
public class Comparadores {
    
    public static Comparator<Pelicula> ordenarDuracion = (Pelicula t, Pelicula t1) -> t1.getDuracion().compareTo(t.getDuracion());
    public static Comparator<Pelicula> ordenarDuracionA = (Pelicula t, Pelicula t1) -> t.getDuracion().compareTo(t1.getDuracion());
    public static Comparator<Pelicula> ordenarTitulo = (Pelicula t, Pelicula t1) -> t.getTitulo().compareTo(t1.getTitulo());
    public static Comparator<Pelicula> ordenarDirector = (Pelicula t, Pelicula t1) -> t.getDirector().compareTo(t1.getDirector());
}   
