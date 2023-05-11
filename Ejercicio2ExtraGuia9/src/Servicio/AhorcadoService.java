
package Servicio;

import Entidades.Ahorcado;
import java.util.Scanner;



public class AhorcadoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {

        Ahorcado ahorcado = new Ahorcado();

        System.out.println("Ingrese una palabra");
        ahorcado.setPalabraAAbuscar(leer.next());
        System.out.println("Ingrese la cantidad máxima de jugadas");
        ahorcado.setCantJugadasMax(leer.nextInt());

        int longitud = ahorcado.getPalabraAAbuscar().length();
        ahorcado.setPalabra(new String[longitud]);

        for (int i = 0; i < longitud; i++) {

            String subs = ahorcado.getPalabraAAbuscar().substring(i, (i+1));
            ahorcado.getPalabra()[i] = subs;
        }
        return ahorcado;
    }

    public void longitud(Ahorcado a) {

        int longitud = a.getPalabra().length;

        System.out.println("La palabra ingresada contiene " + longitud + " letras");
    }

    public Boolean buscar(Ahorcado a) {

        System.out.println("Ingrese letra a buscar");
        String letra = leer.next();
        Boolean estaLetra = false;
        int max = a.getCantJugadasMax();
        
        for (int i = 0; i < a.getPalabra().length; i++) {
            String l = a.getPalabra()[i];
            if (letra.equalsIgnoreCase(l)){
                System.out.println("La letra "+letra+ " está en la palabra y esta en la posicion "+(i+1));
                estaLetra = true;                
            }   
        }     
        if(!estaLetra){
            System.out.println("La letra "+letra+" NO está en la palabra");
            max--;
            a.setCantJugadasMax(max);
        }
        System.out.println("prueba bool " + estaLetra);
       return estaLetra;
    }
    
//    public int encontradas(Ahorcado a, int falt){
//
//
//
//        return a.getCantLetrasEncontradas();
//    }
    
    public int intentos(Ahorcado a){
        
        return a.getCantJugadasMax();
        
    }
   
    public void juego(Ahorcado a){
        longitud(a);
       int falt = a.getPalabra().length;
        do{
      
           // buscar(a);
       
       
        boolean encontrada = buscar(a);
        
        if(encontrada){
           a.setCantLetrasEncontradas(a.getCantLetrasEncontradas()+1);
           falt--;
        }
        
        System.out.println("Ha encontrado " + a.getCantLetrasEncontradas() + " letras!");
        
        System.out.println("Le falta encontrar "+falt+" letras!");
        System.out.println("Le quedan " + intentos(a) + " INTENTOS!!!!"); 
        
    
     //       System.out.println("prueba enc "+enc);
        
     if(falt == 0){
           System.out.println("FELICITACIONES, HA ENCONTRADO LA PALABRA!!!");
      }
        }while(intentos(a) != 0 && falt != 0);
        if(intentos(a) == 0)
        System.out.println("Se te acabaron todos los intentos");
       
    }

}
