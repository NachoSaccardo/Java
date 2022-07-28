
package javaguia7_ej10;

import java.text.DecimalFormat;
import java.util.Arrays;



/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.*/

public class Main {

    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("#.##");

        float vector1[] = new float[50];
        float vector2[] = new float[20];
        
        for(int i=0; i<50;i++)
        {
            vector1[i]=((float) Math.random()*10);
            System.out.print("["+formato.format(vector1[i])+"];");
        }
        
        
        
        System.out.println(Arrays.toString(vector1));
       
        Arrays.sort(vector1);
        System.out.println(Arrays.toString(vector1));
        
        double a = 0.5;
        System.out.println(a);
        for(int i=0;i<10;i++)
        {
            vector2[i]=vector1[i];
        }
        
        Arrays.fill(vector2, 10, 20, (float)0.5);
        System.out.println(Arrays.toString(vector2));
        
    }
    
}
