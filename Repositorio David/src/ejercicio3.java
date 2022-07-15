/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda 
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java*/

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su frase");
        String frase = scanner.next();
        scanner.close();
        
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());

    }
}