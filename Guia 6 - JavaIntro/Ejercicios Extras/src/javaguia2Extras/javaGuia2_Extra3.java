package javaguia2Extras;

import java.util.Scanner;

public class javaGuia2_Extra3 {

    /*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una letra");
        String letra = leer.next();
        if (letra.toLowerCase().equals("a") || letra.toLowerCase().equals("e") || letra.toLowerCase().equals("i") || letra.toLowerCase().equals("o") || letra.toLowerCase().equals("u")) {
            System.out.println("Correcto, es una vocal");
        } else {
            System.out.println("Incorrecto, no es una vocal");
        }

    }
}
