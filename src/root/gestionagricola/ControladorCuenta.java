
package root.gestionagricola;

import java.sql.SQLException;
import root.gestionagricola.modelo.accesodato.CuentaDA;

/**
 * Permite gestionar las instancias de cuentas de usuarios.
 * @author Los Lanzas
 */
public class ControladorCuenta {
    
    /**
     * Permite obtener el tipo de una cuenta.
     * @param nombre Se espera un <String> con el nombre de la cuenta.
     * @param password Se espera un <String> con la clave de la cuenta.
     * @return Retorna un <String> con el tipo de cuenta.
     */
    public static String getTipo(String nombre, String password){
        try{
            if (CuentaDA.buscar(nombre, password) == null){
                return "0";
            }
            else{
                return CuentaDA.buscar(nombre, password).getTipo();
            }
        }
        catch(ClassNotFoundException | IllegalAccessException | 
                InstantiationException | SQLException e){
            return null;
        }
    }
    
    /**
     * Permite modelar una instancia de Cuenta.
     * @param nombre Se espera un <String> con el nombre de la cuenta.
     * @param password Se espera un <String> con la clave de la cuenta.
     * @param tipo Se espera un <String> con el tipo de la cuenta.
     * @return Retoruna una instancia de <Cuenta>.
     */
    public static Cuenta modelCuenta(String nombre, String password, String tipo){
        return new Cuenta(nombre, password, tipo);
    }
}
