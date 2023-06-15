/*

 */
package Entidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**

 */
public class Simulador {
    
    public ArrayList<String> simulador(){
        
        String nombres = "Juan,María,Pedro,Laura,Carlos,Ana,Miguel,Sofía,Luis,Lucía,Fernando,Isabel,Javier,Carmen,Roberto,Elena,Alejandro,Patricia,Diego,Valeria";
        String apellidos = "González,Rodríguez,López,Pérez,García,Martínez,Fernández,Sánchez,Ramírez,Torres,Rivera,Flores,Ortega,Vargas,Mendoza,Ruiz,Guerrero,Cruz,Hernández,Reyes";
        
        String[] nombre = nombres.split(",");
        String[] apellido = apellidos.split(",");
        
         ArrayList<String>nombreCompleto = new ArrayList();
         ArrayList<String>nombreLista = new ArrayList(Arrays.asList(nombre));
         ArrayList<String>apellidoLista = new ArrayList(Arrays.asList(apellido));
         
         for (int i = 0; i < nombreLista.size(); i++) {
            
             String nC = (nombreLista.get((int) (Math.random()*nombreLista.size()))+ " " + (apellidoLista.get((int) (Math.random()*nombreLista.size()))));
             
             nombreCompleto.add(nC);
             
             
        }
         
         return nombreCompleto;
        
    }
    
    public HashSet<String> generadorDni(){
        
        ArrayList<String> listaNombres = simulador();
        HashSet<String> dniC = new HashSet();
        
        String[] dni = {"1","2","3","4","5","6","7","8","9","0"};
        String numDni = "";
        
        for (int i = 0; i < listaNombres.size(); i++) {
            for (int j = 0; j < 8; j++) {
                
                int random = (int) (Math.random()*8);
                numDni += dni[random];
                
            }
            dniC.add(numDni);
            numDni = "";
        }
        return dniC;
    }
    
    public ArrayList<Alumno> generarAlumnos(){
        
        ArrayList<Alumno> alumnos = new ArrayList<>();
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cuántos alumnos desea ingresar?");
        int cantAlumnos = leer.nextInt();
        
        ArrayList<String> nombreL = simulador();
        
        for (int i = 0; i < cantAlumnos; i++) {
            Alumno alumno = new Alumno();
            alumno.setNombre(nombreL.get((int) (Math.random()*nombreL.size())));
           //llenar dni
            
            
            alumnos.add(alumno);
            
        }
        
        return alumnos;
    }
    
    
}
