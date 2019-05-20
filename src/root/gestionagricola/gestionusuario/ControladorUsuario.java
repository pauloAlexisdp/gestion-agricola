package root.gestionagricola.gestionusuario;

import java.sql.SQLException;
import root.gestionagricola.modelo.accesodato.UsuarioDA;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *x
 * @author ignacioburgos
 */
public class ControladorUsuario{
    
    private Usuario usuario;
    
    
    
    /**
     * Permite ingresar un nuevo contrato a la base de datos
     * @param nombreUsuario Se espera un <String> identificador del nombre (unico).
     * @param contrasena Se espera un <String> con la contraseña asociada a un usuario.
     * @param tipoCuenta Se espera un <String> con el tipo de cuenta asociada a un usuario {Administrador, Dueño, Supervisor}
     */
    public static void CrearUsuario(String nombreUsuario, String contrasena, String tipoCuenta){ 

        try{
            UsuarioDA.crearUsuario(nombreUsuario, contrasena, tipoCuenta);
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception){}
    }
    
    public static void ModificarUsuario(String nombreUsuario, String contrasena, String tipoCuenta){

    }
   
    /**
     * Permite eliminar un Usuario de la Base de datos.
     * @param nombreUsuario Se espera un <String> identificador del nombre (unico).
     * @param contrasena Se espera un <String> con la contraseña asociada a un usuario.
     * @param tipoCuenta Se espera un <String> con el tipo de cuenta asociada a un usuario {Administrador, Dueño, Supervisor}
     */
    
    public static void EliminarUsuario(String nombreUsuario, String contrasena, String tipoCuenta){
        
        try{
            UsuarioDA.eliminarUsuario(nombreUsuario);
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception){}

        
    }

    public static String[] getUsuario(String nombre, String contrasena){
        
        //llamada a la BD para obtener al usuario.
        return null;
    }
    
    
    
}
