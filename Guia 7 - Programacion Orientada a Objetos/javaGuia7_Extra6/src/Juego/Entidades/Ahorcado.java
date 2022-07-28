/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego.Entidades;

import java.util.Arrays;
import java.util.Scanner;

/**
 * la cual deberá contener como
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.
 * @author juans
 */
public class Ahorcado 
{
    private String palabra[];
    private int aciertos;
    private int intentos;
    
    //Este lo voy a usar para ir imprimiendo la palabra a medida que la va adivinando
    private String aux2[];
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado(String[] palabra, int aciertos, int intentos) {
        this.palabra = palabra;
        this.aciertos = aciertos;
        this.intentos = intentos;
    }
    public Ahorcado() {
    }
    public String[] getPalabra() {
        return palabra;
    }
    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }
    public int getAciertos() {
        return aciertos;
    }
    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }
    public int getintentos() {
        return intentos;
    }
    public void setintentos(int intentos) {
        this.intentos = intentos;
    }

   public void imprimir() 
   {    
       for (int i=0;i<palabra.length;i++)
       {
            System.out.print(palabra[i]);
       }
       for (int i=0;i<palabra.length;i++)
       {
            System.out.print(aux2[i]);
       }
       
        System.out.println("Ahorcado{" + "palabra=" + palabra + ", aciertos=" + aciertos + ", intentos=" + intentos + ", aux2=" + aux2 + '}');
   }
    
    
    /**
     *  Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
valor que ingresó el usuario y encontradas en 0.
     */
    public void crearJuego()
    {
        System.out.println("Ingrese la palabra a adivinar");
        String pal = leer.next().toLowerCase();
        
        //Asigno el largo al vector segun el largo de "pal"
        palabra = new String[pal.length()];
        
        //Le asigno el mismo largo al vector aux2, y lo lleno con guiones bajos. 
        //Cuando el usuario adivine una letra, reemplazo los guiones con la letra
        aux2 = new String[pal.length()];
        Arrays.fill(aux2,"_");
        
        //Relleno el vector con cada letra
        for(int i=0;i<pal.length();i++)
        {
            palabra[i]=pal.substring(i, i+1);
        }
        
        //Imprimo cada posicion para chequear
        for (int i=0;i<pal.length();i++) 
        {
            System.out.print("{"+palabra[i]+"}");             
        }
        System.out.println("");
        System.out.println("Ingrese la cantidad de oportunidades para adivinar la palabra");
        intentos=leer.nextInt();
        aciertos=0;
        System.out.println("-----------------\n");
        
    }
/*• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.*/
    public void longitud()
    {
        System.out.println("El largo de la palabra es: "+palabra.length);
    }
    
    /*Método buscar(letra): este método recibe una letra dada por el usuario y busca si la
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.*/
    
    public void buscarLetra(String busqueda)
    {
        String aux[]=Arrays.copyOf(palabra, palabra.length);
        Arrays.sort(aux);
        int pivot=Arrays.binarySearch(aux,busqueda);
                
        if(pivot>=0)
            System.out.println("La letra esta contenida en la palabra");
        else{
            System.out.println("La letra no esta en la palabra");
            intentos--;
            }
    }
    
    /*• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.*/
    public boolean encontrarLetra(String busqueda)
    {   
        boolean check=false;
                
        for(int i=0;i<palabra.length;i++)
        {
            if(palabra[i].equals(busqueda))
            {   aux2[i]=palabra[i];
                aciertos++;
            }
        }
        System.out.println("Número de letras (encontradas, totales): ("+aciertos+","+palabra.length+")");
        
        // Aca voy imprimiendo aux2, con las letras adivinadas dentro de la palabra
        for (int i=0;i<palabra.length;i++)
        {
            System.out.print(" "+aux2[i]+" ");
        }
        
        //Con esto busco si la letra ingresada esta en la palabra y devuelvo true si está
        String aux[]=Arrays.copyOf(palabra, palabra.length);
        Arrays.sort(aux);
        int pivot=Arrays.binarySearch(aux,busqueda);
        if(pivot>=0)
        check = true;
        return check;
    }
    
    //Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
    public void intentos()
    {   
        System.out.println("Intentos restantes: "+intentos);
    }
    
    //Con este metodo reviso si la letra que el usuario ingresó ya la tengo como 
    //"revelada" en el vector aux2, y si esta, devuelvo true.    
    public boolean letraRepetida(String busqueda)
    {   
        boolean repetida=false;
        for (int i=0;i<palabra.length;i++)
        {  
            if(aux2[i].equals(busqueda))
                repetida=true;
        }    
        return repetida;
    }
    
    
    /*Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.*/
    
    public void juego()
    {
        crearJuego();
        longitud();
        
        do{
        System.out.println("Ingrese una letra para buscar en la palabra");
        String busqueda = leer.next().toLowerCase();
                
        // Aca verifico si ya adivine esa letra, a traves del metodo letraRepetida.
        // Si ya lo habia adivinado, le pido otra.
        while (letraRepetida(busqueda))
        {
            System.out.println("Ya ha adivinado esa letra. Elija otra: ");
            busqueda=leer.next();
        }
                
        buscarLetra(busqueda);
        encontrarLetra(busqueda);
        
        System.out.println("\nOportunidades restantes:"+intentos+"");
        System.out.println("-----------------\n");
        
        //Aca comparo cantidad de aciertos con el largo de la palabra.
        //Si son iguales, significa que ya adivine todas las letras
        if(aciertos==palabra.length)
        {
            System.out.println("Has adivinado la palabra!!\n");
            break;
        }
        }while(aciertos<palabra.length&&intentos>0);
    }
    
   
}
