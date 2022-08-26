
import java.util.HashMap;
import java.util.Map;


public class DeteccionDeErrores {

    /**
     MANOS A LA OBRA – DETECCIÓN DE ERRORES
HashMap<Integer> personas = new HashMap<>;
String n1 = “Albus”;
String n2 = “Severus”;
personas.add(n1);
personas.add(n2);
     */
    public static void main(String[] args) {
       HashMap<Integer, String> personas = new HashMap();
       String n1 = "Albus";
       String n2 = "Severus";
       personas.put(personas.size()+1, n1);
       personas.put(personas.size()+1, n2);
       
       for(Map.Entry<Integer, String> entry : personas.entrySet())
            System.out.println(entry.getKey()+" ; "+entry.getValue());
    }
    
}
