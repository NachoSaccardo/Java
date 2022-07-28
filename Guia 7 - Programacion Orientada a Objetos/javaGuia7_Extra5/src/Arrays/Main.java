
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*    5. Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!     */

public class Main {


    public static void main(String[] args) 
    {   Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String mes[] = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octurbre","noviembre","diciembre"};
        String mesSecreto = mes[3];
        System.out.println("Adivine el mes secreto! ( en minusculas) ");
        String adivinanza;
        do {
            adivinanza = leer.next();
            if(adivinanza.equals(mesSecreto))
                System.out.println("Felicidades!! Ha adivinado!");
            else
                System.out.println("Segui participando :'(");
                System.out.println("Intentelo nuevamente:");
        } while (!adivinanza.equals(mesSecreto));
        
        
        
        
    }
    
}
