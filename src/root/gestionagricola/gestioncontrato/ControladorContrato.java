
package root.gestionagricola.gestioncontrato;


/**
 * Permite agregar funcionalidad a la gestion de reportes.
 * @author Los Lanzas
 */
public class ControladorContrato {
    
    private Contrato contrato;
    
    /**
     * Permite ingresar un nuevo contrato a la base de datos.
     * @param folio Se espera un <int> identificador del contrato (unico).
     * @param tipo Se espera un <String> con el tipo de contrato {Subcontrato, Planta}
     * @param estado Se espera un <String> con el estado del contrato {Renovado, Activo, Finalizado}
     * @param f_inicio Se espera un <String> con la fecha de inicio del contrato formato 'DD-MM-AAAA'
     * @param f_termino Se espera un <String> con la fecha de termino del contrato formato 'DD-MM-AAAA'
     * @param nombre Se espera un <String> con el nombre del asociado.
     * @param rut Se espera un <int> con el rut del asociado.
     * @param sueldo Se espera un <int> con el sueldo del asociado.
     */
    public static void ingresarContrato(int folio, String tipo, String estado, 
            String f_inicio, String f_termino, String nombre, int rut, int sueldo){
        //Ingreso de datos a la BD
    }
    
    /**
     * Permite buscar los contratos relacionados a los parametros ingresados.
     * @param tipo Se espera un <String> con el tipo de contrato {Subcontrato, Planta}
     * @param estado Se espera un <String> con el estado del contrato {Renovado, Activo, Finalizado}
     * @param f_inicio Se espera un <String> con la fecha de inicio del contrato formato 'DD-MM-AAAA'
     * @param f_termino Se espera un <String> con la fecha de termino del contrato formato 'DD-MM-AAAA'
     * @param nombre Se espera un <String> con el nombre del asociado.
     * @param rut Se espera un <int> con el rut del asociado.
     * @param sueldo Se espera un <int> con el sueldo del asociado.
     * @return Retorna un <String[][]> con la informacion de los contratos encontrados,
     * <null> en caso de no encontrar informacion.
     */
    public static String[][] buscarContrato(String tipo, String estado, 
            String f_inicio, String f_termino, String nombre, int rut, int sueldo){
        //Se obtiene un arreglo de contratos relacionados a los atributos...
        return null;
    }
    
    /**
     * Permite obtener un contrato especifico.
     * @param folio Se espera un <int> con el numero unico de un contrato.
     * @return Retorna un <String[]> con la informacion del contrato.
     */
    public String[] getContrato(int folio){
        // Llamada a la BD para obtener el contrato
        return null;
    }
    
    /**
     * Permite modificar los atributos de un contrato.
     * @param tipo Se espera un <String> con el tipo de contrato {Subcontrato, Planta}
     * @param estado Se espera un <String> con el estado del contrato {Renovado, Activo, Finalizado}
     * @param f_inicio Se espera un <String> con la fecha de inicio del contrato formato 'DD-MM-AAAA'
     * @param f_termino Se espera un <String> con la fecha de termino del contrato formato 'DD-MM-AAAA'
     * @param nombre Se espera un <String> con el nombre del asociado.
     * @param rut Se espera un <int> con el rut del asociado.
     * @param sueldo Se espera un <int> con el sueldo del asociado.
     */
    public static void modificarContrato(String tipo, String estado, 
            String f_inicio, String f_termino, String nombre, int rut, int sueldo){
        
    }
    
    /**
     * Permite eliminar un contrato especifico.
     * @param folio Se espera un <int> con el numero unico del contrato.
     */
    public static void eliminarContrato(int folio){
        
    }
}
