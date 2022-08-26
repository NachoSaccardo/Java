
package ejemplolibreria;

import Servicio.Comparadores;
import ejemplolibreria.Entidades.Libro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class ejemploComparators {

  
    public static void main(String[] args) {
       /* HashMap<Integer, Libro> libreria = new HashMap();
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
            
        }*/
        ArrayList<Libro> libreria = new ArrayList();
        libreria.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes Saavedra", "Español", 544));
        libreria.add(new Libro("Fundacion", "Isaac Asimov", "Ingles", 320));
        for (Libro libro : libreria) {
            System.out.println(libro);
        }
        Collections.sort(libreria,Comparadores.comparador);
        for (Libro libro : libreria) {
            System.out.println(libro);
        }
    }
    
    
}
