
package biblioteca.biblioteca.controladores;

import biblioteca.biblioteca.entidades.Autor;
import biblioteca.biblioteca.entidades.Libro;
import biblioteca.biblioteca.excepciones.MiException;
import biblioteca.biblioteca.servicios.AutorServicio;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public  String registrar()
    {
        return "autor_form.html";
    }
    
    //El parametro nombre se llama igual que la variable "name" del input del html
    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, ModelMap modelo)
    {
        //Deberia enviarle el dato nombre a autorServicio para que, con el, ejecute el metodo crearAutor()
//      //Dentro de crearAutor, tengo el metodo validar, que tira una excepcion, por lo que este metodo lo tengo que manejar mediante un try-catch
        try 
        {
            autorServicio.crearAutor(nombre);

            //imprimo el mensaje que quiero en pantalla en caso de exito. El exito o error lo voy a determinar en el html con Thymeleaf
            modelo.put("exito", "El Autor fue registrado correctamente!"); 

        } 
        catch (MiException ex) 
        {
            //Si hay un error, me recarga el formulario y me imprime el error por consola
            Logger.getLogger(AutorControlador.class.getName()).log(Level.SEVERE, null, ex);  

            //imprimo el mensaje de la excepcion que gnere en el metodo de validacion. Este modelo llave(error)-valor(ex.getMessage()), lo ejecuto
            //desde el html con Thymeleaf
            modelo.put("error", ex.getMessage());         
            return "autor_form.html";
        }
        return "index.html";        
    }
    
    @GetMapping("/lista")
    public String listar(ModelMap modelo)
    {
        List <Autor> autores = autorServicio.listarAutores();
        modelo.addAttribute("autores", autores);
        modelo.put("standby", "");
        return "autor_list.html";
    }
    
    
    /*Este GetMapping va a buscar, estando parado en la vista autor_lista.html, el id del autor que quiero modificar, 
    y se lo va a pasar al metodo autor/modificar que ejecuta la vista autor_modificar.html. El HTML va a buscar con ese idAutor y va a cargar
    un formulario para modificarlo*/
    @GetMapping("/modificar/{id}")  
    //Necesito pasarle el idAutor que quiero modificar. Esto lo hago a traves de un meto que se llama Path Variable
    // que indica que ese valor viaja a traves de un fragmento de la URL. Esta variable es el {id}. Le digo que la variable de tipo String "id" va
    //a viajar a traves de la URL
    public String modificar(@PathVariable String id, ModelMap modelo)
    {
        //Primero tengo que buscar el autor que corresponde a ese ID. Uso el metodo getOne() de la clase AutorServicio
        //ese valor lo inyecto a traves del modelo
        modelo.put("autor", autorServicio.getOne(id));
        
        return "autor_modificar.html";
    }
    
    /*Este metodo va a tomar el id que recibio del @GetMapping, mas el nombre que reciba del input del form de autor_modificar.html, y
    con esos dos valores, va a correr el metodo autor.Servicio.modificarAutor. Si no tira excepcion, me devuelve a la lista.*/
    @PostMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, String nombre, ModelMap modelo)
    {
        try
        {
            autorServicio.modificarAutor(id, nombre);
            modelo.put("exito", "Se ha modificado correctamente el Autor");
            return "redirect:../lista"; //me redirige a el HTML lista pero con los valores actualizados
        }
        catch(MiException ex)
        {
            modelo.put("error", ex.getMessage());
            return "autor_modificar.html";
        }
    }
    
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable String id, ModelMap modelo)
    {
        //Primero tengo que buscar el autor que corresponde a ese ID. Uso el metodo getOne() de la clase AutorServicio
        //ese valor lo inyecto a traves del modelo
//        modelo.put("autor", autorServicio.getOne(id));
//        autorServicio.eliminarAutor(id);
//        modelo.put("exito", "Se ha modificado correctamente el Autor");
//        return "redirect:../lista";
        modelo.put("autor", autorServicio.getOne(id));
        
        return "autor_eliminar.html";
    }
    
    @PostMapping("/eliminar/{id}")
    public String eliminarAutor(@PathVariable String id, ModelMap modelo)
    {
        //Primero tengo que buscar el autor que corresponde a ese ID. Uso el metodo getOne() de la clase AutorServicio
        //ese valor lo inyecto a traves del modelo
        modelo.put("autor", autorServicio.getOne(id));
        autorServicio.eliminarAutor(id);
        modelo.put("exito", "Se ha modificado correctamente el Autor");
        return "redirect:../lista";
    }
    

}
