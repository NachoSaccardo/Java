
package LibreriaAPP.Servicios;

import LibreriaAPP.Entidades.Libro;
import java.util.Scanner;

public class Servicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro crearLibro()
    {
        System.out.println("Ingrese el numero de ISBN del libro");
        int ISBN=leer.nextInt();
        System.out.println("Ingrese el titulo del Libro");
        String titulo = leer.next();
        System.out.println("Ingrese el autor del libro");
        String autor = leer.next();
        System.out.println("Ingrese el numero de paginas del libro");
        int numeropaginas = leer.nextInt();
        Libro l1 = new Libro(ISBN, titulo, autor, numeropaginas);
        
        return l1;
    }
    
    public void imprimirLibro(Libro l1)
    {
        System.out.println(l1);
    }
    
}
