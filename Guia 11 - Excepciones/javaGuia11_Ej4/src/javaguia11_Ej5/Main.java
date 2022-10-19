/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package javaguia11_Ej5;

import java.util.Scanner;


public class Main{
  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num1=0;
        int contador = 1;
        String aux;
        
        int numero = (int) (Math.random() * 10);
        System.out.println("Numero a adivinar: "+numero);
        System.out.println("***************");
        
        
        do{
            try
            {
                System.out.println("Adivina! ");
                System.out.println("Intento "+contador);

                aux=leer.next();
                num1=Integer.parseInt(aux);
                contador++;

                if(num1==numero)
                    System.out.println("Adivinaste!! Felicidades");
                else
                    System.out.println("Segui participando");
            }
            catch(Exception e)
            {
                System.out.println("No se puede ingresar una letra");
            }
            
            
        }while(num1!=numero && contador<10);
    }
    

}