/*
 Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package PaisesServicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 */
public class PaisesServicio {

    Scanner leer = new Scanner(System.in);
    HashSet<String> paises = new HashSet();

    public void conjuntoPaises() {
        boolean otroPais = true;

        while (otroPais) {

            System.out.println("Ingrese un país");
            paises.add(leer.next());
            System.out.println("Desea agregar otro país? s/n");
            String resp = leer.next();
            if (resp.equalsIgnoreCase("n")) {
                otroPais = false;
            }
        }
        mostrarPaises();
        ordenAZ();
    }
    public void mostrarPaises(){
        
        System.out.println("La lista de países es: ");
        
        for (String pais : paises) {
            System.out.println(pais);
        }
    }
     public void ordenAZ(){
        ArrayList<String> paisesAZ = new ArrayList(paises);
        Collections.sort(paisesAZ);
         System.out.println("esta es la lista de países ordenada: ");
         for (String string : paisesAZ) {
             System.out.println(string);
         }
    }
     public void eliminarPais(){
         Iterator<String> it = paises.iterator();
         System.out.println("Ingrese pais a eliminar");
         String respPais = leer.next();
         while(it.hasNext()){
             if(it.next().equalsIgnoreCase(respPais)){
                 it.remove();
             }
         }
         System.out.println("El pais no se encuentra");
         mostrarPaises();
         
     }

}
