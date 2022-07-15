/* Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
números al usuario hasta que la suma de los números introducidos supere el límite inicial */

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero para el limite");
        int limite = scanner.nextInt();

        int suma = 0;
        do {
            System.out.println("Ingrese un numero");
            int numero = scanner.nextInt();
            suma = suma + numero;
        } while (suma < limite);
        
        scanner.close();
        System.out.println("La suma es: " + suma);
    }
}