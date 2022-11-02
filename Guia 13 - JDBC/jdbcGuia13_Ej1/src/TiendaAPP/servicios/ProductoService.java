
package TiendaAPP.servicios;

import TiendaAPP.entidades.Producto;
import TiendaAPP.persistencia.FabricanteDAO;
import TiendaAPP.persistencia.ProductoDAO;
import java.util.Collection;
import java.util.Scanner;

public class ProductoService 
{
    private final ProductoDAO dao;
    private final FabricanteService FS;
 
    //constructor vacio de ProductoService, le crea un DAO;
    public ProductoService()
    {
        this.dao = new ProductoDAO();
        this.FS = new FabricanteService();
    }
    
    public void crearProducto(Integer codigo, String nombre, Double precio, Integer codigo_fabricante) throws Exception
    {
        
        try 
        {
            //valido que lo que le pase al metodo como dato de creacion, este OK. podria validar tambien el formato
            if(codigo==null)
                throw new Exception("Debe indicar un codigo\n");
            if(nombre==null || nombre.trim().isEmpty())
                throw new Exception("Debe indicar un nombre\n");
            if(precio==null)
                throw new Exception("Debe indicar un precio\n");
            if(codigo_fabricante==null)
                throw new Exception("Debe indicar un codigo de fabricante\n");
            
            //valido si este producto ya existe en mi tabla: 
            if(dao.buscarProductoPorCodigo(codigo) != null)
            {
                throw new Exception("El producto ya existe\n");
            }
            
            if(!FS.listarCodigoFabricantes().contains(codigo_fabricante))
            {
                throw new Exception("El fabricante no existe");
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
            System.out.println("");
            
        } 
        catch (Exception e) 
        {
            System.out.println("No se creo el producto\n");
            throw e;
        }
    }
    
    public void eliminarProducto(Integer codigo) throws Exception
    {
        try 
        {
            //valido que lo que le pase al metodo como dato de creacion, este OK. podria validar tambien el formato
            if(codigo==null)
                throw new Exception("Debe indicar un codigo\n");
                        
            //valido si este producto existe en mi tabla: 
            if(dao.buscarProductoPorCodigo(codigo)==null)
            {
                throw new Exception("El producto no existe\n");
            }
            System.out.println("Producto encontrado\n");
            dao.eliminarProducto(dao.buscarProductoPorCodigo(codigo));
                         
        } 
        catch (Exception e) 
        {
            System.out.println("No se creo el producto\n");
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
                throw new Exception("La lista esta vacia\n");
            }
            
            for (Producto aux : lista) 
            {
                System.out.println(aux.toString());
            }
            System.out.println("");
        } 
        catch (Exception e) 
        {
            throw e;
        }
    }

    public void menuProducto(){
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
       int opcion = 0;
       int codigo, codigo_fabricante;
       String nombre;
       Double precio;
       
       do
       {
           System.out.println("Menu Producto:");
           System.out.println("-----------------------------------------");
           System.out.println("Seleccione una opcion\n1: Listar los productos disponibles\n2: Crear un nuevo Producto\n3: Modificar un producto\n"
                   + "4: Eliminar un producto\n9: Salir ");
           System.out.println("-----------------------------------------");
           opcion = leer.nextInt();
           switch(opcion)
            {
                case 1:
                    try 
                    {
                        listaProductos();
                    }
                    catch (Exception e) 
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try 
                    {
                        System.out.println("Ingrese el codigo");
                        codigo = leer.nextInt();
                        System.out.println("Ingrese el nombre");
                        nombre= leer.next();
                        System.out.println("Ingrese el precio");
                        precio= leer.nextDouble();
                        System.out.println("Ingrese el codigo del fabricante");
                        codigo_fabricante=leer.nextInt();
                        
                        crearProducto(codigo, nombre, precio, codigo_fabricante);
                    }
                    catch (Exception e) 
                    {
                        System.out.println(e.getMessage());
                     }
                    break;
                case 3:
                    
                    try{
                        modificarProducto();
                    }
                    catch(Exception e)
                            {
                                System.out.println(e.getMessage());
                            }
                    break;
                case 4:
                    try 
                    {
                        System.out.println("Ingrese un codigo para eliminar el producto");
                        codigo = leer.nextInt();
                        eliminarProducto(codigo);
                    }
                    catch (Exception e) 
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    break;
             }
       }while(opcion!=9);
    }
    
    public void mostrarProductoPorCodigo(int codigo) throws Exception{
        
        Producto producto = dao.buscarProductoPorCodigo(codigo);
        System.out.println(producto);
             
    }
    
    public void modificarProducto() throws Exception
    {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int codigo;
        Producto producto = null;
        String op;
        int codigo_fabricante;
        try 
        {   
            System.out.println("Seleccione un producto para modificarlo: ");
            codigo=leer.nextInt();
            System.out.println("Producto seleccionado: ");
            mostrarProductoPorCodigo(codigo);
            
            producto = dao.buscarProductoPorCodigo(codigo);
            
            if(producto==null)
            {
                throw new Exception("El producto no existe");
            }
            System.out.println("");

            System.out.println("Desea modificar el nombre? (S/N)");
            op = leer.next().toLowerCase();
            if(op.equals("s"))
            {               
                System.out.println("Ingrese el nuevo nombre: ");
                producto.setNombre(leer.next());
            }
            System.out.println("");
            
            System.out.println("Desea modificar el precio? (S/N)");
            op = leer.next().toLowerCase();
            if(op.equals("s"))
            {               
                System.out.println("Ingrese el nuevo precio: ");
                producto.setPrecio(leer.nextDouble());
                
            }
            System.out.println("");
            
            System.out.println("Desea modificar el codigo de fabricante? (S/N)");
            op = leer.next().toLowerCase();
            if(op.equals("s"))
            {        
                System.out.println("Ingrese el nuevo Codigo de Fabricante");
                codigo_fabricante = leer.nextInt();
                if(!FS.listarCodigoFabricantes().contains(codigo_fabricante))
                {
                    throw new Exception("El fabricante no existe");
                }
                producto.setCodigo_fabricante(codigo_fabricante);
            }
            
            
            dao.modificarProducto(producto);
            System.out.println("");
            
        } 
        catch (Exception e) 
        {
            System.out.println("No se modifico el producto\n");
            throw e;
        }

    }
    
    
}
