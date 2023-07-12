/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Pc
 */
public class Hotel4 extends Hoteles {
    
    protected String gimnasio;
    protected String nombreRest;
    protected int capacidadRest;

    public Hotel4() {
    }

    public Hotel4(String gimnasio, String nombreRest, int capacidadRest, int cantHabitaciones, int numCamas, int cantPisos, String nombre, String nombreCalle, int numeroCalle, String localidad, String encargado) {
        super(cantHabitaciones, numCamas, cantPisos, nombre, nombreCalle, numeroCalle, localidad, encargado);
        this.gimnasio = gimnasio;
        this.nombreRest = nombreRest;
        this.capacidadRest = capacidadRest;
    }

    @Override
    public double precioHabitacion() {
        super.precioHabitacion();
        double precio;
        
        if(capacidadRest<30){
         precio =  precioHabitacion() + 10;
        }else if(capacidadRest <= 50 ){
            precio =  precioHabitacion() + 30;
        }else{
            precio = precioHabitacion() + 50;
        }
        
        if(gimnasio.equalsIgnoreCase("a")){
          precio += 50;
        }else {
            precio += 30;
        }
        
        return precio;
    }

    

    

  
    
    
    
}
