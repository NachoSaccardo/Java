/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggNoticias.servicios;

import eggNoticias.entidades.Noticia;
import static eggNoticias.entidades.Noticia.compararFecha;
import eggNoticias.excepciones.MiException;
import eggNoticias.repositorios.NoticiaRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticiaServicio 
{
    @Autowired
    NoticiaRepositorio noticiaRepositorio;

    @Transactional
    public void crearNoticia(String titulo, String cuerpo) throws MiException
    {
        validarNoticia(titulo, cuerpo);
        Noticia noticia = new Noticia();
        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);
        noticia.setFecha(new Date());
        noticiaRepositorio.save(noticia);
    
    }
    @Transactional
    public void modificarNoticia(String id, String titulo, String cuerpo) throws MiException
    {
        validarNoticia(titulo, cuerpo);
        
        Optional<Noticia> respuesta = noticiaRepositorio.findById(id);
        
        if(respuesta.isPresent())
        {
            Noticia noticia = respuesta.get();
            noticia.setTitulo(titulo);
            noticia.setCuerpo(cuerpo);
            noticiaRepositorio.save(noticia);
        }
        
    }
    
    @Transactional
    public void eliminarNoticia(String id)
    {
        noticiaRepositorio.deleteById(id);
    }

    public List<Noticia> listarNoticias()
    {
        List<Noticia> listaNoticias = new ArrayList();
        listaNoticias = noticiaRepositorio.findAll();
        listaNoticias.sort(compararFecha);
        return listaNoticias;
        
    }
        
    public void validarNoticia(String titulo, String cuerpo) throws MiException
    {
        if(titulo==null || titulo.isEmpty())
        {
            throw new MiException("El titulo no puede estar vacio");
        }
        
        if(cuerpo==null || cuerpo.isEmpty())
        {
            throw new MiException("El titulo no puede estar vacio");
        }       
    }
    
    public Noticia getOne(String id)
    {
        //Este metodo busca a traves del repositorio, un objeto usando su id
        return noticiaRepositorio.getOne(id);
    }
}
