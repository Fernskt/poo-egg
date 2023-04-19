/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class CuentaBancariaServicio {
    Scanner leer = new Scanner(System.in);
    public CuentaBancaria crearCuenta(){
        
        CuentaBancaria cuenta = new CuentaBancaria();
        System.out.println("Ingrese el número de cuenta");
        cuenta.setNroCuenta(leer.nextInt());
        System.out.println("Ingrese el DNI");
        cuenta.setDni(leer.nextLong());
        System.out.println("Ingrese el Saldo de la Cuenta");
        cuenta.setSaldoActual(leer.nextDouble());
        
        return cuenta;
    }
    
    public double ingresarDinero(CuentaBancaria cuenta){
        System.out.println("Cuanto dinero quiere ingresar");
        double dinero = leer.nextDouble();
        double saldo = cuenta.getSaldoActual();
        saldo += dinero;
        cuenta.setSaldoActual(saldo);
        return saldo;
        
    }
    
    public double retirarDinero(CuentaBancaria cuenta){
        System.out.println("Cuanto dinero quiere retirar");
        double retiro = leer.nextDouble();
        double saldo = cuenta.getSaldoActual();
        
        if(retiro>saldo){
            System.out.println("El monto ingresado es mayor a su saldo, se retirarán " + saldo);
            retiro=saldo;
        }
        saldo -= retiro;
        cuenta.setSaldoActual(saldo);
        return saldo;
        
    }
    
    public double extraccionRapida(CuentaBancaria cuenta){
        System.out.println("Cuanto dinero quiere Extraer?");
        double extraccion = leer.nextDouble();
        double saldo = cuenta.getSaldoActual();
        
        double limite = saldo *0.20;
        
        if(limite>extraccion){
            System.out.println("El monto no puede exceder el 20% de su saldo");
            return saldo;
            
        }
        saldo -= extraccion;
        cuenta.setSaldoActual(saldo);
        return saldo;
    }
    
    public void consultarSaldo(CuentaBancaria cuenta){
        System.out.println("Su saldo actual es " + cuenta.getSaldoActual());
    }
    
    public void consultarDatos(CuentaBancaria cuenta){
        System.out.println("DNI: " + cuenta.getDni());
        System.out.println("Nro CUENTA: " + cuenta.getNroCuenta());
        System.out.println("SALDO: " + cuenta.getSaldoActual());
    }
}
