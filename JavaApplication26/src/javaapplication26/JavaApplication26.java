/*
 Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
 */
package javaapplication26;


import Entidad.Pelicula;
import Servicio.PeliculaService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author Pc
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        PeliculaService p = new PeliculaService();
        List<Pelicula> listaP = new ArrayList();
       
        listaP = p.crearPelicula();
        
        System.out.println("Ingrese opcion"); 
        System.out.println("Ingrese 1 para mostrar peliculas"); 
        System.out.println("Ingrese 2 para mostrar peliculas mayores a 1 hora"); 
        System.out.println("Ingrese 3 para ordenar por duracion decreciente"); 
        System.out.println("Ingrese 4 para ordenar por duracion ascendente"); 
        System.out.println("Ingrese 5 para ordenar lista por titulo"); 
        System.out.println("Ingrese 6 para ordenar lista por director");
        System.out.println("Ingrese 7 para Salir"); 
        int opcion = leer.nextInt();
       
       
       switch(opcion){
           case 1:
               p.mostrarPeliculas(listaP);
               break;
           case 2:
                p.mayor1Hora(listaP);
                 break;
           case 3:
                p.ordenarDec(listaP);
                break;
           case 4:
               p.ordenarCre(listaP);
                break;
           case 5:
               p.ordenarTitulo(listaP);
                break;
           case 6:
               p.ordenarirector(listaP);
               break;
           case 7:
               System.out.println("Hasta Luego");
               break;
           default:
               System.out.println("Opcion incorrecta");
               
       }
       
       
     
     
    
    
     
     
     
     
  
    }

}
