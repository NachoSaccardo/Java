
package Estancias.entidades;

import java.util.Calendar;

public class Cliente 
{
    private Integer id_cliente;
    private String nombre;
    private String calle; 
    private Integer numero;
    private String codigo_postal;
    private String pais;
    private String email;

    public Cliente() {
    }

    public Cliente(Integer id_cliente, String nombre, String calle, Integer numero, String codigo_postal, String pais, String email) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.calle = calle;
        this.numero = numero;
        this.codigo_postal = codigo_postal;
        this.pais = pais;
        this.email = email;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + ", nombre=" + nombre + ", calle=" + calle + ", numero=" + numero + ", codigo_postal=" + codigo_postal + ", pais=" + pais + ", email=" + email + '}';
    }
    
               
}
