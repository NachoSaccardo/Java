/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alquiler;
import Entidades.DataBase;
import java.util.Map;
import java.util.Scanner;

/**
    private Integer numeroContrato;
 */
public class serviciosAlquiler 
{

    public static void mostrarAlquileres()
    {
        for (Map.Entry<Integer, Alquiler> aux : DataBase.listaAlquileres.entrySet()) 
        {
            Integer key = aux.getKey();
            Alquiler value = aux.getValue();
            
            System.out.println(value);
        }
    }
    
    static void crearContrato()
    {   
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Alquiler a1 = new Alquiler();
        System.out.println("Ingrese el DNI del usuario");
        Integer DNI;
        DNI = leer.nextInt();
        a1.setUsuario(DataBase.listaUsuarios.get(DNI));
        
        System.out.println("Amarres Disponibles: ");
        serviciosAmarre.mostrarAmarresLibres();
        System.out.println("Seleccione un Amarre");
        int amarre = leer.nextInt();
        
        while(!DataBase.listaAmarres.get(amarre).getStatus().equals("Libre"))
        {
            System.out.println("El amarre no esta libre. Seleccione otro");
            amarre = leer.nextInt();
        }
        
        System.out.println("Amarre Seleccionado: "+amarre);
        
        System.out.println("Ingrese la matricula de el barco a amarrar: ");
        serviciosBarco.mostrarBarcosSueltos();
        int matricula = leer.nextInt();
        
        while(DataBase.listaBarcos.get(matricula).getAmarreocupado()!=null)
        {
            System.out.println("El barco ya se encuentra amarrado en el amarre numero "+
                    DataBase.listaBarcos.get(matricula).getAmarreocupado().getNumero());
            System.out.println("Seleccione otro barco");
        }
        
        DataBase.listaBarcos.get(matricula).setAmarreocupado(DataBase.listaAmarres.get(amarre));
        a1.setNumeroAmarre(DataBase.listaAmarres.get(amarre));
        a1.setBarco(DataBase.listaBarcos.get(matricula));
    
        
        System.out.println("Ingrese la fecha de inicio del contrato en formato dd/MM/yyyy");
        a1.setFechaAlquiler(Utilidades.StringToCalendar(leer.nextLine()));
        
        System.out.println("Ingrese la fecha de fin del contrato en formato dd/MM/yyyy");
        a1.setFechaDevolucion(Utilidades.StringToCalendar(leer.nextLine()));
        
        a1.setNumeroContrato(DataBase.listaAlquileres.size()+1);
        System.out.println("Numero de contrato: "+a1.getNumeroContrato());
        
        DataBase.listaAlquileres.put(a1.getNumeroContrato(), a1);
        DataBase.listaAmarres.get(amarre).setBarcoAmarrado(a1.getBarco());
        DataBase.listaAmarres.get(amarre).setStatus("Ocupado");
        
        a1.getBarco().setContratoAlquiler(DataBase.listaAlquileres.get(a1.getNumeroContrato()));
        
    }
    
    public static void mostrarAlquiler()
    {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero de Contrato de Alquiler a mostrar");
        int num = leer.nextInt();
        System.out.println(DataBase.listaAlquileres.get(num));
    }
}

