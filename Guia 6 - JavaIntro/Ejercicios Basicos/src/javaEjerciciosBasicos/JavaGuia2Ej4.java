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
public class JavaGuia2Ej4 {

    /**
     * @param args the command line arguments
     */
    /* Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
    Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la temperatura en grados Centigrados que desea convertir");
        float Temp = leer.nextFloat();

        System.out.println("La temperatura en grados Farenheit es de: " + (32 + (9 * Temp / 5)) + "°F");

    }

}
