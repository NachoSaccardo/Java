
package biblioteca.biblioteca.servicios;

import biblioteca.biblioteca.entidades.Autor;
import biblioteca.biblioteca.entidades.Editorial;
import biblioteca.biblioteca.entidades.Libro;
import biblioteca.biblioteca.excepciones.MiException;
import biblioteca.biblioteca.repositorios.AutorRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/*Ver Libro Servicio para las explicaciones*/

@Service
public class AutorServicio {
    
    @Autowired
    AutorRepositorio autorRepositorio;
    
    @Transactional
    public void crearAutor(String nombre) throws MiException{
        Autor autor = new Autor();
        
        //Valido el ingreso de datos
        validar(autor.getId(), nombre);
        
        autor.setNombre(nombre);
        
        autorRepositorio.save(autor);
    }
    
    /*Metodos para listar TDOOS los autores*/
    public List<Autor>  listarLibros(){
        List<Autor> autores = new ArrayList();
        autores = autorRepositorio.findAll();
        return autores;
    }
    
    @Transactional
    public void modificarAutor(String id, String nombre) throws MiException{
       
        //Valido el ingreso de datos
        validar(id, nombre);
        
        Optional<Autor> respuesta = autorRepositorio.findById(id);
        /*Optional es un espacio que puede o no contener un objeto del tipo que le defino entre <>. Si no lo encuentra, queda Null
        Entonces, con un if, digo que si devolvio un valor, entonces lo uso metiendolo adentro de mi variable libro o autor o editorial. 
        Hago lo mismo para Autor y Editorial xq el usuario lo va a ingresar */
        
                
        if(respuesta.isPresent())
        {
            Autor autor = respuesta.get();
            autor.setNombre(nombre);    
            autorRepositorio.save(autor);
        }
    }
    
    private void validar(String id, String nombre) throws MiException
    {
        if(id.isEmpty()||id==null)
        {
            throw new MiException("El id de Autor no puede ser nulo ni estar vacio");
        }
        
        if(nombre==null||nombre.isEmpty())
        {
            throw new MiException("El nombre no puede ser nulo ni estar vacio");
        }
    }
}
