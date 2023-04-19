/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad 
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo 
después de realizar una transacción de retiro.

 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Cuenta {
    
    public int saldo;
    public String titular;

  

    
    
    public void retirarDinero(){
        
        int retiro = 0;
    
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el usuario");
        titular = leer.nextLine();
        System.out.println("Ingrese cuanto dinero quiere retirar");
        retiro = leer.nextInt();
         saldo=100000;
        if(retiro>saldo){
            System.out.println("No tenés saldo suficiente");
        }else{
            saldo-=retiro;
            
        }
        
        System.out.println("su saldo actual es " + saldo);
       
   
    }
}
