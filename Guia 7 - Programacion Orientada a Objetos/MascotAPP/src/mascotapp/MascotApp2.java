
package mascotapp;

import mascotapp.Servicio.Servicio;


public class MascotApp2 {

    public static void main(String[] args) {
      Servicio ServMasc = new Servicio();
      ServMasc.crearMascota();
      ServMasc.crearMascota();
      ServMasc.mostrarMascotas();
    }
    
}
