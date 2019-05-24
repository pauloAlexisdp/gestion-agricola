
package root.gestionagricola.gestiontrabajador;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Los Lanzas
 */
public class ControladorTrabajador {
    
    private Trabajador trabajador;
    
    public static void crearTrabajadorInterno(int rut, String nombre, String rol, int telefono, String estado, int num_contrato){ 
        /**
         
        try{
            TrabajadorInternoDA.crear
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception){}
    */
    }
    
    public static void crearTrabajadorExterno(int rut, String nombre, String rol, int telefono, String estado, int num_contrato){ 
        /**
         
        try{
            TrabajadorExternoDA.crear
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception){}
    */
    }
    
    public static void modificarTrabajadorExterno(int rut){

    }
    
    public static void modificarTrabajadorInterno(int rut){

    }
   
   public static void eliminarTrabajadorInterno(int rut){
        
       /**
        try{
            UsuarioDA.eliminarUsuario(nombreUsuario);
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception){}   
    */
    }
   
    public static void eliminarTrabajadorExterno(int rut){
     /**   
        try{
            UsuarioDA.eliminarUsuario(nombreUsuario);
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception){}   
    */
    }

    public static String[] getTrabajador(){
        
        //llamada a la BD para obtener al usuario.
        return null;
    }
    
    public static String[][] cargarTrabajadoresInternos() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        ArrayList<Trabajador> trabajadorInterno = new ArrayList();
        //trabajadorInterno = trabajadorInternoDA.cargar();
        
        String[][] datos = new String[trabajadorInterno.size()][6];
             
        for (int i = 0; i < trabajadorInterno.size(); i ++){
            datos[i][0] = String.valueOf(trabajadorInterno.get(i).getRut());
            datos[i][1] = trabajadorInterno.get(i).getNombre();
            datos[i][2] = trabajadorInterno.get(i).getRol();
            datos[i][3] = String.valueOf(trabajadorInterno.get(i).getTelefono());
            datos[i][4] = String.valueOf(trabajadorInterno.get(i).getNum_contrato());
        }
        return datos;
    }
    
    public static String[][] cargarTrabajadoresExternos() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        ArrayList<Trabajador> trabajadorExterno = new ArrayList();
        //trabajadorExterno = trabajadorInternoDA.cargar();
            
        String[][] datos = new String[trabajadorExterno.size()][6];
            
        for (int i = 0; i < trabajadorExterno .size(); i ++){
            datos[i][0] = String.valueOf(trabajadorExterno.get(i).getRut());
            datos[i][1] = trabajadorExterno.get(i).getNombre();
            datos[i][2] = trabajadorExterno.get(i).getRol();
            datos[i][3] = String.valueOf(trabajadorExterno.get(i).getTelefono());
            datos[i][4] = String.valueOf(trabajadorExterno.get(i).getNum_contrato());
        }
    return datos;
    }
            
}
