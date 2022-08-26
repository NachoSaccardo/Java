/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;


public class serviciosAlumno 
{
    ArrayList<Alumno> listaAlumnos = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }
    
    
    public void fabricaAlumnos()
    {
        String bandera = "s";
        String salida = "s";            
        while(bandera.equals("s"))
        {
            salida = "s";
            Alumno alumno = new Alumno();
            System.out.println("Ingrese el nombre");
            alumno.setNombre(leer.next());

            while(!salida.toLowerCase().equals("n"))
            {
                System.out.println("Ingrese la nota");
                alumno.getNotas().add(leer.nextInt());
                System.out.println("Desea ingresar otra nota? (s/n)");
                salida=leer.next();
            }
            
            System.out.println(alumno);
            listaAlumnos.add(alumno);
            System.out.println("Desea crear otro alumno? (s/n)");
            bandera=leer.next();
        }
    }
    
    public void mostrarAlumnos()
    {
        for (Alumno listaAlumno : listaAlumnos) 
        {
            System.out.println(listaAlumno);            
        } 
    }
    
    /**
    Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
    final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
    del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
    promedio final, devuelto por el método y mostrado en el main.
     */
    public float notaFinal(Alumno alumno)
    {
        float promedio = (alumno.getNotas().stream().mapToInt(Integer::intValue).sum())/alumno.getNotas().size();
        return promedio;        
    }
    
   
}
