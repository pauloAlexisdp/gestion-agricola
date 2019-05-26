
package root.gestionagricola;

/**
 * Permite encapsular y aplicar patron Singleton a la entidad Cuenta.
 * @author Los Lanzas
 */
public class SingletonCuenta {

    private static Cuenta myCuenta;
    
    /**
     * Permite obtener la instancia de la cuenta actual.
     * @param nombre Se espera un <String> con el nombre de la cuenta.
     * @param password Se espera un <String> con la clave de ingreso de la cuenta.
     * @param tipo Se espera un <String> con el tipo de cuenta.
     * @return Retorna una instancia de Cuenta.
     */
    public static Cuenta getInstance(String nombre, String password, String tipo){
        if (myCuenta == null){
            myCuenta = new Cuenta(nombre, password, tipo);
            return myCuenta;
        }
        else{
            return myCuenta;
        }
    }
    
    /**
     * Permite eliminar una instancia de Cuenta
     */
    public static void downInstance(){
        myCuenta = null;
    }
}
