
package root.gestionagricola.modelo.accesodato;

import java.sql.SQLException;
import java.util.ArrayList;
import root.gestionagricola.modelo.Conexion;
import root.gestionagricola.modelo.SingletonConexion;

/**
 *  Gestiona los registros de todos los contratos que se han hecho en la empresa 
 *  Incluye los creados, modificados y eliminados
 * @author Los Lanzas
 */
public class HistorialDA {
    
    
    /**
     * guarda el historial de todos los cambios hechos en un contrato
     * hace un historial de todos los cambios hecho por el usuario
     * @param folio Se espera un <int> con el folio del contrato.
     * @param fechaInicio Se espera un <String> con la fecha de incio.
     * @param fechaTermino Se espera un <String> con la fecha de termino.
     * @param estado Se espera un <String> con el estado.
     * @throws ClassNotFoundException En caso de que no se encuentre la clase que
     * permite la conexion con la Base de Datos.
     * @throws InstantiationException En caso de que no se pueda realizar la
     * instanciacion de la Base de Datos.
     * @throws IllegalAccessException En caso de que no se pueda establecer 
     * conexion con la Base de Datos.
     * @throws SQLException En caso que la consulta realizada no sea soportada
     * por el lenguaje SQL.
     */
    public static void guardarhistorial(int rut, int folio, String fechaInicio, String fechaTermino, String estado) throws ClassNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        Conexion cdb = SingletonConexion.getInstancia().getConexiondb();
        /* Modulo seguridad si ya hay una cuenta con ese nombre */
        cdb.un_sql = "insert into historialcontrato(rutTrabajador, folio, estado, fechaincio,fechatermino)  "
                + " values("+rut+","+folio+",'"+estado+"',"+fechaInicio+","+fechaTermino+")";
        cdb.statement.executeUpdate(cdb.un_sql);
    }
    
    /**
     * Carga el historial de todos los contratos registrados en la empresa
     * @return la lista de todos los contratos
     * @throws ClassNotFoundException En caso de que no se encuentre la clase que
     * permite la conexion con la Base de Datos.
     * @throws InstantiationException En caso de que no se pueda realizar la
     * instanciacion de la Base de Datos.
     * @throws IllegalAccessException En caso de que no se pueda establecer 
     * conexion con la Base de Datos.
     * @throws SQLException En caso que la consulta realizada no sea soportada
     * por el lenguaje SQL.
     */
    public static ArrayList cargarContratos() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        ArrayList r = null;

        Conexion cdb = SingletonConexion.getInstancia().getConexiondb();
        /* Estado para trabajador: estado para */
        cdb.un_sql = "select  folio,rutTrabajador, estado, fechainicio,fechatermino"
                + " from historialcontrato";
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if (cdb.resultado != null) {
            r = new ArrayList();
            while (cdb.resultado.next()) {
                int folio = cdb.resultado.getInt("folio");
                int rut = cdb.resultado.getInt("ruttrabajador");
                String estado = cdb.resultado.getString("estado");
                String fechaInicio = cdb.resultado.getString("fechainicio");
                String fechaTermino = cdb.resultado.getString("fechatermino");
               //crear una funcion en el controlador para cargar los datos 
                //r.add(ControladorContrato.crearContrato(folio, "externo", estado, fechaInicio, fechaTermino, nombre, rut, sueldo, nombreEmpresa));
            }
        } else {
        }
        //    cdb.close();
        return r;
    }
}
