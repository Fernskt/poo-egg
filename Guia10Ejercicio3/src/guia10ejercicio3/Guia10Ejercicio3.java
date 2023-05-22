
package guia10ejercicio3;

import Alumno.Alumno;
import Servicio.AlumnoService;
import java.util.ArrayList;


public class Guia10Ejercicio3 {

  
    public static void main(String[] args) {
        
       AlumnoService a = new AlumnoService();
       ArrayList<Alumno> listaAlumnos = new ArrayList<>();
       
       a.cargarLista(listaAlumnos);
    //    System.out.println("La nota final es: " + a.notaFinal(listaAlumnos));
       
     listaAlumnos.forEach((e)->System.out.println(e.getNombre()));
     
        
        
    }
    
    
    
}

