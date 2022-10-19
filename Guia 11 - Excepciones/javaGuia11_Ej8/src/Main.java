/*
Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:

 */

/**
 *
 * @author juans
 */
public class Main {

    /**
     * @param args the command line arguments
     */
  
     public static void main (String[] args) 
     {
         System.out.println("Metodo numero UNO");
        try 
        {
        System.out.println (Uno.metodo()) ;
        }
        catch(Exception e) 
        {
        System.err.println("Excepcion en metodo()");
        e.printStackTrace();
        }
        
        
         System.out.println("\n");
         System.out.println("Metodo Numero DOS");
           try 
        {
        System.out.println (Dos.metodo()) ;
        }
        catch(Exception e) 
        {
        System.err.println("Excepcion en metodo()");
        e.printStackTrace();
        }
        
        System.out.println("\n");
        System.out.println("Metodo Numero DOS");   
              try 
        {
        System.out.println (Tres.metodo()) ;
        }
        catch(Exception e) 
        {
        System.err.println("Excepcion en metodo()");
        e.printStackTrace();
        }
        
        
    }
}
    
    
   
