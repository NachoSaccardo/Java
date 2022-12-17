/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggNoticias.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author juans
 */
@Controller
@RequestMapping("/") //localhost:8080/
public class PortalControlador {
    
    /*Este es el primer metodo que se va a ejecutar al abrir la aplicacion
    */
    @GetMapping("/") //Cuando entro a esta URL, va a traer el index.html¿
    public String index()
    {
        //Tengo que crearle esta vista de HTML, que van en Other Sources/src/main/resources/Templates
        return "index.html";
        //Cuando entre al http://localhost:8080/ (que es donde se inicia mi aplicacion), voy a caer en el index.html
    }
}

