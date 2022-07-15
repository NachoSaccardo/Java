package javaguia2Extras;

import java.util.Scanner;

public class javaGuia2_Extra7 {

    /*
     Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
    de n números (n>0). El valor de n se solicitará al principio del programa y los números
    serán introducidos por el usuario. Realice dos versiones del programa, una usando el
    bucle “while” y otra con el bucle “do - while”.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n, num, suma, max, min, i;
        max = 0;
        min = 0;
        suma = 0;
        i = 0;
        do {
            System.out.println("Ingrese la cantidad de numeros con los que desea trabajar");
            n = leer.nextInt();
        } while (n <= 0);

        while (i < n) {

            System.out.println("Ingrese el siguiente numero");
            num = leer.nextInt();
            if (i == 0) {
                max = num;
                min = num;
            }
            suma = suma + num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            i++;
        }
        System.out.println("Promedio: " + suma / n);
        System.out.println("Maximo: " + max);
        System.out.println("Minimo: " + min);

    }

}
