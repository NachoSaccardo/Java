package FitApp.Servicios;

import FitApp.Entidades.Persona;
import java.util.Scanner;

public class ServiciosPersona {

    Persona[] Lista = new Persona[99];
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int indice = 0;

        
    public Persona crearPersona() {
        int pivot = 0;
        String genero;
        System.out.println("Ingres el nombre");
        String nombre = leer.next();
        System.out.println("Ingrese la edad en años");
        int edad = leer.nextInt();
        System.out.println("Ingrese el genero: M: Masculino. F: Femenino. O: Otro");
        genero = leer.next();
        do {
            switch (genero) {
                case "M":
                    pivot = 1;
                    break;
                case "F":
                    pivot = 1;
                    break;
                case "O":
                    pivot = 1;
                    break;
                default:
                    System.out.println("Ingrese un genero valido");
                    genero = leer.next();
                    break;
            }
        } while (pivot != 1);
        System.out.println("Ingrese el peso en kilos");
        int peso = leer.nextInt();
        System.out.println("Ingrese la altura en centimetros");
        int altura = leer.nextInt();
        Persona p1 = new Persona(nombre, edad, genero, peso, altura, indice);
        Lista[indice] = p1;
        System.out.println("Creada la siguiente persona: ");
        System.out.println(p1);
        indice++;
        return p1;

    }

    /* Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
    kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
    que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
    fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
    está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
    fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
    función devuelve un 1*/
    public int calcularIMC(int indice) {

        double a = Lista[indice].getPeso() / ((Lista[indice].getAltura() / 100)*(Lista[indice].getAltura() / 100));
        System.out.println("a= "+a);
        if (a < 20) {
            Lista[indice].setIMC(-1);
        }else if(a > 25) {
            Lista[indice].setIMC(1);
        }else{
            Lista[indice].setIMC(0);
        }
        return Lista[indice].getIMC();
        }

    public boolean esMayorDeEdad(int indice) {
        if (Lista[indice].getEdad() >= 18) {
            Lista[indice].setMayor(true);
        } else {
            Lista[indice].setMayor(false);
        }
        return Lista[indice].isMayor();
    }

    public Persona getPersona(int indice) {
        return Lista[indice];
    }

}
