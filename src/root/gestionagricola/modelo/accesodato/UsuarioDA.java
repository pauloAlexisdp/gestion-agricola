
package root.gestionagricola.modelo.accesodato;

import java.sql.SQLException;
import java.util.ArrayList;
import root.gestionagricola.gestionusuario.ControladorUsuario;
import root.gestionagricola.modelo.Conexion;
import root.gestionagricola.modelo.SingletonConexion;


/**
 * Permite controlar el acceso a la tabla de Usuarios.
 * @author Los Lanzas
 */
public class UsuarioDA {
    
    /**
     * 
     * @param nombreUsuario Recibe un <String> que corresponde al nick del Usuario. 
     * @param contrasena Recibe un <String> que corresponde a la contraseña del Usuario
     * @param tipoCuenta Recibe un <String> que corresponde a la cuenta asociada a un Usuario especifico(Supervisor, Dueño , Administrador)
     * @throws ClassNotFoundException En caso de que no se encuentre la clase que
     * permite la conexion con la Base de Datos.
     * @throws InstantiationException En caso de que no se pueda realizar la
     * instanciacion de la Base de Datos.
     * @throws IllegalAccessException En caso de que no se pueda establecer 
     * conexion con la Base de Datos.
     * @throws SQLException En caso que la consulta realizada no sea soportada
     * por el lenguaje SQL. 
     */    
    public static void crearUsuario(String nombreUsuario, String contrasena, String tipoCuenta) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
        Conexion cdb = SingletonConexion.getInstancia().getConexiondb();
        //modulo seguridad si ya hay una cuenta con ese nombre

