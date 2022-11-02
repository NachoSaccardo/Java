
package TiendaAPP.principal;

import TiendaAPP.servicios.FabricanteService;
import TiendaAPP.servicios.ProductoService;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Main {

 
    public static void main(String[] args) 
    {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       ProductoService productoService = new ProductoService();
       FabricanteService fabricanteService = new FabricanteService();
       int opcion = 0;

       
       
       
       do
       {
           System.out.println("Seleccione una opcion\n1: Menu de Productos\n2: Menu de Fabricantes\n3: Salir ");
           opcion = leer.nextInt();
           System.out.println("");
           switch(opcion)
            {
                case 1:
                    productoService.menuProducto();
                    break;
                case 2:
                    fabricanteService.menuFabricante();
                    break;
                case 3:
                    break;
             }
       }while(opcion!=3);
    }
}
    

