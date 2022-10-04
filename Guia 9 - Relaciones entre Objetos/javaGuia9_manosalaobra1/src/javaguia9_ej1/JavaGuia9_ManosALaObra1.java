/*
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package javaguia9_ej1;

import Entidades.DNI;
import Entidades.Persona;
import java.util.Scanner;

public class JavaGuia9_ManosALaObra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        DNI dni = new DNI();
        System.out.println("Ingerse el numero de DNI");
        dni.setNumero(leer.nextInt());
        System.out.println("Ingrese la serie");
        dni.setSerie(leer.next());
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre");
        String nombre = leer.next();
        System.out.println("Ingrese el apellido");
        String apellido = leer.next();
        persona.setApellido(apellido);
        persona.setNombre(nombre);
        persona.setDni(dni);

        System.out.println(dni.toString());
        System.out.println(persona.toString());
                        
    }
    
    
}
