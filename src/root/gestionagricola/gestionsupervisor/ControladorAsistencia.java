
package root.gestionagricola.gestionsupervisor;

import java.sql.SQLException;
import java.util.ArrayList;
import root.gestionagricola.gestioncontrato.ControladorContrato;
import root.gestionagricola.modelo.accesodato.AsistenciaDA;
import root.gestionagricola.modelo.accesodato.TemporadaDA;

/**
 * Permite gestionar la comunicacion entre la vista de Asistencias y la 
 * Base de Datos.
 * @author Los Lanzas
 */
public class ControladorAsistencia {
    
    /**
     * Permite recuperar los nombres y rut de trabajadores asociados a un
     * contrato activo.
     * @return Retorna un <String[][]> con los datos solicitados.
     */
    public static String[][] getTabla (){
        /* Inicializacion de variables necesarias */
        ArrayList<Asistencia> planilla = new ArrayList<>();
        
        /* Se recuperan los datos desde la BD */
        try{
            planilla = AsistenciaDA.cargarTrabajadores();
            String[][] datos = new String[planilla.size()][2];
            
            for (int i = 0; i < planilla.size(); i ++){
                datos[i][0] = ControladorContrato.parseRUTtoString(planilla.get(i).getRut());
                datos[i][1] = planilla.get(i).getNombre();
            }
            
            return datos;
        }
        catch(ClassNotFoundException | IllegalAccessException | 
                InstantiationException | SQLException e){
            return null;
        }
    }
    
    /**
     * Permite guardar los datos de la asistencia relacionados a una temporada.
     * @param planilla Se espera un <String[][]> con los datos de la planilla
     * de asistencia.
     */
    public static void guardarAsistencia(String[][] planilla){
        /* Se guarda la planilla de asistencia en la BD */
        try{
            for (int i = 0; i < planilla.length; i ++){
                AsistenciaDA.guardar(TemporadaDA.getInstanciaTemporada(), 
                        ControladorContrato.parseRUTtoINT(planilla[i][0]), planilla[i][1]);
            }
        }
        catch (ClassNotFoundException | IllegalAccessException | 
                InstantiationException | SQLException e){}
    }
    
    /**
     * Permite crear una instancia de Asistencia a partir de el rut y nombre
     * de un trabajador.
     * @param rut Se espera un <int> con el rut del trabajador.
     * @param nombre Se espera un <String> con el nombre del trabajador.
     * @return Retorna una instancia del objeto Asistencia.
     */
    public static Asistencia crearAsistencia(int rut, String nombre){
        return new Asistencia(rut, nombre);
    }
    
    
    public static String [][] reporteEspecifico(String rutificador){
        
        return null;
            
    }
    
    
    public static String[][] realizarBusqueda(String rutificador){
        
        int rutBusqueda = ControladorContrato.parseRUTtoINT(rutificador);
        
        String[][] trabajadores = getTabla();
        String[][] busqueda = null;
        
        for (int i = 0; i < trabajadores.length; i++) {
            
            if(rutBusqueda == Integer.parseInt(trabajadores[0][i])){
                
                busqueda[0][0]= trabajadores[i][0];
                busqueda[0][1]= trabajadores[i][1];
                busqueda[0][2] = trabajadores[i][2];
                
                return busqueda; // retorna el nombre del trabajador que esta asociado con un contrato activo.
            }
            
        }
        return null;
        
    }
    
    
}
