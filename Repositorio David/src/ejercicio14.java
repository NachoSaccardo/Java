/* Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
*/

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de euros");
        double euros = scanner.nextDouble();

        System.out.println("Ingrese la moneda a convertir");
        String moneda = scanner.next();

        convertir(euros, moneda);
        
        scanner.close();
    }

    public static void convertir(double euros, String moneda) {
        if (moneda.equals("libras")) {
            System.out.println(euros+" euros son "+euros*0.86+" libras");
        } else if (moneda.equals("dolares")) {
            System.out.println(euros+" euros son "+euros*1.28611+" dolares");
        } else if (moneda.equals("yenes")) {
            System.out.println(euros+" euros son "+euros*129.852+" yenes");
        } else {
            System.out.println("La moneda introducida no es válida");
        }
    }
}