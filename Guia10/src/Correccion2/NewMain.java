/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Correccion2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Pc
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Listas:
        ArrayList<Integer> numA = new ArrayList();
        int x = 20;
        numA.add(x);
        numA.add(80);
        numA.add(147);
        numA.add(50);
       
      
       
        //Conjuntos:
        HashSet<Integer> numB = new HashSet();
        Integer y = 20;
        numB.add(y);
        numB.add(850);
        numB.add(30);
        
       
        
        //Mapas:
        HashMap<Integer, String> alumnos = new HashMap();
        int dni = 33450203;
        String nombreAlumno = "Pepito";
        alumnos.put(dni, nombreAlumno);
        alumnos.put(5132, "nada");
        alumnos.remove(dni);
        
        
        
        
         for(Integer i : numB){
            System.out.println(i);
        }
         
        
        System.out.println(numA);
        System.out.println(numA.size());
        
        System.out.println(numB);
        
        System.out.println(alumnos);
    }
    
}
