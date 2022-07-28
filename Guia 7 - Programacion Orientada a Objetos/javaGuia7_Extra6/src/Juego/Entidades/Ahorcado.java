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
        String pal = leer.next();
        
        //Asigno el largo al vector segun el largo de "pal"
        palabra = new String[pal.length()];
        aux2 = new String[pal.length()];
        Arrays.fill(aux2,"_");
        
        //Relleno el vector con cada letra
        for(int i=0;i<pal.length();i++)
        {
            palabra[i]=pal.substring(i, i+1);
            System.out.println(palabra[i]);
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
        System.out.println("Número de letras (encontradas, faltantes): ("+aciertos+","+((palabra.length)-aciertos)+")");
        for (int i=0;i<palabra.length;i++) 
        {
            System.out.print(" "+aux2[i]+" ");
        }
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
    
    /*Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.*/
    
    public void juego()
    {
        crearJuego();
        longitud();
        System.out.println("-----------------\n");
        do{
        System.out.println("Ingrese una letra para buscar en la palabra");
        String busqueda = leer.next();
        
        // Incluir un metodo para verificar si la letra ya habia sido elegida anteriormente
        
        buscarLetra(busqueda);
        encontrarLetra(busqueda);
        System.out.println("Oportunidades restantes:"+intentos);
        if(aciertos==palabra.length)
        {
            System.out.println("Has adivinado la palabra!!");
            break;
        }
        }while(aciertos<palabra.length&&intentos>0);
    }
    
}
