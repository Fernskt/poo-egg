/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a 
dos jugadores jugar un juego de adivinanza de números. 
El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
El segundo jugador tiene un número limitado de intentos y recibe una pista de 
"más alto" o "más bajo" después de cada intento. El juego termina cuando el segundo 
jugador adivina el número o se queda sin intentos. Registra el número de intentos 
necesarios para adivinar el número y el número de veces que cada jugador ha ganado.

 */
package EjerciciosExtra;

import java.util.Random;
import java.util.Scanner;


public class JuegoE {
    
    public int numJugador1;
    public int intentos;
    public int ganador1;
    public int ganador2;

    public JuegoE() {
    }
    
    public void iniciarJuego(){
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Ingrese un numero entre 0 y 100");
        numJugador1 = leer.nextInt();
        
        int numJugador2 = 0;
        int IntentosRestantes = intentos;
    }
}
