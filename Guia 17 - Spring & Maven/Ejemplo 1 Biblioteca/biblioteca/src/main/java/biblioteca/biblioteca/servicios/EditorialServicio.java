/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.biblioteca.servicios;

import biblioteca.biblioteca.entidades.Autor;
import biblioteca.biblioteca.entidades.Editorial;
import biblioteca.biblioteca.excepciones.MiException;
import biblioteca.biblioteca.repositorios.EditorialRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/*Ver Libro Servicio para las explicaciones*/

@Service
public class EditorialServicio {
    
    @Autowired
    EditorialRepositorio editorialRepositorio;
    
    @Transactional
    public void crearEditorial(String nombre) throws MiException{
        Editorial editorial = new Editorial();
        
        //Valido el ingreso de datos
        validar(editorial.getId(), nombre);
        
        //Si esta OK le seteo el nombre
        editorial.setNombre(nombre);
        
        editorialRepositorio.save(editorial);
    }
    
        /*Metodos para listar TODAS las editoriales*/
    
    public List<Editorial>  listarLibros(){
        List<Editorial> editoriales = new ArrayList();
        editoriales = editorialRepositorio.findAll();
        return editoriales;
    }
    
    @Transactional
    public void modificarAutor(String id, String nombre) throws MiException{
        
        //Valido el ingreso de datos
        validar(id, nombre);
        
        Optional<Editorial> respuesta = editorialRepositorio.findById(id);
        /*Optional es un espacio que puede o no contener un objeto del tipo que le defino entre <>. Si no lo encuentra, queda Null
        Entonces, con un if, digo que si devolvio un valor, entonces lo uso metiendolo adentro de mi variable libro o autor o editorial. 
        Hago lo mismo para Autor y Editorial xq el usuario lo va a ingresar */
             
        if(respuesta.isPresent())
        {
            Editorial editorial = respuesta.get();
            editorial.setNombre(nombre);    
            editorialRepositorio.save(editorial);
        }
    }
    
        private void validar(String id, String nombre) throws MiException
    {
        if(id.isEmpty()||id==null)
        {
            throw new MiException("El id de Editorial no puede ser nulo ni estar vacio");
        }
        
        if(nombre==null||nombre.isEmpty())
        {
            throw new MiException("El nombre no puede ser nulo ni estar vacio");
        }
    }
}

