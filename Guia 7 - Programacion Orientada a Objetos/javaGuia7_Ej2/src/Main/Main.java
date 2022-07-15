
package Main;

import Circunferencia.Circunferencia;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.DecimalFormat;


/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro. OK
b) Métodos get y set para el atributo radio de la clase Circunferencia. OK
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
*/

public class Main {
   
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Ingrese el radio");
        double radio = leer.nextDouble();
        Circunferencia c1 = new Circunferencia(radio);
        c1.Area();
        System.out.println(c1);
        c1.Perimetro();
        System.out.println(c1);
        
    }
        /*
    System.out.println("numero: "+numero+" numero redondeado: "+(((float) Math.round(numero*100))/100));

    */
    }



