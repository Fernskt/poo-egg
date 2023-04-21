package ejercicio3guia8;

import Entidades.Persona;
import Servicios.PersonaServicio;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio3Guia8 {

    public static void main(String[] args) {

        PersonaServicio servicio = new PersonaServicio();

        Persona p1 = servicio.crearPersona();
        Persona p2 = servicio.crearPersona();
        Persona p3 = servicio.crearPersona();
        Persona p4 = servicio.crearPersona();

        List<Integer> imcs = new ArrayList<>();
        List<Boolean> mayoresEdad = new ArrayList<>();

        Persona[] personas = new Persona[]{p1, p2, p3, p4};
        for (int i = 0; i < personas.length; i++) {
            Persona p = personas[i];
            
            System.out.println("Datos de la persona:");
            System.out.println(p.getNombre() + " - " + p.getEdad() + " años - " + p.getSexo() + " - " + p.getPeso() + " kg - " + p.getAltura() + " m");

            int imc = servicio.calcularIMC(p);
            imcs.add(imc);
            String mensajeIMC = "";
            if (imc == -1) {
                mensajeIMC = "Está por debajo de su peso ideal";
            } else if (imc == 0) {
                mensajeIMC = "Está en su peso ideal";
            } else {
                mensajeIMC = "Tiene sobrepeso";
            }
            System.out.println(mensajeIMC);

            // es mayor de edad
            boolean esMayor = servicio.esMayorDeEdad(p);
            mayoresEdad.add(esMayor);
            String mensajeEdad = esMayor ? "Es mayor de edad" : "Es menor de edad";
            System.out.println(mensajeEdad);

            System.out.println("-------------------------");
        }

        // porcentaje de personas con cada tipo de IMC
        int total = imcs.size();
        int bajoPeso = 0;
        int pesoIdeal = 0;
        int sobrePeso = 0;
        for (int imc : imcs) {
            if (imc == -1) {
                bajoPeso++;
            } else if (imc == 0) {
                pesoIdeal++;
            } else {
                sobrePeso++;
            }
        }
        double porcentajeBajoPeso = ((double) bajoPeso / total) * 100;
        double porcentajePesoIdeal = ((double) pesoIdeal / total) * 100;
        double porcentajeSobrePeso = ((double) sobrePeso / total) * 100;
        System.out.println("Porcentaje de personas con bajo peso: " + porcentajeBajoPeso + "%");
        System.out.println("Porcentaje de personas en su peso ideal: " + porcentajePesoIdeal + "%");
        System.out.println("Porcentaje de personas con sobrepeso: " + porcentajeSobrePeso + "%");
    }
}
