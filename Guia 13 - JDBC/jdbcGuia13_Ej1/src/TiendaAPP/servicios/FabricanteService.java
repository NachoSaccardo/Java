/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiendaAPP.servicios;

import TiendaAPP.entidades.Fabricante;
import TiendaAPP.entidades.Fabricante;

import TiendaAPP.persistencia.FabricanteDAO;
import java.util.ArrayList;

import java.util.Collection;
import java.util.Scanner;

public class FabricanteService 
{
    private final FabricanteDAO dao;
    
     public FabricanteService()
    {
        this.dao = new FabricanteDAO();
    }
    
    public void crearFabricante(Integer codigo, String nombre) throws Exception
    {
        try 
        {
            //valido que lo que le pase al metodo como dato de creacion, este OK. podria validar tambien el formato
            if(codigo==null)
                throw new Exception("Debe indicar un codigo\n");
            if(nombre==null || nombre.trim().isEmpty())
                throw new Exception("Debe indicar un nombre\n");
                        
            //valido si este fabricante ya existe en mi tabla: 
            if(dao.buscarFabricantePorCodigo(codigo) != null)
            {
                throw new Exception("El fabricante ya existe\n");
            }
            
            //creo el Fabricante
            Fabricante fabricante = new Fabricante();
            fabricante.setCodigo(codigo);
            fabricante.setNombre(nombre);
           
            System.out.println("Fabricante Creado: ");
            System.out.println(fabricante.toString());
            dao.guardarFabricante(fabricante);
            System.out.println("");
             
            
        } 
        catch (Exception e) 
        {
            System.out.println("No se creo el fabricante\n");
            throw e;
        }
    }
    
    public void eliminarFabricante(Integer codigo) throws Exception
    {
        try 
        {
            //valido que lo que le pase al metodo como dato de creacion, este OK. podria validar tambien el formato
            if(codigo==null)
                throw new Exception("Debe indicar un codigo\n");
                        
            //valido si este fabricante existe en mi tabla: 
            if(dao.buscarFabricantePorCodigo(codigo)==null)
            {
                throw new Exception("El fabricante no existe\n");
            }
            System.out.println("Fabricante encontrado\n");
            dao.eliminarFabricante(dao.buscarFabricantePorCodigo(codigo));
                         
        } 
        catch (Exception e) 
        {
            System.out.println("No se creo el fabricante\n");
            throw e;
        }
    }

    public void listaFabricantes() throws Exception
    {
        try 
        {
            Collection<Fabricante> lista = dao.listarFabricantes();
            if(lista.isEmpty())
            {
                throw new Exception("La lista esta vacia\n");
            }
            
            for (Fabricante aux : lista) 
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

    public void menuFabricante()
       {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");

            int opcion = 0;
            String nombre;
            int codigo;

            do
            {
                System.out.println("Menu Fabricante:");
                System.out.println("-----------------------------------------");
                System.out.println("Seleccione una opcion\n1: Listar los fabricantes disponibles\n2: Crear un nuevo Fabricante\n3: Modificar un Fabricante\n"
                        + "4: Eliminar un fabricante\n9: Salir ");
                System.out.println("-----------------------------------------");
                opcion = leer.nextInt();
                switch(opcion)
                 {
                     case 1:
                         try 
                         {
                             listaFabricantes();
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

                             crearFabricante(codigo, nombre);
                         }
                         catch (Exception e) 
                         {
                             System.out.println(e.getMessage());
                          }
                         break;
                     case 3:
                         try 
                         {
                             modificarFabricante();
                         }
                         catch (Exception e) 
                         {
                             System.out.println(e.getMessage());
                         }
                         break;
                     case 4:
                         try 
                         {
                             System.out.println("Ingrese un codigo para eliminar el fabricante");
                             codigo = leer.nextInt();
                             eliminarFabricante(codigo);
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

    public void mostrarFabricantePorCodigo(int codigo) throws Exception{
        
        Fabricante fabricante = dao.buscarFabricantePorCodigo(codigo);
        System.out.println(fabricante);
     }
    
    public void modificarFabricante() throws Exception
    {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int codigo;
        Fabricante fabricante = null;
        try 
        {   
            System.out.println("Seleccione un fabricante para modificarlo: ");
            codigo=leer.nextInt();
            System.out.println("Fabricante seleccionado: ");
            mostrarFabricantePorCodigo(codigo);
            fabricante = dao.buscarFabricantePorCodigo(codigo);
            
            if(fabricante==null)
            {
                throw new Exception("El fabricante no existe");
            }
            System.out.println("");


            System.out.println("Ingrese el nuevo nombre: ");
            fabricante.setNombre(leer.next());
            
            dao.modificarFabricante(fabricante);
             
        } 
        catch (Exception e) 
        {
            System.out.println("No se modifico el fabricante\n");
            throw e;
        }

    }


public ArrayList<Integer> listarCodigoFabricantes() throws Exception
{
    try {
        Collection<Fabricante> listaFabricantes = dao.listarFabricantes();
        ArrayList<Integer> lista = new ArrayList();
        for (Fabricante aux : listaFabricantes) 
        {
         
            lista.add(aux.getCodigo());            
        }
        return lista;
    } 
    catch (Exception e) 
    {
        throw e;
    }
}

}
