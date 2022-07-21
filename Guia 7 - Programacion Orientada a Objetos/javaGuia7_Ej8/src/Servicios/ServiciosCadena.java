
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;


public class ServiciosCadena 
{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada. 
    
    /**
     * Esta funcion devuelve la cantidad total de vocales
     * @param c1 
     */
    public void mostrarVocales(Cadena c1)
    {   int cantidadvocales=0;
        for (int i=0;i<c1.getLongitud();i++)
        {
            if(c1.getFrase().substring(i,(i+1)).toLowerCase().equals("a")||
               c1.getFrase().substring(i,(i+1)).toLowerCase().equals("e")||
               c1.getFrase().substring(i,(i+1)).toLowerCase().equals("i")||
               c1.getFrase().substring(i,(i+1)).toLowerCase().equals("o")||
               c1.getFrase().substring(i,(i+1)).toLowerCase().equals("u")){
                cantidadvocales++;
            }
        }
        System.out.println("Cantidad de vocales: "+cantidadvocales );
        System.out.println("---------------------------------");
    }
    
   /* Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
    ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".*/
    public void invertirFrase(Cadena c1)
    {
        for(int i=c1.getLongitud()-1;i>=0;i--)
        {
            System.out.print(c1.getFrase().substring(i,(i+1)));
        }
        System.out.println("");
        System.out.println("--------------------------------");
    }
    
    /*Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: */
    public void vecesRepetido(Cadena c1, String letra)
    {   int cantidadrepetido=0;
        for (int i=0;i<c1.getLongitud();i++)
        {
            if(c1.getFrase().substring(i,(i+1)).toLowerCase().equals(letra)){
                cantidadrepetido++;
            }
        }
        System.out.println("El caracter "+letra+" se repite "+cantidadrepetido+" veces");
        System.out.println("---------------------------------");
    }
    /*Método compararLongitud(String frase), deberá comparar la longitud de la frase que
    compone la clase con otra nueva frase ingresada por el usuario.*/
    public void compararLongitud(Cadena c1)
    {
        System.out.println("Ingrese una nueva frase");
        String nuevafrase=leer.next();
        if (c1.getLongitud()>nuevafrase.length())
            System.out.println("La frase es mas corta");
        else if(c1.getLongitud()<nuevafrase.length())
            System.out.println("La frase es mas larga");
        else 
            System.out.println("Las frases tienen la misma longitud");
    }
    /*Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
    una nueva frase ingresada por el usuario y mostrar la frase resultante.*/
    public void unirFrases(Cadena c1, String frase)
    {
        System.out.println("Las frases sean unidas");
        System.out.println(c1.getFrase().concat(frase));
        System.out.println(c1.getFrase().replace(" ","")+frase.replace(" ",""));
        System.out.println("-----------------------------------------");
    }
    
    /*Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
    frase resultante.*/
    public void reemplazar(Cadena c1, String letra)
    {
        System.out.println(c1.getFrase().replace("a",letra));
    }
    
    /*Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    ingresa el usuario y devuelve verdadero si la contiene y falso si no*/
    public void contiene(Cadena c1, String letra)
    {
        System.out.println("Contiene "+letra+"?: "+c1.getFrase().contains(letra));
    }
}   
