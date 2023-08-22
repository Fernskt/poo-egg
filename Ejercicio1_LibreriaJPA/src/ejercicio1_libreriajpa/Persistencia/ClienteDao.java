/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_libreriajpa.Persistencia;

import ejercicio1_libreriajpa.entidades.Cliente;

/**
 *
 * @author Pc
 */
public class ClienteDao extends DAO<Cliente> {

    public ClienteDao() {
    }
   
      @Override
    public void create(Cliente cliente) {
        super.create(cliente); 
    }
    
     public Cliente findID(int id){
        Cliente cliente = em.find(Cliente.class, id);
        return cliente;
    }

    @Override
    public void update(Cliente cliente) {
        super.update(cliente); 
    }

  @Override
    public void delete(Cliente cliente) {
        super.delete(cliente); 
    }
    
}
