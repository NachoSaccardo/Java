package Entidades;

import java.util.Date;

public class Persona 
{
    private Date nacimiento;
    public String nombre;
    public String apellido;
    private String pais;
    private String provincia;
    private String genero;
    
    /** Esto se hace tipeando "/** y dando ENTER"
     * Constructor por nombre y apellido
     * @param nombre
     * @param apellido 
     */
    public Persona(String nombre,String apellido)
    {
        this.nombre=nombre;
        this.apellido=apellido;
    }

    public Persona(Date nacimiento, String nombre, String apellido, String pais, String provincia, String genero) {
        this.nacimiento = nacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.provincia = provincia;
        this.genero = genero;
    }
    public Date getNacimiento() {
        return this.nacimiento;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public String getPais() {
        return this.pais;
    }
    public String getProvincia() {
        return this.provincia;
    }
    public String getGenero() {
        return this.genero;
    }
    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" + "nacimiento=" + nacimiento + ", nombre=" + nombre + ", apellido=" + apellido + ", pais=" + pais + ", provincia=" + provincia + ", genero=" + genero + '}';
    }

    
}