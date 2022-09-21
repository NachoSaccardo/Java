/*
Perro, que tendrá como atributos: nombre, raza, edad y tamaño
 */
package Entidades;

import Enums.RazaPerro;
import Enums.TamanoPerro;

public class Perro 
{
    private String nombre;
    private Integer edad;
    private TamanoPerro tamano;
    private RazaPerro raza;

    public Perro(String nombre, Integer edad, TamanoPerro tamano, RazaPerro raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.tamano = tamano;
        this.raza = raza;
    }

    public Perro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public TamanoPerro getTamano() {
        return tamano;
    }

    public void setTamano(TamanoPerro tamano) {
        this.tamano = tamano;
    }

    public RazaPerro getRaza() {
        return raza;
    }

    public void setRaza(RazaPerro raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", edad=" + edad + ", tamano=" + tamano + ", raza=" + raza + '}';
    }

    
}
