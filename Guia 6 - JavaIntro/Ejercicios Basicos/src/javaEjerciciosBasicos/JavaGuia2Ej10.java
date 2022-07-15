package javaEjerciciosBasicos;

import java.util.Scanner;

public class JavaGuia2Ej10 {

    /**
     * Escriba un programa en el cual se ingrese un valor límite positivo, y a
     * continuación solicite números al usuario hasta que la suma de los números
     * introducidos supere el límite inicial.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num;
        int suma;
        int num2;
        suma = 0;
        do {
            System.out.println("Ingrese un valor limite positivo");
            num = leer.nextInt();
        } while (num <= 0);

        do {
            System.out.println("Ingrese un numero entero");
            num2 = leer.nextInt();
            suma = suma + num2;
            System.out.println("La suma es: " + suma);
        } while (suma < num);

    }
}
