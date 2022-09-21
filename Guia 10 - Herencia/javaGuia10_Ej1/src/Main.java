
import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/*
 Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */

/**
 *
 * @author juans
 */
public class Main {

    public static void main(String[] args) {
       
        Animal perro1 = new Perro("Pepe", "Carnivoro", 14, "Doberman");
        perro1.Alimentarse();
        
        Animal perro2 = new Perro("Coco", "Croquetas", 10, "Chihuahua");
        perro2.Alimentarse();
        
        Animal gato1 = new Gato("Lola", "Pescado", 5, "Persa");
        gato1.Alimentarse();
        
        Animal caballo1 = new Caballo("Tiro Al Blanco", "Alfalfa", 22, "Caballo");
        caballo1.Alimentarse();
        
        
        System.out.println(perro1);
        System.out.println(perro2);
        System.out.println(gato1);
        System.out.println(caballo1);
       
                
    }
    
}
