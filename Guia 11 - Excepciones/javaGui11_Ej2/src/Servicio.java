
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juans
 */
public class Servicio 
{
    public void prueba() throws Exception
    {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona[] Lista = new Persona[1];
        
        System.out.println("Ingrese una posicion para mostrala");
        int indice = leer.nextInt();

        if(indice>Lista.length)
        throw new Exception("Esa persona no existe");
        
    }
     
}
