
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juans
 */
public class otradetecciondeerrores {

    
    public static void main(String[] args) 
    {
        // MANOS A LA OBRA - DETECCIÓN DE ERRORES
        /*ArrayList<String> = new ArrayList()
        bebidas.put(“café);
        bebidas.add(“té”);
        Iterator<String> it =bebidas.iterator();
        whale (it.next()){
        if (it.next().equals(“café”)){
        it.remove();
        }*/
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("te");
        Iterator<String> it = bebidas.iterator();
        while(it.hasNext())
        {
            if (it.next().equals("café"))
            {
                it.remove();
            }
        
        }
    }
}
