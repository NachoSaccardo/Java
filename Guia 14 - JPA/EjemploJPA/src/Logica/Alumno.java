package Logica;

import java.util.Calendar;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Alumno {
    
    @Id
    private String dni;
    
    @Basic
    private String nombre;
    private String apellido;

    @Temporal(TemporalType.DATE)
    private Calendar fechaNac;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String dni, Calendar fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Calendar getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Calendar fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", fechaNac=" + fechaNac + '}';
    }
   
}
