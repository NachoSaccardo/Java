package poo_persona;

import Entidades.Persona;
import java.util.Scanner;

public class POO_Persona {
   
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su nombre");
        String name=leer.next();
        System.out.println("Ingrese su apellido");
        String lastname=leer.next();
        Persona p1 = new Persona(name,lastname);
        System.out.println("Ingrese el pais de residencia");
        p1.setPais(leer.next());
        System.out.println("Ingrese la provincia de residencia");
        p1.setProvincia(leer.next());
        System.out.println("Ingrese su genero");
        p1.setGenero(leer.next());
        System.out.println(p1);
    }
    
    
}
