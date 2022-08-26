/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Comparator;

/**

 */
public class Pais {
    private String nombre;
    private Double superficie;
    private String idioma;
    private Double habitantes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Double superficie) {
        this.superficie = superficie;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Double getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(Double habitantes) {
        this.habitantes = habitantes;
    }

    public Pais(String nombre, Double superficie, String idioma, Double habitantes) {
        this.nombre = nombre;
        this.superficie = superficie;
        this.idioma = idioma;
        this.habitantes = habitantes;
    }

    public Pais() {
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", superficie=" + superficie + ", idioma=" + idioma + ", habitantes=" + habitantes + '}';
    }
    
  
}
