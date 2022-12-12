
package Estancias.servicios;

import Estancias.entidades.Cliente;
import Estancias.persistencia.ClienteDAO;
import java.util.Collection;
import java.util.Scanner;


public class ClienteService 
{
    private final ClienteDAO dao;
     
    //constructor vacio de ClienteService, le crea un DAO cuando instancion el servicio;
    public ClienteService()
    {
        this.dao = new ClienteDAO();
    }
    
    public void crearCliente(Integer id_cliente, String nombre, String calle, Integer numero, String codigo_postal, String ciudad, String pais, String email) throws Exception
    {
        try 
        {
            //valido que lo que le pase al metodo como dato de creacion, este OK. podria validar tambien el formato
            if(id_cliente==null)
                throw new Exception("Debe indicar un ID\n");
            if(nombre==null)
                throw new Exception("Debe indicar un nombre\n");
            if(calle==null || calle.trim().isEmpty())
                throw new Exception("Debe indicar una calle\n");
            if(numero==null)
                throw new Exception("Debe indicar un numero\n");
            if(codigo_postal==null || codigo_postal.trim().isEmpty())
                throw new Exception("Debe indicar un codigo postal\n");
            if(ciudad==null || ciudad.trim().isEmpty())
                throw new Exception("Debe indicar una ciudad\n");
            if(pais==null || pais.trim().isEmpty())
                throw new Exception("Debe indicar un pais\n");
            if(email==null || email.trim().isEmpty())
                throw new Exception("Debe indicar un email\n");
                        
            //valido si este cliente ya existe en mi tabla: 
            if(dao.buscarClientePorCodigo(id_cliente) != null)
            {
                throw new Exception("El cliente ya existe\n");
            }
            //creo el Cliente
            Cliente cliente = new Cliente();
            
                cliente.setId_cliente(id_cliente);
                cliente.setNombre(nombre);
                cliente.setCalle(calle);
                cliente.setNumero(numero);
                cliente.setCodigo_postal(codigo_postal);
                cliente.setCiudad(ciudad);
                cliente.setPais(pais);
                cliente.setEmail(email);
                
            System.out.println("Cliente Creado: ");
            System.out.println(cliente.toString());
            dao.guardarCliente(cliente);
            System.out.println("");
            
        } 
        catch (Exception e) 
        {
            System.out.println("No se creo el cliente\n");
            throw e;
        }
    }
    
    public void eliminarCliente(Integer id_cliente) throws Exception
    {
        try 
        {
            //valido que lo que le pase al metodo como dato de creacion, este OK. podria validar tambien el formato
            if(id_cliente==null)
                throw new Exception("Debe indicar un ID de cliente\n");
                        
            //valido si este cliente existe en mi tabla: 
            if(dao.buscarClientePorCodigo(id_cliente)==null)
            {
                throw new Exception("El cliente no existe\n");
            }
            System.out.println("Cliente encontrada\n");
            dao.eliminarCliente(dao.buscarClientePorCodigo(id_cliente));
                         
        } 
        catch (Exception e) 
        {
            System.out.println("No se elimino el cliente\n");
            throw e;
        }
    }

