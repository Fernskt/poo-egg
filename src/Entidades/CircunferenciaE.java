
package Entidades;

import Ejercicios.Circunferencia;


public class CircunferenciaE {

    
    public static void main(String[] args) {
       Circunferencia c1 = new Circunferencia();
       
       c1.crearCircunferencia();
       
        System.out.println("El radio es " + c1.getRadio());
        System.out.println("El area es " + c1.area());
        System.out.println("El perimetro es " + c1.perimetro());
        
        
    }
    
}
