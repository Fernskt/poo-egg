
package Entidades;

import EjerciciosExtra.CancionE;
import java.util.Scanner;

public class Cancion {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CancionE cancion = new CancionE();
        System.out.println("Ingrese el titulo de la cancion");
        cancion.titulo = leer.nextLine();
        System.out.println("Ingrese el autor");
        cancion.autor = leer.nextLine();
        
    }
    
}
