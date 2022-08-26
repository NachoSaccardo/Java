/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pais;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author juans
 */
public class ServiciosPais 
{   
    HashSet<Pais> paises = new HashSet();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void fabricaPaises()
    {
        
        String salida = "s";
        
        while(salida.equals("s"))
        {   Pais pais = new Pais();
            System.out.println("Ingrese el nombre");
            pais.setNombre(leer.next());
            System.out.println("Ingrese la superficie");
            pais.setSuperficie(leer.nextDouble());
            System.out.println("Ingrese la cantidad de habitantes");
            pais.setHabitantes(leer.nextDouble());
            System.out.println("Ingrese el idioma");
            pais.setIdioma(leer.next());
            paises.add(pais);

            System.out.println("Desea crear otro pais? (s/n)");
            do 
            { 
                salida=leer.next();
            } 
            while (!salida.equals("s")&&!salida.equals("n"));
            System.out.println(" ");
        }
    }
    
    public void mostrarPaises()
    {
        System.out.println("Paises; \n");
        for (Pais pais : paises) {
            System.out.println(pais);
        }
        System.out.println(" ");
    }
    
    public void ordenarPaisesNombre()
    {
        System.out.println(" ");
        ArrayList<Pais> listaPaises = new ArrayList(paises);
        Collections.sort(listaPaises,Comparadores.compararPaisesNombre );
        for (Pais pais : listaPaises) 
        {
            System.out.println(pais);
        }
        System.out.println(" ");
    }
    
    public void eliminarPais()
    {
        System.out.println("Ingrese un pais a eliminar");
        String eliminar=leer.next();
        Iterator<Pais> it = paises.iterator();
        boolean bandera=false;
        
        for (Iterator<Pais> iterator = paises.iterator(); iterator.hasNext();) {
            Pais next = iterator.next();
            if (next.getNombre().equals(eliminar)) 
            {
                iterator.remove();
                bandera=true;
                System.out.println("El pais "+next.getNombre()+" ha sido eliminado");
                System.out.println(" ");
                mostrarPaises();
            }
        }
        if(!bandera)
            System.out.println("El pais ingresado no se encuentra en el listado");        
    }
}
