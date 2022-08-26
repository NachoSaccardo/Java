 
package mascotapp.Servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mascotapp.Entidades.Mascota;

/* Esta clase la uso para generar los métodos o funciones que no estan asociados
directamente a la naturaleza de los objetos Mascota. Por ejemplo, puedo crear 
los metodos para la creacion de objetos, eliminacion, modificacion, etc. */
public class Servicio 
{
    //Genero un scanner aca para poder usarlo en todos los metodos
    private Scanner leer;
    private List<String> mascotas;
    /**
     * Funcion para crear mascotas, retorna el objeto mascota
     * @return m1
     */
    
    public Servicio() 
    {
        this.leer = new Scanner (System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }


    public Mascota crearMascota() {
        // Creo un nuevo objeto Mascota pidiendo todos los datos por teclado
        // y pasandolos como argumentos al constructor:
        System.out.println("Ingrese el tipo");
        String tipo= leer.next();
        System.out.println("Ingrese el nombre");
        String nombre= leer.next();
        System.out.println("Ingrese el apodo");
        String apodo= leer.next();
        System.out.println("Ingrese la raza");
        String raza= leer.next();
        System.out.println("Ingrese el color");
        String color= leer.next();
        System.out.println("Ingrese la edad en numeros");
        int edad = leer.nextInt();
        System.out.println("Ingrese 'true' si tiene cola, y 'false' si no la tiene");
        boolean cola = leer.nextBoolean();
        // Creo una nueva mascota usando el constructor completo
        //Mascota m3 = new Mascota(tipo, nombre, apodo, raza, color, edad, cola)
        Mascota m1 = new Mascota(tipo, nombre, apodo, raza, color, edad, cola);
        mascotas.add(nombre+" "+apodo+" "+tipo);
        return m1;
    }
    
    public void mostrarMascotas()
    {   System.out.println("Las mascotas son:");
        for (String aux : mascotas) 
        {
            System.out.println(aux);
        }
        System.out.println("Cantidad: "+mascotas.size());
    }
}
