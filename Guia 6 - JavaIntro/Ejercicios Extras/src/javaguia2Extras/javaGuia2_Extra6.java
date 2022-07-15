package javaguia2Extras;

import java.util.Scanner;

public class javaGuia2_Extra6 {

    /*  
    Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
    debajo de 1.60 mts. y el promedio de estaturas en general.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de personas");
        int n = leer.nextInt();
        float[] vector = new float[n];
        int i;
        int contador = 0;
        float total = 0;

        for (i = 0; i < n; i++) {
            System.out.println("Ingrese la siguiente altura");
            vector[i] = leer.nextFloat();
            total = total + vector[i];
            if (vector[i] < 1.6) {
                contador++;
            }

        }

        System.out.println("El total de personas enanas es: " + contador);
        System.out.println("El promedio de altura es: " + (total / n));
    }
}
