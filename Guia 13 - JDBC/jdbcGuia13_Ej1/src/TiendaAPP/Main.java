
package TiendaAPP;

import TiendaAPP.dominio.producto.ProductoService;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Main {

 
    public static void main(String[] args) 
    {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       ProductoService productoService = new ProductoService();
       int opcion = 0;
       int codigo, codigo_fabricante;
       String nombre;
       Double precio;
       
       
       
       do
       {
           System.out.println("Seleccione una opcion\n1: Listar los productos disponibles\n2: Crear un nuevo Producto\n3: Eliminar un producto\n9: Salir ");
           opcion = leer.nextInt();
           switch(opcion)
            {
                case 1:
                    try 
                    {

                        productoService.listaProductos();
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
                        
                        productoService.crearProducto(codigo, nombre, precio, codigo_fabricante);
                    }
                    catch (Exception e) 
                    {
                        System.out.println(e.getMessage());
                                                
                    }
                    break;
                case 3:
                    try 
                    {
                        System.out.println("Ingrese un codigo para eliminar el producto");
                        codigo = leer.nextInt();
                        productoService.eliminarProducto(codigo);
                    }
                    catch (Exception e) 
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
             }
       }while(opcion!=9);
    }
}
    

