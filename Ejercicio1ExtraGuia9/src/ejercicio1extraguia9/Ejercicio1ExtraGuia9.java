/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1extraguia9;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ejercicio1ExtraGuia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        String[] frases = {"Na que ver!","Cualquieee","Nop... es otro","Uy cerca!! pero Nop","Malisimo"};
    
        int numeroAleatorio2 = (int)(Math.random() * 4) + 1;
        int numeroAleatorio = (int)(Math.random() * 11) + 1;
        
        String frase = frases[numeroAleatorio2];
        String mesSecreto = meses[numeroAleatorio];
        
        int resIncorrectas = 0;

        System.out.println("Adivina el mes secreto");
        String respuesta = leer.next();

        if (respuesta.equalsIgnoreCase(mesSecreto)) {
            System.out.println("Ha adivinado el mes!!!");
        }

        while (!respuesta.equalsIgnoreCase(mesSecreto)) {
            numeroAleatorio2 = (int)(Math.random() * 4) + 1;
            frase = frases[numeroAleatorio2];
            resIncorrectas++;
            System.out.println(frase);
             respuesta = leer.next();
            if (respuesta.equalsIgnoreCase(mesSecreto)) {
                System.out.println("¡¡Acertastes!!");
            }
        }
        if(resIncorrectas == 0){
            System.out.println("Felicidades! Adivinaste a la primera! Sos un genio sos lo mas Sos Increible!!!");
        }else if(resIncorrectas == 1){
              System.out.println("Te equivocaste "+resIncorrectas+" vez.. Bastante bien eh... Te felicito");
        }else if(resIncorrectas == 2){
            System.out.println("Te equivocaste "+resIncorrectas+" veces... Bue... bien igual");
        }else if(resIncorrectas > 8){
            System.out.println("Sos un desastre!!!!!! " + resIncorrectas+" respuestas incorrectas Men!");
        }else{
            System.out.println("Te equivocaste "+resIncorrectas+" veces");
        }
        
      

    }
}
