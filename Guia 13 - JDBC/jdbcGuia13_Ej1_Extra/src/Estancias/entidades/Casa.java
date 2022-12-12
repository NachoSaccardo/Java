
package Estancias.entidades;

import static Estancias.Utilidades.Utilidades.CalendarToString;
import java.util.Calendar;


public class Casa 
{
        private Integer id_casa;
        private String calle;
        private Integer numero;
        private String codigo_postal;
        private String ciudad;
        private String pais;
        private Calendar fecha_desde;
        private Calendar fecha_hasta;
        private Integer tiempo_minimo;
        private Integer tiempo_maximo;
        private Float precio_habitacion;
        private String tipo_vivienda;

    public Casa() {
        
    }

    public Casa(Integer id_casa, String calle, Integer numero, String codigo_postal, String ciudad, String pais, Calendar fecha_desde, Calendar fecha_hasta, Integer tiempo_minimo, Integer tiempo_maximo, Float precio_habitacion, String tipo_vivienda) {
        this.id_casa = id_casa;
        this.calle = calle;
        this.numero = numero;
        this.codigo_postal = codigo_postal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
        this.tiempo_minimo = tiempo_minimo;
        this.tiempo_maximo = tiempo_maximo;
        this.precio_habitacion = precio_habitacion;
        this.tipo_vivienda = tipo_vivienda;
    }

    public Integer getId_casa() {
        return id_casa;
    }

    public void setId_casa(Integer id_casa) {
        this.id_casa = id_casa;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
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

    public Integer getTiempo_minimo() {
        return tiempo_minimo;
    }

    public void setTiempo_minimo(Integer tiempo_minimo) {
        this.tiempo_minimo = tiempo_minimo;
    }

    public Integer getTiempo_maximo() {
        return tiempo_maximo;
    }

    public void setTiempo_maximo(Integer tiempo_maximo) {
        this.tiempo_maximo = tiempo_maximo;
    }

    public Float getPrecio_habitacion() {
        return precio_habitacion;
    }

    public void setPrecio_habitacion(Float precio_habitacion) {
        this.precio_habitacion = precio_habitacion;
    }

    public String getTipo_vivienda() {
        return tipo_vivienda;
    }

    public void setTipo_vivienda(String tipo_vivienda) {
        this.tipo_vivienda = tipo_vivienda;
    }

    @Override
    public String toString() {
        return "Casa{" + "id_casa=" + id_casa + ", calle=" + calle + ", numero=" + numero + ", codigo_postal=" + codigo_postal + ", ciudad=" + ciudad + ", pais=" + pais + ", fecha_desde=" + CalendarToString(fecha_desde) + ", fecha_hasta=" + CalendarToString(fecha_hasta)+ ", tiempo_minimo=" + tiempo_minimo + ", tiempo_maximo=" + tiempo_maximo + ", precio_habitacion=" + precio_habitacion + ", tipo_vivienda=" + tipo_vivienda + '}';
    }
        
        
                
        
}
