/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.

 */
package Entidades;

import java.util.Scanner;


public class Electrodomestico 
{
    protected Double precio;
    protected String color;
    protected Character consumo;
    protected Integer peso;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
/*Los métodos a implementar son: Métodos getters y setters de todos los atributos.*/
    
    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, Character consumo, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumo() {
        return consumo;
    }

    public void setConsumo(Character consumo) {
        this.consumo = consumo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
    
    /*• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.*/
    
    private void comprobarConsumo(Character letra)
    {
        String aux = letra.toString().toUpperCase();
        letra=aux.charAt(0);
        
        if(letra=='A'||letra=='B'||letra=='C'||letra=='D'||letra=='E'||letra=='F')
        {
            
        }
        else
        {
            setConsumo('F');
        }
    }
    
/*• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
13*/

    private void comprobarColor(String color)
    {
       if(color.toLowerCase().equals("blanco")||color.toLowerCase().equals("negro")||color.toLowerCase().equals("rojo")||color.toLowerCase().equals("azul")||color.toLowerCase().equals("gris"))
       {          
       }
       else
       {
           setColor("BLANCO");
       }
    }
 
/*• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.*/
    public void crearElectrodomestico()
    {
        System.out.println("Creando nuevo: "+ getClass().getSimpleName());
        setPrecio(1000d);
        System.out.println("Ingrese el color");
        setColor(leer.next().toUpperCase());
        comprobarColor(getColor());
        System.out.println("Ingrese el consumo (A-F)");
        setConsumo(leer.next().charAt(0));
        comprobarConsumo(getConsumo());
        System.out.println("Ingrese el peso");
        setPeso(leer.nextInt());
    }
    
    /* Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
    LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100
PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000*/
    public void precioFinalLargo()
    {
        switch(consumo)
        {
            case 'A':
                precio=precio+1000;
                break;
            case 'B':
                precio=precio+800;
                break;
            case 'C':
                precio=precio+600;
                break;
            case 'D':
                precio=precio+500;
                break;
            case 'E':
                precio=precio+300;
                break;
            case 'F':
                precio=precio+100;
                break;
        }
        if(peso>=1&&peso<=19)
        {
            precio=precio+100;
        }
        if(peso>=20&&peso<=49)
        {
            precio=precio+500;
        }
        if(peso>=50&&peso<=79)
        {
            precio=precio+800;
        }
        if(peso>80)
        {
            precio=precio+1000;
        }
        System.out.println("Precio Final: "+precio);
    }
    
    public void precioFinal()
    {
        precio=precio+(consumo=='A' ? 1000 : 0)+
                (consumo=='B' ? 800 : 0)+
                (consumo=='C' ? 600 : 0)+
                (consumo=='D' ? 500 : 0)+
                (consumo=='E' ? 300 : 0)+
                (consumo=='F' ? 100 : 0)+
                (peso>=1&&peso<=19 ? 100 : 0)+
                (peso>=20&&peso<=49 ? 500 : 0)+
                (peso>=50&&peso<=79 ? 800 : 0)+
                (peso>=80 ? 1000 : 0);
         System.out.println("Precio Base: "+precio);
    }
}

