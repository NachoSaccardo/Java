package javaEjerciciosBasicos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author juans
 */
public class JavaGuia2Ej1 {

    /**
     * @param args the command line arguments
     *
     * 1. Escribir un programa que pida dos números enteros por teclado y
     * calcule la suma de los dos. El programa deberá después mostrar el
     * resultado de la suma
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int num2;
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextInt();
        System.out.println("La suma es " + (num1 + num2));
    }

}
