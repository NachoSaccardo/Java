
package Jarvis;

import Jarvis.Armadura.Armadura;
import java.util.Scanner;

public class Jarvis{
    
    
    
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Armadura IronMan = new Armadura();
        int opcion;
        int tiempo;
        
        
        do{
            System.out.println("Sr. Stark, seleccione una opcion");
            System.out.println("1. Caminar\n2. Correr\n3. Propulsar\n4. Volar\n"
                    + "5. Disparar\n6. Mostrar Bateria\n7. Mostrar Estado\n8. Revisar Dispositivos");
            opcion=leer.nextInt();
            switch(opcion)
            {
                    
                case 1:
                    System.out.println("Sr. Stark, cuantos minutos desea caminar?");
                    tiempo = leer.nextInt();
                    IronMan.caminar(tiempo);
                    break;
                case 2:
                    System.out.println("Sr. Stark, cuantos minutos desea correr?");
                    tiempo = leer.nextInt();
                    IronMan.correr(tiempo);
                    break;
                case 3:
                    System.out.println("Sr. Stark, cuantos minutos desea propulsarse?");
                    tiempo = leer.nextInt();
                    IronMan.propulsar(tiempo);
                    break;      
                case 4: 
                    System.out.println("Sr. Stark, cuantos minutos desea volar?");
                    tiempo = leer.nextInt();
                    IronMan.volar(tiempo);
                    break;
                case 5:
                    System.out.println("Sr. Stark, cuantos minutos desea disparar?");
                    tiempo = leer.nextInt();
                    IronMan.disparar(tiempo);
                    break;
                case 6:
                     IronMan.mostrarBateria();
                     break;
                case 7:
                    IronMan.mostrarEstado();
                    break;
                case 8:
                    IronMan.revisarDispositivos();
                    break;
            }
        }while(opcion!=0);
        
        IronMan.mostrarReactorHP();
        IronMan.mostrarReactorBHP();
        
    }
}
