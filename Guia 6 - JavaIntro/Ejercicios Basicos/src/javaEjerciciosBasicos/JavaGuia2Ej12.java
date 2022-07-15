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
 *
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232,
 * este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas
 * deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres
 * de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
 * Las secuencias leídas que respeten el formato se consideran correctas, la
 * secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y
 * toda secuencia distinta de FDE, que no respete el formato se considera
 * incorrecta. Al finalizar el proceso, se imprime un informe indicando la
 * cantidad de lecturas correctas e incorrectas recibidas. Para resolver el
 * ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java
 * Substring(), Length(), equals().
 */
public class JavaGuia2Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String Frase;
        int contador;
        contador = 0;
        int contador2;
        contador2 = 0;
        do {
            System.out.println("Ingrese una cadena");
            Frase = leer.nextLine();
            if (Frase.length() == 5) {
                if (Frase.substring(0, 1).equals("X") & (Frase.substring(4, 5).equals("O"))) {
                    contador = contador + 1;
                } else {
                    contador2 = contador2 + 1;
                }
            } else {
                contador2 = contador2 + 1;
            }
        } while (!"&&&&&".equals(Frase));
        System.out.println("Cantidad de codigos correctos: " + contador);
        System.out.println("Cantidad de codigos incorrectos: " + contador2);
    }
}
