/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estancias.servicios;

import static Estancias.Utilidades.Utilidades.StringToCalendar;
import Estancias.entidades.Casa;
import Estancias.persistencia.CasaDAO;
import java.util.Calendar;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author I0515541
 */
public final class CasaService 
{
    private final CasaDAO dao;
     
    //constructor vacio de CasaService, le crea un DAO cuando instancion el servicio;
    public CasaService()
    {
        this.dao = new CasaDAO();
    }
    
    public void crearCasa(Integer id_casa, String calle, Integer numero, String codigo_postal, String ciudad, String pais, Calendar fecha_desde, Calendar fecha_hasta, Integer tiempo_minimo, Integer tiempo_maximo, Float precio_habitacion, String tipo_vivienda) throws Exception
    {
        try 
        {
            //valido que lo que le pase al metodo como dato de creacion, este OK. podria validar tambien el formato
            if(id_casa==null)
                throw new Exception("Debe indicar un ID\n");
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
            if(fecha_desde==null)
                throw new Exception("Debe indicar una fecha de inicio\n");
            if(fecha_hasta==null)
               throw new Exception("Debe indicar una fecha de fin\n");
            if(tiempo_minimo==null)
                throw new Exception("Debe indicar un tiempo minimo\n");
            if(tiempo_maximo==null)
                throw new Exception("Debe indicar un tiempo maximo\n");
            if(precio_habitacion==null)
                throw new Exception("Debe indicar un precio de habitacion\n");
            if(tipo_vivienda==null || tipo_vivienda.trim().isEmpty())
                throw new Exception("Debe indicar un tipo de vivienda\n");
                        
            //valido si este casa ya existe en mi tabla: 
            if(dao.buscarCasaPorCodigo(id_casa) != null)
            {
                throw new Exception("La casa ya existe\n");
            }
            //creo el Casa
            Casa casa = new Casa();
            
                casa.setId_casa(id_casa);
                casa.setCalle(calle);
                casa.setNumero(numero);
                casa.setCodigo_postal(codigo_postal);
                casa.setCiudad(ciudad);
                casa.setPais(pais);
                casa.setFecha_desde(fecha_desde);
                casa.setFecha_hasta(fecha_hasta);
                casa.setTiempo_minimo(tiempo_minimo);
                casa.setTiempo_maximo(tiempo_maximo);
                casa.setPrecio_habitacion(precio_habitacion);
                casa.setTipo_vivienda(tipo_vivienda);
                
            System.out.println("Casa Creada: ");
            System.out.println(casa.toString());
            dao.guardarCasa(casa);
            System.out.println("");
            
        } 
        catch (Exception e) 
        {
            System.out.println("No se creo el casa\n");
            throw e;
        }
    }
    
    public void eliminarCasa(Integer id_casa) throws Exception
    {
        try 
        {
            //valido que lo que le pase al metodo como dato de creacion, este OK. podria validar tambien el formato
            if(id_casa==null)
                throw new Exception("Debe indicar un ID de casa\n");
                        
            //valido si este casa existe en mi tabla: 
            if(dao.buscarCasaPorCodigo(id_casa)==null)
            {
                throw new Exception("La casa no existe\n");
            }
            System.out.println("Casa encontrada\n");
            dao.eliminarCasa(dao.buscarCasaPorCodigo(id_casa));
                         
        } 
        catch (Exception e) 
        {
            System.out.println("No se elimino la casa\n");
            throw e;
        }
    }

