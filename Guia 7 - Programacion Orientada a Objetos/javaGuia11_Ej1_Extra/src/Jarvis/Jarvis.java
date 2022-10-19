
package Jarvis;

import Jarvis.Armadura.Armadura;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Jarvis{
    
    
    
    public static void main(String[] args) 
    {
        JOptionPane.showMessageDialog(null, "Hello World");

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Armadura IronMan = new Armadura();
        int opcion;
        int tiempo;
        
        
                
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Sr. Stark, seleccione una opcion\n1. Caminar\n2. Correr\n3. Propulsar\n4. Volar\n5. Disparar\n6. Mostrar Bateria\n7. Mostrar Estado\n8. Revisar Dispositivos"));
            switch(opcion)
            {
                    
                case 1:
                    
                    tiempo = Integer.parseInt(JOptionPane.showInputDialog("Sr. Stark, cuantos minutos desea caminar?"));
                    IronMan.caminar(tiempo);
                    
                    break;
                case 2:
                 
                    tiempo = Integer.parseInt(JOptionPane.showInputDialog("Sr. Stark, cuantos minutos desea correr?"));
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
