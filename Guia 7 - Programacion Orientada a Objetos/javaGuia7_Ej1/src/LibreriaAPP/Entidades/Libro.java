package LibreriaAPP.Entidades;

public class Libro {

    private int ISBN;
    private String titulo;
    private String autor;
    private int numeropaginas;
    public Libro() {
    }
    public Libro(int ISBN, String titulo, String autor, int numeropaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeropaginas = numeropaginas;
    }
    public int getISBN() {
        return ISBN;
    }
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getNumeropaginas() {
        return numeropaginas;
    }
    public void setNumeropaginas(int numeropaginas) {
        this.numeropaginas = numeropaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeropaginas=" + numeropaginas + '}';
    }

}
