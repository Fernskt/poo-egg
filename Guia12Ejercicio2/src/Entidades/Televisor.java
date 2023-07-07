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
public final class Televisor extends Electrodomestico {
    
    private int resolucion;
    private String sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(int resolucion, String sintonizadorTDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public String getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(String sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    
    public void crearTelevisor(){
        
        crearElectrodoméstico();
        System.out.println("Indique la resolucion de la TV en pulgado");
        resolucion = leer.nextInt();
        
        System.out.println("Indique si tiene sintonizador TDT");
        sintonizadorTDT = leer.next();
    
    }

    @Override
    public double precioFinal() {
         super.precioFinal(); //To change body of generated methods, choose Tools | Templates.
         
         if(resolucion > 40){
             precio += precio*0.3;
         }
         if(sintonizadorTDT.equalsIgnoreCase("si")){
             precio += 500;
         }
         return precio;
    }
    
    
    
}
