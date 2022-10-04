/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.DataBase;
import Entidades.Velero;
import Entidades.Yate;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author juans
 */
public class serviciosBarco 
{
    public static void mostrarBarcos()
    {
        for (Map.Entry<Integer, Barco> aux : DataBase.listaBarcos.entrySet()) 
        {
            Integer key = aux.getKey();
            Barco value = aux.getValue();
            
            System.out.println(value);
        }
    }   
    
    public static void mostrarBarcosSueltos()
    {
        for (Map.Entry<Integer, Barco> aux : DataBase.listaBarcos.entrySet()) 
        {
            Integer key = aux.getKey();
            Barco value = aux.getValue();
            
            System.out.println(value.mostrarBarco());
        }
    }  
    
    static boolean barcosLibres()
    {
        boolean bandera=false;
        for (Map.Entry<Integer, Barco> aux : DataBase.listaBarcos.entrySet()) 
        {
            Integer key = aux.getKey();
            Barco value = aux.getValue();
            if(value.getAmarreocupado()==null)
            bandera=true;
        }
        return bandera;
    }

    public static void crearBarco()
    {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
        System.out.println("Ingrese el DNI del usuario");
        int DNI = leer.nextInt();
        while(!DataBase.listaUsuarios.containsKey(DNI))
        {
            System.out.println("Usuario Inexistente. Ingrese un usuario valido");
            DNI = leer.nextInt();
        }
        
        Barco b1 = new Barco();
        int mastiles=0; 
        int CV=0;
        int camarotes=0;
        
        int opcion=0;
        
        while(opcion!=1&&opcion!=2&&opcion!=3)
        {
            System.out.println("Seleccione el tipo de barco a crear: \n1. Velero\n2. Barco a Motor\n3. Yate");
            opcion=leer.nextInt();
            switch(opcion)
            {                
                case 1: 
                    b1 = new Velero();
                    System.out.println("Ingrese el numero de Mastiles");
                    mastiles = leer.nextInt();
                    break;
                case 2: 
                    b1 = new BarcoMotor();
                    System.out.println("Ingrese la potencia en CV");
                    CV = leer.nextInt();
                    break;
                case 3: 
                    b1= new Yate();
                    System.out.println("Ingrese la potencia en CV");
                    CV = leer.nextInt();
                    System.out.println("Ingrese la cantidad de camarotes");
                    camarotes=leer.nextInt();
                    break;
                default:
                    System.out.println("Seleccione una opcion valida");
                    opcion=leer.nextInt();
                    break;
            }
        }
        
        System.out.println("Ingrese la matricula");
        b1.setMatricula(leer.nextInt());
        
        System.out.println("Ingrese los metros de eslora");
        b1.setEslora(leer.nextInt());
        
        System.out.println("Ingrese el año de fabricacion");
        b1.setAnoFabricacion(leer.nextInt());
        
        
        DataBase.listaBarcos.put(b1.getMatricula(), b1);
        
        DataBase.listaBarcos.get(b1.getMatricula()).setDueno(DataBase.listaUsuarios.get(DNI));
        DataBase.listaUsuarios.get(DNI).getBarcosUsuario().add(DataBase.listaBarcos.get(b1.getMatricula()));
        System.out.println("Barco Creado: \n"+b1.mostrarBarco());
        
        
    }
        
}


