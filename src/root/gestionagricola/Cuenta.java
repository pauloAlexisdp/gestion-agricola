
package root.gestionagricola;

/**
 * Permite modelar una instancia de Cuenta
 * @author Los Lanzas
 */
public class Cuenta {
    
    private String nombre;
    private String password;
    private String tipo;
    
    /**
     * Constructor protegido de la entidad Cuenta.
     * @param nombre Se espera un <String> con el nombre de la cuenta.
     * @param password Se espera un <String> con la clave de la cuenta.
     * @param tipo Se espera un <String> con el tipo de cuenta.
     */
    protected Cuenta(String nombre, String password, String tipo){
        this.nombre = nombre;
        this.password = password;
        this.tipo = tipo;
    }

    /**
     * Permite obtener el nombre de la cuenta.
     * @return Retorna un <String> con el nombre de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite obtener la clave de la cuenta.
     * @return Retorna un <String> con la clave de la cuenta.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Permite obtener el tipo de cuenta.
     * @return Retorna un <String> con el tipo de cuenta.
     */
    public String getTipo() {
        return tipo;  
    }   
}
