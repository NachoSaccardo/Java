
package PersonApp.Entidades;

import java.util.Date;
import java.util.Scanner;


public class Persona 
{/*/*. Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:*/
    private Date fechaNacimiento;
    private String nombre;
   

    public Persona() {
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre + '}';
    }
    
}
