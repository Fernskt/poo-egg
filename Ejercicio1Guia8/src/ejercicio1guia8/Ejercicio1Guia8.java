/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1guia8;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;

/**
 *
 * @author Pc
 */
public class Ejercicio1Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        CuentaBancariaServicio cuentaBancaria = new CuentaBancariaServicio();
        CuentaBancaria cuenta1 = cuentaBancaria.crearCuenta();
        
        cuentaBancaria.ingresarDinero(cuenta1);
        cuentaBancaria.retirarDinero(cuenta1);
       // cuentaBancaria.extraccionRapida(cuenta1);
        cuentaBancaria.consultarSaldo(cuenta1);
        cuentaBancaria.consultarDatos(cuenta1);
        System.out.println("-------------------------");
         System.out.println("Cuenta 2");
         System.out.println("-------------------------");
         CuentaBancaria cuenta2 = cuentaBancaria.crearCuenta();
        cuentaBancaria.ingresarDinero(cuenta2);
        cuentaBancaria.retirarDinero(cuenta2);
       // cuentaBancaria.extraccionRapida(cuenta1);
        cuentaBancaria.consultarSaldo(cuenta2);
        cuentaBancaria.consultarDatos(cuenta2);
       
        
        
    }
    
}
