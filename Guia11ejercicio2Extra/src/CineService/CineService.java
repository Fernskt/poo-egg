/*
 Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final delPor último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los  mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
 */
package CineService;

import Entidades.Espectador;
import Entidades.Sala;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class CineService {
       
    Scanner leer = new Scanner(System.in);
    
    Espectador espectador = new Espectador();
   
        Sala sala = new Sala(8, 6);
        
    public void llenarSala() {
        
        for (int i = sala.getFila() - 1; i >= 0; i--) {
            for (int j = 0; j < sala.getColumna(); j++) {
                System.out.print((i + 1) + " " + (char) ('A' + j) + " " + "  | ");
                
            }
            System.out.println("");
        }
    }

    public Espectador crearEspectadores() {
      
            System.out.println("Ingrese su nombre");
            espectador.setNombre(leer.next());
            System.out.println("Ingrese su edad");
            espectador.setEdad(leer.nextInt());
            System.out.println("Ingrese la cantidad de dinero disponible");
            espectador.setDineroDisponible(leer.nextDouble());
            
         
        return espectador;
    }
    
    public Sala ubicarEspectador(Sala sala, Espectador espectador){
        
        int columna = sala.getColumna();
        int fila = sala.getFila();
        
        
        Random random = new Random();
        
        
        return null;
    }
    
    
        
    }

