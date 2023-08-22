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
    
    public void editarCliente(Cliente cl) {
        System.out.println("Ingrese el Id del cliente a modificar: ");
        int IdAModificar = leer.nextInt();
        cl = clienteDao.findID(IdAModificar);

        if (cl != null) {
            System.out.println("Ingrese la opción deseada para cliente: ");
            System.out.println("1: Modificar el D.N.I");
            System.out.println("2: Modificar el nombre ");
            System.out.println("3: Modificar el apellido");
            System.out.println("4: Modificar el teléfono");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el D.N.I correcto.");
                    cl.setDni(leer.nextLong());
                    break;
                case 2:
                    System.out.println("Ingrese el nombre correcto.");
                    cl.setNombre(leer.next());
                    break;
                case 3:
                    System.out.println("Ingrese el apellido correcto.");
                    cl.setApellido(leer.next());
                    break;
                case 4:
                    System.out.println("Ingrese el télefono correcto.");
                    cl.setTelefono(leer.next());
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    throw new AssertionError();
            }

            clienteDao.update(cl);
            System.out.println("Se modificó correctamente a " + cl.getNombre() + cl.getApellido());
        }
    }
    
    public void eliminarCliente(Cliente cl) {

        System.out.println("Ingrese el Id del cliente a eliminar");
        cl = clienteDao.findID(leer.nextInt());

        if (cl != null) {
            clienteDao.delete(cl);
            System.out.println("Se ha eliminado a: " + cl.getNombre() + cl.getApellido());
        } else {
            System.out.println("ID incorrecto");
        }

    }
    
}
