
package Nespresso;

import Nespresso.Entidades.Cafetera;
import Nespresso.Servicios.ServiciosCafetera;
import java.util.Scanner;

public class Nespresso {

    public static void main(String[] args) 
    {   
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Crear nueva cafetera? (S/N)");
        String opcion = leer.next().toLowerCase();
        System.out.println(opcion);
        if(opcion.equals("s"))
        {
            System.out.println("Ingrese la capacidad maxima");
            float capacidadMaxima=leer.nextFloat();
            System.out.println("Ingrese la cantidad de cafe actual");
            float capacidadActual=leer.nextFloat();
            Cafetera c1 = new Cafetera(capacidadMaxima, capacidadActual);
            menu(c1);
        }
        else
        {
            System.out.println("Usted no tiene cafeteras para trabajar");
        }
           
}

public static void menu(Cafetera c1)
{   Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int menu;
    ServiciosCafetera SC = new ServiciosCafetera();
    do 
        {
            System.out.println("Que desea hacer con su nueva cafetera?");
            System.out.println("1. Llenar cafetera\n2. Servir una taza\n3. Vaciar cafetera\n4. Agregar Cafe\n0. Salir");
            menu = leer.nextInt();
            switch(menu)
            {
                case 1: 
                    SC.llenarCafetera(c1);
                    break;
                case 2:
                    System.out.println("Ingrese el volumen de su taza en mililitros");
                    float taza = leer.nextFloat();
                    SC.servirTaza(c1, taza);
                    break;
                case 3:
                    SC.vaciarCafetera(c1);
                    break;
                case 4: 
                    System.out.println("Indique la cantidad de cafe a agregar, en mililitros");
                    float cafe = leer.nextFloat();
                    SC.agregarCafe(c1, cafe);
            }
                
        } while (menu!=0);             
    } 
}