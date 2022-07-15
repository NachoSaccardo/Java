package javaguia2Extras;

import java.util.Scanner;

/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 */
public class javaGuia2_Extra11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        int aux = num;
        int digitos = 1;
        while (aux >= 10) {
            aux = aux / 10;
            digitos++;
        }
        System.out.println("La cantidad de digitos es: " + digitos);
    }

}
