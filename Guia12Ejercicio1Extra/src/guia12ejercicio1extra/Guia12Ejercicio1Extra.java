/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ejercicio1extra;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.Velero;
import Entidades.Yate;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Guia12Ejercicio1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del cliente: ");
        String nombreCliente = leer.nextLine();
        System.out.println("Ingrese el documento del cliente");
        String dni = leer.nextLine();
        
        System.out.println("Ingrese la fecha del alquiler aaaa/mm/dd");
        String fechaAlquilerStr = leer.nextLine();
        LocalDate fechaAlquiler = LocalDate.parse(fechaAlquilerStr);
        
        System.out.println("Ingrese la fecha de devolucion aaaa/mm/dd");
        String fechaDevStr = leer.nextLine();
        LocalDate fechaDev = LocalDate.parse(fechaDevStr);
        
        System.out.println("Ingrese posicion de amarre");
        int posicionAmarre = leer.nextInt();
        
        Barco velero = new Velero("V123",10.5,2000,2);
        Barco barcoMotor = new BarcoMotor("M564",15.0,2010,250);
        Barco yate = new Yate("Y564",15.0,2010,250,5);
        
        Alquiler alquilerVelero = new Alquiler(nombreCliente, dni, fechaAlquiler, fechaDev, posicionAmarre, velero);
        Alquiler alquilerMotor = new Alquiler(nombreCliente, dni, fechaAlquiler, fechaDev, posicionAmarre, barcoMotor);
        Alquiler alquilerYate = new Alquiler(nombreCliente, dni, fechaAlquiler, fechaDev, posicionAmarre, yate);
        
        
        double precioVelero = alquilerVelero.calcularPrecio();
        double precioMotor = alquilerMotor.calcularPrecio();
        double precioYate = alquilerYate.calcularPrecio();
        
        System.out.println("El precio de alquiler del Velero es: ");
        System.out.println("$" +precioVelero);
        System.out.println("El precio de alquiler del barco motor es: ");
        System.out.println("$" +precioMotor);
        System.out.println("El precio de alquiler del yate es: ");
        System.out.println("$" +precioYate);
        
    }
    
}
