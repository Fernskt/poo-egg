/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoradesueldo;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class CalculadoraDeSueldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ARRAYS
        
        //Ejercicio 1:
     //  llenarMatrizAsc();
     
     //Ejercicio 2:
     buscarNumeroAleatorio();
       
        
    }
    
    public static void llenarMatrizAsc(){
         try {
            int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("Número: " + numeros[i]);
        }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Fuera de rango: " + e.fillInStackTrace());
        }
    }
    
    public static void buscarNumeroAleatorio(){
        boolean aux = false;
        int count = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension del vector: ");
        int vector = leer.nextInt();
        
        int[] numerosAleat = new int[vector];
        
        System.out.println("Ingrese qué número quiere buscar: ");
        int numABuscar = leer.nextInt();
        
        for (int i = 0; i < numerosAleat.length; i++) {
            numerosAleat[i] =(int) Math.round(Math.random() * 10 ) ;
        }
        
        for (int i = 0; i < numerosAleat.length; i++) {
            System.out.println("Num: " + numerosAleat[i]);
        }
        
        for (int i = 0; i < numerosAleat.length; i++) {
            if(numerosAleat[i] == numABuscar){
                count++;
                aux = true;
            }
        }
        
      
        
        if (aux) {
            System.out.println("Número "+numABuscar+" encontrado!");
        }else{
             System.out.println("No pudimos encontrar tu número :( ");
        }
          if(count > 1){
            System.out.println("El número " + numABuscar + " se encuentra repetido " + count +" veces");
        }
    }
    
}
