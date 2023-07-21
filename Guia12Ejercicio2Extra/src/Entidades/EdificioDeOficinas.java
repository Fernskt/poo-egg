/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class EdificioDeOficinas extends Edificio {
    
    private int numOficinas;
    private int cantPersonasXOficina;
    private int numPisos;
    
    Scanner leer = new Scanner(System.in);
    
    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numOficinas, int cantPersonasXOficina, int numPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantPersonasXOficina = cantPersonasXOficina;
        this.numPisos = numPisos;
    }
    
    
    public void cantPersonas(){
        
        System.out.println("Ingrese cantidad de oficinas que hay en cada piso:");
        numOficinas = leer.nextInt();
        System.out.println("Ingrese cuántas personas entran en cada oficina:");
        cantPersonasXOficina = leer.nextInt();
        System.out.println("Ingrese la cantidad de pisos que tiene el edificio:");
        numPisos = leer.nextInt();
        
        int cantPersonaXEdificio = cantPersonasXOficina * numOficinas * numPisos;
        
        System.out.println("La cantidad de personas que entran en un edificio es: " + cantPersonaXEdificio);
    }
    

    @Override
    public double calcularSuperficie() {
        return largo * ancho;
    }

    @Override
    public double calcularVolumen() {
       return ancho * largo * alto;
    }
    
    
    
}
