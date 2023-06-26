/*
 Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/**
 *
 * @author Pc
 */
public class Baraja {
    
    private HashSet<Carta> cartas = new HashSet();
    private List<Carta> monton = new ArrayList();

    public Baraja() {
    }

    public HashSet<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(HashSet<Carta> cartas) {
        this.cartas = cartas;
    }

    public List<Carta> getMonton() {
        return monton;
    }

    public void setMonton(List<Carta> monton) {
        this.monton = monton;
    }


   
    
    
    
    public HashSet<Carta> crearBaraja(){
        
      String[] palos = {"Espadas","Oros","Bastos","Copas"};
        for (String palo : palos) {
            for (int i = 1; i <= 12; i++) {
                if(i != 8 && i != 9){
                    cartas.add(new Carta(i,palo));
                }
            }
        }
        return cartas;
    }
    
    
    public void barajar(){
        
        ArrayList<Baraja> mezclar = new ArrayList(cartas);
        Collections.shuffle(mezclar);
        cartas = new LinkedHashSet(mezclar);
     
    }
    
    public Carta siguienteCarta(){
        
        if(!cartas.isEmpty()){
             Iterator<Carta> it = cartas.iterator();
             Carta carta = it.next();
             it.remove();
             monton.add(carta);
             
             return carta;
        }else{
            System.out.println("No quedaron más cartas");
            return null;
        }
       
        
        
    }
     public int cartasDisponibles(){
         return cartas.size();
     }     
     
     public HashSet<Carta> darCartas(int cant){
        
         if(cant > cartas.size()){
             System.out.println("No te quedan mas cartas");
             return null;
         }else{
             HashSet<Carta> cartasPedidas = new HashSet();
             for (int i = 0; i < cant; i++) {
                 Carta carta = siguienteCarta();
                 if(carta != null){
                     cartasPedidas.add(carta);
                 }
             }
             return cartasPedidas;
         }
  
     }
     
     public void cartasMonton(){
         
         if(monton.isEmpty()){
             System.out.println("Aun no ha salido ninguna carta");
         }else{
             System.out.println("cartas en el montón: ");
             for (Carta carta : monton) {
                 System.out.println(carta);
             }
         }
         
     }
       public void mostrarBaraja(){
           
           if(cartas.isEmpty()){
               System.out.println("No hay cartas en la baraja");
               
           }else{
               System.out.println("Cartas en la baraja: ");
               for (Carta carta : cartas) {
                   System.out.println(carta);
               }
           }
           
       }  

    @Override
    public String toString() {
        return "Baraja{" + "cartas=" + cartas + ", monton=" + monton + '}';
    }
       
}
