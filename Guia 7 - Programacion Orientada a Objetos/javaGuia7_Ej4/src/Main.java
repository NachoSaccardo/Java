
import Entidades.Rectangulo;


public class Main {

    
    public static void main(String[] args) {
       Rectangulo r1 = new Rectangulo();
        System.out.println(r1.calcArea());
        System.out.println(r1.calcPerimetro());
        r1.printAsteriscos();
        r1.printAsteriscosVacio();
    }
        
}
