package javaguia2Extras;

import java.util.Scanner;

public class javaGuia2_Extra1 {

    /*
    Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
    usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el tiempo en minutos");
        int minutos = leer.nextInt();
        int dias = minutos / (60 * 24);
        int horas = (minutos / 60) - (dias * 24);
        System.out.println(dias + " Dias, " + horas + " Horas ");

    }
}
