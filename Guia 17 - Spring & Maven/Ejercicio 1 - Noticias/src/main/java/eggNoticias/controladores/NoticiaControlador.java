/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggNoticias.controladores;

import eggNoticias.entidades.Noticia;
import eggNoticias.excepciones.MiException;
import eggNoticias.servicios.NoticiaServicio;
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
@RequestMapping("/noticia")
public class NoticiaControlador 
{
    @Autowired
    NoticiaServicio noticiaServicio;
    
    @GetMapping("/visualizar")
    public String visualizar(@RequestParam String id, ModelMap modelo)
    {
        Noticia noticia = noticiaServicio.getOne(id);
        modelo.addAttribute("noticia", noticia);
        return "noticia.html";
    }
    
    @GetMapping("/registrar")
    public String registrar(ModelMap modelo)
    {
        return "noticia_form.html";
    }
    
    @PostMapping("/registro")
    public String registro(@RequestParam(required=false) String titulo, @RequestParam(required=false) String cuerpo, ModelMap modelo)
    {
        try
        {
            noticiaServicio.crearNoticia(titulo, cuerpo);
            modelo.put("exito", "La noticia fue cargado correctamente");
            
            return "redirect:/noticia/panelAdmin";
   
        }
        catch(MiException ex)
        {
            
            Logger.getLogger(NoticiaControlador.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            modelo.put("error", ex.getMessage()); 
            return "noticia_form.html";
        }
        
    }
    
    @GetMapping("/panelAdmin")
    public String listar(ModelMap modelo)
    {
        List <Noticia> noticias = noticiaServicio.listarNoticias();
        modelo.addAttribute("noticias", noticias);
        
        return "panelAdmin.html";
    }
    
    @GetMapping("/modificar/{id}")  
    //Necesito pasarle el idAutor que quiero modificar. Esto lo hago a traves de un meto que se llama Path Variable
    // que indica que ese valor viaja a traves de un fragmento de la URL. Esta variable es el {id}. Le digo que la variable de tipo String "id" va
    //a viajar a traves de la URL
    public String modificar(@PathVariable String id, ModelMap modelo)
    {
        //Primero tengo que buscar el autor que corresponde a ese ID. Uso el metodo getOne() de la clase AutorServicio
        //ese valor lo inyecto a traves del modelo
        modelo.put("noticia", noticiaServicio.getOne(id));
        
        return "noticia_modificar.html";
    }
    
    @PostMapping("/modificar/{id}")
    public String modificar(@RequestParam String id, @RequestParam(required=false) String titulo, @RequestParam(required=false) String cuerpo, ModelMap modelo)
    {
        try
        {
            noticiaServicio.modificarNoticia(id, titulo, cuerpo);
            modelo.put("exito", "El Libro fue modificado correctamente");
            return "redirect:../panelAdmin";
        }
        catch(MiException ex)
        {
            Logger.getLogger(NoticiaControlador.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            modelo.put("error", ex.getMessage()); 
            return "noticia_modificar.html";
        }
        
    }
    
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable String id, ModelMap modelo)
    {
        modelo.put("noticia", noticiaServicio.getOne(id));
        noticiaServicio.eliminarNoticia(id);
        return "redirect:../panelAdmin";
    }
    
    
}
