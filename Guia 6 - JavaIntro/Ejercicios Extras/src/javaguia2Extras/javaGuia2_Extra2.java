package javaguia2Extras;

import java.util.Scanner;

/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
public class javaGuia2_Extra2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int A, B, C, D, aux;
        A = 1;
        B = 3;
        C = 5;
        D = 7;

        aux = B;
        B = C;
        C = A;
        A = D;
        D = B;

        System.out.println(A + "\n" + B + "\n" + C + "\n" + D);

    }

}
