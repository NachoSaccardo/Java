/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaEjerciciosBasicos;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*
    Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
    de 2 dígitos, etcétera (hasta 5 dígitos)
 */
public class JavaGuia2Ej17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el largo del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        int[] vector2 = new int[5];
        int i, j;
        Random aleatorio = new Random(99999);

        for (i = 0; i < 5; i++) {
            vector2[i] = 0;
            System.out.println(vector2[i]);
        }
        System.out.println("\nok");
        for (i = 0; i < n; i++) {

            vector[i] = aleatorio.nextInt(99999);
            System.out.println(vector[i]);
            switch (String.valueOf(vector[i]).length()) // Interger.toString(vector[i])    
            {
                case 1:
                    vector2[0] = vector2[0] + 1;
                    break;
                case 2:
                    vector2[1] = vector2[1] + 1;
                    break;
                case 3:
                    vector2[2] = vector2[2] + 1;
                    break;
                case 4:
                    vector2[3] = vector2[3] + 1;
                    break;
                case 5:
                    vector2[4] = vector2[4] + 1;
                    break;
            }
        }
        for (i = 0; i < 5; i++) {
            System.out.println("La cantidad de numeros de " + (i + 1) + " digitos es de: " + vector2[i]);
        }
    }

    /*
public static int randInt()
{
int randomNum = ThreadLocalRandom.current().nextInt(0, 99999);

return randomNum;
}
     */
}
