/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_libreriajpa.Persistencia;

import ejercicio1_libreriajpa.entidades.Autor;

/**
 *
 * @author Pc
 */
public class AutorDao extends DAO<Autor> {

    public AutorDao() {
        super();
    }
    
      @Override
    public void create(Autor autor) {
        super.create(autor); 
    }
    
     public Autor findID(int id){
        Autor autor = em.find(Autor.class, id);
        return autor;
    }

    @Override
    public void update(Autor autor) {
        super.update(autor); 
    }

  @Override
    public void delete(Autor autor) {
        super.delete(autor); 
    }
    
    
    
    
}
