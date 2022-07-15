/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaEjerciciosBasicos;

import java.util.Scanner;

/**
 *
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo
 * muestre por pantalla.
 */
public class JavaGuia2Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        System.out.println("El nombre ingresado es " + nombre);
    }

}
