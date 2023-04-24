package javaapplication11;

import java.util.Scanner;

public class JavaApplication11 {

    public static void main(String[] args) {

        int[] vector;
        vector = new int[11];
        Scanner leer = new Scanner(System.in);
        String resp = "";

        System.out.println("Ingrese la tabla que desea mostrar");
        int num = leer.nextInt();
        
       
        
        for (int i = 1; i < vector.length; i++) {

            vector[i] = i * num;
            System.out.println(num + " x " + i + " = " + vector[i]);
        }
        do {
            System.out.println("Desea saber otra tabla? Y/N");
            resp = leer.next();
            if (!resp.equalsIgnoreCase("y") && !resp.equalsIgnoreCase("n")) {
                System.out.println("Respuesta Incorrecta!");
            }
        } while (!resp.equalsIgnoreCase("y") && !resp.equalsIgnoreCase("n"));

        while (resp.equalsIgnoreCase("y")) {
            System.out.println("Ingrese otra tabla");
            num = leer.nextInt();
            for (int i = 0; i < vector.length; i++) {

                vector[i] = i * num;
                System.out.println(num + " x " + i + " = " + vector[i]);
            }
            System.out.println("Desea saber otra tabla? Y/N");
            resp = leer.next();
        }
        System.out.println("Hasta Pronto!!");
    }

}
