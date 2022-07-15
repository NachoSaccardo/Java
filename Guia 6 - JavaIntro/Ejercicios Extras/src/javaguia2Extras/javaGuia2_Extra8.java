package javaguia2Extras;

import java.util.Scanner;

/*
 Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break
 */
public class javaGuia2_Extra8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num = 1;
        int pares = 0;
        int impares = 0;
        while (num % 5 != 0) {
            System.out.println("Ingrese el siguiente numero");
            num = leer.nextInt();
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Impares: " + impares);
        System.out.println("Pares: " + pares);
        System.out.println("Cantidad total: " + (pares + impares));

    }

}
