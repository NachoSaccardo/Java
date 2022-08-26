
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;


public class Manosalaobra1 {

  
    public static void main(String[] args) {
/* correccion de errores
   Corrige el siguiente código:
        
    Array<int> listado = new ArrayList;
    TreeSet<String> = TreeSet();
    HashMap<Integer> personas = new HashMap<>;*/

    ArrayList<Integer> listado = new ArrayList();
    TreeSet<String> Arbol = new TreeSet();
    HashMap<Integer, String> personas = new HashMap();
    
    
    ArrayList<Integer> Numeros = new ArrayList();
    int num = 20;
    Numeros.add(num);
    System.out.println("Tamaño: "+Numeros.size());
    Numeros.remove(0);//Elimino el numero en la posicion 0
    System.out.println("Tamaño: "+Numeros.size());
    
    HashSet<Integer> Numeros2 = new HashSet();
    int num2=10;
    Numeros2.add(num2);
    System.out.println("Tamaño: "+Numeros2.size());
    Numeros2.remove(10);//Elimino el numero 10
    System.out.println("Tamaño: "+Numeros2.size());
    
    HashMap<Integer, String> Alumnos = new HashMap();
    int dni = 36155908;
    String nombre = "Nacho";
    Alumnos.put(dni, nombre);
    System.out.println("Tamaño: "+Alumnos.size());
    
    }
    
}
