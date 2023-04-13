/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosEntidades;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Operacion {

    private int num1;
    private int num2;

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void crearOperacion() {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        this.num1 = leer.nextInt();
        setNum1(num1);
        System.out.println("ingrese segundo numero");
        this.num2 = leer.nextInt();
        setNum2(num2);

    }

    public int sumar() {

        return num1 + num2;
    }

    public int restar() {
        return num1 - num2;
    }

    public int multiplicar() {
        int result = 0;
        if (num1 == 0 || num2 == 0) {
            System.out.println("Error, no se púede realizar la operacion");
        } else {

            result = num1 * num2;

        }
        return result;

    }

    public double dividir() {
        double result = 0;
        if (num1 == 0 || num2 == 0) {
            System.out.println("Error, no se púede realizar la operacion");
        } else {

            result = num1 / num2;

        }
        return result;

    }

}
