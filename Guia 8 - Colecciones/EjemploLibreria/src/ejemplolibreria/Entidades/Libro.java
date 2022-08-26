
package ejemplolibreria.Entidades;

import java.util.Comparator;



public class Libro 
{
    
private String nombre;
private String autor;
private String idioma;
private Integer paginas;

public Libro(String nombre, String autor, String idioma, int paginas) {
        this.nombre = nombre;
        this.autor = autor;
        this.idioma = idioma;
        this.paginas = paginas;
    }

    public Libro() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getIdioma() {
        return idioma;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", autor=" + autor + ", idioma=" + idioma + ", paginas=" + paginas + '}';
    }

    public static Comparator<Libro> compararpaginas=new Comparator<Libro>()
    {
        @Override
        public int compare(Libro l1, Libro l2)
        {
            int a= Integer.compare(l1.getPaginas(),l2.getPaginas());
            System.out.println(a);
            return a;
        }
    };
    
        
    
}
