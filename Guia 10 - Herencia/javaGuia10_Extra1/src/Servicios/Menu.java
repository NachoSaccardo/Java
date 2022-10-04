
package Servicios;

import java.util.Scanner;


public class Menu 
{
    
    
    public static void menuPrincipal()
    {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion = 8;
        
        while(opcion!=0)
        {
            System.out.println("Seleccione el tipo de gestion que desea realizar: \n1. Gestionar Barcos\n2. Gestionar Usuarios\n3. Gestionar Alquileres\n0. Salir");
            opcion = leer.nextInt();
            
            switch(opcion)
            {
                case 1: 
                    menuBarco();
                    break;
                case 2:
                    menuUsuario();
                    break;
                case 3:
                    menuAlquiler();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }
    }
    
    public static void menuBarco()
    {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       int opcion = 8;
        
        while(opcion!=0)
        {
            System.out.println("Seleccione el tipo de gestion que desea realizar: \n1. Crear un nuevo Barco\n2. Alquilar un Amarre\n3. Mostrar Barcos\n0. Volver al Menu Principal");
            opcion = leer.nextInt();
            
            switch(opcion)
            {
                case 1: 
                    serviciosBarco.crearBarco();
                    break;
                case 2:
                    
                    break;
                case 3:
                    serviciosBarco.mostrarBarcos();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        } 
    }
    
    public static void menuAlquiler()
    {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion = 8;
        
        while(opcion!=0)
        {
            System.out.println("Seleccione el tipo de gestion que desea realizar: \n1. Crear un nuevo Contrato de Alquiler\n2. Crear amarres\n3. Mostrar Contratos de Alquiler\n4. Mostrar Contrato\n0. Volver al Menu Principal");
            opcion = leer.nextInt();
            
            switch(opcion)
            {
                case 1: 
                    if(!serviciosBarco.barcosLibres())
                    {
                        System.out.println("No existen barcos disponibles. Agregue o libere un barco");
                    }
                    else if(!serviciosAmarre.amarresLibres())
                    {
                        System.out.println("No existen amarres disponibles. Libere un amarre.");
                    }
                    else
                    {
                        serviciosAlquiler.crearContrato();
                    }
                    break;
                case 2:
                    serviciosAmarre.crearAmarre();
                    break;
                case 3:
                    serviciosAlquiler.mostrarAlquileres();
                    break;
                case 4: 
                    serviciosAlquiler.mostrarAlquiler();
                case 0:
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        } 
        
    }
    
    public static void menuUsuario()
    {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion = 8;
        
        while(opcion!=0)
        {
            System.out.println("Seleccione el tipo de gestion que desea realizar: \n1. Crear un nuevo Usuario\n2. Eliminar un Usuario\n3. Mostrar Usuarios\n0. Volver al Menu Principal");
            opcion = leer.nextInt();
            
            switch(opcion)
            {
                case 1: 
                    serviciosUsuario.crearUsuario();
                    break;
                case 2:
                    serviciosUsuario.eliminarUsuario();
                    break;
                case 3:
                    serviciosUsuario.mostrarUsuarios();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        } 
    }
   
}
