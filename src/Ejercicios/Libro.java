
package Ejercicios;

import java.util.Scanner;


public class Libro {
    
    String isbn;
    String titulo;
    String autor;
    int paginas;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    public void cargarLibro(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el ISBN del libro");
        this.isbn = leer.nextLine();
        
        System.out.println("Ingrese el título del libro");
        this.titulo = leer.nextLine();
        
        System.out.println("Ingrese el autor del libro");
        this.autor = leer.nextLine();
        
        System.out.println("Ingrese la cantidad de páginas del libro");
        this.paginas = leer.nextInt();
    }
    
    public void mostrarLibro(){
        System.out.println("-------------");
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.paginas);
        System.out.println("-------------");
    }
   
}
