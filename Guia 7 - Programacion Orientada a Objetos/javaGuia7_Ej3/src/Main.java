
import Entidades.Operacion;
import Servicios.ServicioOperacion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioOperacion SO = new ServicioOperacion();
        Operacion op1 = SO.crearOperacion();
        System.out.println("Ingrese la operacion a realizar:\n1. Sumar\n2. "
        + "Restar\n3. Multiplicar\n4. Dividir\n0. Salir"); 
        int opcion;
        do{
        opcion=leer.nextInt();
            switch(opcion)
            {
                case 1: 
                    System.out.println("Ingrese la operacion a realizar:\n1. Sumar\n2. "
        + "Restar\n3. Multiplicar\n4. Dividir\n0. Salir"); 
                    System.out.println(SO.sumar(op1));
                break;
                case 2:
                    System.out.println("Ingrese la operacion a realizar:\n1. Sumar\n2. "
        + "Restar\n3. Multiplicar\n4. Dividir\n0. Salir"); 
                    System.out.println(SO.restar(op1));
                break;
                case 3: 
                    System.out.println("Ingrese la operacion a realizar:\n1. Sumar\n2. "
        + "Restar\n3. Multiplicar\n4. Dividir\n0. Salir"); 
                    System.out.println(SO.multiplicar(op1));
                break;
                case 4:System.out.println("Ingrese la operacion a realizar:\n1. Sumar\n2. "
        + "Restar\n3. Multiplicar\n4. Dividir\n0. Salir"); 
                
                    System.out.println(SO.dividir(op1));
                break;
                case 0: break;
            }
        }while(opcion!=0);

    }
    
}
