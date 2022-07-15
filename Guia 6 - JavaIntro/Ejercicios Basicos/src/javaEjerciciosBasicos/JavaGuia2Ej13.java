package javaEjerciciosBasicos;

import java.util.Scanner;

public class JavaGuia2Ej13 {

    /*3. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n;
        int i;
        int j;
        System.out.println("Ingrese el lado del cuadrado");
        n = leer.nextInt();
        for (i = 0; i < n; i++) {
            System.out.print("\n");

            if (i == 0 || i == n - 1) {
                for (j = 0; j < n; j++) {
                    System.out.print("*");
                }
            } else {
                for (j = 0; j < n; j++) {
                    if (j == 0 || j == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }

    }
}
