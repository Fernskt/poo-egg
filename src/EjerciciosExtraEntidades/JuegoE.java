/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a 
dos jugadores jugar un juego de adivinanza de números. 
El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
El segundo jugador tiene un número limitado de intentos y recibe una pista de 
"más alto" o "más bajo" después de cada intento. El juego termina cuando el segundo 
jugador adivina el número o se queda sin intentos. Registra el número de intentos 
necesarios para adivinar el número y el número de veces que cada jugador ha ganado.

 */
package EjerciciosExtraEntidades;


import java.util.Scanner;


public class JuegoE {
    
    public int numJugador1;
    public int intentos;
    

    public JuegoE() {
    }
    
    public void iniciarJuego(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 10");
        numJugador1 = leer.nextInt();
        
        if()
        
        int IntentosRestantes = intentos;
    }
}
