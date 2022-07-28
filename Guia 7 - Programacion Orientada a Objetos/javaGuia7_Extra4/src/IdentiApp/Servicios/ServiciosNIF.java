
package IdentiApp.Servicios;

import IdentiApp.Entidades.NIF;
import java.util.Arrays;

import java.util.Scanner;


public class ServiciosNIF 
{   
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public String lista[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
    public NIF crearNIF()
    {   
        
        NIF N1 = new NIF();
        System.out.println("Ingrese su numero de DNI");
        N1.setDNI(leer.nextLong());
        N1.setLetra(lista[(int)N1.getDNI()%23]);
        System.out.println(N1.toString());
        return N1;
        
    }
}
