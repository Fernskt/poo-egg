/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2guia9;

import Entidad.ParDeNumeros;
import Servicio.ParDeNumerosService;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ejercicio2Guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ParDeNumerosService ps1 = new ParDeNumerosService();
        ParDeNumeros p1 = new ParDeNumeros();
        int rta;
        
          do {
            System.out.println("MENU\n"
                + "1-MOSTRAR VALORES\n"
                + "2-DEVOLVER MAYOR\n"
                + "3-CALCULAR POTENCIA\n"
                + "4-CALCULAR RAIZ\n"
                + "5-SALIR");
            rta=leer.nextInt();
            switch (rta) {
                case 1:
                    ps1.mostrarValores(p1);
                    break;
                case 2:
                    System.out.printf("El mayor valor es: %f",ps1.devolverMayor(p1));
                    break;
                case 3:
                    ps1.calcularPotencia(p1);
                    break;
                case 4:
                    ps1.calcularRaiz(p1);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
            }
        } while (rta!=5);
    }
    
}
