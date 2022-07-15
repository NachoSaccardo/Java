package javaguia2Extras;

import java.util.Scanner;

public class javaGuia2_Extra14 {

    /*
    Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
    hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
    de hijos para averiguar la media de edad de los hijos de todas las familias.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de familias");
        int n = leer.nextInt();
        int[] hijos = new int[n];
        float[] promedio = new float[n];
        int i, j, aux;

        for (i = 0; i < n; i++) {
            System.out.println("Ingrese la cantidad de hijos de la faminia numero " + (i + 1));
            hijos[i] = leer.nextInt();
            promedio[i] = 0;
        }
        for (i = 0; i < n; i++) {
            System.out.println("FAMILIA" + i + 1);
            aux = 0;
            for (j = 0; j < hijos[i]; j++) {
                System.out.println("Ingrese la edad del hijo N° " + (j + 1));
                aux = leer.nextInt();
                promedio[i] = promedio[i] + aux;
                if (j == (hijos[i]) - 1) {
                    promedio[i] = promedio[i] / hijos[i];
                }
            }

        }
        for (i = 0; i < n; i++) {
            System.out.println("El promedio de edad de la familia " + i + 1 + " es de " + promedio[i] + " años");
        }
    }

}
