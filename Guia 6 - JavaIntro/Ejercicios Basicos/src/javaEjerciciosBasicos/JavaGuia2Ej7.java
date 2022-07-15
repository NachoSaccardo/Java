/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaEjerciciosBasicos;

import java.util.Scanner;

public class JavaGuia2Ej7 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String Frase = leer.nextLine();
        System.out.println(Frase);
        //con el modificador "toLowerCase()", le digo que la variable "Frase", 
        //pasada a minusculas, tiene que ser igual a (equals()) "Eureka"
        if (Frase.toLowerCase().equals("eureka")) {
            System.out.println("Correcto!");
        } else {
            System.out.println("Incorrecto!");
        }
    }
}
