/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.biblioteca.servicios;

import biblioteca.biblioteca.entidades.Autor;
import biblioteca.biblioteca.entidades.Editorial;
import biblioteca.biblioteca.entidades.Libro;
import biblioteca.biblioteca.excepciones.MiException;
import biblioteca.biblioteca.repositorios.AutorRepositorio;
import biblioteca.biblioteca.repositorios.EditorialRepositorio;
import biblioteca.biblioteca.repositorios.LibroRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Tienen como objetivo llevar adelante la logica del negocio
 * Ejecuta todas las funcionalidades necesarias para cumplir con el pedido del cliente
    *
 * Nuestra clase servicios va a permitir: Crear libros, Editar sus datos, Habilitar o Deshabilitar un libro
 * @author juans
 */

/* */

@Service
public class LibroServicio {
    
    /*Llamo al repositorio para persistir nuestro objeto Libro. Con Autowired le indico al servidor de aplicaciones que
    esta variable va a ser inicializada por el, por lo que no hace falta inicializarla para operar con ella (Se refiere a la variable libroRepositorio).
    Esto se conoce como inyeccion de dependencias.*/
    @Autowired
    private LibroRepositorio libroRepositorio;
    @Autowired
    private EditorialRepositorio editorialRepositorio;
    @Autowired
    private AutorRepositorio autorRepositorio;
    
    
    
    /*Esta notacion le indica que si el metodo se ejecuta sin lanzar excepciones, se realiza un commit a la base de datos y se guardan los cambios.
    Si se lanza una excepcion, se hace un rollback y se aborta. TODOS LOS METODOS QUE MODIFIQUEN DEBEN SER @Transactional*/
    @Transactional 
    public void crearLibro(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws MiException
    //Estos datos van a llegar a traves de unb formulario de HTML y necesito, con ellos, instanciar una entidad
    {
        
        //Valido que los datos de entrada no vengan vacios
        validar(isbn, titulo, ejemplares, idAutor, idEditorial);
          
        //Libro libro = libroRepositorio.findById(isbn).get();
        /*Podria usar este metodo para buscar el libro, pero si no existe me tira una excepcion. La alternativa es usar Optional*/
        Optional<Libro> respuesta = libroRepositorio.findById(isbn);
        //Uso el metodo findById y le paso como parametro el id del autor. FindById devuelve un Optional, con el .get() capturo el objeto Autor
        Optional<Autor> respuestaAutor = autorRepositorio.findById(idAutor);
        Optional<Editorial> respuestaEditorial = editorialRepositorio.findById(idEditorial);
        /*Optional es un espacio que puede o no contener un objeto del tipo que le defino entre <>. Si no lo encuentra, queda Null
        Entonces, con un if, digo que si devolvio un valor, entonces lo uso metiendolo adentro de mi variable libro o autor o editorial. 
        Hago lo mismo para Autor y Editorial xq el usuario lo va a ingresar */
        
        
        //Instancio un autor y una editorial vacios, si la respuesta del optional no esta vacia, le asigno los valores
        Autor autor = new Autor();
        Editorial editorial= new Editorial();
        
        if(respuestaAutor.isPresent())
        {
            autor = respuestaAutor.get();
        }
        
        if(respuestaEditorial.isPresent())
        {
            editorial = respuestaEditorial.get();
        }
      
        Libro libro = new Libro();
       
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setEjemplares(ejemplares);
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        //Con este new Date() le seteo la fecha del momento en que se crea
        libro.setAlta(new Date());
        
        /*Como creé el atributo libroRepositorio, ya puedo llamar a los metodos 
        que tiene JPA Repository porque LibroRepositorio extiende de ella*/
        libroRepositorio.save(libro);
                
    }
    
    /*Metodos para listar TODOS los libros*/
    public List<Libro>  listarLibros(){
        List<Libro> libros = new ArrayList();
        libros = libroRepositorio.findAll();
        return libros;
    }
    
    /*Le paso el isbn para encontrar el libro, luego los parametros que quiero modificar*/
    @Transactional
    public void modificarLibro(Long isbn, String titulo, String idAutor, String idEditorial, Integer ejemplares) throws MiException{
        
        //Valido que los datos de entrada no vengan vacios
        validar(isbn, titulo, ejemplares, idAutor, idEditorial);

        //Libro libro = libroRepositorio.findById(isbn).get();
        /*Podria usar este metodo para buscar el libro, pero si no existe me tira una excepcion. La alternativa es usar Optional*/
        
        Optional<Libro> respuesta = libroRepositorio.findById(isbn);
        /*Optional es un espacio que puede o no contener un objeto del tipo que le defino entre <>. Si no lo encuentra, queda Null
        Entonces, con un if, digo que si devolvio un valor, entonces lo uso metiendolo adentro de mi variable libro o autor o editorial. 
        Hago lo mismo para Autor y Editorial xq el usuario lo va a ingresar */
        Optional<Autor> respuestaAutor = autorRepositorio.findById(idAutor);
        Optional<Editorial> respuestaEditorial = editorialRepositorio.findById(idEditorial);
        
        
        //Instancio un autor y una editorial vacios, si la respuesta del optional no esta vacia, le asigno los valores
        Autor autor = new Autor();
        Editorial editorial = new Editorial();
        
        if(respuestaAutor.isPresent())
        {
            autor = respuestaAutor.get();
        }
        if(respuestaEditorial.isPresent())
        {
            editorial = respuestaEditorial.get();
        }
                       
        if(respuesta.isPresent())
        {
            Libro libro = respuesta.get();
            libro.setTitulo(titulo);    
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            libro.setEjemplares(ejemplares);
            libroRepositorio.save(libro);
        }
    }
    
    private void validar(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws MiException{
       
        if(isbn == null){
            throw new MiException("el isbn no puede ser nulo"); //
        }
        if(titulo.isEmpty() || titulo == null){
            throw new MiException("el titulo no puede ser nulo o estar vacio");
        }
        if(ejemplares == null){
            throw new MiException("ejemplares no puede ser nulo");
        }
        if(idAutor.isEmpty() || idAutor == null){
            throw new MiException("el Autor no puede ser nulo o estar vacio");
        }
        
        if(idEditorial.isEmpty() || idEditorial == null){
            throw new MiException("La Editorial no puede ser nula o estar vacia");
        }
    }
    
}

