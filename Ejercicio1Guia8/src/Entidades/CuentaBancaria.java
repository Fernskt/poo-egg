/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes 
atributos: numeroCuenta(entero), dniCliente(entero largo), saldoActual. 
Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al 
saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al 
saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará el 
máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

 */
package Entidades;

/**
 *
 * @author Pc
 */
public class CuentaBancaria {
    
    private int nroCuenta;
    private long dni;
    private double saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int nroCuenta, long dni, double saldoActual) {
        this.nroCuenta = nroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    
    
    
}
