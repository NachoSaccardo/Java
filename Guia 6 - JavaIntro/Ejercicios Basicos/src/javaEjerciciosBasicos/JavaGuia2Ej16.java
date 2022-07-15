package javaEjerciciosBasicos;

import java.util.Random;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeMath.random;

/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
public class JavaGuia2Ej16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random aleatorio = new Random();
        int posicion;
        posicion = (-1);
        String repetido = "no se repite";
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        System.out.println("Ingrese el numero a buscar");
        int busqueda = leer.nextInt();
        for (int i = 0; i < n; i++) {
            vector[i] = aleatorio.nextInt(100);
            System.out.println(vector[i]);
            if (vector[i] == busqueda) {
                if (posicion < 0) {
                    posicion = i;
                } else {
                    repetido = "se repite";
                }
            }
        }
        if (posicion == (-1)) {
            System.out.println("El valor no se encuentra en el vector");
        }
        if (posicion != (-1)) {
            System.out.println("El valor se encuentra en la posicion " + posicion + " del vector\n y " + repetido);
        }

    }

}
