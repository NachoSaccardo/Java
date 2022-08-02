
package Jarvis;

import Jarvis.Armadura.Armadura;
import java.util.Scanner;

public class Jarvis{
    
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Armadura IronMan = new Armadura();
        System.out.println("Sr. Stark, cuanto desea caminar?");
        int tiempo = leer.nextInt();
        IronMan.caminar(tiempo);
        
        System.out.println("Sr. Stark, cuanto desea correr?");
        tiempo = leer.nextInt();
        IronMan.correr(tiempo);
        
        System.out.println("Sr. Stark, cuanto desea volar?");
        tiempo = leer.nextInt();
        IronMan.correr(tiempo);
        
    }
}
