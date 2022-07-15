package javaEjerciciosBasicos;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.random;
import static java.lang.Math.pow;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Random;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeMath.random;

public class JavaGuia2Ej19 {

    /*
    Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
    matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
    signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
    denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el lado de la matriz cuadrada");

        int n = leer.nextInt();
        int[][] matriz = new int[n][n];
        int[][] transpuesta = new int[n][n];
        //int numero = (int) (Math.random() * 100*pow((-1),Math.random()));
        Random aleatorio = new Random();
        int i, j;

        for (i = 0; i < 4; i++) {
            System.out.println(" ");
            for (j = 0; j < 4; j++) {   // La notacion para un random es random.nextInt(max-min)+min. Si quiero usar negativos esos signos me cambian.
                matriz[i][j] = aleatorio.nextInt(99 + 99) - 99;
                System.out.print("[" + matriz[i][j] + "]");
            }
        }
        System.out.println(" ");

        for (i = 0; i < 4; i++) {
            System.out.println(" ");
            for (j = 0; j < 4; j++) {
                transpuesta[i][j] = (-1) * matriz[j][i];

                System.out.print("[" + transpuesta[i][j] + "]");
            }
        }
    }

}
