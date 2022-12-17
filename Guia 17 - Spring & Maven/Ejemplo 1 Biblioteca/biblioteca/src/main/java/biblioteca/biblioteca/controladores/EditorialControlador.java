package biblioteca.biblioteca.controladores;


import biblioteca.biblioteca.excepciones.MiException;

import biblioteca.biblioteca.servicios.EditorialServicio;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/editorial") //localhost:8080/autor
public class EditorialControlador {
    
    @Autowired
    private EditorialServicio editorialServicio;
    //Creo una unica instancia (autowired) de editorialServicio para poder usar sus metodos
    
    
    //Este metodo abre la vista que quiero utilizar
    @GetMapping("/registrar") //localhost:8080/editorial/registrar  cuando entro a esta URL, va a traer el form editorial_form.html
    public  String registrar(){
        return "editorial_form.html";
    }

    //El parametro nombre se llama igual que la variable "name" del input del html
    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, ModelMap modelo)
    {
    //Deberia enviarle el dato nombre a editorialServicio para que, con el, ejecute el metodo crearEditorial()
    //Dentro de crearEditorial, tengo el metodo validar, que tira una excepcion, por lo que este metodo "crear" lo 
    //tengo que manejar mediante un try-catch
        try 
        {
            editorialServicio.crearEditorial(nombre);
            System.out.println("Prueba OK");
            //imprimo el mensaje que quiero en pantalla en caso de exito. El exito o error lo voy a determinar en el html con Thymeleaf
            modelo.put("exito", "La Editorial fue registrado correctamente!");
        } 
        catch (MiException ex) 
        {
           //Si hay un error, me recarga el formulario y me imprime el error por consola. Ademas
           //envia un mensaje por pantalla

            Logger.getLogger(AutorControlador.class.getName()).log(Level.SEVERE, null, ex);
            //imprimo el mensaje de la excepcion que gnere en el metodo de validacion. Este modelo llave(error)-valor(ex.getMessage()), lo ejecuto
            //desde el html con Thymeleaf
            modelo.put("error", ex.getMessage());
            return "editorial_form.html";
        }
        //Al finalizar, si todo salio bien, vuelvo al index
        return "index.html";        
    }
}
    