/*
 En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
 */
package Entidades;

/**
 *
 * @author Pc
 */
public class AExtrahoteleros extends Alojamiento {
    
    protected boolean esPrivado;
    protected double m2;

    public AExtrahoteleros() {
    }
    
    

    public AExtrahoteleros(boolean esPrivado, double m2, String nombre, String nombreCalle, int numeroCalle, String localidad, String encargado) {
        super(nombre, nombreCalle, numeroCalle, localidad, encargado);
        this.esPrivado = esPrivado;
        this.m2 = m2;
    }
    
    
    
}
