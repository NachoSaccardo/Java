/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaEjerciciosBasicos;

import java.util.Scanner;

/**
 *
 * @author juans
 */
public class JavaGuia2Ej11 {

    /**
     * @param args the command line arguments
     *
     * Realizar un programa que pida dos números enteros positivos por teclado y
     * muestre por pantalla el siguiente menú: MENU 1. Sumar 2. Restar 3.
     * Multiplicar 4. Dividir 5. Salir Elija opción: El usuario deberá elegir
     * una opción y el programa deberá mostrar el resultado por pantalla y luego
     * volver al menú. El programa deberá ejecutarse hasta que se elija la
     * opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
     * vez de salir del programa directamente, se debe mostrar el siguiente
     * mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
     * Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
     * contrario se vuelve a mostrar el menú.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        float num1;
        float num2;
        int opcion;
        String confirmacion;
        float resultado;

        System.out.println("Ingrese el primer numero");
        num1 = leer.nextFloat();
        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextFloat();

        opcion = 0;
        while (opcion != 5) {
            System.out.println("Seleccione una opcion: \n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La division es: " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    confirmacion = leer.next().toUpperCase();

                    while (!confirmacion.equals("S") & !confirmacion.equals("N")) {
                        System.out.println("Ingreso un valor erroneo");
                        System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                        confirmacion = leer.next().toUpperCase();

                    }

                    if (confirmacion.equals("S")) {
                        break;
                    } else if (confirmacion.equals("N")) {
                        opcion = 0;
                        break;
                    }

            }
        }
    }
}
