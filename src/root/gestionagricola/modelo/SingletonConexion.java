
package root.gestionagricola.modelo;

/**
 * Permite generar una instancia para el servicio de base de datos
 * @author len_win
 */
public class SingletonConexion {
    //puntero que hereda conexion
    private Conexion cdb;
    
    private static SingletonConexion instancia;
    
    public SingletonConexion(){
        
    }
    
    public static SingletonConexion getInstancia(){
        if(instancia==null){
            instancia = new SingletonConexion();
        }
        return instancia;
    }
    
    public Conexion getConexiondb() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        if(cdb == null){
            String nombreClase = "root.gestionagricola.modelo.Conexion_Postgres";
            
            cdb = (Conexion) Class.forName(nombreClase).newInstance();
        }
        return cdb;
    }
}
