/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package guia11ejercicio1guia;

import Entidades.Equipo;
import Entidades.Jugador;
import java.util.ArrayList;
import java.util.List;


public class Guia11Ejercicio1Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Equipo equipo = new Equipo();
        
        List<Jugador> jugadores = new ArrayList();
        Jugador jugador1 = new Jugador("Lionel", "Messi","Delantero", 10);
        Jugador jugador2 = new Jugador("Cristiano","Ronaldo","Delantero",7);
        Jugador jugador3 = new Jugador("Dibu","Martinez","Arquero",1);
        Jugador jugador4 = new Jugador("Enzo","Fernandez","Mediocampista",23);
        
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        jugadores.add(jugador3);
        jugadores.add(jugador4);
        
       equipo.mostrarJugadores((ArrayList<Jugador>) jugadores);
    }
    
}
