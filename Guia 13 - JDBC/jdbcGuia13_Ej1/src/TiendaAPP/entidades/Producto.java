/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiendaAPP.entidades;

/**
 *
 * @author juans
 */
public class Producto {
    
    private Integer codigo;
    private String nombre;
    private Double precio;
    private Integer codigo_fabricante;

    public Producto() {
    }

    public Producto(Integer codigo, String nombre, Double precio, Integer codigo_fabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codigo_fabricante = codigo_fabricante;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCodigo_fabricante() {
        return codigo_fabricante;
    }

    public void setCodigo_fabricante(Integer codigo_fabricante) {
        this.codigo_fabricante = codigo_fabricante;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", codigo_fabricante=" + codigo_fabricante + '}';
    }
    
    
     
}
