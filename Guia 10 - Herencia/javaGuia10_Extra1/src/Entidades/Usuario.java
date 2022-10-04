/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author juans
 */
public class Usuario 
{
    private String nombre;
    private String apellido; 
    private Integer DNI; 
    private ArrayList<Barco> barcosUsuario = new ArrayList();

    public Usuario(String nombre, String apellido, Integer DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }

    public Usuario() {
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

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public ArrayList<Barco> getBarcosUsuario() {
        return barcosUsuario;
    }

    public void setBarcosUsuario(ArrayList<Barco> barcosUsuario) {
        this.barcosUsuario = barcosUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Nombre: " + nombre + ", Apellido: " + apellido + ", DNI: " + DNI + ", Barcos: " + barcosUsuario + '}';
    }
    
    
}
