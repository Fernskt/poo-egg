/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Pc
 */
public class Equipo {
    
    private ArrayList<Jugador> equipo;

    public Equipo() {
    }
  
    public Equipo(ArrayList<Jugador> equipo) {
        this.equipo = equipo;
    }

    public ArrayList<Jugador> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Jugador> equipo) {
        this.equipo = equipo;
    }

    public void mostrarJugadores(ArrayList<Jugador> equipo){
        for (Jugador jugador : equipo) {
            System.out.println("Nombre: " + jugador.getNombre());
            System.out.println("Apellido: " + jugador.getApellido());
            System.out.println("Posición: " + jugador.getPosicion());
            System.out.println("Número de espaldera: " + jugador.getNumero());
            System.out.println("___________________________________");
        }
    }
}
    
    
    
    

