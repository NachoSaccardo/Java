package javaguia2Extras;

import java.util.Scanner;

/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
public class javaGuia2_Extra10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Adivina adivinador, cuanto es la multiplicacion?");
        int guess = leer.nextInt();
        int result = (int) (Math.random() * 10 * Math.random());
        if (guess == result) {
            System.out.println("Correcto!");
            System.out.println("El numero era: " + result);
        } else {
            do {
                System.out.println("Incorrecto!");
                System.out.println("Intentelo nuevamente");
                guess = leer.nextInt();
            } while (guess != result);
            System.out.println("Correcto!");
            System.out.println("El numero era: " + result);
        }
    }

}
