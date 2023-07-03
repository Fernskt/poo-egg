/*
 Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz.
 */
package guia11ejercicio2extra;

import CineService.CineService;

/**
 *
 * @author Pc
 */
public class Guia11ejercicio2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CineService cs = new CineService();
        cs.llenarSala();
    }
    
}
