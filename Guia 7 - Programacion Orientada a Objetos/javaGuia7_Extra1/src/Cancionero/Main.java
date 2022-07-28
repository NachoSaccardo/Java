
package Cancionero;

import Cancionero.Entidades.Cancion;
import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cancion balada = new Cancion();
        System.out.println("Ingrese el titulo");
        balada.setTitulo(leer.next());
        System.out.println("Ingrese el autor");
        balada.setAutor(leer.next());
        System.out.println(balada.toString());
        Cancion cumbia = new Cancion("La Motito","Mala Fama");
        System.out.println(cumbia.toString());
    }
    
}
