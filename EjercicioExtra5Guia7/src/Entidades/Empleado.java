/*
 Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un 
empleado en función de su edad y salario actual. El aumento salarial debe ser 
del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.

 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Empleado {
    
    public String nombre;
    public int edad;
    public double salario;
    
    public void calcularAumento(){
        
        Scanner leer = new Scanner(System.in);
        
        
        
        System.out.println("Diga su nombre");
        nombre=leer.next();
        System.out.println(nombre + " cuál es su edad?");
        edad = leer.nextInt();
        System.out.println("Cuál es su salario? ");
        salario = leer.nextDouble();
        
        if(edad>30){  
             System.out.println("Su aumento es de $" +salario*0.1);
            salario = salario*1.1;  
            
        }else if(edad<30){
            System.out.println("Su aumento es de $" +salario*0.05);
            salario=salario*1.05;
        }
        System.out.println("El neto a cobrar es: $" + salario);
       
    }
    
}
