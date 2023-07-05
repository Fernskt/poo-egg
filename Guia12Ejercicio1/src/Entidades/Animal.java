/*
 Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package Entidades;


public class Animal {
    
    protected String animal;
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;

    public Animal(String animal, String nombre, String alimento, int edad, String raza) {
        this.animal = animal;
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

 
    
    public void alimentarse(){
        System.out.println("Alimento");
    }
    
}
