
package Servicios;

import Entidades.Equipo;
import Entidades.Jugador;
import java.util.ArrayList;

public class ServicioObjeto 
{
    public ArrayList<Equipo> listaequipos = new ArrayList();
    public ArrayList<Jugador> listajugadores = new ArrayList();
    
    public void agregarjugador(Equipo equipo, Jugador jugador)
    {
        equipo.getJugadores().add(jugador);
    }
}
