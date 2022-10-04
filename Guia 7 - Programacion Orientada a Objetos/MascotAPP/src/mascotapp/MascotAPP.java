package mascotapp;

import mascotapp.Entidades.Mascota;
import java.util.Scanner;
import mascotapp.Servicio.Servicio;

public class MascotAPP {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        //Creo un objeto usando el constructor por default. 
        //Este no le asigna valores a los atributos
        Mascota m1 = new Mascota();
        
        /* Si lo quiero inicializar manualmente, cuando los atributos son de tipo "public"
        lo puedo hacer mediante una asignacion directa, de esta forma: 
        "m1" es el nombre de este objeto, y ".apodo" es la variable de ese objeto 
        m1.apodo = "Chiquito";
        m1.nombre = "Fernando Chiquito";
        m1.tipo = "Perro";
        m1.edad = 14;
        m1.raza = "Beagle";
        m1.cola = true;
        m1.color = "Tricolor";        */
        
        /* La otra opcion es crearlo ya definiendo sus atributos, a traves de los constructores
        Mascota m1 = new Mascota(nombre, apodo, tipo);             
        Toco Crl+Space y veo las opciones de ingreso, si lo hago dentro del parentesis
        me muestra los constructores disponibles */
        
        /* En caso de que los atributos de la clase sean "public", yo los puedo cambiar desde aca, x ej:
        m1.nombre="Mario"
        Si son de tipo private, tengo que crear, en la clase Mascota, un metodo 
        "Setter" que me permite acceder a ese atributo desde otras Clases que no sean la del objeto.
        cuando los atributos son privados, tampoco los puedo imprimir, necesito 
        crear un m{etodo "Getter" */
        
        
        //Aca le cambio el nombre usando un Setter
        m1.setNombre("CACA");
        // Imprimo usando Getters:         
        System.out.println(m1.getNombre()+" ,"+m1.getApodo()+" ,"+m1.getTipo());
        // Si mantengo Ctrl+click en get.Nombre, me va a llevar a la clase 
        // "Mascota", a la linea donde creé el Método getter        
        
        //aca lo imprimo usando el @Override del toString() del metodo Mascota.
        //Para ver el Método toString(), Ctrl+click 
        System.out.println(m1.toString()); 
        
        //Ejecuto el metodo "pasear", le digo que voy a gastar 100 de energia
        m1.pasear(100); 
        System.out.println(m1.toString());
        //Ejecuto el metodo "pasear", gastando 100 de energia por vuelta, y doy 3 vueltas
        m1.pasear(100,3);
        System.out.println(m1.toString());
        
        //Creo un nuevo objeto mascota, asignandole valores DIRECTAMENTE en el constructor
        Mascota m2 = new Mascota("Conejo", "Bugs Bunny","Bugs", "Rabioso", "Blanco", 5, false);
        System.out.println(m2);
        
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
        //Mascota m3 = new Mascota(tipo, nombre, apodo, raza, color, edad, cola)
        Mascota m3 = new Mascota(a, b, c, d, e, f, g);
        System.out.println(m3);
        
        // tambien puedo crear un nuevo objeto mascota con el constructor default
        // (vacio) y usar Setters para asignarle valores a sus atributos
        Mascota m4 = new Mascota();
            System.out.println("Ingrese el tipo");
            m4.setNombre(leer.next());
            System.out.println("Ingrese el nombre");
            m4.setApodo(leer.next());
            System.out.println("Ingrese el apodo");
            m4.setTipo(leer.next());
            System.out.println("Ingrese la raza");
            m4.setRaza(leer.next());
            System.out.println("Ingrese el color");
            m4.setColor(leer.next());
            System.out.println("Ingrese la edad en numeros");
            m4.setEdad(leer.nextInt());
            System.out.println("Ingrese 'true' si tiene cola, y 'false' si no la tiene");
            m4.setCola(leer.nextBoolean());
            System.out.println(m4);
            
            
            /* Por ultimo, puedo crear la mascota usando el servicio "crearMascota()":
            Creo un objeto de tipo Servicio llamado "sm" para poder acceder a 
            los métodos dentro de la clase Servicio*/
            Servicio sm = new Servicio(); 
            Mascota m5 = sm.crearMascota();
            System.out.println(m5);


            
    }
}

