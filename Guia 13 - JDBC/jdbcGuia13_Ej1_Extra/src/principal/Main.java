package principal;

//jdbc:mysql://localhost:3306/estancias_exterior?zeroDateTimeBehavior=convertToNull

import static Estancias.Utilidades.Utilidades.CalendarToString;
import static Estancias.Utilidades.Utilidades.StringToCalendar;
import Estancias.servicios.CasaService;
import Estancias.servicios.ClienteService;
import java.util.Calendar;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) 
    {
        CasaService casaservice = new CasaService();
        ClienteService clienteservice = new ClienteService();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int op;
        

        do
        {
            System.out.println("Seleccione una opcion: \n1. Menu CASAS\n2. Menu CLIENTES\n3. Menu CONTRATOS\n4. Menu FAMILIAS\n5. Comentarios\n0. Salir");
            op=leer.nextInt();
        
            switch(op)
            {
                case 1:
                    casaservice.menuCasa();
                    break;
                case 2:
                    clienteservice.menuCliente();
                    break;
                case 0: 
                   break;
                default: 
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }while(op!=0);
        
    }
}