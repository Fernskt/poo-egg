/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import Entidades.Cafetera;
import Servicio.CafeteraServicio;

/**
 *
 * @author Pc
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraServicio cafetera = new CafeteraServicio();
        Cafetera cafe1 = cafetera.crearCafetera();
        
        cafetera.menuCafetera(cafe1);
        
    }
    
}
