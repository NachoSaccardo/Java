/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiendaAPP.persistencia;

import TiendaAPP.entidades.Fabricante;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author juans
 */
public final class FabricanteDAO extends DAO
{
    public FabricanteDAO(){
    }
    
    public void guardarFabricante(Fabricante fabricante) throws Exception
    {
        try 
        {
            if(fabricante ==null)
                throw new Exception("Debe indicar un fabricante valido");
            
            String sql = "INSERT INTO Fabricante (codigo, nombre) VALUES ("+fabricante.getCodigo()+",'"+fabricante.getNombre()+"');";
            
            insertarModificarEliminar(sql);
        } 
        catch (Exception e) 
        {
            System.out.println("No se guardo el fabricante");
            throw e;
        }
    }

    public void modificarFabricante(Fabricante fabricante) throws Exception
    {
        try 
        {
            if(fabricante ==null)
                throw new Exception("Debe indicar un fabricante valido");
            
            String sql = "UPDATE Fabricante SET nombre= '"+fabricante.getNombre()+"' WHERE codigo='"+fabricante.getCodigo()+"';";
            
            insertarModificarEliminar(sql);
        } 
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public void eliminarFabricante(Fabricante fabricante) throws Exception
    {
        try 
        {
            if(fabricante ==null)
                throw new Exception("Debe indicar un fabricante valido");
            
            String sql = "DELETE FROM Fabricante WHERE codigo= '"+fabricante.getCodigo()+"';";
            
            insertarModificarEliminar(sql);
        } 
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public Fabricante buscarFabricantePorCodigo(Integer codigo) throws Exception
    {
        try 
        {
            
            String sql = "SELECT * FROM fabricante WHERE codigo = '"+codigo+"';";
            consultarBase(sql);
            Fabricante fabricante = null;
            while(resultado.next())
            {
                fabricante= new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
                
            }    
            desconectarBase();
            return fabricante;               
        } 
        catch (Exception e) 
        {
            desconectarBase();
            e.printStackTrace();
            throw e;
        }
    }
    
        
    public Collection<Fabricante> listarFabricantes() throws Exception
    {
       try 
        {
            String sql = "SELECT * FROM fabricante;";
            consultarBase(sql);
            
            Fabricante fabricante = null;
            ArrayList<Fabricante> listafabricantes = new ArrayList();
            
            while(resultado.next())
            {   fabricante= new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
                listafabricantes.add(fabricante);
            }    
            desconectarBase();
            return listafabricantes;
                        
        } 
        catch (Exception e) 
        {
            desconectarBase();
            e.printStackTrace();
            throw e;
        }
    }
    
}
