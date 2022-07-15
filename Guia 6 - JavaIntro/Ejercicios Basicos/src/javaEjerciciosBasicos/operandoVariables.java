package javaEjerciciosBasicos;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author juans
 */
public class operandoVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        int num1 = 54;
        int num2 = 52;
        int num3 = -12;
        int num4 = 99;
        int num5 = (num1 + num2) - (num3 * num4);
        int num6;
        if (num2 > num1) {
            num6 = num2 - num1;
        } else {
            num6 = num1 - num2;
        }
        boolean Logico = num1 == num2;
        System.out.println("Resultado Num5 = " + num5);
        System.out.println("Logico: " + Logico);
        System.out.println("Resultado Num6 = " + num6);
        System.out.print("Hola ");
        System.out.print("Mundo");
    }

}
