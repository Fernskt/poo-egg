/*
 *Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número 
entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). 
Esta clase debecontener un método toString() que retorne el número de carta y el palo. 
La baraja estará compuesta por un conjunto de cartas, 40 exactamente.
 */
package guia11ejercicio2;

import Entidades.Baraja;
import Entidades.Carta;
import java.util.HashSet;

/**
 *
 * @author Pc
 */
public class Guia11Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Baraja baraja = new Baraja();
        baraja.crearBaraja();
        baraja.barajar();
        
        System.out.println("Las cartas disponibles en la baraja: " + baraja.cartasDisponibles());
        
        HashSet<Carta> cartasPedidas = baraja.darCartas(5);
        
        if(cartasPedidas != null){
            System.out.println("Cartas obtenidas: ");
            for (Carta carta : cartasPedidas) {
                System.out.println(carta);
            }
        }
        
        System.out.println("__________________________");
        System.out.println("Cartas disponibles en la baraja: " + baraja.cartasDisponibles() + " cartas ");
        baraja.cartasMonton();
        baraja.mostrarBaraja();
    }
    
}
