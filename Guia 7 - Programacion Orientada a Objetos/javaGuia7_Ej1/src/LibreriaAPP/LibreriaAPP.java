package LibreriaAPP;

import LibreriaAPP.Entidades.Libro;
import LibreriaAPP.Servicios.Servicio;


public class LibreriaAPP {

    public static void main(String[] args) {
        Servicio sl = new Servicio();
        Libro L1 = sl.crearLibro();
        sl.imprimirLibro(L1);
        
    }
    
}
