/*
Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los 
atributos capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) 
y cantidadActual (la cantidad actual de café que hay en la cafetera). 
Agregar constructor vacío y con parámetros así como setters y getters. Crear clase 
CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. 
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. 
El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, 
el método lo recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Servicio;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);

    public Cafetera crearCafetera() {

        Cafetera cafetera = new Cafetera();

        System.out.println("Ingrese la capacidad máxima de la cafetera en cm3");
        cafetera.setCapacidadMáxima(leer.nextInt());

        System.out.println("La capacidad de la cafetera es " + cafetera.getCapacidadMáxima() + " cm3");
        return cafetera;

    }

    public int llenarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(cafetera.getCapacidadMáxima());
        System.out.println("La cafetera se llenó con " + cafetera.getCantidadActual());
        return cafetera.getCantidadActual();

    }

    public int servirTaza(Cafetera cafetera) {

        /* Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. 

El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
cuanto quedó la taza.*/
        System.out.println("Ingrese la capacidad de la taza");
        int tazaTamano = leer.nextInt();

        System.out.println("Ingrese cuanto café desea servirse en la taza de " + tazaTamano);
        int cafe = leer.nextInt();

        /*Si la cantidad actual de café “no alcanza” para llenar la taza, 
        se sirve lo que quede. */
        int cafeActual = cafetera.getCantidadActual();

        if (cafeActual < cafe) {
            System.out.println("No alcanzó y se llenó con " + cafeActual);
            cafetera.setCantidadActual(0);

        } else {
            cafeActual -= cafe;
            cafetera.setCantidadActual(cafeActual);
            System.out.println("la taza se llenó con " + cafe);
            System.out.println("en la cafetera queda " + cafetera.getCantidadActual() + " café");
        }
        return cafe;
    }

    public void vaciarCafetera(Cafetera cafetera) {
        /*do vaciarCafetera(): pone la cantidad de café actual en cero. */
        cafetera.setCantidadActual(0);
        System.out.println("Se vacio la cafetera " + cafetera.getCantidadActual());
    }

    /* Método agregarCafe(int): se le pide al usuario una cantidad de café, 
el método lo recibe y se añade a la cafetera la cantidad de café indicada.*/
    public int agregarCafe(Cafetera cafetera) {

        System.out.println("cuando cafe quiere agregar a la cafetera?");
        int masCafe = leer.nextInt();
        masCafe += cafetera.getCantidadActual();

        int max = cafetera.getCapacidadMáxima();

        while (masCafe > max) {

            System.out.println("Ha excedido la capacidad máxima, ingrese una capacidad menor a " + (max - cafetera.getCantidadActual()));
            masCafe = leer.nextInt();
            masCafe += cafetera.getCantidadActual();
            max = cafetera.getCapacidadMáxima();
        }
        System.out.println("cantidad actual de cafe es "+cafetera.getCantidadActual());
        cafetera.setCantidadActual(masCafe);
        return cafetera.getCantidadActual();

    }
    
    public void menuCafetera(Cafetera cafetera) {
        boolean salir = false;
        do {
            System.out.print(
                     "---------------------------------"+"\n"
                    +"---------------------------------"+"\n"
                    +"**** - CAFETERA - ****" + "\n"
                    + "**** -  Menu  - ****" + "\n"
                    + "1 . LLenar Cafetera" + "\n"
                    + "2 . Servir Taza " + "\n"
                    + "3 . Vaciar cafetera" + "\n"
                    + "4 . Agregar Café" + "\n"
                    + "5 . Salir" + "\n"
                    +" - ");
            int opc = leer.nextInt();
            System.out.print("---------------------------------"+"\n"
                            +"---------------------------------"+"\n");
            switch (opc) {
                case 1:
                    llenarCafetera(cafetera);
                    break;
                case 2:
                    servirTaza(cafetera);
                    break;
                case 3:
                    vaciarCafetera(cafetera);
                    break;
                case 4:
                    agregarCafe(cafetera);
                    break;
                case 5:
                    System.out.println("Saliendo... Gracias por utilizar este programa");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
                    break;
            }
        } while (!salir);
    }

}
