package Servicio;

import Alumno.Alumno;
import java.util.List;
import java.util.Scanner;

public class AlumnoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alumno agregarAlumno() {
        Alumno a = new Alumno();
        System.out.println("Ingrese nombre del alumno");
        a.setNombre(leer.next());
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese nota del alumno del 1 al 10 " + (i + 1));
            a.getNota().add(leer.nextInt());
        }
        return a;
    }

    public void cargarLista(List<Alumno> a) {

        String respuesta;
        do {
            a.add(agregarAlumno());
            System.out.println("Quiere carcar otro Alumno? Y/N");
            respuesta = leer.next();
        } while (!respuesta.equalsIgnoreCase("n"));
    }

    public double notaFinal(List<Alumno> a) {
        String alumno;
        System.out.println("Ingrese el alumno a buscar");
        alumno = leer.next();
        int suma = 0;
        for (Alumno alumno1 : a) {
            if (alumno.equalsIgnoreCase(alumno1.getNombre())) {
                for (Integer nota : alumno1.getNota()) {
                     suma+=nota;  
                }
            }
            
        }
         return suma/3;  
    }
}
