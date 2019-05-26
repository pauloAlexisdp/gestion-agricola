package root.gestionagricola.gestionusuario;

import java.sql.SQLException;
import java.util.ArrayList;
import root.gestionagricola.gestioncontrato.Contrato;
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
    
    
    
    /**
     * 
     * @param nombreUsuarioAntiguo Se espera un <String> identificador del nombre (único)
     * @param nombreUsuarioNuevo Se espera un <String> identificador nuevo del usuario
     * @param contrasena Se espera un <String> con la contraseña nueva asociada a un usuario.
     * @param tipocuenta Se espera un <String> con el tipo de cuenta nueva asociada a un usuario {Administrador, Dueño, Supervisor}
     * @throws ClassNotFoundException 
     */
    
    public static void ModificarUsuario(String nombreUsuarioAntiguo, String nombreUsuarioNuevo, String contrasena, String tipocuenta) throws ClassNotFoundException{
        
         try{
            UsuarioDA.modificarUsuario(nombreUsuarioAntiguo, nombreUsuarioNuevo, contrasena, tipocuenta);
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception){}
    }
   

    public static void ModificarContrasena(String nombreUsuario, String contrasenaNueva){
        
        try{
            
            UsuarioDA.modificarContrasena(nombreUsuario, contrasenaNueva);
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception){}
        
    } 
    
    
    // dudas con este método
    /**
     * 
     * @param nombreUsuario Se espera un <String> para identificar a un Usuario (único).
     * @return
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException 
     */
    
    public static boolean BuscarUsuario(String nombreUsuario) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
        ArrayList<Usuario> usuarios = new ArrayList<>();

        usuarios = UsuarioDA.cargar();
      
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getNombreUsuario().equals(nombreUsuario)){
                return true;
            }
        }
        return false;   
    }
    
    
    public static boolean BuscarContrasena(String nombreUsuario, String contrasenaAntigua) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException{
        
         ArrayList<Usuario> usuarios = new ArrayList<>();

        usuarios = UsuarioDA.cargar();
      
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getContrasena().equals(contrasenaAntigua) && usuarios.get(i).getNombreUsuario().equals(nombreUsuario)){
                return true;
            }
        }
        return false;   
        
    }
    
    
    /**
     * Permite eliminar un Usuario de la Base de datos.
     * @param nombreUsuario Se espera un <String> identificador del nombre (unico).
     * @param contrasena Se espera un <String> con la contraseña asociada a un usuario.
     * @param tipoCuenta Se espera un <String> con el tipo de cuenta asociada a un usuario {Administrador, Dueño, Supervisor}
     */
    
    public static void EliminarUsuario(String nombreUsuario, String contrasena){
        
        try{
            UsuarioDA.eliminarUsuario(nombreUsuario);
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception){}

        
    }

    public static String[] getUsuario(String nombre, String contrasena){
        
        //llamada a la BD para obtener al usuario.
        return null;
    }
    
    
    
    public static String[][] cargarDatos() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        ArrayList<Usuario> usuarios = new ArrayList();
        usuarios = UsuarioDA.cargar();
        
        String[][] datos = new String[usuarios.size()][9];
        System.out.println(usuarios.size());
        for (int i = 0; i < usuarios.size(); i ++){
            datos[i][0] = String.valueOf(usuarios.get(i).getNombreUsuario());
            datos[i][1] = usuarios.get(i).getTipoCuenta();
        }
        return datos;
    }
    
    
}
