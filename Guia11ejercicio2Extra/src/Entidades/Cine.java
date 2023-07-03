/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Pc
 */
public class Cine {
    
    private Pelicula pelicula;
    private double precio;
    private int [][] sala;

    public Cine() {
    }

    public Cine(Pelicula pelicula, double precio, int[][] sala) {
        this.pelicula = pelicula;
        this.precio = precio;
        this.sala = sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int[][] getSala() {
        return sala;
    }

    public void setSala(int[][] sala) {
        this.sala = sala;
    }
         
    
}
