package javaguia2Extras;

import java.util.Scanner;

/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
public class javaGuia2_Extra13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la altura de la escalera");
        int altura = leer.nextInt();
        int i;
        String escalon = "";
        for (i = 1; i <= altura; i++) {
            escalon = escalon.concat(Integer.toString(i));
            System.out.println(escalon);
        }
    }

}
