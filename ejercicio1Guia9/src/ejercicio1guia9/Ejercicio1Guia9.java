/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1guia9;

import Entidades.Cadena;
import java.util.Scanner;
import servicio.CadenaServicio;

/**
 *
 * @author Pc
 */
public class Ejercicio1Guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        CadenaServicio c = new CadenaServicio();

        Cadena cadena = c.crearCadena();
        //System.out.println(cadena.toString());
        
        System.out.println("Qué desea realizar con la frase?");
        System.out.println("1. Contar vocales");
        System.out.println("2. Invertir frase");
        System.out.println("3. Contar caracter");
        System.out.println("4. comparar longitud con otra frase");
        System.out.println("5. unir dos frases");
        System.out.println("6. reemplazar caracter");
        System.out.println("7. contiene caracter");
        int opcion = leer.nextInt();
        switch(opcion){
            case 1:
                System.out.println("La cantidad de vocales es: " + c.mostrarVocales(cadena));
                break;
            case 2:
                System.out.println("Cadena invertida: ");
                c.invertirFrase(cadena);
                break;
            case 3:
                System.out.println("Veces letra repetida");
                c.vecesRepetido(cadena);
                break;
            case 4:
                System.out.println("comparar longitudes");
                c.compararLongitud(cadena);
                break;
            case 5:
                System.out.println(c.unirFrase(cadena));
                break;
            case 6:
                c.reemplazar(cadena);
                break;
            case 7:
                if(c.contiene(cadena)){
                    System.out.println("contiene la letra");
                }else{
                    System.out.println("La letra no se encuentra en la frase");
                }
                break;
            default:
                System.out.println("Opción inválida");
                
        }
        

//    System.out.println("La cantidad de vocales es: " + c.mostrarVocales(cadena));
//
//    System.out.println("Cadena invertida: ");
//
//    c.invertirFrase(cadena);
//
//    System.out.println("Veces letra repetida");
//
//    c.vecesRepetido(cadena);
//
//    System.out.println("comparar longitudes");
//
//    c.compararLongitud(cadena);
//
//    System.out.println(c.unirFrase(cadena));
//
//    c.reemplazar(cadena);

    }

}
