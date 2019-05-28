
package root.gestionagricola.gestionsupervisor;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
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
    
    /**
     * Permite realizar busqueda de trabajadores para la asistencia.
     * @param rutificador Se espera un <String> con el RUT del trabajador.
     * @return Retorna un <String[][]> con los datos de los trabajadores.
     */
    public static String[][] realizarBusqueda(String rutificador){
        
        int rutBusqueda = ControladorContrato.parseRUTtoINT(rutificador);
        
        String[][] trabajadores = getTabla();
        String[][] busqueda = new String[1][2];
        
        for (int i = 0; i < trabajadores.length; i++) {
            
            if(rutBusqueda == ControladorContrato.parseRUTtoINT(trabajadores[i][0])){
                
                busqueda[0][0]= trabajadores[i][0];
                busqueda[0][1]= trabajadores[i][1];
                
                return busqueda;
            }
            
        }
        return null;
        
    }
    
    /**
     * Permite dar formato a una fecha, sera usado para una fecha que no existe
     * para demostrar que esta inasistente.
     * @param fecha Se espera un <Date> con la fecha.
     * @return Retorna un <String> con la fecha formateada: '"DD-MM-AAAA"'.
     */
    public static String transformarDateInasistencia(Date fecha) {
        String inicio;

        if (fecha.getDate() < 10) {
            inicio = "'" + "0" + fecha.getDate();
        } else {
            inicio = "'" + "" + fecha.getDate();
        }
        if (fecha.getMonth() < 9) {
            inicio += "-0" + (fecha.getMonth() + 1);
        } else {
            inicio += "-" + (fecha.getMonth() + 1);
        }
        inicio += "-" + (fecha.getYear() + 1000) + "'";

        return inicio;
    }
    
}
