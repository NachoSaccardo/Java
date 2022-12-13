
package biblioteca.biblioteca.controladores;

import biblioteca.biblioteca.excepciones.MiException;
import biblioteca.biblioteca.servicios.AutorServicio;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/autor") //localhost:8080/autor
public class AutorControlador {
    
    @Autowired
    private AutorServicio autorServicio;
    //Creo una unica instancia (autowired) de autorServicio para poder usar sus metodos
    
    
    //Este metodo abre la vista que quiero utilizar
    @GetMapping("/registrar") //localhost:8080/autor/registrar  cuando entro a esta URL, va a traer el form
    public  String registrar(){
        return "autor_form.html";
    }
    
   
    //El parametro nombre se llama igual que la variable "name" del input del html
    @PostMapping("/registro")
    public String registro(@RequestParam String nombre)
    { 
        System.out.println("Nombre: "+nombre);
        //Este SOUT es solo de prueba, para ver si cuando envio el formulario, me envia el nombre ingresado y me lo imprime por consola de NetBeans
        
        //Deberia enviarle el dato nombre a AutorServicio para que, con el, ejecute el metodo crearAutor()
        //Dentro de crearAutro, tengo el metodo validar, que tira una excepcion, por lo que este metodo lo tengo que manejar mediante un try-catch
        try
        {
            System.out.println("Nombre: "+nombre);
            autorServicio.crearAutor(nombre);
            return "index.html";
       }
        catch (MiException ex)
        {
           //Si hay un error, me recarga el formulario y me imprime el error por consola
           Logger.getLogger(AutorControlador.class.getName()).log(Level.SEVERE, null, ex);
           return "autor_form.html";
        }
        

        //Al finalizar, si todo salio bien, vuelvo al index
    }
    
    
}
