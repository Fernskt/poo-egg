/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_libreriajpa;


import ejercicio1_libreriajpa.entidades.Libro;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Pc
 */
public class Ejercicio1_LibreriaJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        EntityManager em = Persistence.createEntityManagerFactory("Ejercicio1_LibreriaJPAPU").createEntityManager();
        
       Libro libro = new Libro();
       libro.setTitulo("El Alquimista");
       libro.setAnio(1990);
       libro.setEjemplares(5);
       libro.setEjemplaresRestantes(0);
       em.getTransaction().begin();
       em.persist(libro);
       em.getTransaction().commit();
        
        
    }
    
}
