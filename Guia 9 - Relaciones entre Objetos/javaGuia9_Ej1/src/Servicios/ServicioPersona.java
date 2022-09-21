/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;


public class ServicioPersona 
{          
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public ArrayList<Persona> listapersonas = new ArrayList();
           
    public void crearPersona(){

            Persona p1 = new Persona();
            System.out.println("Ingrese el nombre");
            p1.setNombre(leer.next());
            System.out.println("Ingrese el apellido");
            p1.setApellido(leer.next());
            System.out.println("Ingrese la edad");
            p1.setEdad(leer.nextInt());
            System.out.println("Ingrese el numero de documento");
            p1.setDocumento(leer.nextInt());
            listapersonas.add(p1);    
    }
    
    public void mostrarPersonas()
    {
        System.out.println("Personas: ");
        for (Persona aux : listapersonas) 
        {
            System.out.println(aux.toString());            
        }
        System.out.println("\n");
    }
    
    public void adoptarPerro(ServicioPerro SP)
    {   
        System.out.println("Ingrese su numero de documento");
        int DNI = leer.nextInt();
        for (Persona aux : listapersonas) 
        {
            if(aux.getDocumento()==DNI)
            {   
                System.out.println("Bienvenido, "+aux.getNombre()+" "+aux.getApellido());
                SP.adopcionPerro(aux);

            }
        }  
    }
}
        
    
    
   
