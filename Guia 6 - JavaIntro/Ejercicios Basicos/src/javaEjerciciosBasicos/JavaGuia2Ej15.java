package javaEjerciciosBasicos;

import java.util.Scanner;

public class JavaGuia2Ej15 {

    /*
    Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[] vector = new int[100];
        int i;

        for (i = 0; i < 100; i++) {
            vector[i] = i + 1;
            System.out.println(vector[i]);
        }
    }

}
