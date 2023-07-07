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
public class Electrodomestico {
    
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumeEnergetico) {
        this.consumoEnergetico = consumeEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void comprobarConsumoEnergetico(char letra){
        letra = consumoEnergetico;
                if(letra > 'f'){
                    letra = 'f';
                }
    }
    
    public void comprobarColor(){
        
        
        if(color.equalsIgnoreCase("blanco") || 
                color.equalsIgnoreCase("negro") || 
                color.equalsIgnoreCase("rojo") || 
                color.equalsIgnoreCase("azul") || 
                color.equalsIgnoreCase("gris")){
           
        }else{
             color = "Blanco";
        }
        
    }
    Scanner leer = new Scanner(System.in);
    
    public void crearElectrodoméstico(){
        
        precio = 1000;
        System.out.println("Indique color del electrodoméstico");
        color = leer.next();
        comprobarColor();
        System.out.println(color);
        System.out.println("Indique consumo energético del electrodoéstico");
        String entrada = leer.next();
        consumoEnergetico = entrada.charAt(0);
        System.out.println(consumoEnergetico);
        comprobarConsumoEnergetico(consumoEnergetico);
        System.out.println("Indique el peso del electrodoméstico");
        peso = leer.nextDouble();
        
    }
    
    public double precioFinal(){
        
        switch (consumoEnergetico){
            case 'a':
                    precio += 1000;
                    break;
          case 'b':
                    precio += 800;
                    break;
          case 'c':
                    precio += 600;
                    break;
          case 'd':
                    precio += 500;
                    break;
          case 'e':
                    precio += 300;
                    break;
          case 'f':
                    precio += 100;
                    break;
        }
        
        if(peso >= 1 && peso <= 19){
            precio += 100;
        } else if(peso >= 20 && peso <= 49){
            precio += 500;
        } else if(peso >= 50 && peso <= 79){
            precio += 800;
        } else{
            precio += 1000;
        }
        return precio;
    }
    
}
