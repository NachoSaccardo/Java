package javaEjerciciosBasicos;

import java.util.Scanner;

/**
 *
 * @author juans
 */
public class NombreyEdad {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        InputStreamReader ir = new InputStreamReader(System. in );
        BufferedReader br = new BufferedReader(ir);
        nombre = br.readLine();
        System.out.println(nombre);
         
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int edad;

        System.out.println("Ingrese su edad");
        edad = leer.nextInt();

        System.out.println("Ingrese su nombre:");
        String nombre = leer.next();

        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años de edad");

        /* String name,city,course;
    Scanner sc = new Scanner(System. in );
    System.out.println("Welcome to Techvidvan Tutorials");
    System.out.println("Enter your name");
    name = sc.nextLine();
    System.out.println("Enter your city");
    city = sc.nextLine();
    System.out.println("Enter the course that you want to learn from TechVidvan");
    course = sc.nextLine();
    System.out.println("You entered the following details:");
    System.out.println("Name: " + name);
    System.out.println("City: " + city);
    System.out.println("Opted Course: " + course);
         */
    }

}
