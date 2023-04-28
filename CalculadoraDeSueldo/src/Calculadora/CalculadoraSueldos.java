/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author Pc
 */
public class CalculadoraSueldos {
    
    private double sueldoBasico;
    private int diasTrabajados;
    private int aniosTrabajados;
    private int cantidadHoras100;
    private int categoria;

    public CalculadoraSueldos() {
    }
    
    public CalculadoraSueldos(double sueldoBasico, int diasTrabajados, int aniosTrabajados, int cantidadHoras100, int categoria) {
        this.sueldoBasico = sueldoBasico;
        this.diasTrabajados = diasTrabajados;
        this.aniosTrabajados = aniosTrabajados;
        this.cantidadHoras100 = cantidadHoras100;
        this.categoria = categoria;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public int getAniosTrabajados() {
        return aniosTrabajados;
    }

    public void setAniosTrabajados(int aniosTrabajados) {
        this.aniosTrabajados = aniosTrabajados;
    }

    public int getCantidadHoras100() {
        return cantidadHoras100;
    }

    public void setCantidadHoras100(int cantidadHoras100) {
        this.cantidadHoras100 = cantidadHoras100;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    
    
    
}
