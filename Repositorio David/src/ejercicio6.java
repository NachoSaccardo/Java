/* Crear un programa que dado un numero determine si es par o impar */

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero%2==0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}