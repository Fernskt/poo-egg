
package ejercicio1gui8extra;

import Entidades.Raices;
import Servicios.ServicioRaices;


public class Ejercicio1Gui8Extra {

   
    public static void main(String[] args) {
        
        ServicioRaices raices = new ServicioRaices();
        Raices r = raices.crearRaices();
        
        raices.calcular(r);
        
    }
    
}
