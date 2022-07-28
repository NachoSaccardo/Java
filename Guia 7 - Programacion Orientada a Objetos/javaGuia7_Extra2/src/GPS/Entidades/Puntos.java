
package GPS.Entidades;

import java.util.Scanner;

public class Puntos 
{
    private float x1;
    private float y1;
    private float x2;
    private float y2;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Puntos() 
    {
        System.out.println("Ingrese la coordenada en X del primer punto");
        x1=leer.nextFloat();
        System.out.println("Ingrese la coordenada en Y del primer punto");
        y1=leer.nextFloat();
        System.out.println("Ingrese la coordenada en X del segundo punto");
        x2=leer.nextFloat();
        System.out.println("Ingrese la coordenada en Y del segundo punto");
        y2=leer.nextFloat();
        
    }

    public Puntos(float x1, float y1, float x2, float y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public float getX1() {
        return x1;
    }

    public float getY1() {
        return y1;
    }

    public float getX2() {
        return x2;
    }

    public float getY2() {
        return y2;
    }

    @Override
    public String toString() {
        return "Puntos{" + "x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + '}';
    }
    
    public void calcularDistancia()
    {
        double distancia = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("La distancia es: "+distancia);
    }
}
