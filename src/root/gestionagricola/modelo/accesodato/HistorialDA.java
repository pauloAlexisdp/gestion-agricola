/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.gestionagricola.modelo.accesodato;

import java.sql.SQLException;
import java.util.ArrayList;
import root.gestionagricola.gestioncontrato.ControladorContrato;
import root.gestionagricola.modelo.Conexion;
import root.gestionagricola.modelo.FactoriaConexion;

/**
 *  Gestiona los registros de todos los contratos que se han hecho en la empresa 
 *  Incluye los creados, modificados y eliminados
 * @author len_win
 */
public class HistorialDA {
    
    
    /**
     * guarda el historial de todos los cambios hechos en un contrato
     * hace un historial de todos los cambios hecho por el usuario
     * @param folio
     * @param fechaInicio
     * @param fechaTermino
     * @param estado
     * @throws ClassNotFoundException
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException 
     */
    public static void guardarhistorial(int rut, int folio, String fechaInicio, String fechaTermino, String estado) throws ClassNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
        //modulo seguridad si ya hay una cuenta con ese nombre 
        cdb.un_sql = "insert into historialcontrato(rutTrabajador, folio, estado, fechaincio,fechatermino)  "
                + " values("+rut+","+folio+",'"+estado+"',"+fechaInicio+","+fechaTermino+")";
        cdb.statement.executeUpdate(cdb.un_sql);
    }
    
    /**
     * Carga el historial de todos los contratos registrados en la empresa
     * @return la lista de todos los contratos
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException 
     */
    public static ArrayList cargarContratos() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        ArrayList r = null;

        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
        /**
         * estado para trabajador: estado para
         */
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
