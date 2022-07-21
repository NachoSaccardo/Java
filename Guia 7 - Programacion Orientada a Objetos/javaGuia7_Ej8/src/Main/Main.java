
package Main;

import Entidades.Cadena;
import Servicios.ServiciosCadena;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServiciosCadena SC = new ServiciosCadena();
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        
        Cadena c1 = new Cadena();
        c1.setFrase(frase);
        c1.setLongitud(frase.length());
        SC.invertirFrase(c1);
        System.out.println("Ingrese una letra para ver cuantas veces se repite");
        String letra= leer.next();
        SC.vecesRepetido(c1, letra);
        SC.compararLongitud(c1);
        SC.mostrarVocales(c1);
        System.out.println("Ingrese una frase para concatenar");
        frase = leer.next();
        SC.unirFrases(c1, frase);
        System.out.println("Ingrese una letra para reemplazar por la vocal A");
        letra=leer.next();
        SC.reemplazar(c1, letra);
        System.out.println("Ingrese una letra para saber si esta en la frase");
        letra=leer.next();
        SC.contiene(c1, letra);
    }
    
}
