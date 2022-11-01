
package TiendaAPP.persistencia;


//para poder importar las librerias, tengo que agregar MySQL JDBC a las librerias del proyecto

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

//DAO no puede ser instanciada
public abstract class DAO 
{
    //objetos necesarios para operar con las bases
    protected Connection conexion = null;
    //OJO, importar import java.sql.Connection y  no mySQL.Connection
    protected ResultSet resultado = null; 
    //OJO, importar import java.sql.Statement y  no mySQL.Statement
    protected Statement sentencia = null;
    
    //atributos de acceso a la base de datos
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    
    //Este metodo se conecta a la base de datos usando todos los datos de los atributos
    protected void conectarBase() throws ClassNotFoundException, SQLException
    {
        try
        {
            Class.forName(DRIVER);
            String urlBaseDatos = "jdbc:mysql://localhost:3306/"+DATABASE+"?useSSL=false";
            conexion = DriverManager.getConnection(urlBaseDatos, USER, PASSWORD);
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            throw ex;
        }            
    }

    /*Este metodo se desconecta de la base de datos para que, si se quieren crear nuevas 
    conexiones, no esten todas ocupadas*/
    protected void desconectarBase() throws Exception
    {
        try
        {
            if (resultado!=null)
                resultado.close();
            if(sentencia!=null)
                sentencia.close();
            if(conexion!= null)
                conexion.close();
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
    
    //Este metodo recibe la sentencia a ejecutar, INSERT, UPDATE, DROP, etc
    
    protected void insertarModificarEliminar(String sql) throws Exception
    {
        try
        {
            //Me conecto a la base de datos, xq siempre voy a estar desconectado a menos q este haciendo algo con ella
            conectarBase();
            
            /*Inicializo el Statement que habia creado como NULL, 
            dentro de la conexcion que hice en la linea anterior*/
            sentencia = conexion.createStatement();
            
            /*ejecuto la sentencia de modificacion de la BD. executeUpdate se usa siempre que 
            necesito modificar la tabla o BD. Si solo quiero consultar, uso executeQuery()*/
            sentencia.executeUpdate(sql);
        }
        catch(SQLException | ClassNotFoundException ex)
        { 
            //conexion.rollback();
            /*
            Descomentar la linea anterior si desean activar el rollback. 
            En WorkBench, correr el siguiente Script:
            
            SET autocommit = 1;
            COMMIT
            
            El rollback me permite, si estoy haciendo una modificacion de varias lineas y me tira un error, 
            tirar para atras todo lo que modifique dentro de esta ejecucion del metodo y dejar todo como estaba
            */
            System.out.println("No se ejecuto la sentencia");
            throw ex;
        }
        finally
        {
            //siempre desconecto la BD luego de hacer una consulta o modificacion
            desconectarBase();
        }
    }
    
    protected void consultarBase(String sql) throws Exception
    {
        try
        {
            conectarBase();
            /*Inicializo el Statement que habia creado como NULL, 
            dentro de la conexcion que hice en la linea anterior*/
            sentencia=conexion.createStatement();
            
            /*Inicializo el ResultSet que habia creado como NULL, 
            con el Statement que inicialize en la linea anterior*/
            resultado= sentencia.executeQuery(sql);
            
            /*NO SE XQ NO LE PUSO UN RETURN, VER EN VIDEOS SIGUIENTES; QUIZAS LO PUEDE USAR DIRECTAMENTE EN
            EL DAO DE LA CLASE
            */
            
        }
        catch (Exception ex)
        {
            System.out.println("Fallo la consulta");
            throw ex;
        }
        finally
        {
            /*desconectarBase(); este no lo uso xq lo voy a hacer en el DAO de cada clase Servicio. Si desconectara ahora, cuando el metodo que fuera
            llame a este metodo, va a ejecutar la consulta pero va a desconectar la BD y voy a perder todos los datos que obtuve*/
        }
    }
}

