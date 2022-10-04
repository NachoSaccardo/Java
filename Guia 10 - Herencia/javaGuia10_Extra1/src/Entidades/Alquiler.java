/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Calendar;

/**
 *
 * @author juans
 */
public class Alquiler 
{
    private Usuario usuario;
    private Amarre numeroAmarre;
    private Calendar fechaAlquiler;
    private Calendar fechaDevolucion;
    private Barco barco; 
    private Integer numeroContrato;

    public Alquiler() {
    }

    public Alquiler(Usuario usuario, Barco barco, Amarre numeroAmarre, Calendar fechaAlquiler, Calendar fechaDevolucion) {
        this.usuario=usuario;
        this.numeroAmarre = numeroAmarre;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.barco = barco;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Integer getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(Integer numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Amarre getNumeroAmarre() {
        return numeroAmarre;
    }

    public void setNumeroAmarre(Amarre numeroAmarre) {
        this.numeroAmarre = numeroAmarre;
    }

    public Calendar getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Calendar fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Calendar getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Calendar fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco numeroBarco) {
        this.barco = numeroBarco;
    }

    @Override
    public String toString() {
        return  "Numero de Contrato: " + numeroContrato + 
                "\nUsuario: "+usuario.getNombre()+" "+usuario.getApellido()+ 
                "\nAmarre: " + numeroAmarre.getNumero()+
                "\nFecha de Alquiler: " + fechaAlquiler.getTime() + 
                "\nFecha de Devolucion: " + fechaDevolucion.getTime() + 
                "\nBarco: " + barco.toString() +'}';
    }

    
    
    
    
          
}
