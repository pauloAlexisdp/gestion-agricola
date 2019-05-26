
package root.gestionagricola.gestionsupervisor;

/**
 * Esta clase permite instanciar los datos de la tabla de asistencia.
 * @author Los Lanzas
 */
public class Asistencia {
    
    private int rut;
    private String nombre;

    /**
     * Constructor de la instancia de Asistencia
     * @param rut Se espera un <int> con el rut de un trabajador.
     * @param nombre Se espera un <String> con el nombre de un trabajador.
     */
    public Asistencia(int rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }

    /**
     * Permite obtener el rut de un trabajador en la asistencia.
     * @return Retorna un <int> con el rut del trabajador.
     */
    public int getRut() {
        return rut;
    }

    /**
     * Permite obtener el nombre de un trabajador en la asistencia.
     * @return Retorna un <String> con el nombre del trabajador.
     */
    public String getNombre() {
        return nombre;
    }
}
