package javaEjerciciosBasicos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author juans
 */
public class PruebaVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        String Cadena;
        long enterolargo;
        int entero;
        float decimal;
        Double decimallargo;
        char caracter;
        boolean Logico;
        System.out.println("Ingrese una cadena de caracteres");
        Cadena = leer.nextLine();
        System.out.println("Ingrese una variable de tipo entero largo");
        enterolargo = leer.nextLong();
        System.out.println("Ingrese una variable de tipo entero");
        entero = leer.nextInt();
        System.out.println("Ingrese una variable de tipo decimal");
        decimal = leer.nextFloat();
        System.out.println("Ingrese una variable de tipo decimal largo");
        decimallargo = leer.nextDouble();
        System.out.println("Ingrese una variable de tipo caracter");
        caracter = leer.next().charAt(2);
        System.out.println("Ingrese una variable de tipo Logico");
        Logico = leer.nextBoolean();
        System.out.println("Cadena: " + Cadena);
        System.out.println("Entero Largo Long; " + enterolargo);
        System.out.println("Entero: " + entero);
        System.out.println("Decimal Float: " + decimal);
        System.out.println("Decimal Largo Long: " + decimallargo);
        System.out.println("Caracter Char: " + caracter);
        System.out.println("Logico Boolean: " + Logico);

    }

}
