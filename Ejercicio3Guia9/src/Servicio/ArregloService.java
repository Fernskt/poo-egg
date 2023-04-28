/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Arrays;

/**
 *
 * @author Pc
 */
public class ArregloService {
    
    
    public void inicializarA(double[]a){
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.round(Math.random()*10+1);
        }
    }
    //Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
    public void mostrar(double[]a){
//        for (int i = 0; i < a.length; i++) {
//            System.out.print( a[i]+" ");
//        }
//        System.out.println("");
        System.out.println(Arrays.toString(a));
    
    }
    
//Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
    public void ordenar(double[]a){
         Arrays.sort(a);
        double aux [] = new double [a.length];
        for (int i = 0; i < a.length; i++) {
            aux[a.length-i-1] = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = aux[i];
        }
    }
   
  
    
    //Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B.
    
    public void inicializarB(double[]a ,double[]b){
        for (int i = 0; i < 10; i++) {
            b[i] = a[i];
    // Luego llenar las últimas 10 posiciones del arreglo B con 0.5.       
        }
        for (int i = 10; i < b.length; i++) {
            b[i] = 0.5;
        }
    }
    
    public void mostrarA(double[]a) {
        System.out.println(Arrays.toString(a));
        
    }
    public void mostrarB(double[]b) {
        System.out.println(Arrays.toString(b));
    }
    
}
