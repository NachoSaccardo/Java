
package javaguia8_ej10;

import java.util.*;

public class JavaGuia8_Ej10 {
/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.*/
    
    public static void main(String[] args) {
        ArrayList<String> razas = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        
        String respuesta;
        boolean bandera=true;
        while(bandera)
        {
            System.out.println("Ingrese una raza");
            razas.add(leer.next());
            System.out.println("Desea ingresar una nueva raza (s/n)");
            respuesta=leer.next();
            while(!respuesta.equals("n")&&!respuesta.equals("s"))
            {
                System.out.println("Ingrese una respuesta valida");
                System.out.println("Desea ingresar una nueva raza (s/n)");
                respuesta=leer.next();
            }
            if(respuesta.equals("n"))
                    {
                        bandera=false;
                    }
            
        }
        for (String raza : razas) {
            System.out.println(raza);
            
        }
            
           
            
           
            
        
        
    }
    
}
