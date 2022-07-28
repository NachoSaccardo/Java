
package javaguia7_ej11;

import java.util.Date;
import java.util.Scanner;

/*Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();*/
public class Main {

;
    
    public static void main(String[] args) 
    {   Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero de dia");
        int dia=leer.nextInt();
        System.out.println("Ingrese el numero de mes");
        int mes=leer.nextInt()-1;;
        System.out.println("Ingrese el numero de año");
        int anio=leer.nextInt()-1900;;
        Date fecha = new Date(anio, mes, dia);
        Date fechaActual = new Date();
        Date diferencia = new Date(fechaActual.getTime()-fecha.getTime());
        System.out.println("Fecha: "+fecha);
        System.out.println("Fecha Actual: "+fechaActual);
        System.out.println("Diferencia: "+diferencia);

        double diasdif;
        diasdif = diferencia.getTime()/86400000;
        System.out.println("Hay "+diasdif+" dias entre las dos fechas");
    }
    
}
