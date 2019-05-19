package root.gestionagricola.gestionusuario;

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
    
    
    public static void CrearUsuario(String nombreUsuario, String contrasena, String tipoCuenta){ 
        
        String nombre = nombreUsuario;
        // validar que el nombre del usuario y que no se repita dentro de la BD
        
        String password = contrasena;
        
        String cuenta = tipoCuenta;
        
        // agregar los 3 parametros a la BD.
        
    }
    
    
    public static void ModificarUsuario(String nombreUsuario, String contrasena, String tipoCuenta){
        
        String modificarNombre = nombreUsuario;

        
        
        
        
    }
   
    
    public static void EliminarUsuario(String nombreUsuario, String contrasena, String tipoCuenta){
        
        String nombre = nombreUsuario;
        
        String password = contrasena;
        
        // verificar en la BD que los dos parametros existen y eliminarlos.
        
        
        
        
        
    }

    public static String[] getUsuario(String nombre, String contrasena){
        
        //llamada a la BD para obtener al usuario.
        return null;
    }
    
    
    
}
