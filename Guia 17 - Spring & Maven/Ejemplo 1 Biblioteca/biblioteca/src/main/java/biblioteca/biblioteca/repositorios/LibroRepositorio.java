
package biblioteca.biblioteca.repositorios;

import biblioteca.biblioteca.entidades.Libro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/*El repositorio se encarga de vincular mis entidades con la base de datos. Vendria a ser, justamente, la capa de acceso a datos
*/
@Repository
public interface LibroRepositorio extends JpaRepository<Libro, Long> 
/*Lo que esta entre <> es: "Libro como el tipo de Entidad que va a manejar, y Long como el tipo de dato de la llave primaria de ese Libro */
{
    //JPARepository tiene metodos propios que podria utilizar ahora
    
    //Como es una interfaz, impletmenta metodos abstractos
    @Query("SELECT l FROM Libro l WHERE l.titulo = :titulo")
    /*Query es una consulta a la BD. Selecciono todos los libros de la tabla Libro en donde el titulo sea el que yo le estoy pasando como parametro
    Este valor que le estoy pasando como parametro, en  la consulta, se escribe como :titulo. En la definicion de la funcion, seria
    el "String titulo", le estoy diciendo que busque ese valor que tenga adentro de la variable. 
    La parte de @Param("titulo"), le esta diciendo a la query que voy a buscar por titulo, siendo titulo el atributo en la tabla.*/
    public Libro buscarPorTitulo(@Param("titulo") String titulo);

    /*En este caso estoy buscando por el nombre del autor del libro, por eso la consulta es "l.autor.nombre". 
    En @Param, "nombre" es ese nombre del autor.
    Como puede devolver varios libros que tengan el mismo autor, devuelve el tipo de dato List<Libro>
    */
    @Query("SELECT l FROM Libro l WHERE l.autor.nombre = :nombre")
    public List<Libro> buscarPorAutor(@Param("nombre") String nombre);
            
            


}
