/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.gestionagricola.modelo.accesodato;


import java.sql.SQLException;
import java.util.ArrayList;
import root.gestionagricola.gestioncontrato.Contrato;
import root.gestionagricola.gestioncontrato.ControladorContrato;
import root.gestionagricola.modelo.Conexion;
import root.gestionagricola.modelo.FactoriaConexion;

/**
 *
 * @author len_win
 */
public class TrabajadorInternoDA {

    /**
     * se guardan los datos de los trabajadores interno
     *
     * @param rut rut del trabajador
     * @param nombre nombre del trabajador
     * @param sueldo que gana el trabajador
     * @param folio numero de contrato de trabajo
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException
     */
    public static void guardar(int rut, String nombre, int sueldo, int folio) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
        //modulo seguridad si ya hay una cuenta con ese nombre 
        cdb.un_sql = "select rut from trabajadorInterno where rut = " + rut;
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if (cdb.resultado != null) {
            if (cdb.resultado.next()) {
                //Actualiza trabajador Interno
                cdb.un_sql = "UPDATE trabajadorinterno set nombre='" + nombre + "', sueldo=" + sueldo + ", refcontrato=" + folio
                        + " WHERE rut=" + rut;
                cdb.statement.executeUpdate(cdb.un_sql);
                System.out.println("Datos actualizados");
            } else {
                cdb.un_sql = "Insert into trabajadorInterno values(" + rut + ", '" + nombre + "', " + sueldo + ", " + folio + ")";
                cdb.statement.executeUpdate(cdb.un_sql);
                System.out.println("Datos guardados");

            }
        } else {
            cdb.un_sql = "Insert into trabajadorInterno values(" + rut + ", '" + nombre + "', " + sueldo + ", " + folio + ")";
            cdb.statement.executeUpdate(cdb.un_sql);
        }
        //cdb.close();
    }

    /**
     * cargo una lista de todos los contratos registrados
     *
     * @return una lista de todas los contratos
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException 
     *
     */
    public static ArrayList cargarContrato() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        ArrayList r = null;

        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
        /**
         * estado para trabajador: estado para
         */
        cdb.un_sql = "select folio, fechainicio,fechatermino, rut, nombre, sueldo, estado "
                + " from trabajadorinterno, contrato where estado not like 'eliminado' and folio=refcontrato";
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if (cdb.resultado != null) {
            r = new ArrayList();
            while (cdb.resultado.next()) {
                String fechaInicio = cdb.resultado.getString("fechainicio");
                String fechaTermino = cdb.resultado.getString("fechatermino");
                int folio = cdb.resultado.getInt("folio");
                int rut = cdb.resultado.getInt("rut");
                String nombre = cdb.resultado.getString("nombre");
                int sueldo = cdb.resultado.getInt("sueldo");
                String estado = cdb.resultado.getString("estado");

                r.add(ControladorContrato.crearContrato(folio, "planta", estado, fechaInicio, fechaTermino, nombre, rut, sueldo, ""));
            }
        } else {
            System.out.println("error");
        }
        //cdb.close();
        return r;
    }

    /**
     * se carga un contrato en especifico
     *
     * @param folio folio del trabajador especifico
     * @return el contrato encontrado
     */
    public static Contrato encontrarContrato(int folio) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();

        Contrato contrato = null;

        cdb.un_sql = "select folio, fechainicio,fechatermino, rut, nombre, sueldo, estado "
                + " from trabajadorinterno, contrato where estado not like 'eliminado' and folio=" + folio + " and refcontrato=folio";
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if (cdb.resultado != null) {
            while (cdb.resultado.next()) {
                String fechaInicio = cdb.resultado.getString("fechainicio");
                String fechaTermino = cdb.resultado.getString("fechatermino");
                int folioResult = cdb.resultado.getInt("folio");
                int rut = cdb.resultado.getInt("rut");
                String nombre = cdb.resultado.getString("nombre");
                int sueldo = cdb.resultado.getInt("sueldo");
                String estado = cdb.resultado.getString("estado");

                contrato = ControladorContrato.crearContrato(folio, "planta", estado, fechaInicio, fechaTermino, nombre, rut, sueldo, "");
            }
        } else {
            System.out.println("error");
        }
        //cdb.close();
        return contrato;

    }

    /**
     * cargo una lista de todos los contratos registrados
     *
     * @param inicio
     * @param termino
     * @return una lista de todas los contratos que coincidan con las fechas
     * correspondiente
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException 
     *
     */
    public static ArrayList buscarContrato(String inicio, String termino) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        ArrayList r = null;

        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
        /**
         * estado para trabajador: estado para
         */
        cdb.un_sql = "select folio, fechainicio,fechatermino, rut, nombre, sueldo, estado "
                + "from trabajadorinterno, contrato where estado not like 'eliminado' and  folio=refcontrato and fechainicio>=" + inicio + " and fechatermino<=" + termino;
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if (cdb.resultado != null) {
            r = new ArrayList();
            while (cdb.resultado.next()) {
                String fechaInicio = cdb.resultado.getString("fechainicio");
                String fechaTermino = cdb.resultado.getString("fechatermino");
                int folio = cdb.resultado.getInt("folio");
                int rut = cdb.resultado.getInt("rut");
                String nombre = cdb.resultado.getString("nombre");
                int sueldo = cdb.resultado.getInt("sueldo");
                String estado = cdb.resultado.getString("estado");

                r.add(ControladorContrato.crearContrato(folio, "planta", estado, fechaInicio, fechaTermino, nombre, rut, sueldo, ""));
            }
        } else {
            System.out.println("error");
        }
        //cdb.close();
        return r;
    }
    
    /**
     * busca contrato especifico con los parametros que se quieran pasar  
     * @param estado estado del contrato
     * @param inicio fecha inicio
     * @param termino fecha termino
     * @param nombre nombre trabajador
     * @param rut rut del trabajador
     * @param sueldo sueldo del trabajador a buscar
     * @return lista de todos los trabajadores que cumplan con los criterios de busqueda
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException 
     */
    public static ArrayList buscarContrato( String estado,
            String  inicio, String termino, String nombre, int rut, int sueldo) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        ArrayList r = null;

        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
        
        cdb.un_sql = "select folio, fechainicio,fechatermino, rut, nombre, sueldo,estado"
                + " from trabajadorinterno, contrato where folio=refcontrato ";
        
        if(rut>0){
            cdb.un_sql += " and rut ="+rut;  
        }
        if(sueldo>0){
            cdb.un_sql += " and sueldo="+sueldo;
        }
        if(!nombre.equals("")){
            cdb.un_sql += " and nombre like '%"+nombre+"%'";
        }
        if(!inicio.equals("")){
            cdb.un_sql += " and fechainicio="+inicio;
        }
        if(!termino.equals("")){
            cdb.un_sql += " and fechatermino="+termino; 
        }
        if(!estado.equals("")){
            cdb.un_sql+= " and estado="+estado;
        }

        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if (cdb.resultado != null) {
            r = new ArrayList();
            while (cdb.resultado.next()) {
                String fechaInicio = cdb.resultado.getString("fechainicio");
                String fechaTermino = cdb.resultado.getString("fechatermino");
                int folio = cdb.resultado.getInt("folio");
                int rut_t = cdb.resultado.getInt("rut");
                String nombre_t = cdb.resultado.getString("nombre");
                int sueldo_t = cdb.resultado.getInt("sueldo");
                String estado_t = cdb.resultado.getString("estado");
                r.add(ControladorContrato.crearContrato(folio, "interno", estado_t, fechaInicio, fechaTermino, nombre_t, rut_t, sueldo_t, ""));

            }
        } else {
        }
        //    cdb.close();
        return r;
    }
}
