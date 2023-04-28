/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4guia9;

import Servicio.FechaService;
import java.util.Date;

/**
 *
 * @author Pc
 */
public class Ejercicio4Guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FechaService fecha = new FechaService();
        //Date f = fecha.fechaNacimiento();
        Date fa = fecha.fechaActual();
        
       
        
        //System.out.println(f.getDate()+"/"+(f.getMonth()+1)+"/"+f.getYear());
        
        System.out.println("el día actual es: " +fa.getDate());
    }
    
}
