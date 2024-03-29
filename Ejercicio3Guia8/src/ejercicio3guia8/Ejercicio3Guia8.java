/*
Realizar una clase llamada Persona en el paquete de entidades que tengan los 
siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ 
para otro), peso y altura. Si desea añadir algún otro atributo, puede hacerlo. 
Agregar constructores, getters y setters.
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve 
un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los 
atributos al usuario y después se le asignan a sus respectivos atributos para 
llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto,
es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje


Método calcularIMC(): calculara si la persona está en su peso ideal 
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor 
que 20, significa que la persona está por debajo de su peso ideal y la función 
devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos),
significa que la persona está en su peso ideal y la función devuelve un 0. 
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa 
que la persona tiene sobrepeso, y la función devuelve un 1.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos
todos los métodos para cada objeto, deberá comprobar si la persona está en su 
peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para 
cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables(arrays), para después calcular un porcentaje de esas 4 
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos,
por encima, y también calcularemos un porcentaje de cuantos son mayores de edad
y cuantos menores. Para esto, podemos crear unos métodos adicionales.

 */
package ejercicio3guia8;

import Entidades.Persona;
import Servicios.PersonaServicio;
import java.util.ArrayList;

public class Ejercicio3Guia8 {

    public static void main(String[] args) {

        PersonaServicio personaService = new PersonaServicio();

        ArrayList<Persona> personas = new ArrayList();

        Persona p1 = personaService.crearPersona();

        Persona p2 = personaService.crearPersona();

//        Persona p3 = personaService.crearPersona();
//
//        Persona p4 = personaService.crearPersona();

        personas.add(p1);
        personas.add(p2);
//        personas.add(p3);
//        personas.add(p4);

        int total = personas.size();
        int personasBajoPeso = 0;
        int personasPesoIdeal = 0;
        int personasExcesoPeso = 0;
        int mayorEdad = 0;
        int menorEdad = 0;
        String  mensajeIMC = "";

        for (Persona persona : personas) {

            switch (personaService.calcularIMC(persona)) {
                case -1:
                    personasBajoPeso++;
                   mensajeIMC = persona.getNombre() + ", con " + persona.getPeso() +" Kg, y " + persona.getAltura() +"mts,  está por debajo de su peso ideal";
                    break;
                case 0:
                    personasPesoIdeal++;
                    mensajeIMC = persona.getNombre() + ", con " + persona.getPeso() +" Kg, y " + persona.getAltura() +"mts, Tiene un peso ideal";
                    break;
                default:
                    personasExcesoPeso++;
                    mensajeIMC = persona.getNombre() + ", con " + persona.getPeso() +" Kg, y " + persona.getAltura() +"mts, Está excedido de peso";
                    break;
            }

           if (personaService.esMayorDeEdad(persona)){
               mayorEdad++;
           } else {
               menorEdad++;
           }
            System.out.println(mensajeIMC);
        }
        
        System.out.println("____________________________________________________");
        System.out.println("____________________________________________________");

        double porcentajeBajoPeso = ((double) personasBajoPeso / total) * 100;
        double porcentajePesoIdeal = ((double) personasPesoIdeal / total) * 100;
        double porcentajeSobrePeso = ((double) personasExcesoPeso / total) * 100;
        
        System.out.println(
                "Porcentaje de personas con bajo peso: " + porcentajeBajoPeso + "%");
        System.out.println(
                "Porcentaje de personas en su peso ideal: " + porcentajePesoIdeal + "%");
        System.out.println(
                "Porcentaje de personas con sobrepeso: " + porcentajeSobrePeso + "%");
        
        System.out.println("____________________________________________________");
        System.out.println("____________________________________________________");
        
        

//        PersonaServicio servicio = new PersonaServicio();
//        ArrayList<Persona> personas = new ArrayList();
//
//        Persona p = servicio.crearPersona();
//
//        List<Integer> imcs = new ArrayList<>();
//        List<Boolean> mayoresEdad = new ArrayList<>();
//
//        System.out.println("Datos de la persona:");
//        System.out.println(p.getNombre() + " - " + p.getEdad() + " años - " + p.getSexo() + " - " + p.getPeso() + " kg - " + p.getAltura() + " m");
//
//        int imc = servicio.calcularIMC(p);
//        imcs.add(imc);
//        String mensajeIMC = "";
//        if (imc == -1) {
//            mensajeIMC = "Está por debajo de su peso ideal";
//        } else if (imc == 0) {
//            mensajeIMC = "Está en su peso ideal";
//        } else {
//            mensajeIMC = "Tiene sobrepeso";
//        }
//        System.out.println(mensajeIMC);
//
//        // es mayor de edad
//        boolean esMayor = servicio.esMayorDeEdad(p);
//        mayoresEdad.add(esMayor);
//        String mensajeEdad = esMayor ? "Es mayor de edad" : "Es menor de edad";
//        System.out.println(mensajeEdad);
//
//        System.out.println("-------------------------");
//    }
//
//    // porcentaje de personas con cada tipo de IMC
//    int total = imcs.size();
//    int bajoPeso = 0;
//    int pesoIdeal = 0;
//    int sobrePeso = 0;
//    for (int imc : imcs
//
//    
//        ) {
//            if (imc == -1) {
//            bajoPeso++;
//        } else if (imc == 0) {
//            pesoIdeal++;
//        } else {
//            sobrePeso++;
//        }
//    }
//    double porcentajeBajoPeso = ((double) bajoPeso / total) * 100;
//    double porcentajePesoIdeal = ((double) pesoIdeal / total) * 100;
//    double porcentajeSobrePeso = ((double) sobrePeso / total) * 100;
//
//    System.out.println (
//
//    "Porcentaje de personas con bajo peso: " + porcentajeBajoPeso + "%");
//    System.out.println (
//
//    "Porcentaje de personas en su peso ideal: " + porcentajePesoIdeal + "%");
//    System.out.println (
//
//"Porcentaje de personas con sobrepeso: " + porcentajeSobrePeso + "%");
    }
}
