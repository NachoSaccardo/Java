
package PersonApp.Servicios;

import PersonApp.Entidades.Persona;
import java.util.Date;
import java.util.Scanner;


public class ServicioPersona 
    {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona()
    {   System.out.println("Bienvenido!");
        System.out.println("Ingrese el numero de dia de su Fecha de Nacimiento");
        int dia=leer.nextInt();
        System.out.println("Ingrese el numero de mes");
        int mes=leer.nextInt()-1;;
        System.out.println("Ingrese el numero de año");
        int anio=leer.nextInt()-1900;;
        Date fechaNacimiento = new Date(anio, mes, dia);
        System.out.println("Ingrese su nombre y apellido");
        String nombre = leer.next();
        Persona p1 = new Persona(nombre, fechaNacimiento);
        return p1;
    }
   /* Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.*/

    public void calcularEdad(Persona p1)
    {
        Date fechaActual = new Date();
        Date diferencia = new Date(fechaActual.getTime()-p1.getFechaNacimiento().getTime());
        

        int edad;
        edad =(int)(diferencia.getTime()/(86400000));
        edad=edad/365;
        System.out.println(p1.getNombre()+" tiene "+edad+" años de edad");
    }
    
    /*• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.*/
    public void menorQue(Persona p1, int edad)
    {
        Date fechaActual = new Date();
        Date diferencia = new Date(fechaActual.getTime()-p1.getFechaNacimiento().getTime());
        System.out.println("Fecha Nacimiento: "+p1.getFechaNacimiento());
        System.out.println("Fecha Actual: "+fechaActual);
        System.out.println("Diferencia: "+diferencia + " milisegundos");
        int edad2 =(int)(diferencia.getTime()/(86400000*365));
        if(edad2<edad)
            System.out.println(p1.getNombre()+" es mayor");
        else
            System.out.println(p1.getNombre()+" es menor");
    }
   
    /*• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.*/
    public void mostrarPersona(Persona p1)
    {
        System.out.println(p1.toString());
    }
        
}
