package javaguia2Extras;

import java.util.Scanner;

public class javaGuia2_Extra5 {

    /*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio    
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String socio;
        float arancel;
        System.out.println("Ingrese el tipo de socio");
        socio = leer.next();
        System.out.println("Ingrese el valor del tratamiento");
        arancel = leer.nextInt();

        switch (socio.toUpperCase()) {
            case "A":
                System.out.println("Importe a abonar: " + arancel * .50);
                break;
            case "B":
                System.out.println("Importe a abonar: " + arancel * .30);
                break;
            case "C":
                System.out.println("Importe a abonar: " + arancel);
                break;
            default:
                System.out.println("Ingreso un tipo de socio incorrecto");
        }
    }

}
