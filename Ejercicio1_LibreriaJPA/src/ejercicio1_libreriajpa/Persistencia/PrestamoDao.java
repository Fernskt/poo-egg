/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_libreriajpa.Persistencia;

import ejercicio1_libreriajpa.entidades.Prestamo;

/**
 *
 * @author Pc
 */
public class PrestamoDao extends DAO<Prestamo>{

    public PrestamoDao() {
    }

    
      @Override
    public void create(Prestamo prestamo) {
        super.create(prestamo); 
    }
    
     public Prestamo findID(int id){
        Prestamo prestamo = em.find(Prestamo.class, id);
        return prestamo;
    }

    @Override
    public void update(Prestamo prestamo) {
        super.update(prestamo); 
    }

  @Override
    public void delete(Prestamo prestamo) {
        super.delete(prestamo); 
    }
    
    
}
