
package Entidades;

import java.util.ArrayList;


public class Equipo 
{
    private String nombre;
    private ArrayList<Jugador> jugadores = new ArrayList();

    public Equipo() {
    }

    public Equipo(String nombre, ArrayList<Jugador> jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "\nEquipo{" + "nombre=" + nombre + ", jugadores=" + jugadores + '}';
    }
    
    
}
