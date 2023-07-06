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
public final class Lavadora extends Electrodomestico {
    
    private int carga;

    public Lavadora() {
    }


    public Lavadora(int carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
        
        crearElectrodoméstico();
        
        System.out.println("Ingrese la capacidad de carga");
        carga = leer.nextInt();
        
    }

    @Override
    public double precioFinal() {
        super.precioFinal(); //To change body of generated methods, choose Tools | Templates.
         if(carga > 30){
             precio += 500;
         }
         return precio;
    }
    
    
}
