/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaEjerciciosBasicos;

import java.util.Random;
import java.util.Scanner;


/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.


 */
public class JavaGuia2Ej21 {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random aleatorio = new Random();
        int n, p, i, j, k, l;
        n = 3;
        p = 10;
        int[][] M = new int[n][n];
        int[][] P = new int[p][p];
        boolean bandera = true;
        int pos1, pos2;
        pos1 = -1;
        pos2 = -1;

        //Inicializo matriz M de 3x3
        for (i = 0; i < n; i++) {
            System.out.println("");
            for (j = 0; j < n; j++) {
                M[i][j] = aleatorio.nextInt(2);
                System.out.print("[" + M[i][j] + "]");
            }
        }
        //Inicializo matriz P de 10x10
        System.out.println("");
        for (i = 0; i < p; i++) {
            System.out.println("");
            for (j = 0; j < p; j++) {
                P[i][j] = aleatorio.nextInt(2);
                System.out.print("[" + P[i][j] + "]");
            }
        }
        System.out.println("");

        //Comparo M y P
        pepe: //bandera que al darle el comando "break pepe", interrumpe todos los bucles hasta este punto y luego los saltea
        for (i = 0; i < p - 2; i++) {
            for (j = 0; j < p - 2; j++) {
                bandera = true;
                pancho: //bandera a partir de la cual puedo saltar con un "break pancho"
                if (P[i][j] == M[0][0]) {
                    for (k = 0; k < n; k++) {
                        for (l = 0; l < n; l++) {
                            if (!(P[i + k][j + l] == M[k][l])) {
                                bandera = false;
                                break pancho;
                            }
                        }
                    }
                    if (bandera == true) {
                        pos1 = i;
                        pos2 = j;

                    }
                    if (pos1 != (-1) && pos2 != (-1)) {
                        /*
                i=9;
                j=9;
                         */
                        break pepe;
                    }
                }
            }
        }
        if (pos1 != (-1) && pos2 != (-1)) {
            System.out.println(pos1);
            System.out.println(pos2);
            System.out.println("");
            for (i = 0; i < p; i++) {
                System.out.println("");
                for (j = 0; j < p; j++) {
                    if (i >= pos1 && i < pos1 + n && j >= pos2 && j < pos2 + n) {
                        System.out.print(ANSI_RED + "[" + P[i][j] + "]");
                    } else {
                        System.out.print(ANSI_GREEN + "[" + P[i][j] + "]");
                    }

                }
            }
        }
    }
}
