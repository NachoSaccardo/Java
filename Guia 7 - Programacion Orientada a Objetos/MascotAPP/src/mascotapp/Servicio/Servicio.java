
package mascotapp.Servicio;

import java.util.Scanner;
import mascotapp.Entidades.Mascota;

/* Esta clase la uso para generar los métodos o funciones que no estan asociados
directamente a la naturaleza de los objetos Mascota. Por ejemplo, puedo crear 
los metodos para la creacion de objetos, eliminacion, modificacion, etc. */
public class Servicio 
{
    //Genero un scanner aca para poder usarlo en todos los metodos
    private Scanner leer = new Scanner (System.in).useDelimiter("\n");
   
    /**
     * Funcion para crear mascotas, retorna el objeto mascota
     * @return m1
     */
    public Mascota crearMascota() 
    {
        // Creo un nuevo objeto Mascota pidiendo todos los datos por teclado 
        // y pasandolos como argumentos al constructor:            
            System.out.println("Ingrese el tipo");
            String a= leer.next();
            System.out.println("Ingrese el nombre");
            String b= leer.next();
            System.out.println("Ingrese el apodo");
            String c= leer.next();
            System.out.println("Ingrese la raza");
            String d= leer.next();        
            System.out.println("Ingrese el color");
            String e= leer.next();        
            System.out.println("Ingrese la edad en numeros");
            int f = leer.nextInt();
            System.out.println("Ingrese 'true' si tiene cola, y 'false' si no la tiene");
            boolean g = leer.nextBoolean();
        // Creo una nueva mascota usando el constructor completo
        //Mascota m3 = new Mascota(tipo, nombre, apodo, raza, color, edad, cola)
        Mascota m1 = new Mascota(a, b, c, d, e, f, g);
        return m1;
}
}
