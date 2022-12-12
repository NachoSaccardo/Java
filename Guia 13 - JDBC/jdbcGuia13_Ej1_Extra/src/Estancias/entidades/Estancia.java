
package Estancias.entidades;

import java.util.Calendar;


public class Estancia {
    
       private Integer id_estancia;
       private Integer id_cliente;
       private Integer id_casa;
       private String nombre_huesped;
       private Calendar fecha_desde;
       private Calendar fecha_hasta;

    public Estancia() {
    }

    public Estancia(Integer id_estancia, Integer id_cliente, Integer id_casa, String nombre_huesped, Calendar fecha_desde, Calendar fecha_hasta) {
        this.id_estancia = id_estancia;
        this.id_cliente = id_cliente;
        this.id_casa = id_casa;
        this.nombre_huesped = nombre_huesped;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
    }

    public Integer getId_estancia() {
        return id_estancia;
    }

    public void setId_estancia(Integer id_estancia) {
        this.id_estancia = id_estancia;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Integer getId_casa() {
        return id_casa;
    }

    public void setId_casa(Integer id_casa) {
        this.id_casa = id_casa;
    }

    public String getNombre_huesped() {
        return nombre_huesped;
    }

    public void setNombre_huesped(String nombre_huesped) {
        this.nombre_huesped = nombre_huesped;
    }

    public Calendar getFecha_desde() {
        return fecha_desde;
    }

    public void setFecha_desde(Calendar fecha_desde) {
        this.fecha_desde = fecha_desde;
    }

    public Calendar getFecha_hasta() {
        return fecha_hasta;
    }

    public void setFecha_hasta(Calendar fecha_hasta) {
        this.fecha_hasta = fecha_hasta;
    }

    @Override
    public String toString() {
        return "Estancia{" + "id_estancia=" + id_estancia + ", id_cliente=" + id_cliente + ", id_casa=" + id_casa + ", nombre_huesped=" + nombre_huesped + ", fecha_desde=" + fecha_desde + ", fecha_hasta=" + fecha_hasta + '}';
    }
       
       
}
