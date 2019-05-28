
package root.gestionagricola.gestionusuario;

import java.sql.SQLException;
import java.util.ArrayList;
import root.gestionagricola.modelo.accesodato.UsuarioDA;

/**
 * Permite agregar funcionalidad a la gestion de usuarios.
 * @author Los Lanzas
 */
public class ControladorUsuario{
    
    private Usuario usuario;
        
    /**
     * Permite ingresar un nuevo contrato a la base de datos.
     * @param nombreUsuario Se espera un <String> identificador del nombre (unico).
     * @param contrasena Se espera un <String> con la contraseña asociada a un usuario.
     * @param tipoCuenta Se espera un <String> con el tipo de cuenta asociada a un usuario {Administrador, Dueño, Supervisor}
     */
    public static void CrearUsuario(String nombreUsuario, String contrasena, String tipoCuenta){ 
        try{
            UsuarioDA.crearUsuario(nombreUsuario, contrasena, tipoCuenta);
        }
        catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception){}
    }
    
    
    
    /**
     * Permite modificar un usuario del sistema.
     * @param nombreUsuarioAntiguo Se espera un <String> identificador del nombre (único).
     * @param nombreUsuarioNuevo Se espera un <String> identificador nuevo del usuario.
     * @param contrasena Se espera un <String> con la contraseña nueva asociada a un usuario.
     * @param tipocuenta Se espera un <String> con el tipo de cuenta nueva asociada a un usuario {Administrador, Dueño, Supervisor}.
     */
    public static void ModificarUsuario(String nombreUsuarioAntiguo, String nombreUsuarioNuevo, String contrasena, String tipocuenta){
        try{
            UsuarioDA.modificarUsuario(nombreUsuarioAntiguo, nombreUsuarioNuevo, contrasena, tipocuenta);
        }
        catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception){}
    }
    
    public static void ModificarContrasena(String nombreUsuario, String contrasenaNueva){
        try{
            UsuarioDA.modificarContrasena(nombreUsuario, contrasenaNueva);
        }
        catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception){}
        
    }
    
    /**
     * Permite buscar a un usuario en especifico.
     * @param nombreUsuario Se espera un <String> para identificar a un Usuario.
     * @return Retorna <true> si se encuentra el usaurio, <false> en caso
     * contrario.
     */
    public static boolean BuscarUsuario(String nombreUsuario){
        try{
            ArrayList<Usuario> usuarios = new ArrayList<>();
            usuarios = UsuarioDA.cargar();

            for (int i = 0; i < usuarios.size(); i++) {
                if (usuarios.get(i).getNombreUsuario().equals(nombreUsuario)){
                    return true;
                }
            }
            return false;
        }
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){
        return false;
        }
    }
    
    /**
     * Permite encontrar una clave de cuenta de usuario.
     * @param nombreUsuario
     * @param contrasenaAntigua
     * @return Retorna <true> si se encuentra la clave de cuenta, <false> en 
     * caso contrario.
     */
    public static boolean BuscarContrasena(String nombreUsuario, String contrasenaAntigua){
        try{
            ArrayList<Usuario> usuarios = new ArrayList<>();
            usuarios = UsuarioDA.cargar();

            for (int i = 0; i < usuarios.size(); i++) {
                if(usuarios.get(i).getContrasena().equals(contrasenaAntigua) && usuarios.get(i).getNombreUsuario().equals(nombreUsuario)){
                    return true;
                }
            }
            return false;   
        }
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){
            return false;
        }
    }
    
    
    /**
     * Permite eliminar un Usuario de la Base de datos.
     * @param nombreUsuario Se espera un <String> identificador del nombre (unico).
     * @param contrasena Se espera un <String> con la contraseña asociada a un usuario.
     */
    public static void EliminarUsuario(String nombreUsuario, String contrasena){
        try{
            UsuarioDA.eliminarUsuario(nombreUsuario);
        }
        catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception){}

        
    }
    
    /**
     * Permite cargar los datos de usaurios.
     * @return Retorna un <String[][]> con los datos de usaurios.
     */
    public static String[][] cargarDatos(){
        try{
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
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){
            return null;
        }
    }
    
    /**
     * Permite modelar un usuario.
     * @param nombre Se espera un <String> con el nombre de cuenta.
     * @param password Se espera un <String> con la clave de cuenta.
     * @param tipo Se espera un <String> con el tipo de cuenta.
     * @return Retorna una instancia de Usuario.
     */
    public static Usuario modelUsuario(String nombre, String password, String tipo){
        return new Usuario(nombre, nombre, tipo);
    }
}
