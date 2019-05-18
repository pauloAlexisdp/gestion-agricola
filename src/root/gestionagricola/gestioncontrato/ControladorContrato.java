
package root.gestionagricola.gestioncontrato;

import java.util.ArrayList;

/**
 * Permite agregar funcionalidad a la gestion de reportes.
 * @author Los Lanzas
 */
public class ControladorContrato {
    
    private Contrato contrato;
    
    public static void ingresarContrato(int folio, String tipo, String estado, 
            String f_inicio, String f_termino, String nombre, int rut, int sueldo){
        //Ingreso de datos a la BD
    }
    
    public static ArrayList buscarContrato(int folio, String tipo, String estado, 
            String f_inicio, String f_termino, String nombre, int rut, int sueldo){
        //Se obtiene un arreglo de contratos relacionados a los atributos...
        return null;
    }
    
    public Contrato getContrato(int folio){
        // Llamada a la BD para obtener el contrato
        return null;
    }
    
    /* Revisar */
    public static Contrato setContrato(int folio, String tipo, String estado, 
            String f_inicio, String f_termino, String nombre, int rut, int sueldo){
        return new Contrato(folio, tipo, estado, f_inicio, f_termino, nombre, rut, sueldo);
    }
    
    public static void eliminarContrato(int folio){
        
    }
}
