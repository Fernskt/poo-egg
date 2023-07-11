/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ejercicio2extra;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;




/**
 *
 * @author Pc
 */
public class Guia12Ejercicio2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Polideportivo p1 = new Polideportivo("elpoli",true,160.50,30,300);
        Polideportivo p2 = new Polideportivo("Islas Malvinas",false,100,20,200);
        EdificioDeOficinas eo1 = new EdificioDeOficinas();
        EdificioDeOficinas eo2 = new EdificioDeOficinas();
        
        ArrayList<Edificio> edificios = new ArrayList();
        
        edificios.add(p1);
        edificios.add(p2);
        edificios.add(eo1);
        edificios.add(eo2);
        
        for (Edificio edificio : edificios) {
            edificio.calcularSuperficie();
        }
      
    }
    
}
