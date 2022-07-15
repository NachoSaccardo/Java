
package mascotapp.Entidades;

public class Mascota {

//Si creo los atributos como Publicos, puedo acceder a ellos (leer/escribir) desde cualquier otro método,
//x ejemplo el main
//    public String tipo;
//    public String nombre;
//    public String apodo;
//    public String raza;
//    public String color;
//    public int edad;
//    public boolean cola;
    
// Si los declaro como Private, para acceder a ellos desde otra clase q no sea esta,
// necesito usar un Setter, x ejemplo, m1.setNombre(), o un Getter, x ejemplo, m1.getNombre().
    private String tipo;
    private String nombre;
    private String apodo;
    private String raza;
    private String color;
    private int edad;
    private boolean cola;
    public int energia;
    //Constructor vacio, no recibe parametros
    public Mascota() {
        energia=1000;
    }
    //Si toco Alt+Insert me da la opcion de crearle un constructor, y me ofrece los parametros a darle
    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        //this.nombre significa la variable nombre en esta clase, seria la de la linea 8
        // y lo que esta a la derecha del igual, se refiere al atributo String nombre que le llega
        energia=1000;
    }
    //this.nombre significa la variable nombre en esta clase, seria la de la linea 8
    // y lo que esta a la derecha del igual, se refiere al atributo String nombre que le llega
    
    //Creo un constructor adicional con TODOS los parametros
    public Mascota(String tipo, String nombre, String apodo, String raza, String color, int edad, boolean cola) {    
        this.tipo = tipo;
        this.nombre = nombre;
        this.apodo = apodo;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        energia=1000;
    }
    //Si toco Alt+Insert, tambien puedo crear los Setters y los Getters de todos los atributos,
    //automaticamente
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setCola(boolean cola) {
        this.cola = cola;
    }
    public String getTipo() {
        return this.tipo;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getApodo() {
        return this.apodo;
    }
    public String getRaza() {
        return this.raza;
    }
    public String getColor() {
        return this.color;
    }
    public int getEdad() {
        return this.edad;
    }
    public boolean isCola() {
        return this.cola;
    }
    
    /**
     * Este metodo pasear toma la energia que le mando al llamar a la funcion, y se la resta a la energia
     * de mi mascota
     * @param restoEnergia
     * @return energia
     */
    public int pasear(int restoEnergia)
    {
        energia=energia-restoEnergia;
        return energia;
    }

    /**
     * Este metodo pasear toma la cantidad de vueltas y la energia por vueltas, y 
     * realiza el calculo de la energia total consumida, me devuelve la restante
     * @param restoEnergia
     * @param vueltas
     * @return 
     */
    public int pasear(int restoEnergia, int vueltas)
    {
        for (int i = 0; i < vueltas; i++) {
            energia-=restoEnergia;
        }
        return energia;
    }
    // El "toString me concatena todos los atributos de ese objeto para mostrarlo por un SOUT usando solo el nombre del objeto

    @Override
    public String toString() {
        return "Mascota{" + "tipo=" + tipo + ", nombre=" + nombre + ", apodo=" + apodo + ", raza=" + raza + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", energia=" + energia + '}';
    }
}
