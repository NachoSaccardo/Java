
package Servicio;

import ejemplolibreria.Entidades.Libro;
import java.util.Comparator;


public class Comparadores
{
    public static Comparator<Libro> comparador = new Comparator<Libro>() {
        @Override
        public int compare(Libro l1, Libro l2) {
            
            return l1.getPaginas().compareTo(l2.getPaginas());
                       
        }
    };
}

