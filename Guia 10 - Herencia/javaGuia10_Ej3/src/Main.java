

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

/*
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        ArrayList<Electrodomestico> lista = new ArrayList();
        Double stockvalorizado=0d;
        Double stockvalorizadolavadoras=0d;
        double stockvalorizadoTVs=0d;
        
        Lavadora lava = new Lavadora(12, 1000d, "blanco", 'A', 44);
        //lava.crearLavadora();
        lista.add(lava);
        System.out.println(lava);
        

        System.out.println("-------------------");

        
        Televisor TV = new Televisor(24, false, 1000d, "blanco", 'A', 8);
        //TV.crearTelevisor();
        lista.add(TV);
        System.out.println(TV);
        

        System.out.println("-------------------");

        
        Lavadora lava2 = new Lavadora(24, 1000d, "gris", 'B', 85);
        //lava2.crearLavadora();
        lista.add(lava2);
        System.out.println(lava2);
        

        System.out.println("-------------------");

        
        Televisor TV2 = new Televisor(55, true, 1000d, "gris", 'A', 12);
        //TV2.crearTelevisor();
        lista.add(TV2);
        System.out.println(TV2);
        
        System.out.println(" ");
        System.out.println("-------------------");
        System.out.println(" ");
        
        for (Electrodomestico aux : lista) 
        {
            System.out.println(aux);
            aux.precioFinal();
            stockvalorizado = stockvalorizado + aux.getPrecio();
            
            if(aux.getClass().getSimpleName().equals("Lavadora"))
            {
                stockvalorizadolavadoras=stockvalorizadolavadoras+aux.getPrecio();
            }
            
            if(aux.getClass().getSimpleName().equals("Televisor"))
            {
                stockvalorizadoTVs=stockvalorizadoTVs+aux.getPrecio();
            }
            System.out.println("-------------------");
        }
        System.out.println("Stock Total Valorizado: " + stockvalorizado );
        System.out.println("Stock Total Valorizado Lavadoras: " + stockvalorizadolavadoras );
        System.out.println("Stock Total Valorizado Televisores : " + stockvalorizadoTVs );
    }
    
}
