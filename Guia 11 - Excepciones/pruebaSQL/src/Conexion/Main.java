/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author juans
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
        // TODO code application logic here
      
        Connection con;
        String url = "jdbc:mysql://localhost:3306/nba?zeroDateTimeBehavior=convertToNull";
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "root");
            System.out.println("Conexion exitosa");
            
            
            String sql = "SELECT codigo, nombre FROM jugador WHERE codigo<20 AND codigo>10";
            Statement stmt = con.createStatement();
            System.out.println("Statement creado");
            System.out.println("Consulta: SELECT codigo, nombre FROM jugador WHERE codigo<20 AND codigo>10");
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("Query ejecutada");

            //int c = rs.getString("nombre"); esto puesto antes de llamar al rs.next() tira error
            //el rs.next() avanza una fila en mi tabla ResultSet. Si nunca lo invoco, sigo parado en la fila 0
            while (rs.next()) 
            {
                //puedo indicar la columna con el numero de columna de la tabla resultante
                int b = rs.getInt(1);
                //o la puedo indicar con su nombre como String
                String a = rs.getString("nombre");            
                //System.out.println(c);
                System.out.println("Codigo: "+b+", Nombre: "+a);
            }
            rs.close();
        }//muchos de los metodos de la clase connection tiran excepciones de tipo SQLException
        catch (SQLException ex) 
        {
            con = null;
            System.out.println("No se pudo conectar");
            ex.printStackTrace();
            System.out.println("SQLException: "+ex.getMessage());
            System.out.println("SQLState: "+ex.getSQLState());
            System.out.println("VendorError: "+ex.getErrorCode());
        }
        

        
        try
        {   
            System.out.println("Ejemplo con Prepared Statement");
            System.out.println("Consulta: SELECT codigo, nombre FROM jugador WHERE codigo<? AND codigo>?\nps.setInt(1,20);\nps.setInt(2,10);");
            //Prepared Statement: Una sentencia que preparo antemano xq la voy a llamar muchas veces
            //PreparedStatement ps = con.prepareCall("String");
            /*Puedo dejar parametros de la sentencia libres para completarlos luego dependiendo de alguna condicion. Ej: */
            PreparedStatement ps;
            ps = con.prepareStatement("SELECT codigo, nombre FROM jugador WHERE codigo<? AND codigo>?");
            //Luego, para darle valor a esos ? uso los metodos ps.setXXX(); donde XXX es el tipo de variable
            ps.setInt(1,20);
            ps.setInt(2,10);
            //Luego, puedo ejecutar la sentencia con el metodo executeUpdate()
            ResultSet rs1 = ps.executeQuery();
            while (rs1.next()) 
                {
                    //puedo indicar la columna con el numero de columna de la tabla resultante
                    int c = rs1.getInt(1);
                    //o la puedo indicar con su nombre como String
                    String d = rs1.getString("nombre");            
                    //System.out.println(c);
                    System.out.println("Codigo: "+c+", Nombre: "+d);
                }
                rs1.close();
        }
       //muchos de los metodos de la clase connection tiran excepciones de tipo SQLException
        catch(SQLException ex1) 
        {
            con = null;
            System.out.println("No se pudo conectar");
            ex1.printStackTrace();
            System.out.println("SQLException: "+ex1.getMessage());
            System.out.println("SQLState: "+ex1.getSQLState());
            System.out.println("VendorError: "+ex1.getErrorCode());
        }
        
    } 
        
    }
    

