
package ejemplolibreria;

import ejemplolibreria.Entidades.Libro;
import java.util.HashMap;
import java.util.Map;


public class EjemploLibreria {

  
    public static void main(String[] args) {
        HashMap<Integer, Libro> libreria = new HashMap();
        Libro quijote = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes Saavedra", "Español", 544);
        int a=1;
        libreria.put(a,quijote);
        a++;
        Libro fundacion = new Libro("Fundacion", "Isaac Asimov", "Ingles", 320);
        libreria.put(a,fundacion);
        a++;
        
        Libro lordoftherings = new Libro("El Señor de Los Anillos: Las Dos Torres", "J.R.R. Tolkien", "Ingles", 650);
        libreria.put(a,lordoftherings);
        a++;
        
        a=1;
        for (Map.Entry<Integer, Libro> entry : libreria.entrySet()) {
            Integer key = entry.getKey();
            Libro value = entry.getValue();
            System.out.println("Nombre: "+value.getNombre());
            System.out.println("Libro "+a);
            System.out.println("Indice: "+key);
            System.out.println(value);
            a++;
            
        }
    }
    
}
