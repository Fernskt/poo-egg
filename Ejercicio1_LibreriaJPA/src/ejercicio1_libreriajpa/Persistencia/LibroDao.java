
package ejercicio1_libreriajpa.Persistencia;

import ejercicio1_libreriajpa.entidades.Libro;

/**
 *
 * @author Pc
 */
public class LibroDao extends DAO<Libro> {

    public LibroDao() {
        super();
    }

    @Override
    public void create(Libro libro) {
        super.create(libro); 
    }
    
    public Libro findID(Long isbn){
        Libro libro = em.find(Libro.class, isbn);
        return libro;
    }

    @Override
    public void update(Libro libro) {
        super.update(libro); 
    }
    
   @Override
    public void delete(Libro libro) {
        super.delete(libro); 
    }
   
    
}
