
package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import Enums.RazaPerro;
import Enums.TamanoPerro;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioPerro 
{
    public ArrayList<Perro> listaperros = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearPerro()
    {
           Perro p1 = new Perro();
           
           System.out.println("Ingrese el nombre");
           p1.setNombre(leer.next());
           System.out.println("Ingrese la edad");
           p1.setEdad(leer.nextInt());
           System.out.println("Ingrese la raza");
           for (RazaPerro aux : RazaPerro.values()) 
           {
               System.out.println((aux.ordinal()+1)+" "+aux.toString());
           }
           int raza = leer.nextInt()-1;
           p1.setRaza(RazaPerro.values()[raza]);
          
           System.out.println("Indique el tamaño");
           for (TamanoPerro aux2 : TamanoPerro.values()) 
           {
               System.out.println((aux2.ordinal()+1)+" "+aux2.toString());           
           }
           int tamano = leer.nextInt()-1;
           p1.setTamano(TamanoPerro.values()[tamano]);
           listaperros.add(p1);
    }


    public void mostrarPerros()
    {
        listaperros.forEach(
        (aux) -> 
            {            
                System.out.println(aux);
            }
        );
    }
    
    public void adopcionPerro(Persona p1)
    {
        System.out.println("Perros Disponibles: ");
        this.mostrarPerros();
        
        System.out.println("\nIngrese el nombre del perro que desea adoptar");
        String adoptar = leer.next();
        for (Perro auxiliar : listaperros) 
        {
            if(auxiliar.getNombre().equals(adoptar))
            {
                p1.setPerro(auxiliar);
            }
        }
                
    }
}