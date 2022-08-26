
import java.util.ArrayList;


public class EjemploColeeciones {

    
    public static void main(String[] args) {
    
        String[] nombresArray = new String[5];//Vector de tamaño 5 de tipo String
        for (int i = 0; i < nombresArray.length; i++) 
        {
         nombresArray[i]="Chiquito "+i;   
        }
        for (int i = 0; i < nombresArray.length; i++) 
        {
            System.out.println(nombresArray[i]);   
        }
        
        //Coleccion
        
        ArrayList<String> nombresArrayList = new ArrayList();
        System.out.println(nombresArrayList.size());//El metodo Size de ArrayList me devuelve el tamaño
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        System.out.println(nombresArrayList.size());
        nombresArrayList.remove("Chiquito");//Con el remove le quito ese dato, el tamaño cambia nuevamente
        System.out.println(nombresArrayList.size());
    }  
    
    
}

