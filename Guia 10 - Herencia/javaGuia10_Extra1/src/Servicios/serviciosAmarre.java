/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Amarre;

import Entidades.DataBase;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author juans
 */
public class serviciosAmarre 
{
    public static void mostrarAmarresLibres()
    {
        for (Map.Entry<Integer, Amarre> aux : DataBase.listaAmarres.entrySet()) 
        {
            Integer key = aux.getKey();
            Amarre value = aux.getValue();
            if(value.getStatus().equals("Libre"))
            System.out.println("Numero: "+key+"\nEstado: "+value.getStatus());
        }
    }
    
    static boolean amarresLibres()
    {
        boolean bandera=false;
        for (Map.Entry<Integer, Amarre> aux : DataBase.listaAmarres.entrySet()) 
        {
            Integer key = aux.getKey();
            Amarre value = aux.getValue();
            if(value.getStatus().equals("Libre"))
            bandera=true;
        }
        return bandera;
    }
    
    public static void crearAmarre()
    {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de amarres a crear");
        int cant = leer.nextInt();
        int cantidad = leer.nextInt();
        for(int i=0; i<cant; i++)
        {
            Amarre a1 = new Amarre(i+1);
            DataBase.listaAmarres.put(i+1, a1);
        }
    }
    
}
