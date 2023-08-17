/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_libreriajpa.servicio;

import ejercicio1_libreriajpa.Persistencia.EditorialDao;
import ejercicio1_libreriajpa.entidades.Editorial;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class EditorialServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    EditorialDao editorialDaoService = new EditorialDao();

    
    public Editorial crearEditorial() {

        Editorial editorial = new Editorial();

        editorial.getId();

        System.out.println("Ingrese el nombre de la Editorial: ");
        editorial.setNombre(leer.next());

        editorial.setAlta(true);

        editorialDaoService.create(editorial);
        return editorial;
    }

    
    public void consultarEditorial(Editorial e) {

        System.out.println("Ingrese el ID de la editorial a buscar");
        e = editorialDaoService.findID(leer.nextInt());

        if (e != null) {
            System.out.println("El nombre de la editorial es: " + e.getNombre());
        } else {
            System.out.println("el ID es incorrecto!");
        }

    }

    
    public void modificarEditorial(Editorial e) {

        System.out.println("Ingrese el ID de la editorial a editar");
        e = editorialDaoService.findID(leer.nextInt());

        if (e != null) {
            System.out.println("Ingrese nuevo nombre");
            String nuevoNombre = leer.next();
            e.setNombre(nuevoNombre);
            editorialDaoService.update(e);

            System.out.println("Se modificó correctamente a: " + e.getNombre());
        } else {
            System.out.println("ID incorrecto");
        }

    }

    
    public void eliminarEditorial(Editorial e) {

        System.out.println("Ingrese el ID de la editorial a eliminar");
        e = editorialDaoService.findID(leer.nextInt());

        if (e != null) {
            editorialDaoService.delete(e);
            System.out.println("Se ha eliminado a: " + e.getNombre());
        } else {
            System.out.println("ID incorrecto");
        }

    }

}
