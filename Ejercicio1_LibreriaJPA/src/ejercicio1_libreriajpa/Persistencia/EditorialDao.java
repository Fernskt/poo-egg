/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_libreriajpa.Persistencia;

import ejercicio1_libreriajpa.entidades.Editorial;
import java.util.List;

/**
 *
 * @author Pc
 */
public class EditorialDao extends DAO<Editorial> {

    public EditorialDao() {
        super();
    }
    
      @Override
    public void create(Editorial editorial) {
        super.create(editorial); 
    }
    
     public Editorial findID(int id){
        Editorial editorial = em.find(Editorial.class, id);
        return editorial;
    }
     
      @Override
    public void update(Editorial editorial) {
        super.update(editorial);
    }

    @Override
    public void delete(Editorial editorial) {
        super.delete(editorial); 
    }

   public List<Editorial> buscarEditorialNombre(String nombre){
        
    String jpql = "SELECT e FROM Editorial e WHERE e.nombre LIKE '%"+nombre+"%'";
     return em.createQuery(jpql, Editorial.class).getResultList();
        
    }

  
    
    
}
