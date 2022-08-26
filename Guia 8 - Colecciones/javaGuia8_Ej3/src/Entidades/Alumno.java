/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author juans
 */
public class Alumno {
   
    private String Nombre;
    private ArrayList<Integer> notas = new ArrayList();

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "Nombre=" + Nombre + ", notas=" + notas + '}';
    }

    public Alumno(String Nombre) {
        this.Nombre = Nombre;
    }

    public Alumno() {
    }
    
    
}
