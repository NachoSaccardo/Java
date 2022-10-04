package FitApp;
import FitApp.Entidades.Persona;
import FitApp.Servicios.ServiciosPersona;
import java.util.Scanner;


public class FitApp {

    public static void main(String[] args) 
    {  
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServiciosPersona SP = new ServiciosPersona();
        int indice=-2;
        int totalflacos=0;
        int totalnormales=0;
        int totalgordos=0;
        int totalmayores=0;
        int totalmenores=0;
        int aux;
        
        //Prueba por ejercicio 1 Excepciones
        SP.crearPersonaVacia();
        
        try{
            SP.esMayorDeEdad(1);
        }
        catch(Exception e)
        {
            System.out.println("El objeto esta vacio");
        }
        //Aca finaliza la prueba
        
        int opcion=-2;
        while(opcion!=-1){
            System.out.println("Desea crear otra persona?");
            SP.crearPersona();
            
            System.out.println("Indique el indice de la persona a calcular IMC y edad.\nPara finalizar ingrese -1");
            
            aux=leer.nextInt();
            if(aux==-1)
                break;
            else
                indice=aux;
            
            SP.esMayorDeEdad(indice);
            SP.calcularIMC(indice);

            if(SP.getPersona(indice).getIMC()==1)
            {
                System.out.println(SP.getPersona(indice).getNombre()+" tiene sobrepeso");
            } else if (SP.getPersona(indice).getIMC() ==0) {
                System.out.println(SP.getPersona(indice).getNombre()+" esta en su peso ideal");
            } else if (SP.getPersona(indice).getIMC()==-1) {
                System.out.println(SP.getPersona(indice).getNombre()+" esta por debajo de su peso ideal");
            }
            if(SP.esMayorDeEdad(indice)) 
                System.out.println(SP.getPersona(indice).getNombre()+" es mayor de edad");
            else
            {
                System.out.println(SP.getPersona(indice).getNombre()+" es menor de edad");
            }
            System.out.println("Quiere calcular otra persona? Para salir ingrese -1");
            opcion = leer.nextInt();
        } 
   
  
        for(indice=0;indice<4;indice++)
        {
         if(SP.getPersona(indice).getIMC()==-1)
             totalflacos++;
         else if(SP.getPersona(indice).getIMC()==0)
         totalnormales++;
         else if(SP.getPersona(indice).getIMC()==1)
         totalgordos++;
         if(SP.getPersona(indice).isMayor())
         totalmayores++;
         else
         totalmenores++;
        }
        System.out.println("Gordos: "+(100*totalgordos/4)+"%");
        System.out.println("Normales: "+(100*totalnormales/4)+"%");
        System.out.println("Flacos: "+(100*totalflacos/4)+"%");
        System.out.println("Mayores: "+(100*totalmayores/4)+"%");
        System.out.println("Menores: "+(100*totalmenores/4)+"%");
    }
}
