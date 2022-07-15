package javaEjerciciosBasicos;

import java.util.Random;
import java.util.Scanner;

public class JavaGuia2Ej20 {

    /*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.    
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random aleatorio = new Random();

        System.out.println("Ingrese el lado de la matriz cuadrada");
        int n = leer.nextInt();
        int[][] matriz = new int[n][n];
        int i, j, diag1, diag2, pivot;
        int[] filas = new int[n];
        int[] columnas = new int[n];

        boolean magica = true;
        //inicializo ambos vectores en 0
        do {
            diag1 = 0;
            diag2 = 0;
            for (i = 0; i < n; i++) {
                filas[i] = 0;
                columnas[i] = 0;
            }

            //Relleno e imprimo la matriz
            for (i = 0; i < n; i++) {
                System.out.println(" ");

                for (j = 0; j < n; j++) {   // La notacion para un random es random.nextInt(max-min)+min. Si quiero usar negativos esos signos me cambian.
                    matriz[i][j] = aleatorio.nextInt(9);
                    //leer.nextInt(); 

                    System.out.print("[" + matriz[i][j] + "]");
                    //con esto sumo las filas, donde i coincide con el numero de filas
                    filas[i] = filas[i] + matriz[i][j];
                    //con esto sumo las columnas y las guardo en un vector, donde j coincide con el numero de columnas
                    columnas[j] = columnas[j] + matriz[i][j];
                    //sumo la diagonal principal
                    if (i == j) {
                        diag1 = diag1 + matriz[i][j];
                    }
                    if (i + j == n - 1) {
                        diag2 = diag2 + matriz[i][j];
                    }
                }
            }
            System.out.println(" ");

            System.out.println("vector Filas");
            for (i = 0; i < n; i++) {
                System.out.println("[" + filas[i] + "]");
            }

            System.out.println("vector Columnas");
            for (j = 0; j < n; j++) {
                System.out.println("[" + columnas[j] + "]");
            }
            System.out.println("suma diag1: " + diag1);
            System.out.println("suma diag2: " + diag2);

            pivot = filas[1];
            for (i = 0; i < n; i++) {

                if (filas[i] != pivot) {
                    magica = false;
                }
                if (columnas[i] != pivot) {
                    magica = false;
                }

            }
            if (diag1 != pivot) {
                magica = false;
            }
            if (diag2 != pivot) {
                magica = false;
            }

            if (magica) {
                System.out.println("La matriz es magica!! =D");
            } else {
                System.out.println("La matriz no es magica =(");
            }

        } while (!magica);
    }
}
