/* Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por 
pantalla */

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = scanner.next();
        scanner.close();
        
        System.out.println("Su nombre es "+nombre);

    }
}