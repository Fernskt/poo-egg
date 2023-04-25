/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.NIF;
import java.util.Scanner;

public class ServicioNIF {

    Scanner leer = new Scanner(System.in);
    NIF n = new NIF();

    public NIF crearNif() {

        System.out.println("Ingrese n de DNI");
        n.setDni(leer.nextLong());

        return n;
    }

    public String calcular(NIF n) {

        String[] vector = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        long num = n.getDni() % 23;
        System.out.println("Posicion: " + num);

        for (int i = 0; i < vector.length; i++) {
            if (i == num) {
                n.setLetra(vector[i]);
            }
        }
        return n.getLetra();
    }

    public void mostrar(NIF n) {
        System.out.println(n.getDni() + "-" + calcular(n));
    }
}
