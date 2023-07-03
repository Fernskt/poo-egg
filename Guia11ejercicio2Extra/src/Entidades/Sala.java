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
public class Sala {
    
    private int fila;
    private int columna;
    private String[][] butacas;

    public Sala() {
    }

    public Sala(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.butacas = new String[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                butacas[i][j] = " ";
            }

        }
    }

    public String[][] getButacas() {
        return butacas;
    }

    public void setButacas(String[][] butacas) {
        this.butacas = butacas;
    }
    
    

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    @Override
    public String toString() {
        return "Sala{" + "fila=" + fila + ", columna=" + columna + ", butacas=" + butacas + '}';
    }
    
}
