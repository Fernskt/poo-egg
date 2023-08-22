/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_libreriajpa.servicio;

import ejercicio1_libreriajpa.Persistencia.ClienteDao;
import ejercicio1_libreriajpa.entidades.Cliente;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class ClienteServicio {
    ClienteDao clienteDao = new ClienteDao();
    Scanner leer = new Scanner(System.in);
    
    public Cliente crearcliente(){
        
        Cliente cliente = new Cliente();
        cliente.getId();
        System.out.println("Ingrese el DNI");
        cliente.setDni(leer.nextLong());
        System.out.println("Ingrese el nombre");
       cliente.setNombre(leer.next());
        System.out.println("Ingrese el apellido");
        cliente.setApellido(leer.next());
        System.out.println("Dame tu telefono");
        cliente.setTelefono(leer.next());
        
        clienteDao.create(cliente);
        
        return cliente;
    }
    
    public void consultarCliente(Cliente cl){
        System.out.println("Ingrese el ID del cliente a buscar: ");
        cl = clienteDao.findID(leer.nextInt());
        
        if(cl != null){
            System.out.println("El nombre del cliente es: "+cl.getNombre()+" Apellido: " + cl.getApellido()+" DNI: "+cl.getDni()+ " Cel: "+cl.getTelefono());
        }else{
            System.out.println("El ID es incorrecto");
        }
    }
    
    public void editarCliente(Cliente cl){
        
        System.out.println("Ingrese el ID del cliente a modificar");
        
        
    }
    
}
