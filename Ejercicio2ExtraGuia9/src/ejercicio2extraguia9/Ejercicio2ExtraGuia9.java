
package ejercicio2extraguia9;

import Entidades.Ahorcado;
import Servicio.AhorcadoService;

public class Ejercicio2ExtraGuia9 {

   
    public static void main(String[] args) {
        AhorcadoService ahorcado = new AhorcadoService();
        Ahorcado juego = ahorcado.crearJuego();
        ahorcado.juego(juego);
    }
    
}
