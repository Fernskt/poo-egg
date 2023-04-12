/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class PuntosE {
    
    public double x1;
    public double x2;
    public double y1;
    public double y2;
    
     public void crearPuntos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese x1: ");
        x1 = sc.nextDouble();
        System.out.print("Ingrese y1: ");
        y1 = sc.nextDouble();
        System.out.print("Ingrese x2: ");
        x2 = sc.nextDouble();
        System.out.print("Ingrese y2: ");
        y2 = sc.nextDouble();
    }
    
      public double calcularDistancia() {
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distancia;
    }
}
