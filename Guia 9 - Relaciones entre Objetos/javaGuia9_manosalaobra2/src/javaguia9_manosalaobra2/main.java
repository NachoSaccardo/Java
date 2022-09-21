/*
 Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package javaguia9_manosalaobra2;

import Entidades.Equipo;
import Entidades.Jugador;
import Servicios.ServicioObjeto;
import java.util.Scanner;


public class main {

  
    public static void main(String[] args) 
    {
        ServicioObjeto SC = new ServicioObjeto();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
        //Creo un equipo
        Equipo equipo1 = new Equipo();
                
        //seteo nombre del equipo
        equipo1.setNombre("Los Borbotones");
        
        //Agrego ese equipo a la lista de equipos
        SC.listaequipos.add(equipo1);
          
        //creo el primer jugador
        System.out.println("Player 1");
        System.out.println("---------------");
        Jugador player1 = new Jugador();
        
        System.out.println("Ingrese el nombre del jugador");
        player1.setNombre(leer.next());
        System.out.println("Ingrese el apellido");
        player1.setApellido(leer.next());
        System.out.println("Ingrese el numero de camiseta");
        player1.setNumero(leer.nextInt());
        System.out.println("Ingrese la posicion");
        player1.setPosicion(leer.next());
        player1.setEquipo(equipo1);
        
        SC.listajugadores.add(player1);
        
        //lo añado a la lista
        equipo1.getJugadores().add(player1);
        
        
        //creo el segundo jugador
        System.out.println("Player 2");
        System.out.println("---------------");
        Jugador player2 = new Jugador();
        System.out.println("Ingrese el nombre del jugador");
        player2.setNombre(leer.next());
        System.out.println("Ingrese el apellido");
        player2.setApellido(leer.next());
        System.out.println("Ingrese el numero de camiseta");
        player2.setNumero(leer.nextInt());
        System.out.println("Ingrese la posicion");
        player2.setPosicion(leer.next());
        player2.setEquipo(equipo1);
        
        SC.listajugadores.add(player2);
        
        //agrego el segundo jugador a la lista
        equipo1.getJugadores().add(player2);

        //muestro el equipo, que mostrara a su vez a todos los jugadores
        System.out.println(equipo1.toString());
        
                        
        //Creo el segundo equipo
        Equipo equipo2 = new Equipo();
        
        //seteo nombre del equipo
        equipo2.setNombre("Los Isotopos");
        
        //Agrego ese equipo a la lista de equipos
        SC.listaequipos.add(equipo2);
        
        //creo el primer jugador
        System.out.println("Player 3");
        System.out.println("---------------");
        Jugador player3 = new Jugador();
        
        //lo añado a la lista de ese equipo
        equipo2.getJugadores().add(player3);
        
        //Le asigno los valores a los atributos
        System.out.println("Ingrese el nombre del jugador");
        player3.setNombre(leer.next());
        System.out.println("Ingrese el apellido");
        player3.setApellido(leer.next());
        System.out.println("Ingrese el numero de camiseta");
        player3.setNumero(leer.nextInt());
        System.out.println("Ingrese la posicion");
        player3.setPosicion(leer.next());
        player3.setEquipo(equipo2);
        SC.listajugadores.add(player3);
        
        //Creo el segundo jugador
        System.out.println("Player 4");
        System.out.println("---------------");
        Jugador player4 = new Jugador();
        
        
        //lo añado a la lista maestra de jugadores
         SC.listajugadores.add(player4);
         
        //Le asigno los valores a los atributos
        System.out.println("Ingrese el nombre del jugador");
        player4.setNombre(leer.next());
        System.out.println("Ingrese el apellido");
        player4.setApellido(leer.next());
        System.out.println("Ingrese el numero de camiseta");
        player4.setNumero(leer.nextInt());
        System.out.println("Ingrese la posicion");
        player4.setPosicion(leer.next());
        player4.setEquipo(equipo2);
       
        //agrego el segundo jugador a la lista del equipo
        equipo2.getJugadores().add(player4);
          
        //muestro el equipo, que mostrara a su vez a todos los jugadores
        System.out.println("Imprimo por toString");
        System.out.println(equipo2.toString());
        
        //pruebo imprimir el vector
        System.out.println("Imprimo la lista de equipos");
        for (Equipo aux : SC.listaequipos) 
        {
            System.out.println(aux.toString());
        }
        
        //elimino un jugador
        System.out.println("Ingrese el nombre del equipo para eliminar un jugador");
        String equipoaeliminar = leer.next();
        System.out.println("Ingrese el nombre del jugador a eliminar");
        String jugadoraeliminar = leer.next();
        
        for (Equipo aux : SC.listaequipos) 
        {
            if(aux.getNombre().equals(equipoaeliminar))
            {
                for (Jugador aux2 : aux.getJugadores()) 
                {
                    if(aux2.getNombre().equals(jugadoraeliminar))
                        aux.getJugadores().remove(aux2);
                    //aux2.finalize();
                }
            }
            
        }
        
        //pruebo imprimir el vector
        System.out.println("Imprimo la lista de equipos con sus jugadores");
        for (Equipo aux : SC.listaequipos) 
        {
            System.out.println(aux.toString());
        }

   
    }
    
}
