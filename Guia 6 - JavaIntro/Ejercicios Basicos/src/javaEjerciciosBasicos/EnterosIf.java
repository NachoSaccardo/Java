package javaEjerciciosBasicos;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author juans
 */
public class EnterosIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num1, num2;
        System.out.println("Ingrese el primer numero entero");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        num2 = leer.nextInt();
        if (num1 > 25 || num2 > 25) {
            if (num1 > 25) {
                if (num2 > 25) {
                    System.out.println("Ambos numeros son mayores que 25");
                } else {
                    System.out.println("Solo el primer numero es mayor a 25");
                }
            } else {
                System.out.println("Solo el segundo numero es mayor a 25");
            }
        } else {
            System.out.println("Ningun numero es mayor a 25");
        }
    }
}
