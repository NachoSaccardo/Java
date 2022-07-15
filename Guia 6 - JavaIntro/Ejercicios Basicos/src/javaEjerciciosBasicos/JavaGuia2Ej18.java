/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaEjerciciosBasicos;

import java.util.Random;
import java.util.Scanner;

/*
    Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
    traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
    cambiando sus filas por columnas (o viceversa).
    Matriz A            Matriz B
    1   0   4           1   0   6
    0   5   0           0   5   0   
    6   0  -9           4   0  -9
 */
public class JavaGuia2Ej18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[][] matriz = new int[4][4];
        int[][] transpuesta = new int[4][4];
        int pivot;
        int i, j;
        Random aleatorio = new Random();
        for (i = 0; i < 4; i++) {
            System.out.println(" ");
            for (j = 0; j < 4; j++) {
                matriz[i][j] = aleatorio.nextInt(10);
                System.out.print(matriz[i][j]);
            }
        }
        System.out.println(" ");

        for (i = 0; i < 4; i++) {
            System.out.println(" ");
            for (j = 0; j < 4; j++) {
                transpuesta[i][j] = matriz[j][i];

                System.out.print(transpuesta[i][j]);
            }
        }
    }
}
