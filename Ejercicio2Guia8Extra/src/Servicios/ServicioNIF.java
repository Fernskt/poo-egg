/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.NIF;
import java.util.Scanner;


public class ServicioNIF {
    
    Scanner leer = new Scanner(System.in);
    NIF n = new NIF();
    public NIF crearNif(){
        
        System.out.println("Ingrese n de DNI");
        n.setDni(leer.nextLong());
        
        
        
        
        
        return n;
    }
}
