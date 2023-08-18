package ejercicio1_libreriajpa;

import ejercicio1_libreriajpa.entidades.Autor;
import ejercicio1_libreriajpa.entidades.Editorial;
import ejercicio1_libreriajpa.entidades.Libro;
import ejercicio1_libreriajpa.servicio.AutorServicio;
import ejercicio1_libreriajpa.servicio.EditorialServicio;
import ejercicio1_libreriajpa.servicio.LibroServicio;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ejercicio1_LibreriaJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //Servicios Instancias
        
        AutorServicio autorServicio = new AutorServicio();
        LibroServicio libroServicio = new LibroServicio();
        EditorialServicio editorialServicio = new EditorialServicio();
        
        //Entidades Instancias
        
        Autor autor = new Autor();
        Libro libro = new Libro();
        Editorial editorial = new Editorial();
        
        boolean aux = true;
        
        System.out.println("Sistema de Gestión de altas y bajas de libros");
        System.out.println("____________________________");
        try {
            
       
        while(aux){
            
        System.out.println("Menú: ");
        System.out.println("1: Ingresar un libro");
        System.out.println("2: Editar un libro");
        System.out.println("3: Eliminar un libro por ID");
        System.out.println("4: Buscar libro por ISBN");
        System.out.println("5: Buscar autor por nombre");
        System.out.println("6: Alta o Baja de libro");
        System.out.println("7: Buscar libro por nombre");
        System.out.println("0: Salir");
        
        System.out.println("____________________________");
        System.out.println("Ingrese qué acción desea realizar");
        int opcion = leer.nextInt();
        
        switch(opcion){
            case 1:
                libroServicio.crearLibro();
                break;
            case 2:
                libroServicio.modificarLibro(libro);
                break;
            case 3:
                libroServicio.eliminarLibro(libro);
                break;
            case 4:
                libroServicio.consultarLibro(libro);
                break;
            case 5:
                autorServicio.buscarAutorPorNombre();
                break;
            case 6:
                libroServicio.altaBajaLibro(libro);
                break;
            case 7:
                libroServicio.buscarLibroPorNombre();
            case 0:
                System.out.println("Seguro desea salir? S/N");
                String salir = leer.next();
                if(salir.equalsIgnoreCase("s")){
                    aux = false;
                }
        }
        }
        } catch (Exception error) {
            System.out.println("Sólo puede ingresar números " + error);
        }
        
        System.out.println("¡Hasta Pronto!");

        //
        //   Autor autor = autorServicio.crearAutor();
        //
        //ls.crearLibro();
        // autorServicio.consultarAutor();
        //autorServicio.modificarAutor();
        // autorServicio.eliminarAutor();
    }

}
