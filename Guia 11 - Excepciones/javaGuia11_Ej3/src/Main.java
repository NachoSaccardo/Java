
import java.util.InputMismatchException;
import java.util.Scanner;

/*

Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado. 

Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones

 */

public class Main {

    public static void main(String[] args) throws Exception 
    {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String a;
        String b;
        try
        {
            
            System.out.println("Ingrese el primer numero (Numerador)");
            a=leer.next();
            
            System.out.println("Ingrese el segundo numero (Denominador)");
            b=leer.next();
            
            int c = Integer.parseInt(a);
            System.out.println("c: "+c);
            int d = Integer.parseInt(b);
            System.out.println("d: "+d);
           
            DividirNumeros(c, d);
            
        }

        catch(ArithmeticException f)
        {
            System.out.println("No se puede dividir por cero");
        }
        catch(NumberFormatException h)
        {
            System.out.println("El valor ingresado no es un entero");
          //  throw new Exception("Esta Excepcion me la invente");
        }
        finally
        {
            
            System.out.println("Este es el mensaje final");
        }
        
        
    }
    
    public static void DividirNumeros(int c, int d)
    {
        double j = ((double) c / (double) d);
        
        System.out.println("Division: "+j);
    }
 
}
