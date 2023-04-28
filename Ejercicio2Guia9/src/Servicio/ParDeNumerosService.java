/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.ParDeNumeros;

/**
 *
 * @author Pc
 */
public class ParDeNumerosService {
    
    //Método mostrarValores que muestra cuáles son los dos números guardados.
public void mostrarValores(ParDeNumeros n){
    System.out.printf("El primer número es %f y el segundo Número es %f \n",n.getNum1(),n.getNum2());
}

//Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor

public double  devolverMayor(ParDeNumeros n){
    return Math.max(n.getNum1(), n.getNum2());
}
//Método calcularPotencia para calcular la potencia del mayor valor de la clase 
//elevado al menor número. Previamente se deben redondear ambos valores.

public void calcularPotencia(ParDeNumeros n){
    double n1 = (int) Math.round(n.getNum1());
    double n2 = (int) Math.round(n.getNum2());
    double potencia;
    
    if(n1>n2){
        potencia = (int) Math.pow(n1, n2);
        System.out.printf("La potencia de %f es de %f \n",n1,potencia);
           
       } else {
           potencia = (int) Math.pow(n2, n1);
           System.out.printf("La potencia de %f es de %f \n",n2,potencia);
    }
    
}
//Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.


    public void calcularRaiz(ParDeNumeros n) {
    double n1 = (int) Math.round(n.getNum1());
    double n2 = (int) Math.round(n.getNum2());
    double raiz;
    
    if(n1>n2){
        raiz = (int) Math.sqrt(n2);
        System.out.printf("La raiz de %f es de %f \n",n2,raiz);
           
       } else {
           raiz = (int) Math.sqrt(n1);
           System.out.printf("La raiz de %f es de %f \n",n1,raiz);
    }
    }
    

}
