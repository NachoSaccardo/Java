
import java.util.Scanner;

/*
    Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
    generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
    de rango).
 */

public class Main {

    
    public static void main(String[] args) throws Exception
    {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicio S = new Servicio();
        try{
        S.prueba();
        
        
//        System.out.println("Ingrese una posicion para mostrala");
//        int indice = leer.nextInt();
//        
//        
//        
//           if(indice>Lista.length)
//           throw new Exception("Esa persona no existe");
        
        }
        catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }
    }
    
}
