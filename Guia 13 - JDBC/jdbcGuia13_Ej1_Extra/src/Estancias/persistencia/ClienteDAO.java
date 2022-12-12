package Estancias.persistencia;

import Estancias.entidades.Cliente;
import java.util.ArrayList;
import java.util.Collection;

public class ClienteDAO extends DAO
{
        public ClienteDAO(){
    }
    
    public void guardarCliente(Cliente cliente) throws Exception
    {
        try 
        {
            if(cliente ==null)
                throw new Exception("Debe indicar una ID de cliente valido");
            

            
            String sql = "INSERT INTO Clientes (id_cliente, nombre, calle, numero, codigo_postal, ciudad, pais, email) VALUES("+cliente.getId_cliente()+",'"+cliente.getNombre()+"','"+cliente.getCalle()+"',"+cliente.getNumero()+",'"+cliente.getCodigo_postal()+"','"+cliente.getCiudad()+"','"+cliente.getPais()+"','"+cliente.getEmail()+"');";
          
            insertarModificarEliminar(sql);
        } 
        catch (Exception e) 
        {
            System.out.println("No se guardo el cliente");
        
            throw e;
        }
    }

    public void modificarCliente(Cliente cliente) throws Exception
    {
        try 
        {
            if(cliente ==null)
                throw new Exception("Debe indicar un ID de cliente valido");
            
            String sql = "UPDATE Clientes SET calle = '"+cliente.getCalle()+"', numero = "+cliente.getNumero()+
                    "nombre='"+cliente.getNombre()+"', codigo_postal= '"+cliente.getCodigo_postal()+"',"
                    + "ciudad= '"+cliente.getCiudad()+"',pais='"+cliente.getPais()+"',email='"+cliente.getEmail()+
                    "' WHERE id_cliente="+cliente.getId_cliente()+";";
            
            insertarModificarEliminar(sql);
        } 
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public void eliminarCliente(Cliente cliente) throws Exception
    {
        try 
        {
            if(cliente ==null)
                throw new Exception("Debe indicar un cliente valido");
            
            String sql = "DELETE FROM Clientes WHERE id_cliente= '"+cliente.getId_cliente()+"';";
            
            insertarModificarEliminar(sql);
        } 
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public Cliente buscarClientePorCodigo(Integer id_cliente) throws Exception
    {
        try 
        {
            
            String sql = "SELECT * FROM Clientes WHERE id_cliente = '"+id_cliente+"';";
            consultarBase(sql);
            Cliente cliente = null;
            while(resultado.next())
            {
                cliente= new Cliente();
                cliente.setId_cliente(resultado.getInt(1));
                cliente.setNombre(resultado.getString(2));
                cliente.setCalle(resultado.getString(3));
                cliente.setNumero(resultado.getInt(4));
                cliente.setCodigo_postal(resultado.getString(5));
                cliente.setCiudad(resultado.getString(6));
                cliente.setPais(resultado.getString(7));
                cliente.setEmail(resultado.getString(8));
                
                //System.out.println("Ingrese la fecha de inicio del contrato en formato dd/MM/yyyy");
                //cliente.setFecha_desde(Utilidades.StringToCalendar(String);
            }    
            desconectarBase();
            return cliente;               
        } 
        catch (Exception e) 
        {
            desconectarBase();
            e.printStackTrace();
            throw e;
        }
    }
    
        
    public Collection<Cliente> listarClientes() throws Exception
    {
       try 
        {
            String sql = "SELECT * FROM clientes;";
            consultarBase(sql);
            
            Cliente cliente = null;
            ArrayList<Cliente> listaclientes = new ArrayList();
            
            while(resultado.next())
            {   cliente= new Cliente();
                cliente= new Cliente();
                cliente.setId_cliente(resultado.getInt(1));
                cliente.setNombre(resultado.getString(2));
                cliente.setCalle(resultado.getString(3));
                cliente.setNumero(resultado.getInt(4));
                cliente.setCodigo_postal(resultado.getString(5));
                cliente.setCiudad(resultado.getString(6));
                cliente.setPais(resultado.getString(7));
                cliente.setEmail(resultado.getString(8));
                
                listaclientes.add(cliente);
            }    
            desconectarBase();
            return listaclientes;
                        
        } 
        catch (Exception e) 
        {
            desconectarBase();
            e.printStackTrace();
            throw e;
        }
    }
    
}
