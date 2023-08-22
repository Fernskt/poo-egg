/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_libreriajpa.servicio;

import ejercicio1_libreriajpa.Persistencia.ClienteDao;
import ejercicio1_libreriajpa.Persistencia.LibroDao;
import ejercicio1_libreriajpa.Persistencia.PrestamoDao;
import ejercicio1_libreriajpa.entidades.Cliente;
import ejercicio1_libreriajpa.entidades.Libro;
import ejercicio1_libreriajpa.entidades.Prestamo;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class PrestamoServicio {
    Scanner leer = new Scanner(System.in);
    
    Cliente cliente = new Cliente();
    Libro libro = new Libro();
   ClienteDao clienteDao = new ClienteDao();
   LibroDao libroDao = new LibroDao();
   ClienteServicio clienteServicio = new ClienteServicio();
   LibroServicio libroServicio = new LibroServicio();
   PrestamoDao prestamoDao = new PrestamoDao();
    
    public Prestamo crearPrestamo(){
        Prestamo prestamo = new Prestamo();
        
        // Obtener ID
        prestamo.getId();
        
        //Obtener Cliente
        System.out.println("Ingrese el ID del cliente");
        int id = leer.nextInt();
        cliente = clienteDao.findID(id);
        
        if (cliente == null){
        cliente = clienteServicio.crearcliente();
        prestamo.setCliente(cliente);
        
        }else{
            prestamo.setCliente(cliente);
        }
        
        //Obtener Libro
        System.out.println("Ingrese el ISBN del libro a alquilar");
        long isbn = leer.nextLong();
        
        libro  = libroDao.findID(isbn);
        
        if(libro.getEjemplaresRestantes()  != 0){
            libro.setEjemplaresRestantes(libro.getEjemplaresRestantes()-1);
            libro.setEjemplaresPrestados(libro.getEjemplaresPrestados()+1);
             libroDao.update(libro);
            prestamo.setLibro(libro);       
        }else{
            System.out.println("Ejemplares insuficientes");
        }
        
        //obtener fecha prestamo
        
        prestamo.setFechaPrestamo(LocalDate.now());
        
        //obtener fecha Devolucion
        
        prestamo.setFechaDevolucion(LocalDate.now().plusDays(7));
        
        prestamoDao.create(prestamo);
        
        return prestamo;
        
    }
    
}
