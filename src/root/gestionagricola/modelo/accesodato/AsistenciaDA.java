/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.gestionagricola.modelo.accesodato;

import java.sql.SQLException;
import java.util.ArrayList;
import root.gestionagricola.gestionsupervisor.ControladorAsistencia;
import root.gestionagricola.modelo.Conexion;
import root.gestionagricola.modelo.FactoriaConexion;

/**
 *
 * @author len_win
 */
public class AsistenciaDA {
    /**
     * verifica si el trabajador es interno o externo
     * @param rut verifica con el rut 
     * @return true si es interno, falso externo
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException 
     */
    public static boolean isInterno(int rut) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
        boolean es=false;
        cdb.un_sql = "select rut from trabajadorinterno"
                + " where rut = "+rut;
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if (cdb.resultado != null) {
            while (cdb.resultado.next()) {
                es=true;
            }
        }
        //cdb.close();
        return es;

    }

    /**
     * guardar a las respectivas clases dependiendo si es interno o externo el trabajador 
     * la asistencia
     * @param idTermporada instancia temporada
     * @param rut rut del trabajador
     * @param fecha fecha de asistencia
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException 
     */
    public static void guardar(String idTermporada, int rut, String fecha) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
        //modulo seguridad si ya hay una cuenta con ese nombre 
        if(isInterno(rut)){
        
            if (cdb.resultado != null) {
                if (cdb.resultado.next()) {
                    cdb.un_sql = "update into asistenciatrabajadorinterno set asistencia='"+fecha+"' where rut="+rut;
                } else {
                    cdb.un_sql = "Insert into asistenciatrabajadorinterno(reftemporada,reftrabajadorinterno,asistencia) values('" + idTermporada + "', " + rut + ", " + fecha + ")";
                    cdb.statement.executeUpdate(cdb.un_sql);
                
                }
            } else {
                
                    cdb.un_sql = "Insert into asistenciatrabajadorinterno(reftemporada,reftrabajadorinterno,asistencia) values('" + idTermporada + "', " + rut + ", " + fecha + ")";
                    cdb.statement.executeUpdate(cdb.un_sql);
            }
        }else{
            if (cdb.resultado != null) {
                if (cdb.resultado.next()) {
                    cdb.un_sql = "update into asistenciatrabajadorexterno set asistencia='"+fecha+"' where rut="+rut;
                } else {
                    cdb.un_sql = "Insert into asistenciatrabajadorexterno(reftemporada,reftrabajadorexterno,asistencia) values('" + idTermporada + "', " + rut + ", " + fecha + ")";
                    cdb.statement.executeUpdate(cdb.un_sql);

                }
            } else {
                    cdb.un_sql = "Insert into asistenciatrabajadorexterno(reftemporada,reftrabajadorexterno,asistencia) values('" + idTermporada + "', " + rut + ", " + fecha + ")";
                cdb.statement.executeUpdate(cdb.un_sql);
            }
        }
        //cdb.close();
    }
    
    /**
     * metodo que carga los rut y nombres de los trabajadores de la empresa
     * @return la lista de todos los trabajadores (externo/internos) que estan trbajando
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException 
     */
    public static ArrayList cargarTrabajadores() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
        ArrayList r = null;

        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
        /**
         * estado para trabajador: estado para
         */
        cdb.un_sql = "select rut, nombre from trabajadorexterno, contrato where folio=refcontrato and estado='Activo' "
                + " union select rut, nombre from trabajadorinterno, contrato where folio=refcontrato and estado='Activo' ";
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if (cdb.resultado != null) {
            r = new ArrayList();
            while (cdb.resultado.next()) {
                int rut = cdb.resultado.getInt("rut");
                String nombre = cdb.resultado.getString("nombre");
                
                r.add(ControladorAsistencia.crearAsistencia(rut, nombre));
            }
        } else {
        }
        //    cdb.close();
        return r;
        
        
    }
    
    
}
