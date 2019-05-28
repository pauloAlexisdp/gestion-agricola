
package root.gestionagricola.modelo.accesodato;

import java.sql.SQLException;
import java.util.Date;
import root.gestionagricola.gestioncontrato.ControladorContrato;
import root.gestionagricola.modelo.Conexion;
import root.gestionagricola.modelo.SingletonConexion;

/**
 * Adminsitra la temporada
 * @author Los Lanzas
 */
public class TemporadaDA {
    
    /**
     * Permite guardar una tempora en la base de datos.
     * @param id id de la temporada 
     * @param fecha Se espera un String con la fecha de la temporada.
     * @throws ClassNotFoundException En caso de que no se encuentre la clase que
     * permite la conexion con la Base de Datos.
     * @throws InstantiationException En caso de que no se pueda realizar la
     * instanciacion de la Base de Datos.
     * @throws IllegalAccessException En caso de que no se pueda establecer 
     * conexion con la Base de Datos.
     * @throws SQLException En caso que la consulta realizada no sea soportada
     * por el lenguaje SQL.
     */
    public static void guardarTemporada(String id, String fecha) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
        Conexion cdb = SingletonConexion.getInstancia().getConexiondb();
        //modulo seguridad si ya hay una cuenta con ese nombre

        cdb.un_sql ="select id from instanciatemporada where id = '"+id+"'";
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if(cdb.resultado != null){

           if(cdb.resultado.next()){
               cdb.un_sql = "UPDATE instanciatemporada set fecha="+fecha+
                       " WHERE id='"+id+"'";
                cdb.statement.executeUpdate(cdb.un_sql);
                System.out.println("Datos InstanciaTemporada actualizados");
           }else{
               cdb.un_sql = "Insert into instanciatemporada values('"+id+"',"+fecha+")";
               cdb.statement.executeUpdate(cdb.un_sql);
               System.out.println("Datos guardados");
               
           }
        }else{
            cdb.un_sql = "Insert into instanciatemporada values('"+id+"',"+fecha+")";
            cdb.statement.executeUpdate(cdb.un_sql);
        }
//        cdb.close();
    }
    
    /**
     * Permite obtener el identificador de la temporada actual.
     * @return Retorna un <String> con el codigo de la temporada actual.
     */
    public static String getInstanciaTemporada(){
        String id_temporada = "";
        Date temp = new Date();
        temp.setMonth(7);
        Date actual = new Date();

        if (actual.compareTo(temp) < 0){
            id_temporada = "1-";
        }
        else{
            id_temporada = "2-";
        }

        return id_temporada + temp.getYear();
    }
    
    /**
     * Permite crear una instancia de temporada.
     * @throws ClassNotFoundException En caso de que no se encuentre la clase que
     * permite la conexion con la Base de Datos.
     * @throws InstantiationException En caso de que no se pueda realizar la
     * instanciacion de la Base de Datos.
     * @throws IllegalAccessException En caso de que no se pueda establecer 
     * conexion con la Base de Datos.
     * @throws SQLException En caso que la consulta realizada no sea soportada
     * por el lenguaje SQL.
     */
    public static void crear() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        Date fecha = new Date();
        String id = getInstanciaTemporada();
        guardarTemporada(id,ControladorContrato.transformarDate(fecha));
    }
}
