/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaEjerciciosBasicos;

import java.util.Scanner;

/**
 *
 * @author juans
 */
public class JavaGuia2Ej5 {

    /**
     * @param args the command line arguments
     *
     * Escribir un programa que lea un número entero por teclado y muestre por
     * pantalla el doble, el triple y la raíz cuadrada de ese número. Nota:
     * investigar la función Math.sqrt().
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        System.out.println("El doble del numero es: " + (2 * num) + "\nEl triple del numero es: " + (3 * num) + "\nLa raiz cuadrada del numero es: " + (Math.sqrt(num)));
    }

}
