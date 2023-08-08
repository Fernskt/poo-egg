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
    
    //crear, modificar, eliminar un producto
    
    public void guardarProducto(Producto producto) throws Exception{
        try { 
            if (producto == null){
                throw new Exception("Debe indicar un producto");
            }
            String sql = "INSERT INTO producto (codigo, nombre, precio)" 
                    + "VALUES ( " + producto.getCodigo() + " , ' "+ producto.getNombre() + " ',  "  + producto.getPrecio() +" );";
            actualizarDatos(sql);   
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificarProducto(Producto producto) throws Exception{
         try { 
            if (producto == null){
                throw new Exception("Debe indicar un producto a modificar");
            }
            String sql = "UPDATE usuario SET" 
                    + "nombre =  ' " + producto.getNombre() + " 'WHERE codigo =  ' "+ producto.getCodigo() + " ';";
            actualizarDatos(sql);   
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarProducto(int codigo) throws Exception{
         try {     
            String sql = "DELETE FROM producto WHERE   codigo = ' " + codigo + " ' ";                 
            actualizarDatos(sql);   
        } catch (Exception e) {
            throw e;
        }    
    }
    
    // buscar un producto
    
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
             desconectarBase();
             return producto;
             
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
}
     