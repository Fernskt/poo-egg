package ejercicio3guia8;

import Entidades.Persona;
import Servicios.PersonaServicio;

public class Ejercicio3Guia8 {

    public static void main(String[] args) {
        /*Crear 4 objetos de tipo Persona con distintos valores, 
        a continuación, llamaremos todos los métodos para cada objeto, 
        deberá comprobar si la persona está en su peso ideal, tiene sobrepeso 
        o está por debajo de su peso ideal e indicar para cada objeto si la 
        persona es mayor de edad.
        --------------------------------------------------------------------
        Por último, guardaremos los resultados de los métodos calcularIMC y 
        esMayorDeEdad en distintas variables(arrays), para después calcular un 
        porcentaje de esas 4 personas cuantas están por debajo de su peso, 
        cuantas en su peso ideal y cuantos, por encima, y también calcularemos 
        un porcentaje de cuantos son mayores de edad y cuantos menores. 
        Para esto, podemos crear unos métodos adicionales.
         */

        PersonaServicio persona = new PersonaServicio();
        Persona persona1 = persona.crearPersona();
        Persona persona2 = persona.crearPersona();
        Persona persona3 = persona.crearPersona();
        Persona persona4 = persona.crearPersona();

        int[] IMCTotal = new int[4];
        boolean[] edades = new boolean[4];

        for (int i = 0; i < 4; i++) {
            // IMCTotal[i] = persona.calcularIMC(persona1);

            switch (i) {
                case 0:
                    IMCTotal[i] = persona.calcularIMC(persona1);
                    break;
                case 1:
                    IMCTotal[i] = persona.calcularIMC(persona2);
                    break;
                case 2:
                    IMCTotal[i] = persona.calcularIMC(persona3);
                    break;
                case 3:
                    IMCTotal[i] = persona.calcularIMC(persona4);
                    break;
            }
        }

        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    edades[i] = persona.esMayorDeEdad(persona1);
                    break;
                case 1:
                    edades[i] = persona.esMayorDeEdad(persona2);
                    break;
                case 2:
                   edades[i] = persona.esMayorDeEdad(persona3);
                    break;
                case 3:
                   edades[i] = persona.esMayorDeEdad(persona4);
                    break;
            }
        }
    }
}
