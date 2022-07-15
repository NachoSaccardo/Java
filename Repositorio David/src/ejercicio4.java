/* Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)*/

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una temperatura en grados centígrados");
        int celsius = scanner.nextInt();
        scanner.close();
        
        System.out.println("Equivale a " + (32 + (9 * celsius / 5)) + " grados Fahrenheit");

    }
}