
package ejercicio2guia8extra;

import Entidades.NIF;
import Servicios.ServicioNIF;


public class Ejercicio2Guia8Extra {

    public static void main(String[] args) {
       ServicioNIF nif = new ServicioNIF();
       NIF n = nif.crearNif();
       nif.mostrar(n);
       
    }
    
}
