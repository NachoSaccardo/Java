/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiendaAPP.persistencia;

import TiendaAPP.dominio.producto.Producto;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author juans
 */
public final class productoDAO extends DAO
{

    public productoDAO() 
    {
    }
    
    public void guardarProducto(Producto producto) throws Exception
    {
        try 
        {
            if(producto ==null)
                throw new Exception("Debe indicar un producto valido");
            
            String sql = "INSERT INTO Producto (codigo, nombre, precio, codigo_fabricante) VALUES ("+producto.getCodigo()+",'"+producto.getNombre()+"',"+ producto.getPrecio()+","+producto.getCodigo_fabricante()+");";
            
            insertarModificarEliminar(sql);
        } 
        catch (Exception e) 
        {
            System.out.println("No se guardo el producto");
            throw e;
        }
    }

    public void modificarProducto(Producto producto) throws Exception
    {
        try 
        {
            if(producto ==null)
                throw new Exception("Debe indicar un producto valido");
            
            String sql = "UPDATE Producto SET nombre= '"+producto.getNombre()+"' WHERE codigo='"+producto.getCodigo()+"';";
            
            insertarModificarEliminar(sql);
        } 
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public void eliminarProducto(Producto producto) throws Exception
    {
        try 
        {
            if(producto ==null)
                throw new Exception("Debe indicar un producto valido");
            
            String sql = "DELETE FROM Producto WHERE codigo= '"+producto.getCodigo()+"';";
            
            insertarModificarEliminar(sql);
        } 
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public Producto buscarProductoPorCodigo(Integer codigo) throws Exception
    {
        try 
        {
            
            String sql = "SELECT * FROM producto WHERE codigo = '"+codigo+"';";
            consultarBase(sql);
            Producto producto = null;
            while(resultado.next())
            {
                producto= new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigo_fabricante(resultado.getInt(4));
            }    
            desconectarBase();
            return producto;               
        } 
        catch (Exception e) 
        {
            desconectarBase();
            e.printStackTrace();
            throw e;
        }
    }
    
        
    public Collection<Producto> listarProductos() throws Exception
    {
       try 
        {
            String sql = "SELECT * FROM producto;";
            consultarBase(sql);
            
            Producto producto = null;
            ArrayList<Producto> listaproductos = new ArrayList();
            
            while(resultado.next())
            {   producto= new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigo_fabricante(resultado.getInt(4));
                listaproductos.add(producto);
            }    
            desconectarBase();
            return listaproductos;
                        
        } 
        catch (Exception e) 
        {
            desconectarBase();
            e.printStackTrace();
            throw e;
        }
    }
    
}
