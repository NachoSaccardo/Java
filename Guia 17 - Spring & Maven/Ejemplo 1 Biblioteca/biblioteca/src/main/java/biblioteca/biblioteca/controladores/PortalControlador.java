
package biblioteca.biblioteca.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*Controlador del portal inicial de la aplicacion. Es de tipo Controller. en RequestMapping le indico la url a partir de la cual este controlador va a "escuchar
Esto vendria a ser, dentro de mi URL, por ejemplo www.google.com/home.html, le digo que el Request Mapping es "/", osea que lea a partir de la barra para llevarme al home"*/
@Controller
@RequestMapping("/")
public class PortalControlador {
    
    /*Este es el primer metodo que se va a ejecutar al abrir la aplicacion
    */
    @GetMapping("/")
    public String index()
    {
        //Tengo que crearle esta vista de HTML, que van en Other Sources/src/main/resources/Templates
        return "index.html";
        //Cuando entre al http://localhost:8080/ (que es donde se inicia mi aplicacion), voy a caer en el index.html
    }
}
