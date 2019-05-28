
package root.gestionagricola.modelo;


import java.sql.*;

/**
 * Clase que permite la conexion con la base de datos
 * @author Los Lanzas
 */
public class Conexion {
    
    public Connection conexion = null;
    public Statement statement = null;
    public DatabaseMetaData dbmd;
    public String s_conexion = null;
    public ResultSet resultado = null;
    public String un_sql  = null;
  
    protected String jdbc;
    protected String driver;
    protected String host;
    protected String database;
    protected String username;
    protected String password;
    
    /**
     * Constructor de la clase.
     * @param jdbc 
     * @param driver Driver de la base de datos.
     * @param host Host de la base de datos.
     * @param database Nombre de la base de datos.
     * @param username Nombre del usuario de la base de datos.
     * @param password Clave del usuario de la base de datos.
     * @throws ClassNotFoundException En caso de que no se encuentre la clase que
     * permite la conexion con la Base de Datos.
     * @throws InstantiationException En caso de que no se pueda realizar la
     * instanciacion de la Base de Datos.
     * @throws IllegalAccessException En caso de que no se pueda establecer 
     * conexion con la Base de Datos.
     * @throws SQLException En caso que la consulta realizada no sea soportada
     * por el lenguaje SQL.
     */
    public Conexion(String jdbc, String driver, String host, String database,String username,String password) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        this.jdbc = jdbc;
        this.driver = driver;
        this.host = host;
        this.database = database;
        this.username = username;
        this.password = password;
        init();
    }
    
    /**
     * Inicializa la conexion con la base de datos
     * @throws ClassNotFoundException En caso de que no se encuentre la clase que
     * permite la conexion con la Base de Datos.
     * @throws InstantiationException En caso de que no se pueda realizar la
     * instanciacion de la Base de Datos.
     * @throws IllegalAccessException En caso de que no se pueda establecer 
     * conexion con la Base de Datos.
     * @throws SQLException En caso que la consulta realizada no sea soportada
     * por el lenguaje SQL.
     */
    public void init() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        s_conexion = this.jdbc + this.host + "/"+this.database;
        Class.forName(this.driver).newInstance();
        conexion = DriverManager.getConnection(this.jdbc + this.host + "/"+this.database, this.username,this.password);
        dbmd = conexion.getMetaData();
        statement = (Statement) conexion.createStatement();
    }
    
    /**
     * Permite obtener el driver.
     * @return Retorna un <String> con el driver de la base de datos.
     */
    public String getDriver(){
        return this.driver;
    }
    
    /**
     * Finaliza conexion.
     * @throws SQLException En caso que la consulta realizada no sea soportada
     * por el lenguaje SQL.
     */
    public void close() throws SQLException{
        this.statement.close();
        this.resultado.close();
    }
    
}
