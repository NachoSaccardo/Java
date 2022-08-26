
package javaguia8_ej2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.*/

public class Main {

    public static void main(String[] args) {

        ArrayList<String> razas = new ArrayList();
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
        String respuesta;
        boolean bandera=true;
        while(bandera)
        {
            System.out.println("Ingrese una raza");
            razas.add(leer.next());
            System.out.println("Desea ingresar una nueva raza (s/n)");
            respuesta=leer.next();
            while(!respuesta.equals("n")&&!respuesta.equals("s"))
            {
                System.out.println("Ingrese una respuesta valida");
                System.out.println("Desea ingresar una nueva raza (s/n)");
                respuesta=leer.next();
            }
            if(respuesta.equals("n"))
                    {
                        bandera=false;
                    }   
        }

        Iterator<String> iterator = razas.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        
        System.out.println("Ingrese una raza para eliminarla");
        String aeliminar = leer.next();
        iterator = razas.iterator();
        bandera=false;
        while(iterator.hasNext())
        {
            if(iterator.next().equals(aeliminar))
            {
                iterator.remove();
                bandera=true;
            }
        }
       
        if(bandera==false)
        {
            System.out.println("La raza ingesada no se encuentra en la lista");
        }
        else
        {
            System.out.println("La raza ha sido eliminada");
        
         for (String casa : razas) {
            System.out.println(casa);
            
        }
        }
    }
}
    

