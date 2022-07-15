package javaEjerciciosBasicos;

import java.util.Scanner;

public class JavaGuia2Ej14 {

    /*
    Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
    
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de euros");
        float euros = leer.nextFloat();
        System.out.println("Ingrese la moneda a convertir:\n1. Dolares\n2. Yenes\n3. Libras\n4. Mostrar todas");
        String moneda = leer.next();
        convertir(euros, moneda);
    }

    public static void convertir(float euros, String moneda) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        try {
            switch (Integer.parseInt(moneda)) {
                case 1:
                    System.out.println("El cambio de " + euros + " es: " + (euros * 0.128611) + " dolares");
                    break;
                case 2:
                    System.out.println("El cambio de " + euros + " es: " + (euros * 129852) + " yenes");
                    break;
                case 3:
                    System.out.println("El cambio de " + euros + " es: " + (euros * 0.86) + " libras");
                    break;
                case 4:
                    System.out.println("El cambio de " + euros + " es: " + (euros * 0.128611) + " dolares");
                    System.out.println("El cambio de " + euros + " es: " + (euros * 129852) + " yenes");
                    System.out.println("El cambio de " + euros + " es: " + (euros * 0.86) + " libras");
                    break;
            }
        } catch (NumberFormatException ex) {

            System.out.println("Prueba");
        }

    }
}
