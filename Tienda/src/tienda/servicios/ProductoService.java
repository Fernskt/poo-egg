/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

/**
 *
 * @author Pc
 */
public class ProductoService {
    
    private ProductoDAO dao;

    public ProductoService() {
        this.dao = new ProductoDAO();
    }
    
    public void crearProducto() throws Exception{
        
        try {
            
//            if(codigo <= 0){
//                throw new Exception("Debes indicar el codigo del producto");
//            }
//            if(nombre == null || nombre.trim().isEmpty()){
//                 throw new Exception("Debes indicar el nombre del producto");
//            }
//              if(precio <= 0){
//                throw new Exception("Debes indicar el precio del producto");
//            }
            // Se crea el Producto
            
            Scanner leer = new Scanner(System.in);
            
            Producto producto = new Producto();
            
            System.out.println("Ingrese el codigo del producto:");
            producto.setCodigo(leer.nextInt());
             System.out.println("Ingrese el nombre del producto:");
             producto.setNombre(leer.next());
             System.out.println("Ingrese el precio del producto");
             producto.setPrecio(leer.nextDouble());
             
             dao.guardarProducto(producto);
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    
}