    public void listaCasas() throws Exception
    {
        try 
        {
            Collection<Casa> lista = dao.listarCasas();
            if(lista.isEmpty())
            {
                throw new Exception("La lista esta vacia\n");
            }
            
            for (Casa aux : lista) 
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

    public void menuCasa(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion = 0;
        int id_casa;
        String calle;
        Integer numero;
        String codigo_postal;
        String ciudad;
        String pais;
        Calendar fecha_desde;
        Calendar fecha_hasta;
        Integer tiempo_minimo;
        Integer tiempo_maximo;
        Float precio_habitacion;
        String tipo_vivienda;
       
        do
        {
           System.out.println("Menu Casa:");
           System.out.println("-----------------------------------------");
           System.out.println("Seleccione una opcion\n1: Listar las casas disponibles\n2: Crear una nueva Casa\n3: Modificar una casa\n"
                   + "4: Eliminar una casa\n9: Volver al Menu Principal ");
           System.out.println("-----------------------------------------");
           opcion = leer.nextInt();
           switch(opcion)
            {
                case 1:
                    try 
                    {
                        listaCasas();
                    }
                    catch (Exception e) 
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try 
                    {
                        System.out.println("Ingrese el ID de la casa");
                        id_casa = leer.nextInt();
                        System.out.println("Ingrese la calle");
                        calle= leer.next();
                        System.out.println("Ingrese el numero de la casa");
                        numero=leer.nextInt();
                        System.out.println("Ingrese el codigo postal");
                        codigo_postal=leer.next();
                        System.out.println("Ingrese la ciudad");
                        ciudad=leer.next();
                        System.out.println("Ingrese el pais");
                        pais=leer.next();
                        System.out.println("Ingrese la fecha de inicio en formato yyyy-MM-dd");
                        fecha_desde=StringToCalendar(leer.next());
                        System.out.println("Ingrese la fecha de fin en formato yyyy-MM-dd");
                        fecha_hasta=StringToCalendar(leer.next());
                        System.out.println("Ingrese el tiempo minimo de estadia");
                        tiempo_minimo=leer.nextInt();
                        System.out.println("Ingrese el tiempo maximo de estadia");
                        tiempo_maximo=leer.nextInt();
                        System.out.println("Ingrese el precio de la habitacion");
                        precio_habitacion = leer.nextFloat();
                        System.out.println("Ingrese el tipo de vivienda");
                        tipo_vivienda=leer.next();
                        
                        crearCasa(id_casa, calle, numero, codigo_postal, ciudad, pais, fecha_desde, fecha_hasta, tiempo_minimo, tiempo_maximo, precio_habitacion, tipo_vivienda);
                    }
                    catch (Exception e) 
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    
                    try
                    {
                        modificarCasa();
                    }
                    catch(Exception e)
                            {
                                System.out.println(e.getMessage());
                            }
                    break;
                case 4:
                    try 
                    {
                        System.out.println("Ingrese un ID para eliminar el casa");
                        id_casa = leer.nextInt();
                        eliminarCasa(id_casa);
                    }
                    catch (Exception e) 
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
             }
       }while(opcion!=0);
    }
    
    public void mostrarCasaPorCodigo(int id_casa) throws Exception{
        
        Casa casa = dao.buscarCasaPorCodigo(id_casa);
        System.out.println(id_casa);
             
    }
    
    public void modificarCasa() throws Exception
    {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int id_casa;
        Casa casa = null;
        String op;

        try 
        {   
            System.out.println("Indique el ID de una casa para modificarla: ");
            id_casa=leer.nextInt();
            System.out.println("Casa seleccionado: ");
            mostrarCasaPorCodigo(id_casa);
            
            casa = dao.buscarCasaPorCodigo(id_casa);
            
            if(casa==null)
            {
                throw new Exception("La casa no existe");
            }
            System.out.println("");

            System.out.println("Desea modificar la Direccion? (S/N)");
            op = leer.next().toLowerCase();
            if(op.equals("s"))
            {               
                System.out.println("Ingrese la nueva calle: ");
                casa.setCalle(leer.next());
                System.out.println("Ingrese el numero");
                casa.setNumero(leer.nextInt());
                System.out.println("Ingrese la ciudad");
                casa.setCiudad(leer.next());
                System.out.println("Ingrese el Pais");
                casa.setPais(leer.next());
            }
            System.out.println("");
            
            System.out.println("Desea modificar el precio de la habitacion? (S/N)");
            op = leer.next().toLowerCase();
            if(op.equals("s"))
            {               
                System.out.println("Ingrese el nuevo precio: ");
                casa.setPrecio_habitacion(leer.nextFloat());
                
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
                casa.setCodigo_fabricante(codigo_fabricante);
            }
            */
            
            dao.modificarCasa(casa);
            System.out.println("");
            
        } 
        catch (Exception e) 
        {
            System.out.println("No se modifico la casa\n");
            throw e;
        }

    }
  
}
