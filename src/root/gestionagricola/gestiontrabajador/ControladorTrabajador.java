
package root.gestionagricola.gestiontrabajador;

import java.sql.SQLException;
import java.util.ArrayList;
import root.gestionagricola.modelo.accesodato.TrabajadorExternoDA;
import root.gestionagricola.modelo.accesodato.TrabajadorInternoDA;

/**
 *
 * @author Los Lanzas
 */
public class ControladorTrabajador {
    private Trabajador trabajador = null;
    
    public static void ingresarTrabajadorInterno(int rut, String nombre, String rol, int telefono, String estado, int num_contrato){ 
        /* Guardando Datos */
        try {
            TrabajadorInternoDA.guardarTrabajadorInterno(rut, nombre, rol, telefono, estado, num_contrato);
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception){}
    }
     
    //Llama al metodo que permite crear un trabajador externo en la base de datos.
    public static void ingresarTrabajadorExterno(int rut, String nombre, String rol, int telefono, String estado, int num_contrato){ 
        try{
            TrabajadorExternoDA.guardarTrabajadorExterno(rut, nombre, rol, telefono, estado, num_contrato);
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception){}
    }
    
    /**
     * Permite la modificación de un trabajador externo.
     * @param rut
     * @param nombre
     * @param rol
     * @param telefono
     * @param estado
     * @param num_contrato 
     */
    public static void modificarTrabajadorExterno(int rut, String nombre, String rol, int telefono, String estado, int num_contrato){
        try{
            TrabajadorExternoDA.guardarTrabajadorExterno(rut, nombre, rol, telefono, estado, num_contrato);
        }catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception) {}
    }
    
    /**
     * Permiten la modificacion de los datos de un trabajador interno.
     * @param rut 
     * @param nombre
     * @param rol
     * @param telefono
     * @param estado
     * @param num_contrato 
     */
    public static void modificarTrabajadorInterno(int rut, String nombre, String rol, int telefono, String estado, int num_contrato){
        try{
            TrabajadorInternoDA.guardarTrabajadorInterno(rut, nombre, rol, telefono, estado, num_contrato);
        }catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception) {}
    }
   
    /**
    * Permite eliminar un trabajador interno de la base de datos.
    * @param rut es numero entero con el cual se identifica el trabajador a borrar
    */
    public static void eliminarTrabajadorInterno(int rut){
        try{
            TrabajadorInternoDA.eliminarTrabajadorInterno(rut);
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception){}   
    }
   
    /**
    * Permite eliminar un trabajador externo de la base de datos.
    * @param rut es numero entero con el cual se identifica el trabajador a borrar
    */
    public static void eliminarTrabajadorExterno(int rut){
        try{
            TrabajadorExternoDA.eliminarTrabajadorExterno(rut);
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception){}   
    }

    public static String[] getTrabajador(int rut) {
        Trabajador trabajador;
        String[] datos = new String[7];
        try {
            if (TrabajadorExternoDA.encontrarTrabajadorExterno(rut) != null) {
                trabajador = TrabajadorExternoDA.encontrarTrabajadorExterno(rut);
                datos[0] = String.valueOf(trabajador.getRut());
                datos[1] = trabajador.getNombre();
                datos[2] = trabajador.getRol();
                datos[3] = String.valueOf(trabajador.getTelefono());
                datos[4] = trabajador.getEstado();
                datos[5] = String.valueOf(trabajador.getNum_contrato());
                return datos;
            }
            if (TrabajadorInternoDA.encontrarTrabajadorInterno(rut) != null) {
                trabajador = TrabajadorInternoDA.encontrarTrabajadorInterno(rut);
                datos[0] = String.valueOf(trabajador.getRut());
                datos[1] = trabajador.getNombre();
                datos[2] = trabajador.getRol();
                datos[3] = String.valueOf(trabajador.getTelefono());
                datos[4] = trabajador.getEstado();
                datos[5] = String.valueOf(trabajador.getNum_contrato());
                return datos;
            } else {
                return null;
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception) {}
        return null;
    }
    
    public static Trabajador crearTrabajadorInterno(int rut, String nombre, String rol, int telefono, String estado, int num_contrato){
        return new Trabajador(rut, nombre, rol, telefono, estado, num_contrato);
    }
    
    public static Trabajador crearTrabajadorExterno(int rut, String nombre, String rol, int telefono, String estado, int num_contrato) {
        return new Trabajador(rut, nombre, rol, telefono, estado, num_contrato);
    }
    
    /**
     * Método para cargar en la tabla los trabajadores que se van creando.
     * @return
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException 
     */
    public static String[][] cargarTrabajadoresInternos() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        ArrayList<Trabajador> trabajadorInterno = new ArrayList();
        trabajadorInterno = TrabajadorInternoDA.cargarTrabajadorInterno();
        
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
    
    /**
     * Método para cargar en la tabla los trabajadores externos que se van creando.
     * @return
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException 
     */
    public static String[][] cargarTrabajadoresExternos() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        ArrayList<Trabajador> trabajadorExterno = new ArrayList();
        trabajadorExterno = TrabajadorExternoDA.cargarTrabajadorExterno();
            
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
