
package ejercicio1_libreriajpa;

import ejercicio1_libreriajpa.entidades.Autor;
import ejercicio1_libreriajpa.servicio.AutorServicio;

/**
 *
 * @author Pc
 */
public class Ejercicio1_LibreriaJPA {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
      AutorServicio autorServicio = new AutorServicio();
     Autor autor = autorServicio.crearAutor();
     // autorServicio.consultarAutor();
     //autorServicio.modificarAutor();
    //autorServicio.eliminarAutor();
      
   
        
    }
    
}
