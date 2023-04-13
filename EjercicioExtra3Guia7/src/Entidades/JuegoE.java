/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a 
dos jugadores jugar un juego de adivinanza de números. 
El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
El segundo jugador tiene un número limitado de intentos y recibe una pista de 
"más alto" o "más bajo" después de cada intento. El juego termina cuando el segundo 
jugador adivina el número o se queda sin intentos. Registra el número de intentos 
necesarios para adivinar el número y el número de veces que cada jugador ha ganado.

 */
package Entidades;

import java.util.Scanner;

public class JuegoE {

    public int numJugador1;

    public JuegoE() {
    }

    public void iniciarJuego() {

        int intento = 3;
        int numJugador2;
        int partidasGanadas = 0;
        int partidasPerdidas = 0;
        String respuesta;
        Scanner leer = new Scanner(System.in);
        do {
            do {
                intento = 3;
                System.out.println("Jugador 1 Ingrese un numero entre 1 y 10");
                numJugador1 = leer.nextInt();
            } while (numJugador1 < 0 || numJugador1 >= 10);

            do {
                System.out.println("Jugador 2 adivine numero");
                numJugador2 = leer.nextInt();

                if (numJugador1 == numJugador2) {
                    System.out.println("GANASTE");
                    partidasGanadas++;

                    break;
                }
                if (numJugador1 > numJugador2) {
                    System.out.println("El número es más alto");
                    intento--;
                    System.out.println("Te quedan " + intento + " intentos");

                }
                if (numJugador1 < numJugador2) {
                    System.out.println("El número es más bajo");
                    intento--;
                    System.out.println("Te quedan " + intento + " intentos");
                }
                if (intento == 0) {
                    System.out.println("Te quedaste sin intentos!!");
                    partidasPerdidas++;
                }
            } while (intento > 0);
            System.out.println("Desea seguir jugando? y/n");
            respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("n")) {
                break;
            }

        } while (respuesta.equalsIgnoreCase("y"));
        
   

        System.out.println("Partidas ganadas: " + partidasGanadas);
        System.out.println("Partidas perdidas: " + partidasPerdidas);

    }
}
