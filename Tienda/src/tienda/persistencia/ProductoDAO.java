/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import tienda.entidades.Producto;

/**
 *
 * @author Pc
 */
public final class ProductoDAO extends DAO{
    
    
    public Producto buscarProducto() throws Exception{
        
        try {
             String sql = "SELECT nombre FROM producto ";
             consultarBase(sql);
             
             Producto producto = null;
             
             while(resultado.next()){
                 producto = new Producto();
                 producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                 
                 
             }
             
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
        
    
     
     
} 
    
    
   
           
    
}
