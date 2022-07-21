package Nespresso.Servicios;

import Nespresso.Entidades.Cafetera;
import java.util.Scanner;


public class ServiciosCafetera {
    Scanner leer = new Scanner(System.in);
    
    public void llenarCafetera(Cafetera c1)
    {
        c1.setCantidadActual(c1.getCapacidadMaxima());
        System.out.println("Cafe restante: "+c1.getCantidadActual());
    }
    
    /** Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
    tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
    cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
    método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
    cuanto quedó la taza.
    *@param c1
    *@param taza     */
    
    public void servirTaza(Cafetera c1, float taza)
    {
        if(c1.getCantidadActual()<taza)
        {
            System.out.println("No tiene suficiente cafe para llenar la taza");
            System.out.println("Se sirvio el total disponible de "+c1.getCantidadActual()+" mililitros");
            c1.setCantidadActual(0);
            System.out.println("Cafe restante: "+c1.getCantidadActual());
            System.out.println("Disftute su cafe!");
        }
        else
        {
            c1.setCantidadActual(c1.getCantidadActual()-taza);
            System.out.println("Disftute su cafe!");
            System.out.println("Cafe restante: "+c1.getCantidadActual());
        }
    }
    public void vaciarCafetera(Cafetera c1)
    {
        System.out.println("Esta seguro que desea vaciar la cafetera?");
        System.out.println("S/N");
        String opcion = leer.next().toLowerCase();
        if(opcion.equals("s"))
        {
            c1.setCantidadActual(0);
            System.out.println("Se ha vaciado la cafetera");
            System.out.println("Cafe restante: "+c1.getCantidadActual());
        }
    }
    public void agregarCafe(Cafetera c1, float cafe)
    {
        if(c1.getCantidadActual()+cafe<=c1.getCapacidadMaxima())
        {
            c1.setCantidadActual(c1.getCantidadActual()+cafe);
            System.out.println("Cantidad de cafe: "+c1.getCantidadActual());
        }
        else
        {
            System.out.println("Esta intentando agregar demasiado cafe, supera la capacidad maxima");
            System.out.println("Se llenara procedera a llenar al maximo la cafetera");
            c1.setCantidadActual(c1.getCapacidadMaxima());
            System.out.println("Cantidad de cafe: "+c1.getCantidadActual());
        }
    }
}
    

