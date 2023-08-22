/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_libreriajpa.servicio;

import ejercicio1_libreriajpa.Persistencia.AutorDao;
import ejercicio1_libreriajpa.Persistencia.EditorialDao;
import ejercicio1_libreriajpa.Persistencia.LibroDao;
import ejercicio1_libreriajpa.entidades.Autor;
import ejercicio1_libreriajpa.entidades.Editorial;
import ejercicio1_libreriajpa.entidades.Libro;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class LibroServicio {

    LibroDao libroDao = new LibroDao();
    AutorDao autorDao = new AutorDao();
    EditorialDao editorialDao = new EditorialDao();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro crearLibro() {
        Autor autor = new Autor();
        Editorial editorial = new Editorial();
        Libro libro = new Libro();

        libro.getIsbn();
        System.out.println("Ingrese el título del libro");
        libro.setTitulo(leer.next());
        System.out.println("Ingrese el año de publicacion del libro");
        libro.setAnio(leer.nextInt());
        System.out.println("Ingrese la cantidad de ejemplares");
        int ejempl = leer.nextInt();
        libro.setEjemplares(ejempl);

        libro.setEjemplaresPrestados(0);
        libro.setEjemplaresRestantes(ejempl);

        System.out.println("Ingrese el autor del libro");
        String nombreA = leer.next();
        
        boolean aux = true;

        List<Autor> autores = autorDao.buscarAutorNombre(nombreA);

        for (Autor autore : autores) {
            if (autore.getNombre().equalsIgnoreCase(nombreA)) {
                libro.setAutor(autore);
                aux = false;
            }
        }
        if (aux) {
            autor.setNombre(nombreA);
            autor.setAlta(true);
            autorDao.create(autor);
            libro.setAutor(autor);
        }

        System.out.println("Ingrese la editorial del libro");
        String nombreE = leer.next();

        aux = true;

        List<Editorial> editoriales = editorialDao.buscarEditorialNombre(nombreE);

        for (Editorial editoriale : editoriales) {
            if (editoriale.getNombre().equalsIgnoreCase(nombreE)) {
                libro.setEditorial(editoriale);
                aux = false;
            }
        }
        if (aux) {
            editorial.setNombre(nombreE);
            editorial.setAlta(true);
            editorialDao.create(editorial);
            libro.setEditorial(editorial);
        }

        libroDao.create(libro);

        return libro;
    }

    public void consultarLibro(Libro li) {

        System.out.println("Ingrese el ISBN del libro a buscar");
        li = libroDao.findID(leer.nextLong());

        if (li != null) {
            System.out.println("El nombre del libro es: " + li.getTitulo() + " El Autor es: " + li.getAutor().getNombre() + " Editorial: " + li.getEditorial().getNombre());
        } else {
            System.out.println("el ID es incorrecto!");
        }

    }

    public void modificarLibro(Libro li) {

        System.out.println("Ingrese el ID del libro a editar");
        li = libroDao.findID(leer.nextLong());

        if (li != null) {
            System.out.println("Ingrese nuevo nombre");
            String nuevoNombre = leer.next();
            li.setTitulo(nuevoNombre);
            libroDao.update(li);

            System.out.println("Se modificó correctamente a: " + li.getTitulo());
        } else {
            System.out.println("ID incorrecto");
        }

    }

    public void eliminarLibro(Libro li) {

        System.out.println("Ingrese el ID del libro a eliminar");
        li = libroDao.findID(leer.nextLong());

        if (li != null) {
            libroDao.delete(li);
            System.out.println("Se ha eliminado a: " + li.getTitulo());
        } else {
            System.out.println("ID incorrecto");
        }

    }

    public void altaBajaLibro(Libro li) {

        System.out.println("Seleccione ISBN del libro");
        li = libroDao.findID(leer.nextLong());

        if (li.isAlta()) {
            System.out.println("El libro '" + li.getTitulo() + "', está dado de alta, Desea darle la Baja? S/N");
            String resp = leer.next();
            if (resp.equalsIgnoreCase("S")) {
                li.setAlta(false);
                libroDao.update(li);
                System.out.println("Libro dado de baja! ");
            }
        } else {
            System.out.println("Libro '" + li.getTitulo() + "', está  dado de baja, Desea darlo de alta? S/N");
            String resp = leer.next();
            if (resp.equalsIgnoreCase("S")) {
                li.setAlta(true);
                libroDao.update(li);
                System.out.println("Libro dado de alta");
            }
        }

    }

    public void buscarLibroPorNombre() {

        System.out.println("Ingrese el nombre del libro a buscar: ");
        String nombre = leer.next();
        List<Libro> libros = libroDao.buscarLibroNombre(nombre);
        if (!libros.isEmpty()) {
            System.out.println("Se encontraron " + libros.size() + " libros: ");
            for (Libro libroz : libros) {
                System.out.println(libroz.getTitulo() + " ID: " + libroz.getIsbn() + " Autor: " + libroz.getAutor().getNombre());
            }
        } else {
            System.out.println("No se encontró ningún libro que contenga '" + nombre + "'");

        }

    }

}
