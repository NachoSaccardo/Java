

import Entidades.Lavadora;
import Entidades.Televisor;

/*
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos. 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      

        Lavadora lava = new Lavadora();
        lava.crearLavadora();
        System.out.println(lava.getClass().getSimpleName());
        lava.precioFinal();
        System.out.println(lava);
        System.out.println(" ");
        System.out.println("-------------------");
        System.out.println(" ");
        
        Televisor TV = new Televisor();
        TV.crearTelevisor();
        TV.precioFinal();
        System.out.println(TV);
    }
    
}
