
import Entidades.Circulo;
import Entidades.Rectangulo;
import java.util.Scanner;

/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */

/**
 *
 * @author juans
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Creacion de Circulo: \n");
        
        System.out.println("Ingrese el radio del circulo a crear");
        int radio = leer.nextInt();
        Circulo c1 = new Circulo(radio);
        System.out.println("PI: "+ c1.PI);
        c1.calcularArea();
        c1.calcularPerimetro();
        System.out.println(" ");
        System.out.println(c1);
        System.out.println("\n----------------------\n");
        
        System.out.println("Creacion de Rectangulo: \n");
        
        System.out.println("Ingrese el lado A del rectangulo a crear");
        int ladoA = leer.nextInt();
        System.out.println("Ingrese el lado B del rectangulo a crear");
        int ladoB = leer.nextInt();
        Rectangulo r1 = new Rectangulo(ladoA, ladoB);
        r1.calcularPerimetro();
        r1.calcularArea();
        System.out.println(" ");
        System.out.println(r1);
        System.out.println("\n----------------------\n");        
    }
}
