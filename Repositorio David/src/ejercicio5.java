/* Escribir un programa que lea un número entero por teclado y muestre por pantalla el 
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt() */

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero"); //
        int numero = scanner.nextInt();
        scanner.close();
        
        System.out.println("El doble de "+numero+" es "+2*numero);
        System.out.println("El triple de "+numero+" es "+3*numero);
        System.out.println("La raiz de "+numero+" es "+Math.sqrt(numero));

    }
}