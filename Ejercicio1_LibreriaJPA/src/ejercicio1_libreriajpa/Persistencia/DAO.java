/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_libreriajpa.Persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Pc
 * @param <T>
 
 */
public class DAO<T> {
    
    protected EntityManager em;
    protected final EntityManagerFactory emf;

    public DAO() {
        emf = Persistence.createEntityManagerFactory("Ejercicio1_LibreriaJPAPU");
        em = emf.createEntityManager();
    }
    
    public void conectar(){
        
        try {
            if(!em.isOpen()){
                em = emf.createEntityManager();
                System.out.println("Se conectó a la base de datos correctamente");
            }
        } catch (Exception e) {
            System.out.println("No se puede realizar la conexión");
            
        }
        
    }
    
   public void desconectar(){
       
       try {
           if(em.isOpen()){
               em.close();
           }
           System.out.println("Desconectado correctamente");
       } catch (Exception e) {
           System.out.println("No se pudo terminar la conexión");
       }
       
   }
   
   public void create(T objeto){
       try {
           conectar();
           em.getTransaction().begin();
           em.persist(objeto);
           em.getTransaction().commit();         
       } catch (Exception e) {
           System.out.println("No se pudo cargar " + objeto);
           if(em.getTransaction().isActive()){
               em.getTransaction().rollback();
           }
       }
       finally{
       desconectar();
   }       
   }
   
   public void update(T objeto){
       
       try {
           conectar();
           em.getTransaction().begin();
           em.merge(objeto);
           em.getTransaction().commit();  
       } catch (Exception e) {
           System.out.println("Error al editar  "+objeto);
       } finally{
           desconectar();
       }  
   }
        
public void delete(T objeto){
    
    try{
           conectar();
           em.getTransaction().begin();
           em.remove(objeto);
           em.getTransaction().commit();  
    }catch(Exception e){
        System.out.println("No se pudo eliminar");
    }finally{
        desconectar();
    }
    
}
    
}
