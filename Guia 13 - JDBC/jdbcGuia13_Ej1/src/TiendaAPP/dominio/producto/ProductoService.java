
package TiendaAPP.dominio.producto;

import TiendaAPP.persistencia.productoDAO;
import java.util.Collection;

public class ProductoService 
{
    private final productoDAO dao;
 
    //constructor vacio de ProductoService, le crea un DAO;
    public ProductoService()
    {
        this.dao = new productoDAO();
    }
    
    public void crearProducto(Integer codigo, String nombre, Double precio, Integer codigo_fabricante) throws Exception
    {
        try 
        {
            //valido que lo que le pase al metodo como dato de creacion, este OK. podria validar tambien el formato
            if(codigo==null)
                throw new Exception("Debe indicar un codigo");
            if(nombre==null || nombre.trim().isEmpty())
                throw new Exception("Debe indicar un nombre");
            if(precio==null)
                throw new Exception("Debe indicar un precio");
            if(codigo_fabricante==null)
                throw new Exception("Debe indicar un codigo de fabricante");
            
            //valido si este producto ya existe en mi tabla: 
            if(dao.buscarProductoPorCodigo(codigo) != null)
            {
                throw new Exception("El producto ya existe");
            }
            
            //creo el Producto
            Producto producto = new Producto();
            producto.setCodigo(codigo);
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigo_fabricante(codigo_fabricante);
            System.out.println("Producto Creado: ");
            System.out.println(producto.toString());
            dao.guardarProducto(producto);
             
            
        } 
        catch (Exception e) 
        {
            System.out.println("No se creo el producto");
            throw e;
        }
    }
    
    public void eliminarProducto(Integer codigo) throws Exception
    {
        try 
        {
            //valido que lo que le pase al metodo como dato de creacion, este OK. podria validar tambien el formato
            if(codigo==null)
                throw new Exception("Debe indicar un codigo");
                        
            //valido si este producto existe en mi tabla: 
            if(dao.buscarProductoPorCodigo(codigo)==null)
            {
                throw new Exception("El producto no existe");
            }
            System.out.println("Producto encontrado");
            dao.eliminarProducto(dao.buscarProductoPorCodigo(codigo));
                         
        } 
        catch (Exception e) 
        {
            System.out.println("No se creo el producto");
            throw e;
        }
    }

    public void listaProductos() throws Exception
    {
        try 
        {
            Collection<Producto> lista = dao.listarProductos();
            if(lista.isEmpty())
            {
                throw new Exception("La lista esta vacia;");
            }
            
            for (Producto aux : lista) 
            {
                System.out.println(aux.toString());
            }
        } 
        catch (Exception e) 
        {
            throw e;
        }
    }

    
}
