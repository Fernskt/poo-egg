package Servicio;


import java.util.Date;
import java.util.Scanner;

/*
 Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, 
en paquete Servicios, que tenga los siguientes métodos:

 */


public class FechaService {
    /**
 Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento.
 * Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar 
 * el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia)
 */
    Scanner leer = new Scanner(System.in);
    public Date fechaNacimiento(){
    Date fecha = new Date();

    System.out.println("Ingrese su fecha de nacimiento;");
    System.out.println("Año: ");
    fecha.setYear(leer.nextInt());
    System.out.println("Mes: ");
    fecha.setMonth(leer.nextInt()-1);
    System.out.println("Día: ");
    fecha.setDate(leer.nextInt());

    return fecha;
    }

    public Date fechaActual() {
        Date fechaActual = new  Date();
        fechaActual.getDate();
        return fechaActual;
    }


//public static Date fechaNacimiento() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingrese su fecha de nacimiento:");
//        System.out.print("Año (yyyy): ");
//        int anio = scanner.nextInt();
//        System.out.print("Mes (1-12): ");
//        int mes = scanner.nextInt() - 1; // Los meses en la clase Date van de 0 a 11
//        System.out.print("Día (1-31): ");
//        int dia = scanner.nextInt();
//
//        return new Date(anio - 1900, mes, dia);
//    
//    
//}

}