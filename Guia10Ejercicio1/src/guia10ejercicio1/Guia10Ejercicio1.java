
package guia10ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Guia10Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> razasPerros = new ArrayList();
        Scanner leer = new Scanner(System.in);
        
        Boolean continuar = true;
        
        while (continuar) {
        System.out.println("Ingrese una raza de perro: ");
       
        
        razasPerros.add(leer.next().toLowerCase());
        
            System.out.println("¿Desea continuar Y/N?");
            String opcion = leer.next();
            if (opcion.equalsIgnoreCase("n")) {
                continuar = false;
            }
            
    }
       
        
        
       
        for (String razas : razasPerros) {
            System.out.println("Raza: " + razas);
        }
        
         System.out.println(razasPerros.size());
        
        System.out.println("Indique qué perro quiere eliminar");
        String perro = leer.next();
        
        
        
        Iterator<String> iterator = razasPerros.iterator();
        boolean esta = false;
       
        
       
        
        while(iterator.hasNext()){
            if(iterator.next().equals(perro)){
                iterator.remove();
                System.out.println("Perro " + perro +" eliminado"); 
                esta = true;
            }
       
        }
        if(esta == false){
                System.out.println("La raza no se encuentra en la lista");
            }
        
        Collections.sort(razasPerros);
        
         for (String razas : razasPerros) {
            System.out.println("Raza: " + razas);
        }
        
        
    } 
//   Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
//un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
//está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
//ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
//la lista ordenada. 
}
