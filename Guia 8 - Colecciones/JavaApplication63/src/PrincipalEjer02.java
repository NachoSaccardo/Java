/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se 
le pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro
en la lista. Si el perro está en la lista, se eliminará el perro que ingresó el
usuario y se mostrará la lista ordenada. Si el perro no se encuentra en la
lista, se le informará al usuario y se mostrará la lista ordenada.
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class PrincipalEjer02 {

  
    public static void main(String[] args) {
        // copia del ejer 01
        ArrayList<String> razasPerro = new ArrayList();
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        char opc;
        do {  
            System.out.println("Ingrese una raza de perro");
            String raza = scan.next();
            razasPerro.add(raza);
            System.out.println("Desea ingresar otro perro ? s/n");
            opc = scan.next().charAt(0);
            
        } while (opc != 'n');
        System.out.println("La lista de razas de perros es: ");
        for (String string : razasPerro) {
            System.out.println(string);
        }
        
        // Aca empieza el ejercicio 2
        System.out.println("Ingrese la raza que desea eliminar: ");
        String elimRaza = scan.next();
        int cont= 0;
        int largo= razasPerro.size();
        Iterator <String> it = razasPerro.iterator();
        while (it.hasNext()) {
            if (it.next().equals(elimRaza)) { //borro la raza elegida
                it.remove();    
            }else{ cont++;
                   System.out.println(cont);
            }
        }
        if (cont == largo) {
            System.out.println("La raza no se encuentra en la lista");
        }
        Collections.sort(razasPerro);
        System.out.println("La lista final de razas es: ");
        for (String string : razasPerro) {
                System.out.println(string);
        }
    }   
}
