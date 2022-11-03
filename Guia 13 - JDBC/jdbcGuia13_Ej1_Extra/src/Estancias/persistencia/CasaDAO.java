package Estancias.persistencia;

import static Estancias.Utilidades.Utilidades.CalendarToString;
import static Estancias.Utilidades.Utilidades.StringToCalendar;
import Estancias.entidades.Casa;
import java.util.ArrayList;
import java.util.Collection;


public class CasaDAO extends DAO{
    
    public CasaDAO(){
    }
    
    public void guardarCasa(Casa casa) throws Exception
    {
        try 
        {
            if(casa ==null)
                throw new Exception("Debe indicar una ID de casa valido");
            
            String sql = "INSERT INTO Casas (id_casa, calle, numero, codigo_postal, "
                    + "ciudad, pais, fecha_desde, fecha_hasta, tiempo_minimo, tiempo_maximo, "
                    + "precio_habitacion, tipo_vivienda ) VALUES "
                    + "("+casa.getId_casa()+",'"+casa.getCalle()+"',"+casa.getNumero()+",'"+casa.getCodigo_postal()+"','"+casa.getCiudad()+
                    "','"+casa.getPais()+"','"+CalendarToString(casa.getFecha_desde())+"','"+CalendarToString(casa.getFecha_hasta())+"',"+casa.getTiempo_minimo()+","+casa.getTiempo_maximo()+
                    ","+casa.getPrecio_habitacion()+",'"+casa.getTipo_vivienda()+"');";
            
            insertarModificarEliminar(sql);
        } 
        catch (Exception e) 
        {
            System.out.println("No se guardo la casa");
            throw e;
        }
    }

    public void modificarCasa(Casa casa) throws Exception
    {
        try 
        {
            if(casa ==null)
                throw new Exception("Debe indicar un ID de casa valido");
            
            String sql = "UPDATE Casas SET calle = '"+casa.getCalle()+"', numero = "+casa.getNumero()+", codigo_postal='"+casa.getCodigo_postal()+"',"
                    + "ciudad= '"+casa.getCiudad()+"',pais='"+casa.getPais()+"',fecha_desde='"+CalendarToString(casa.getFecha_desde())+"',fecha_hasta='"+CalendarToString(casa.getFecha_hasta())+
                    "',tiempo_minimo="+casa.getTiempo_minimo()+",tiempo_maximo="+casa.getTiempo_maximo()+",precio_habitacion="+casa.getPrecio_habitacion()+
                    ",tipo_vivienda='"+casa.getTipo_vivienda()+"' WHERE id_casa="+casa.getId_casa()+";";
            
            insertarModificarEliminar(sql);
        } 
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public void eliminarCasa(Casa casa) throws Exception
    {
        try 
        {
            if(casa ==null)
                throw new Exception("Debe indicar un casa valido");
            
            String sql = "DELETE FROM Casas WHERE id_casa= '"+casa.getId_casa()+"';";
            
            insertarModificarEliminar(sql);
        } 
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public Casa buscarCasaPorCodigo(Integer id_casa) throws Exception
    {
        try 
        {
            
            String sql = "SELECT * FROM Casas WHERE id_casa = '"+id_casa+"';";
            consultarBase(sql);
            Casa casa = null;
            while(resultado.next())
            {
                casa= new Casa();
                casa.setId_casa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigo_postal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFecha_desde(StringToCalendar(resultado.getString(7)));
                casa.setFecha_hasta(StringToCalendar(resultado.getString(8)));
                casa.setTiempo_minimo(resultado.getInt(9));
                casa.setTiempo_maximo(resultado.getInt(10));
                casa.setPrecio_habitacion(resultado.getFloat(11));
                casa.setTipo_vivienda(resultado.getString(12));
                
                //System.out.println("Ingrese la fecha de inicio del contrato en formato dd/MM/yyyy");
                //casa.setFecha_desde(Utilidades.StringToCalendar(String);
            }    
            desconectarBase();
            return casa;               
        } 
        catch (Exception e) 
        {
            desconectarBase();
            e.printStackTrace();
            throw e;
        }
    }
    
        
    public Collection<Casa> listarCasas() throws Exception
    {
       try 
        {
            String sql = "SELECT * FROM casas;";
            consultarBase(sql);
            
            Casa casa = null;
            ArrayList<Casa> listacasas = new ArrayList();
            
            while(resultado.next())
            {   casa= new Casa();
                casa.setId_casa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigo_postal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFecha_desde(StringToCalendar(resultado.getString(7)));
                casa.setFecha_hasta(StringToCalendar(resultado.getString(8)));
                casa.setTiempo_minimo(resultado.getInt(9));
                casa.setTiempo_maximo(resultado.getInt(10));
                casa.setPrecio_habitacion(resultado.getFloat(11));
                casa.setTipo_vivienda(resultado.getString(12));
                
                listacasas.add(casa);
            }    
            desconectarBase();
            return listacasas;
                        
        } 
        catch (Exception e) 
        {
            desconectarBase();
            e.printStackTrace();
            throw e;
        }
    }
    
}

