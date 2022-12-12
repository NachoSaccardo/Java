
package biblioteca.biblioteca.excepciones;


//Creo esta clase MiException solamente para distinguir una excepcion que yo le intruduje a mi programa mediante codigo, de un bug propio del programa
public class MiException extends Exception{

    //Unicamente tiene un constructor que le pasa el mensaje que yo le intruduzca cuando la cree a la clase Exception (padre)
    public MiException(String msg){
        super(msg);
    }
    
}
