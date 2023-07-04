/*
 Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo
“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear
un ArrayList de animales y los siguientes animales
 */
package Entidades;

import Interfaces.NewInterface;

/**
 *
 * @author Pc
 */
public class Animal implements NewInterface {
    
    protected String tipoAnimal;
    protected int edad;
    protected int patas;

    public Animal() {
    }

    public Animal(String tipoAnimal, int edad, int patas) {
        this.tipoAnimal = tipoAnimal;
        this.edad = edad;
        this.patas = patas;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

   
    
    public void hacerRuido(){
        System.out.println("Hola");
    }

    @Override
    public void hacerMuertito() {
        System.out.println("Nada");
    }
    
}
