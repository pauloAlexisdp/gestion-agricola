/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.gestionagricola.modelo.accesodato;

import java.sql.SQLException;
import java.util.ArrayList;
import root.gestionagricola.Cuenta;
import root.gestionagricola.gestionusuario.Usuario;
import root.gestionagricola.modelo.Conexion;
import root.gestionagricola.modelo.FactoriaConexion;


/**
 *
 * @author ignacioburgos
 */
public class UsuarioDA {
        
    private Usuario usuario;
    
    public UsuarioDA(Usuario usuario){
        this.usuario = usuario;
    }
    
    /**
     * 
     * @param nombreUsuario Recibe un <String> que corresponde al nick del Usuario. 
     * @param contrasena Recibe un <String> que corresponde a la contraseña del Usuario
     * @param tipoCuenta Recibe un <String> que corresponde a la cuenta asociada a un Usuario especifico(Supervisor, Dueño , Administrador)
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException 
     */
    
    public static void crearUsuario(String nombreUsuario, String contrasena, String tipoCuenta) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
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
        cdb.close();
    }
    
    
    /**
     * elimina un usuario de la base de datos, solo oculta la informacion del usuario
     * @param nombreUsuario Recibe un <String> que corresponde al NICK del usuario.
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException 
     */
    
    public static void eliminarUsuario(String nombreUsuario) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
        //modulo seguridad si ya hay una Usuario con ese nombre 
        cdb.un_sql = "select nombre from cuenta where nombre = "+nombreUsuario;
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if(cdb.resultado!=null){
           if(cdb.resultado.next()){
               //ACTUALIZACION
               cdb.un_sql = "UPDATE cuenta set estado='eliminado'"+
                      " WHERE nombre="+nombreUsuario;
                cdb.statement.executeUpdate(cdb.un_sql);
                System.out.println("Usuario eliminado");
           }else{
               
           }
        }
    }
    
   

   /**
     * cargo una lista de todos los usuarios registrados en mi cuenta
     * @return una lista de todas las cuentas que tengo en la tabla cuenta
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException 
     */
    public ArrayList cargar() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        ArrayList r = null;
        Cuenta c;
        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
        cdb.un_sql = "select * from cuenta";
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if(cdb.resultado!=null){
            r = new ArrayList();
            while(cdb.resultado.next()){
                c = new Cuenta();
                c.setNombre(cdb.resultado.getString("nombre"));
                c.setPassword(cdb.resultado.getString("contrasena"));
                c.setTipo(cdb.resultado.getString("tipo"));
                r.add(c);
            }
        }else{
            System.out.println("error");
        }
        cdb.close();
      return r;
    }
}
        
    
    
    
    
    
    
    
