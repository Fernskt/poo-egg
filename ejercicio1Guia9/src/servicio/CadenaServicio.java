/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {

        System.out.println("Ingrese una frase");
        String frase = (leer.next());
        Cadena cadena = new Cadena(frase);
        cadena.setFrase(frase);
        return cadena;
    }

    /*Método mostrarVocales(), deberá contabilizar la cantidad de vocales que 
tiene la frase ingresada.*/
    public int mostrarVocales(Cadena c) {
        String frase = c.getFrase();

        int cantVocales = 0;

        for (int i = 0; i < c.getLongitud(); i++) {
            String subs = frase.substring(i, (i + 1));
           
            if (subs.equalsIgnoreCase("a") || subs.equalsIgnoreCase("e") || subs.equalsIgnoreCase("i") || subs.equalsIgnoreCase("o") || subs.equalsIgnoreCase("u")) {

                cantVocales++;
            }
        }

        return cantVocales;
    }

    /*Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
    Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".*/
    
    public void invertirFrase(Cadena c) {
        String frase = c.getFrase();
        for (int i = c.getLongitud() ; i > 0; i--) {
            String subs = frase.substring(i-1,i);
            System.out.print(subs);  
        }
        System.out.println(" ");
       
    }
    
    public void vecesRepetido(Cadena c) {
        System.out.println("Ingrese una letra");
        String letra = leer.next();
        String frase = c.getFrase();
        int cont = 0;
        
        for (int i = 0; i < c.getLongitud(); i++) {
            String subs = frase.substring(i, (i + 1));
           
           if(letra.equalsIgnoreCase(subs)){
               cont++;
           }
        }
        System.out.println("La cantidad de veces que se repite la letra ("+letra+") es " +cont+" veces");
        
    }
    
    /*Método compararLongitud(String frase), deberá comparar la longitud 
    de la frase que compone la clase con otra nueva frase ingresada por el usuario.*/
    
    public void compararLongitud(Cadena c) {
        String frase1 = c.getFrase();
        System.out.println("Ingrese otra frase");
        String frase2 = leer.next();
        
        int long1 = c.getLongitud();
        int long2 = frase2.length();
        
        if(long1==long2){
            System.out.println("Las frases tienen la misma longitud");
        }else{
            System.out.println("Las frases tienen distinta longitud");
        }
       
    }
    
    public String unirFrase(Cadena c) {
        System.out.println("Ingrese otra frase");
        String frase2 = leer.next();
        String frase1 = c.getFrase();
        
        frase2 = frase1.concat(frase2);
        return frase2;
    }
    
    public void reemplazar(Cadena c) {
        System.out.println("Ingrese una letra para reemplazar");
        String letra=leer.next();
        String fin=c.getFrase().replaceAll("a", letra);
        System.out.println("La frase con el reemplazo es: "+fin+"\n");
        
    }
//   Método contiene(String letra), deberá comprobar si la frase contiene 
//   una letra que ingresa el usuario y devuelve verdadero si la 
//   contiene y falso si no.
    
    public boolean contiene(Cadena c){
        System.out.println("Ingrese una letra");
        String letra = leer.next();
        String frase = c.getFrase();
        boolean res = true;
        for (int i = 0; i < c.getLongitud(); i++) {
            String subs = frase.substring(i, (i + 1));
            if(letra.equalsIgnoreCase(subs)){
                res = true;
                break;
            }else{
                res = false;
                
            }
        }
        
        return res;
    }


}
