/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaEjerciciosBasicos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author juans
 */
public class JavaGuia2Ej3 {

    /**
     * @param args the command line arguments
     */
    // Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
    //en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase");
        String Frase = leer.next();
        System.out.println(Frase.toLowerCase());
        System.out.println(Frase.toUpperCase());

    }

}
