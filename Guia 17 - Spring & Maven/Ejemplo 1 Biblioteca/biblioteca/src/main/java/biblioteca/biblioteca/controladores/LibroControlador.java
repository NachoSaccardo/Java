/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.biblioteca.controladores;

import biblioteca.biblioteca.entidades.Autor;
import biblioteca.biblioteca.entidades.Editorial;
import biblioteca.biblioteca.entidades.Libro;
import biblioteca.biblioteca.excepciones.MiException;
import biblioteca.biblioteca.servicios.AutorServicio;
import biblioteca.biblioteca.servicios.EditorialServicio;
import biblioteca.biblioteca.servicios.LibroServicio;
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
@RequestMapping("/libro") //localhost:8080/libro
public class LibroControlador {
    
    @Autowired
    private LibroServicio libroServicio;
    @Autowired
    private EditorialServicio editorialServicio;
    @Autowired
    private AutorServicio autorServicio;
    
    @GetMapping("/registrar") //localhost:8080/libro/registrar
    public String registrar(ModelMap modelo) // Le creo un ModelMap para poder usar Thymeleaf con llave-valor en el html libro_form.html
    {
        //Creo dos listas, una de objetos Autor y otra de objetos Editorial, usando los metodos de las
        //clases de Servicio. Estos se los voy a pasar al HTML para que pueda mostrar por pantalla los autores
        //y las editoriales en un menu desplegable (<select>)
        List<Autor> autores = autorServicio.listarAutores();
        List<Editorial> editoriales = editorialServicio.listarEditoriales();
        
        modelo.addAttribute("autores", autores); //Lo paso al modelo bajo la llave autores
        modelo.addAttribute("editoriales", editoriales); //Lo paso al modelo bajo la llave editoriales
                
        return "libro_form.html";
    }
    
    @PostMapping("/registro")
    public String registro(@RequestParam(required=false) Long isbn, @RequestParam String titulo, 
            @RequestParam(required=false) Integer ejemplares, @RequestParam String idAutor, 
            @RequestParam String idEditorial, ModelMap modelo) //ModelMap lo vamos a usar para inyectar mensajes
    //El required=false, es para que por mas que vengan nulos, ingrese igual a CrearLibro, porque sino me tira una excepcion antes de ingresar al metodo de validacion
    {
        try{
           libroServicio.crearLibro(isbn, titulo, ejemplares, idAutor, idEditorial);
            modelo.put("exito", "El Libro fue cargado correctamente");
            return "index.html";
            //si todo sale bien, retornamos al index
        }
        catch(MiException ex)
        {
            System.out.println("Algo se rompio en el catch");
            Logger.getLogger(LibroControlador.class.getName()).log(Level.SEVERE, null, ex);
            
            System.out.println(ex.getMessage());
            modelo.put("error", ex.getMessage()); //imprimo el mensaje de la excepcion que gnere en el metodo de validacion
            return "libro_form.html";
        }
    }
    
    @GetMapping("/lista")
    public String listar(ModelMap modelo)
    {
        List <Libro> libros = libroServicio.listarLibros();
        modelo.addAttribute("libros", libros);
        return "libro_list.html";
    }
    

}

