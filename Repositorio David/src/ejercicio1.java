/* Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
dos. El programa deberá después mostrar el resultado de la suma */

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 2 numeros");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();
        
        System.out.println("La suma de los numeros es: " + (num1 + num2));

    }
}
