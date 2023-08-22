/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_libreriajpa.servicio;

import ejercicio1_libreriajpa.Persistencia.AutorDao;
import ejercicio1_libreriajpa.entidades.Autor;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class AutorServicio {
    
    AutorDao autorDaoService = new AutorDao();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public Autor crearAutor() {
        
        Autor autor = new Autor(); 
       autor.getId();
         System.out.println("Ingrese el nombre del nuevo autor: ");
        autor.setNombre(leer.next());
        autor.setAlta(true);
        autorDaoService.create(autor);
        return autor;
        
    }

    public void consultarAutor(){
        
        System.out.println("Ingrese el autor a buscar: ");
        Autor consultaAutor =  autorDaoService.findID(leer.nextInt());
        if(consultaAutor != null){
             System.out.println("El nombre es: " + consultaAutor.getNombre()  + " y ID del autor es: " + consultaAutor.getId());
        }else{
            System.out.println("El ID no es válido!");
        }   
    }
    
    public void modificarAutor(){
        
        System.out.println("Ingrese el ID del autor a modificar ");
        int idAModificar = leer.nextInt();
        Autor modificarAutor = autorDaoService.findID(idAModificar);
        if(modificarAutor != null){
            System.out.println("Ingrese los cambios pertinen¿tes");
            String cambio = leer.next();
            modificarAutor.setNombre(cambio);
            autorDaoService.update(modificarAutor);
            System.out.println("Se modificó correctamente a: " + modificarAutor.getNombre());
        }else{
            System.out.println("ID Incorrecto!");
        }
        
    }
    
    public void eliminarAutor(){
        
         System.out.println("Ingrese el ID del autor a eliminar ");
          int idAEliminar = leer.nextInt();
         Autor eliminarAutor = autorDaoService.findID(idAEliminar);
         
         if(eliminarAutor != null){
             autorDaoService.delete(eliminarAutor);
             System.out.println("Se ha eliminado correctamente a: " + eliminarAutor.getNombre());
         } else{
             System.out.println("ID Incorrecto!");
         }  
    }
    
    public void buscarAutorPorNombre(){
        
        System.out.println("Ingrese el nombre del autor a buscar: ");
        String nombre = leer.next();
        List<Autor> autores = autorDaoService.buscarAutorNombre(nombre);
        
        for (Autor autore : autores) {
            if(autore!=null){
                System.out.println("Autor: " + autore.getNombre() + " ID " + autore.getId());
            }else{
                System.out.println("El Autor no se encuentra");
            }
            
        }
       
    }
    
}
