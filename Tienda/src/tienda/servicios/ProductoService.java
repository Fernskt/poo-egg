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

    public void ingresarProducto() throws Exception {

        try {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");

            System.out.println("Ingrese el codigo del producto:");
            int codigo = leer.nextInt();
            System.out.println("Ingrese el nombre del producto:");
            String nombre = leer.next();
            System.out.println("Ingrese el precio del producto");
            double precio = leer.nextDouble();
            System.out.println("Ingrese el código del fabricante");
            int codigoFabricante = leer.nextInt();

            crearProducto(codigo, nombre, precio, codigoFabricante);

        } catch (Exception ex) {
            throw ex;
        }

    }

    public void crearProducto(int codigo, String nombre, double precio, int codigoFabricante) throws Exception {

        try {

            if (codigo <= 0) {
                throw new Exception("Debes indicar el codigo del producto");
            }
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debes indicar el nombre del producto");
            }
            if (precio <= 0) {
                throw new Exception("Debes indicar el precio del producto");
            }
            if (codigoFabricante <= 0) {
                throw new Exception("Debes indicar el código del fabricante válido");
            }

            // Se crea el Producto
            Scanner leer = new Scanner(System.in);
            Producto producto = new Producto();

            producto.setCodigo(codigo);
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigoFabricante);

            dao.guardarProducto(producto);

        } catch (Exception e) {
            throw e;
        }

    }

    public void eliminarProducto() throws Exception {

        try {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el código del producto a eliminar");
            int codigo = leer.nextInt();

            dao.eliminarProducto(codigo);
        } catch (Exception e) {
            throw e;
        }

    }
}
