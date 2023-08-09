/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.Scanner;
import tienda.servicios.ProductoService;

/**
 *
 * @author Pc
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ProductoService ps = new ProductoService();
        Scanner leer = new Scanner(System.in);
        try {

            boolean aux = true;

            while (aux) {
                System.out.println("Qué deseas hacer?");
                System.out.println("1: Ingresar un producto");
                System.out.println("2: Eliminar un producto");

                int opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        ps.ingresarProducto();
                        break;
                    case 2:
                        ps.eliminarProducto();
                }
                System.out.println("Desea seguir operando? S/N");
                String respuesta = leer.next();
                if (respuesta.equalsIgnoreCase("n")) {
                    System.out.println("Hasta Pronto");
                    aux = false;
                }
            }

        } catch (Exception e) {
            System.out.println("Errorcito");
            System.out.println(e.fillInStackTrace());
        }

    }

}
