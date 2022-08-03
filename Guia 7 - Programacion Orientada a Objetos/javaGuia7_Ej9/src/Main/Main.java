
package Main;

import Entidades.Matematica;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Matematica MAT = new Matematica();
        System.out.println("Ingrese el primero numero real");
        MAT.setNum1(leer.nextFloat());
        System.out.println("Ingrese el segundo numero real");
        MAT.setNum2(leer.nextFloat());
        MAT.devolverMayor();
        MAT.calcularPotencia();
        MAT.calcularRaiz();

                
    } 
}
