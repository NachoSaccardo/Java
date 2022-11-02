
package TiendaAPP.persistencia;

import TiendaAPP.entidades.Producto;
import java.util.ArrayList;
import java.util.Collection;

public final class ProductoDAO extends DAO
{

    public ProductoDAO() 
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
            
            //UPDATE producto SET nombre="casa", precio=500, codigo_fabricante=2 WHERE codigo=1;
            
            String sql = "UPDATE Producto SET nombre='"+producto.getNombre()+"', precio="+producto.getPrecio()+", codigo_fabricante ="+producto.getCodigo_fabricante()+" WHERE codigo='"+producto.getCodigo()+"';";
            
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
