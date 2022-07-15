/* Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al 
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
numero y si se encuentra repetido
*/

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector");
        int n = scanner.nextInt();

        System.out.println("Ingrese el numero a buscar");
        int numero = scanner.nextInt();

        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100);
        }

        int cantidad = 0;
        for (int i = 0; i < n; i++) {
            if (vector[i] == numero) {
                cantidad++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(vector[i]+" ");
        }

        System.out.println("\nEl numero "+numero+" se encuentra en el vector "+cantidad+" veces");

        scanner.close();
    }
}