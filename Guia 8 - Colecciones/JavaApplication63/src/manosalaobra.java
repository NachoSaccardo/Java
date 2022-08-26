
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;


public class manosalaobra {

  
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
    Numeros.add(10);
    Numeros.add(10);
    Numeros.add(10);
    System.out.println("Tamaño: "+Numeros.size());
    for (Integer integer : Numeros) 
        {
            System.out.println(integer);
        }
    Numeros.remove(0);//Elimino el numero en la posicion 0
    System.out.println("Tamaño: "+Numeros.size());
    for (Integer integer : Numeros) 
        {
            System.out.println(integer);
        }
    
    HashSet<Integer> Numeros2 = new HashSet();
    int num2=10;
    Numeros2.add(num2);
    Numeros2.add(40);
    Numeros2.add(40);
    Numeros2.add(40);
    System.out.println("Tamaño: "+Numeros2.size());
        for (Integer integer : Numeros2) 
        {
            System.out.println(integer);
        }
            Numeros2.remove(10);//Elimino el numero 10
    System.out.println("Tamaño: "+Numeros2.size());
       
    //Este FOR muestra todo el ArrayList. Lo pongo automatico tocando for+Ctrl+Space
    for (Integer integer : Numeros2) 
        {
            System.out.println(integer);
        }
    
    HashMap<Integer, String> Alumnos = new HashMap();
    int dni = 36155908;
    String nombre = "Nacho";
    Alumnos.put(dni, nombre);
    Alumnos.put(44422233, "Carlos");
    Alumnos.put(436668778, "Lolo");
    Alumnos.put(41231233, "Nestor");
    System.out.println("Tamaño: "+Alumnos.size());
    
    //Este for recorre e imprime todo el mapa. Genera una variable Map.Entry llamada entry que usa para recorrer el array. 
    //Lo que va encontrando lo va metiendo adentro de las variables "key" y "value", y despues lo muestro
    //Para armarlo automatico, tipeo "for" y toco Ctrl+Space
    for (Map.Entry<Integer, String> entry : Alumnos.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Llave: "+key+"\nValor: "+value);
            
        }
    Alumnos.remove(44422233);
    System.out.println("Tamaño: "+Alumnos.size());
    for (Map.Entry<Integer, String> entry : Alumnos.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Llave: "+key+"\nValor: "+value);
            
        }
    }
    
}