    public void listaClientes() throws Exception
    {
        try 
        {
            Collection<Cliente> lista = dao.listarClientes();
            if(lista.isEmpty())
            {
                throw new Exception("La lista esta vacia\n");
            }
            
            for (Cliente aux : lista) 
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

    public void menuCliente(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion = 0;
        int id_cliente;
        String nombre;
        String calle;
        Integer numero;
        String codigo_postal;
        String ciudad;
        String pais;
        String email;
       
        do
        {
           System.out.println("Menu Cliente:");
           System.out.println("-----------------------------------------");
           System.out.println("Seleccione una opcion\n1: Listar los clientes disponibles\n2: Crear un nuevo Cliente\n3: Modificar un cliente\n"
                   + "4: Eliminar un cliente\n0: Volver al Menu Principal ");
           System.out.println("-----------------------------------------");
           opcion = leer.nextInt();
           switch(opcion)
            {
                case 1:
                    try 
                    {
                        listaClientes();
                    }
                    catch (Exception e) 
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try 
                    {
                        System.out.println("Ingrese el ID de la cliente");
                        id_cliente = leer.nextInt();
                        System.out.println("Ingrese el nombre completo");
                        nombre=leer.next();
                        System.out.println("Ingrese la calle");
                        calle= leer.next();
                        System.out.println("Ingrese el numero de la cliente");
                        numero=leer.nextInt();
                        System.out.println("Ingrese el codigo postal");
                        codigo_postal=leer.next();
                        System.out.println("Ingrese la ciudad");
                        ciudad=leer.next();
                        System.out.println("Ingrese el pais");
                        pais=leer.next();
                        System.out.println("Ingrese el email");
                        email=leer.next();
                        
                        crearCliente(id_cliente, nombre, calle, numero, codigo_postal, ciudad, pais, email);
                    }
                    catch (Exception e) 
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    
                    try
                    {
                        modificarCliente();
                    }
                    catch(Exception e)
                            {
                                System.out.println(e.getMessage());
                            }
                    break;
                case 4:
                    try 
                    {
                        System.out.println("Ingrese un ID para eliminar el cliente");
                        id_cliente = leer.nextInt();
                        eliminarCliente(id_cliente);
                        System.out.println("Cliente eliminado");
                    }
                    catch (Exception e) 
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 0: 
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
             }
       }while(opcion!=0);
    }
    
    public void mostrarClientePorCodigo(int id_cliente) throws Exception{
        
        Cliente cliente = dao.buscarClientePorCodigo(id_cliente);
        System.out.println(id_cliente);
             
    }
    
    public void modificarCliente() throws Exception
    {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int id_cliente;
        Cliente cliente = null;
        String op;

        try 
        {   
            System.out.println("Indique el ID de una cliente para modificarlo: ");
            id_cliente=leer.nextInt();
            System.out.println("Cliente seleccionado: ");
            mostrarClientePorCodigo(id_cliente);
            
            cliente = dao.buscarClientePorCodigo(id_cliente);
            
            if(cliente==null)
            {
                throw new Exception("El cliente no existe");
            }
            System.out.println("");

            System.out.println("Desea modificar el Nombre? (S/N)");
            op = leer.next().toLowerCase();
            if(op.equals("s"))
            {
                System.out.println("Ingrese el nuevo Nombre");
                cliente.setNombre(leer.next());
            }
            
            System.out.println("Desea modificar la Direccion? (S/N)");
            op = leer.next().toLowerCase();
            if(op.equals("s"))
            {               
                System.out.println("Ingrese la nueva calle: ");
                cliente.setCalle(leer.next());
                System.out.println("Ingrese el numero");
                cliente.setNumero(leer.nextInt());
                System.out.println("Ingrese el codigo postal");
                cliente.setCodigo_postal(leer.next());
                System.out.println("Ingrese la ciudad");
                cliente.setCiudad(leer.next());
                System.out.println("Ingrese el Pais");
                cliente.setPais(leer.next());
            }
            System.out.println("");
            
            System.out.println("Desea modificar el Email");
            op = leer.next().toLowerCase();
            if(op.equals("s"))
            {               
                System.out.println("Ingrese el nuevo precio: ");
                cliente.setEmail(leer.next());
                
            }
            System.out.println("");
            
            /*System.out.println("Desea modificar el codigo de fabricante? (S/N)");
            op = leer.next().toLowerCase();
            if(op.equals("s"))
            {        
                System.out.println("Ingrese el nuevo Codigo de Fabricante");
                codigo_fabricante = leer.nextInt();
                if(!FS.listarCodigoFabricantes().contains(codigo_fabricante))
                {
                    throw new Exception("El fabricante no existe");
                }
                cliente.setCodigo_fabricante(codigo_fabricante);
            }
            */
            
            dao.modificarCliente(cliente);
            System.out.println("");
            
        } 
        catch (Exception e) 
        {
            System.out.println("No se modifico la cliente\n");
            throw e;
        }

    }
  
}
