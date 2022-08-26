/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
22
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Servicios;

import Entidades.Pelicula;
import Utilidades.Comparators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author juans
 */
public class ServiciosPelicula 
{
    ArrayList<Pelicula> listaPeliculas = new ArrayList();
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public void fabricaPeliculas()
    {
        String salida = "s";
        
        while(salida.equals("s"))
        {   Pelicula peli = new Pelicula();
            System.out.println("Ingrese el Titulo de la pelicula");
            peli.setTitulo(leer.next());
            System.out.println("Ingrese el/la Director/a");
            peli.setDirector(leer.next());
            System.out.println("Ingrese la duracion");
            peli.setDuracion(leer.nextInt());
            listaPeliculas.add(peli);
            System.out.println("-----------------------");
            System.out.println("Pelicula Creada:");
            System.out.println(peli);
            System.out.println("-----------------------");
            System.out.println(" ");
            System.out.println("Desea crear otra pelicula? (s/n)");
            
            do { salida=leer.next();
            } while (!salida.equals("s")&&!salida.equals("n"));
            System.out.println(" ");
        }
    }
    
    public void mostrarPeliculas()
    {
        for (Pelicula peli : listaPeliculas) 
        {   System.out.println("Peliculas: ");
            System.out.println(" ");
            System.out.println(peli);
            System.out.println("-----------------------");
        }
    }
    public void mostrarPeliculasLargas()
    {
        System.out.println("Peliculas de mas de 1,5 horas:");
        System.out.println(" ");
        for (Pelicula peli : listaPeliculas) 
        {
            if(peli.getDuracion()>90)
            {
                System.out.println(peli);
                System.out.println("-----------------------");
            }
        }
        System.out.println(" ");
    }
    
    public void ordenarPeliculasDuracionAsc()
    {
        Collections.sort(listaPeliculas, Comparators.compararPeliDuracAsc);
        System.out.println(" ");
        System.out.println("Peliculas ordenadas por duracion, de forma ascendente");
        System.out.println(" ");
        mostrarPeliculas();
        System.out.println(" ");
    }
    
    public void ordenarPeliculasDuracionDesc()
    {
        Collections.sort(listaPeliculas, Comparators.compararPeliDuracDesc);
        System.out.println(" ");
        System.out.println("Peliculas ordenadas por duracion, de forma descendente");
        System.out.println(" ");
        mostrarPeliculas();
        System.out.println(" ");
    }
    
    public void ordenarPeliculasTitulo()
    {
        Collections.sort(listaPeliculas, Comparators.compararPeliTitulo);
        System.out.println(" ");
        System.out.println("Peliculas ordenadas por Titulo");
        System.out.println(" ");
        mostrarPeliculas();
        System.out.println(" ");
    }
    
    public void ordenarPeliculasDirector()
    {
        Collections.sort(listaPeliculas, Comparators.compararPeliDirector);
        System.out.println(" ");
        System.out.println("Peliculas ordenadas por Director");
        System.out.println(" ");
        mostrarPeliculas();
        System.out.println(" ");
    }
}
