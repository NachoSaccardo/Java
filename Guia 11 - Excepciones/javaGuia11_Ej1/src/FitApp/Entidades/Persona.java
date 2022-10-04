
package FitApp.Entidades;


public class Persona 
{
    private String nombre;
    private int edad;
    private String genero;
    private double peso;
    private double altura;
    private int IMC;
    private boolean mayor;
    int indice;

    public Persona() {
    }
    public Persona(String nombre, int edad, String genero, int peso, int altura, int indice) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
        this.indice = indice;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getIMC() {
        return IMC;
    }
    public void setIMC(int IMC) {
        this.IMC = IMC;
    }
    public int getIndice() {
        return indice;
    }
    public void setIndice(int indice) {
        this.indice = indice;
    }

    public boolean isMayor() {
        return mayor;
    }

    public void setMayor(boolean mayor) {
        this.mayor = mayor;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", peso=" + peso + ", altura=" + altura + ", IMC=" + IMC + ", mayor=" + mayor + ", indice=" + indice + '}';
    }
    
  
}
