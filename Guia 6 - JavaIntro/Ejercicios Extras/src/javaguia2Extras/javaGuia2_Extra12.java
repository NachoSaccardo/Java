package javaguia2Extras;

public class javaGuia2_Extra12 {

    /*
    Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
    0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
    Ejemplo:
    0-0-0
    0-0-1
    0-0-2
    0-0-E
    0-0-4
    0-1-2
    0-1-E
    Nota: investigar función equals() y como convertir números a String.
     */
    public static void main(String[] args) {
        int i, j;
        String aux;
        aux = "";

        for (i = 0; i < 1000; i++) {
            aux = "";
            for (j = 0; j < Integer.toString(i).length(); j++) {
                if (Integer.toString(i).substring(j, j + 1).equals("3")) {
                    if (j == 1) {
                        aux = aux.concat("-E-");
                    } else {
                        aux = aux.concat("E");
                    }
                } else {
                    if (j == 1) {
                        aux = aux.concat("-" + Integer.toString(i).substring(j, j + 1) + "-");
                    } else {
                        aux = aux.concat(Integer.toString(i).substring(j, j + 1));
                    }
                }
            }
            System.out.println(aux);
        }

    }
}