        cdb.un_sql ="select nombre from cuenta where nombre = '"+nombreUsuario+"'";
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if(cdb.resultado != null){

           if(cdb.resultado.next()){
               cdb.un_sql = "UPDATE cuenta set contrasena='"+contrasena+"', tipo='"+tipoCuenta+"'"+
                       "WHERE nombre='"+nombreUsuario+"'";
                cdb.statement.executeUpdate(cdb.un_sql);
                System.out.println("Datos actualizados");
           }else{
               cdb.un_sql = "Insert into cuenta values('"+nombreUsuario+"','"+contrasena+"','"+tipoCuenta+"')";
               cdb.statement.executeUpdate(cdb.un_sql);
               System.out.println("Datos guardados");
               
           }
        }else{
            cdb.un_sql = "Insert into cuenta values ('"+nombreUsuario+"','"+contrasena+"','"+tipoCuenta+"')";
            cdb.statement.executeUpdate(cdb.un_sql);
        }
//        cdb.close();
    }
    
  
    
    /**
     * Permite modificar un usuario.
     * @param nombreUsuario Recibe un <String> que corresponde al nick del usuario.
     * @param nombreUsuarioNuevo Recibe un <String> que corresponde al nick nuevo del usuario o el mismo.
     * @param contrasena Recibe un <String> con la contraseña nueva del usuario.
     * @param tipoCuenta Recibe un <String> con el tipo de cuenta ya sea nueva o antigua del usuario.
     * @throws ClassNotFoundException En caso de que no se encuentre la clase que
     * permite la conexion con la Base de Datos.
     * @throws InstantiationException En caso de que no se pueda realizar la
     * instanciacion de la Base de Datos.
     * @throws IllegalAccessException En caso de que no se pueda establecer 
     * conexion con la Base de Datos.
     * @throws SQLException En caso que la consulta realizada no sea soportada
     * por el lenguaje SQL.
     */
        
    public static void modificarUsuario(String nombreUsuario, String nombreUsuarioNuevo, String contrasena, String tipoCuenta) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
        Conexion cdb = SingletonConexion.getInstancia().getConexiondb();
        //modulo seguridad si ya hay una Usuario con ese nombre 
        cdb.un_sql = "select nombre from cuenta where nombre = '"+nombreUsuario+"'";
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if(cdb.resultado!=null){
           if(cdb.resultado.next()){
               //ACTUALIZACION DE LOS DATOS DE UN USUARIO
                cdb.un_sql = "UPDATE cuenta set nombre='"+nombreUsuarioNuevo+"', contrasena='"+contrasena+"', tipo='"+tipoCuenta+"'"+
                       "WHERE nombre='"+nombreUsuario+"'";
                cdb.statement.executeUpdate(cdb.un_sql);
                System.out.println("Datos actualizados");
           }else{
               
           }
        }
    }
    
    /**
     * Elimina un usuario de la base de datos, solo oculta la informacion del usuario
     * @param nombreUsuario Recibe un <String> que corresponde al NICK del usuario.
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException 
     */
    public static void eliminarUsuario(String nombreUsuario) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        Conexion cdb = SingletonConexion.getInstancia().getConexiondb();
        //modulo seguridad si ya hay una Usuario con ese nombre 
        cdb.un_sql = "select nombre from cuenta where nombre = '"+nombreUsuario+"'";
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if(cdb.resultado!=null){
           if(cdb.resultado.next()){
               //eliminacion
               cdb.un_sql = "DELETE FROM cuenta"+
                      " WHERE nombre='"+nombreUsuario+"'";
                cdb.statement.executeUpdate(cdb.un_sql);
                System.out.println("Usuario eliminado");
           }else{
               
           }
        }
    }
    
    /**
     * Permite modificar la clave del usuario.
     * @param nombreUsuario Se espera un <String> del nombre de usuario.
     * @param contrasenaNueva Se espera un <String> con la nueva clave.
     * @throws ClassNotFoundException En caso de que no se encuentre la clase que
     * permite la conexion con la Base de Datos.
     * @throws InstantiationException En caso de que no se pueda realizar la
     * instanciacion de la Base de Datos.
     * @throws IllegalAccessException En caso de que no se pueda establecer 
     * conexion con la Base de Datos.
     * @throws SQLException En caso que la consulta realizada no sea soportada
     * por el lenguaje SQL. 
     */
    public static void modificarContrasena(String nombreUsuario, String contrasenaNueva) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
        Conexion cdb = SingletonConexion.getInstancia().getConexiondb();
        
        cdb.un_sql = "select nombre from cuenta where nombre = '"+nombreUsuario+"'";
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if(cdb.resultado!=null){
           if(cdb.resultado.next()){
               //ACTUALIZACION LA CONTRASEÑA DE USUAR
                cdb.un_sql = "UPDATE cuenta set contrasena='"+contrasenaNueva+"'"+
                       "WHERE nombre='"+nombreUsuario+"'";
                cdb.statement.executeUpdate(cdb.un_sql);
                System.out.println("Contraseña actualizada");
           }else{
               
           }
        }

    }
   

   /**
     * Cargo una lista de todos los usuarios registrados en mi cuenta
     * @return una lista de todas las cuentas que tengo en la tabla cuenta
     * @throws ClassNotFoundException En caso de que no se encuentre la clase que
     * permite la conexion con la Base de Datos.
     * @throws InstantiationException En caso de que no se pueda realizar la
     * instanciacion de la Base de Datos.
     * @throws IllegalAccessException En caso de que no se pueda establecer 
     * conexion con la Base de Datos.
     * @throws SQLException En caso que la consulta realizada no sea soportada
     * por el lenguaje SQL. 
     */
    public static ArrayList cargar() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        ArrayList r = null;
        Conexion cdb = SingletonConexion.getInstancia().getConexiondb();
        cdb.un_sql = "select * from cuenta";
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if(cdb.resultado!=null){
            r = new ArrayList();
            while(cdb.resultado.next()){
                r.add(ControladorUsuario.modelUsuario(cdb.resultado.getString("nombre"), cdb.resultado.getString("tipo"), cdb.resultado.getString("contrasena")));
            }
        }else{
            System.out.println("error");
        }
//        cdb.close();
      return r;
    }
    
    

 
}
        
    
    
    
    
    
    
    

