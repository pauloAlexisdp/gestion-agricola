
package root.gestionagricola.gestionsupervisor;

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
        /* Se recuperan los datos desde la BD */
        
        return null;
    }
    
    /**
     * Permite guardar los datos de la asistencia relacionados a una temporada.
     * @param planilla Se espera un <String[][]> con los datos de la planilla
     * de asistencia.
     */
    public static void guardarAsistencia(String[][] planilla){
        /* Se guarda la planilla de asistencia en la BD */
        
    }
    
}
