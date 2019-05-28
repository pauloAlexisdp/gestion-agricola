
package root.gestionagricola.modelo.accesodato;

import root.gestionagricola.modelo.*;
import java.sql.SQLException;
import java.util.ArrayList;
import root.gestionagricola.ControladorCuenta;
import root.gestionagricola.Cuenta;

/**
 * Permite controlar el acceso de Cuentas a la Base de Datos
 * @author Los Lanzas
 */
public class CuentaDA {
    private Cuenta cuenta;
    
    public CuentaDA(Cuenta cuenta){
        this.cuenta = cuenta;
    }
    
    /**
     * Permite guardar los datos de una cuenta en la tabla de usuarios.
     * @throws ClassNotFoundException En caso de que no se encuentre la clase que
     * permite la conexion con la Base de Datos.
     * @throws InstantiationException En caso de que no se pueda realizar la
     * instanciacion de la Base de Datos.
     * @throws IllegalAccessException En caso de que no se pueda establecer 
     * conexion con la Base de Datos.
     * @throws SQLException En caso que la consulta realizada no sea soportada
     * por el lenguaje SQL.
     */
    public void guardar() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        Conexion cdb = SingletonConexion.getInstancia().getConexiondb();
        
        cdb.un_sql = "select nombre from cuenta where nombre = '"+cuenta.getNombre()+"'";
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if(cdb.resultado!=null){
           if(cdb.resultado.next()){
               cdb.un_sql = "UPDATE cuenta set contrasena='"+cuenta.getPassword()+"', tipo='"+cuenta.getTipo()+"'"+
                       "WHERE nombre='"+cuenta.getNombre()+"'";
                cdb.statement.executeUpdate(cdb.un_sql);
                System.out.println("Datos actualizados");
           }else{
               cdb.un_sql = "Insert into cuenta values('"+cuenta.getNombre()+"','"+cuenta.getPassword()+"','"+cuenta.getTipo()+"')";
               cdb.statement.executeUpdate(cdb.un_sql);
               System.out.println("Datos guardados");
               
           }
        }else{
            cdb.un_sql = "Insert into cuenta values ('"+cuenta.getNombre()+"','"+cuenta.getPassword()+"','"+cuenta.getTipo()+"')";
            cdb.statement.executeUpdate(cdb.un_sql);
        }
        cdb.close();
    }
    
    /**
     * Permite cargar todas las cuentas de la tabla de cuentas.
     * @return Retorna un <ArrayList> con todas las cuenta en la Base de Datos.
     * @throws ClassNotFoundException En caso de que no se encuentre la clase que
     * permite la conexion con la Base de Datos.
     * @throws InstantiationException En caso de que no se pueda realizar la
     * instanciacion de la Base de Datos.
     * @throws IllegalAccessException En caso de que no se pueda establecer 
     * conexion con la Base de Datos.
     * @throws SQLException En caso que la consulta realizada no sea soportada
     * por el lenguaje SQL. 
     */
    public ArrayList cargar() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        ArrayList r = null;
        Conexion cdb = SingletonConexion.getInstancia().getConexiondb();
        cdb.un_sql = "select * from cuenta";
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if(cdb.resultado!=null){
            r = new ArrayList();
            while(cdb.resultado.next()){
                r.add(ControladorCuenta.modelCuenta(cdb.resultado.getString("nombre"), cdb.resultado.getString("contrasena"), cdb.resultado.getString("tipo")));
            }
        }else{
            System.out.println("error");
        }
        cdb.close();
      return r;
    }
    
    /**
     * Permite buscar los datos de una cuenta especifica.
     * @param nombre Se espera un <String> con el nombre de la cuenta.
     * @param password Se espera un <String> con la clave de la cuenta.
     * @return Retorna una instancia de <Cuenta> con los datos encontrados.
     * @throws ClassNotFoundException En caso de que no se encuentre la clase que
     * permite la conexion con la Base de Datos.
     * @throws InstantiationException En caso de que no se pueda realizar la
     * instanciacion de la Base de Datos.
     * @throws IllegalAccessException En caso de que no se pueda establecer 
     * conexion con la Base de Datos.
     * @throws SQLException En caso que la consulta realizada no sea soportada
     * por el lenguaje SQL. 
     */
    public static Cuenta buscar(String nombre, String password) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
        Conexion cdb = SingletonConexion.getInstancia().getConexiondb();
        
        cdb.un_sql = "select nombre,contrasena, tipo from cuenta where nombre like '"+nombre+"' and contrasena like '"+password+"'";
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if(cdb.resultado!=null){
            while(cdb.resultado.next()){
                return ControladorCuenta.modelCuenta(cdb.resultado.getString("nombre"), cdb.resultado.getString("contrasena"), cdb.resultado.getString("tipo"));
            }
            return null;
        }else{
            return null;
        }
      //  cdb.close();
    }
}
