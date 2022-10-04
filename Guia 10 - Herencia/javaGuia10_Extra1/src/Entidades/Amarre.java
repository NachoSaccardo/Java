/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Map;



public class Amarre 
{
    private Integer numero;
    private Barco barcoAmarrado;
    private String status = "Libre";

    public Amarre() {
    }
    
    public Amarre(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        if(numero>0)
            return numero;
        else
            return 0;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Barco getBarcoAmarrado() {
        return barcoAmarrado;
    }

    public void setBarcoAmarrado(Barco barcoAmarrado) {
        this.barcoAmarrado = barcoAmarrado;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
   
    @Override
    public String toString() {
        return "Amarre{" + "Numero de Amarre: " + numero + ", Matricula Barco Amarrado: " + barcoAmarrado.getMatricula() + "Estado: "+status+'}';
    }
    
    
    
}
