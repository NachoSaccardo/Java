/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.DataBase;
import Entidades.Usuario;
import java.util.Map;
import java.util.Scanner;

public class serviciosUsuario 
{
    public static void mostrarUsuarios()
    {
        for (Map.Entry<Integer, Usuario> aux : DataBase.listaUsuarios.entrySet()) 
        {
            Integer key = aux.getKey();
            Usuario value = aux.getValue();
            
            System.out.println(value);
        }
    }   
    
    public static void crearUsuario()
    {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Usuario u1 = new Usuario();
        System.out.println("Ingrese el nombre");
        u1.setNombre(leer.next());
        System.out.println("Ingrese el apellido");
        u1.setApellido(leer.next());
        System.out.println("Ingrese el DNI");
        u1.setDNI(leer.nextInt());
        
        DataBase.listaUsuarios.put(u1.getDNI(), u1);
        
        System.out.println("Usuario Agregado: ");
        System.out.println(DataBase.listaUsuarios.get(u1.getDNI()));
    }
    
    public static void eliminarUsuario()
    {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        boolean bandera = false;
        System.out.println("Ingrese el DNI del usuario a eliminar");
        int DNIeliminar = leer.nextInt();
        for (Map.Entry<Integer, Usuario> aux : DataBase.listaUsuarios.entrySet()) 
        {
            Integer key = aux.getKey();
            Usuario value = aux.getValue();
            
            if(key==DNIeliminar)
            {
                DataBase.listaUsuarios.remove(DNIeliminar);
                System.out.println("Usuario eliminado");
                bandera = true;
            }
            if(!bandera)
                System.out.println("El usuario no existe");
            
        }
    }
}
