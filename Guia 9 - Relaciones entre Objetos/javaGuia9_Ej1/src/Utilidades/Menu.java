
package Utilidades;

import Servicios.ServicioPerro;
import Servicios.ServicioPersona;
import java.util.Scanner;


public class Menu 
{   
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ServicioPerro SP = new ServicioPerro();
    ServicioPersona SPER = new ServicioPersona();

    public Menu() {
    }
    
    public void principal()
    {
       int opcion = 1;
       
       while(opcion!=0) 
       {
            System.out.println("Seleccione la operacion");
            System.out.println("1. Agregar persona\n2. Agregar Perro\n3. Mostrar Personas\n"
             + "4. Mostrar Perros\n5.Adoptar Perro\n0. Salir");
            opcion = leer.nextInt();
            
           switch(opcion)
           {
               case 1:
                   SPER.crearPersona();
                   break;
               case 2:
                   SP.crearPerro();
                   break;
               case 3: 
                   SPER.mostrarPersonas();
                   break;
               case 4: 
                   SP.mostrarPerros();
                   break; 
               case 5:
                   SPER.adoptarPerro(SP);
                   break;
                           
               case 0: 
                   break;
           }
       }
    }
}
