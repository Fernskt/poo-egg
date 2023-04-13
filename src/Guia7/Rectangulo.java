
package Guia7;

import EjerciciosEntidades.RectanguloE;


public class Rectangulo {

   
    public static void main(String[] args) {
        RectanguloE rectangulo = new RectanguloE();
        rectangulo.crearRectangulo();
        System.out.println("superficie: " + rectangulo.superficie());
        System.out.println("Perimetro: "+rectangulo.perimetro());
        
        rectangulo.dibujar();
    }
    
}
