
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class pruebaIterator {


    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
    ArrayList<String> lista = new ArrayList();
    lista.add("a");
    lista.add("b");
    lista.add("b");
    lista.add("b");
    lista.add("c");
    lista.add("d");
    
    Iterator<String> iterator = lista.iterator();
    
    System.out.println("Imprimo la lista como la cree");
    while(iterator.hasNext())
    {
        System.out.println(iterator.next()+" ");
    }
        System.out.println("Elimino todas las entradas que sean iguales a b");
    
    iterator = lista.iterator();
    
    String aeliminar;
        System.out.println("Ingrese un valor a eliminar");
        aeliminar=leer.next();
    while(iterator.hasNext())
    {
        if(iterator.next().equals(aeliminar))
        {
            iterator.remove();
        }
    }
    System.out.println("La imprimo nuevamente luego de eliminar");
        System.out.println("Tamaño: "+lista.size());
        iterator = lista.iterator();
    while(iterator.hasNext())
    {
        System.out.println(iterator.next()+" ");
    }
    
    ArrayList<Integer> Numeros = new ArrayList();
    
    }
    
}
