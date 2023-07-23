/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13ejercicio2;

/**
 *
 * @author Pc
 */
public class Arreglo {

    private int array[];

    public Arreglo(int tamanio) {
        this.array = new int[tamanio];
    }

    public void Cargar(int pos, int n) {
        try {
            array[pos] = n;

        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Indice fuera de rango");
        }
    }

    public int leer(int pos) {
        try {
            return array[pos];
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Indice fuera de rango");
            return -1;
        }
    }

}

