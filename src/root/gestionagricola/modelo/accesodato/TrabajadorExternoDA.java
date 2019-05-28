
package root.gestionagricola.modelo.accesodato;

import java.sql.SQLException;
import java.util.ArrayList;
import root.gestionagricola.gestioncontrato.Contrato;
import root.gestionagricola.gestioncontrato.ControladorContrato;
import root.gestionagricola.gestiontrabajador.ControladorTrabajador;
import root.gestionagricola.gestiontrabajador.Trabajador;
import root.gestionagricola.modelo.Conexion;
import root.gestionagricola.modelo.SingletonConexion;

/**
 * Permite gestionar la tabla del Trabajador Externo
 * @author Los Lanzas
 */
public class TrabajadorExternoDA {

    /**
     * Se guardan los datos de los trabajadores externos
     * @param rut rut del trabajador
     * @param nombre nombre del trabajador
     * @param sueldo Se espera un <int> con el sueldo del trabajador.
     * @param nombreEmpresa Se espera un <int> con el folio del contrato.
     * @param folio numero de contrato de trabajo
     * @throws ClassNotFoundException En caso de que no se encuentre la clase que
     * permite la conexion con la Base de Datos.
     * @throws InstantiationException En caso de que no se pueda realizar la
     * instanciacion de la Base de Datos.
     * @throws IllegalAccessException En caso de que no se pueda establecer 
     * conexion con la Base de Datos.
     * @throws SQLException En caso que la consulta realizada no sea soportada
     * por el lenguaje SQL.
     */
    public static void guardar(int rut, String nombre, int sueldo, int folio, String nombreEmpresa) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

        Conexion cdb = SingletonConexion.getInstancia().getConexiondb();
        //modulo seguridad si ya hay una cuenta con ese nombre 
        cdb.un_sql = "select rut from trabajadorexterno where rut = " + rut;
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if (cdb.resultado != null) {
            if (cdb.resultado.next()) {
                //Actualizacion de trabajadores 
                cdb.un_sql = "UPDATE trabajadorexterno set nombre='" + nombre + "', sueldo=" + sueldo + ",nombreempresa='" + nombreEmpresa + "', refcontrato=" + folio
                        + " WHERE rut=" + rut;
                cdb.statement.executeUpdate(cdb.un_sql);
                System.out.println("Datos actualizados");
            } else {
                cdb.un_sql = "Insert into trabajadorexterno values(" + rut + ", '" + nombre + "'," + sueldo + ", '" + nombreEmpresa + "', " + folio + ")";
                cdb.statement.executeUpdate(cdb.un_sql);

            }
        } else {

            cdb.un_sql = "Insert into trabajadorexterno values(" + rut + ", '" + nombre + "'," + sueldo + ", '" + nombreEmpresa + "', " + folio + ")";
            cdb.statement.executeUpdate(cdb.un_sql);
        }
        //cdb.close();
    }

    /**
     * Se carga una lista de todos los contratos de los trabajadores externos
     * @return una lista de todas los contratos
     * @throws ClassNotFoundException En caso de que no se encuentre la clase que
     * permite la conexion con la Base de Datos.
     * @throws InstantiationException En caso de que no se pueda realizar la
     * instanciacion de la Base de Datos.
     * @throws IllegalAccessException En caso de que no se pueda establecer 
     * conexion con la Base de Datos.
     * @throws SQLException En caso que la consulta realizada no sea soportada
     * por el lenguaje SQL.
     *
     */
    public static ArrayList cargarContrato() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        ArrayList r = null;

        Conexion cdb = SingletonConexion.getInstancia().getConexiondb();
        /**
         * estado para trabajador: estado para
         */
        cdb.un_sql = "select folio, fechainicio,fechatermino, rut, nombre, sueldo,estado, nombreempresa"
                + "from trabajadorexterno, contrato where folio=refcontrato";
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
                String nombreEmpresa = cdb.resultado.getString("nombreempresa");

                r.add(ControladorContrato.crearContrato(folio, "externo", estado, fechaInicio, fechaTermino, nombre, rut, sueldo, nombreEmpresa));
            }
        } else {
            System.out.println("error");
        }
        //    cdb.close();
        return r;
    }

    /**
     * Se carga un contrato en especifico
     * @param folio folio del trabajador especifico
     * @return el contrato encontrado
     */
    public static Contrato encontrarContrato(int folio) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Conexion cdb = SingletonConexion.getInstancia().getConexiondb();

        Contrato contrato = null;

        cdb.un_sql = "select folio, fechainicio,fechatermino, rut, nombre, sueldo, estado,nombreempresa "
                + " from trabajadorexterno, contrato where estado not like 'eliminado' and folio=" + folio + " and refcontrato=folio";
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
                String nom_empresa = cdb.resultado.getString("nombreempresa");
                contrato = ControladorContrato.crearContrato(folio, "externo", estado, fechaInicio, fechaTermino, nombre, rut, sueldo, nom_empresa);
            }
        } else {
            System.out.println("error");
        }
        //cdb.close();
        return contrato;

    }

    /**
     * Se carga una lista de todos los contratos de los trabajadores externos
     * que fueron contratado en ciertas fechas
     * @param inicio fecha inicio en que esta el contrato
     * @param termino fecha de termino del contrato
     * @return una lista de todas los contratos
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException
     *
     */
    public static ArrayList buscarContrato(String inicio, String termino) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        ArrayList r = null;

        Conexion cdb = SingletonConexion.getInstancia().getConexiondb();
        cdb.un_sql = "select folio, fechainicio,fechatermino, rut, nombre, sueldo,estado, nombreempresa"
                + " from trabajadorexterno, contrato where folio=refcontrato and fechainicio>=" + inicio + " and fechatermino<=" + termino;

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
                String nombreEmpresa = cdb.resultado.getString("nombreempresa");
                System.out.println(nombreEmpresa);
                r.add(ControladorContrato.crearContrato(folio, "externo", estado, fechaInicio, fechaTermino, nombre, rut, sueldo, nombreEmpresa));

            }
        } else {
            System.out.println("error");
        }
        //    cdb.close();
        return r;
    }
    
<<<<<<< HEAD
<<<<<<< HEAD
    /**
     * 
     * @param rut
     * @param nombre
     * @param rol
     * @param telefono
     * @param estado
     * @param num_contrato
=======
    /**
     * Busca contrato especifico con los parametros 
     * @param estado estado del contrato
     * @param inicio fecha inicio
     * @param termino fecha termino
     * @param nombre nombre trabajador
     * @param rut rut del trabajador
     * @param sueldo sueldo del trabajador a buscar
     * @param nom_empresa nombre de la empres que quiere buscar
     * @return lista de todos los trabajadores que cumplan con los criterios de busqueda
>>>>>>> Desarrollo
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException 
     */
<<<<<<< HEAD
    public static void guardarTrabajadorExterno(int rut, String nombre, String rol, int telefono, String estado, int num_contrato) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
  
        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
        //modulo seguridad si ya hay una cuenta con ese nombre 
        cdb.un_sql = "select rut from trabajador_Externo where rut = "+rut;
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if(cdb.resultado!=null){
           if(cdb.resultado.next()){
               //Actualiza trabajador Interno
               cdb.un_sql = "UPDATE trabajador_Externo set nombre='"+nombre+"', rol="+rol+", telefono="+telefono+"', estado="+estado+"', num_contrato="+num_contrato+
                       " WHERE rut="+rut;
                cdb.statement.executeUpdate(cdb.un_sql);
                System.out.println("Datos actualizados");
           }else{
               cdb.un_sql = "Insert into trabajador_Externo values("+rut +", '"+nombre+"', " +rol+", "+telefono+", "+estado+", "+num_contrato+")";
               cdb.statement.executeUpdate(cdb.un_sql);
               System.out.println("Datos guardados");
               
           }
        }else{
               cdb.un_sql = "Insert into trabajador_Externo values("+rut +", '"+nombre+"', " +rol+", "+telefono+", "+estado+", "+num_contrato+")";
               cdb.statement.executeUpdate(cdb.un_sql);
        }
        //cdb.close();
    }
    
    public static void eliminarTrabajadorExterno(int rut) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
        //modulo seguridad si ya hay una cuenta con ese rut
        cdb.un_sql = "select rut from trabajador_Externo where rut = "+rut;
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if(cdb.resultado!=null){
           if(cdb.resultado.next()){
               //ACTUALIZACION
               cdb.un_sql = "DELETE FROM trabajador_Externo"+
                      " WHERE rut='"+rut+"'";
                cdb.statement.executeUpdate(cdb.un_sql);
                System.out.println("Trabajador eliminado");
            }else{
               
            }
        }
    }
    
    /**
     * Se carga una lista de los trabajadores externos creados.
     * @return un arreglo que contienen a los trabajadores.
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException 
     */
    public static ArrayList cargarTrabajadorExterno() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        ArrayList r = null;
        Trabajador t;
        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
        cdb.un_sql = "select * from trabajador_Externo";
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if(cdb.resultado!=null){
            r = new ArrayList();
            while(cdb.resultado.next()){
                t = new Trabajador();
                t.setRut(Integer.valueOf(cdb.resultado.getString("rut")));
                t.setNombre(cdb.resultado.getString("nombre"));
                t.setRol(cdb.resultado.getString("rol"));
                t.setTelefono(Integer.valueOf(cdb.resultado.getString("telefono")));
                t.setEstado(cdb.resultado.getString("estado"));
                t.setNum_contrato(Integer.valueOf(cdb.resultado.getString("num_contrato")));
                r.add(t);
            }
        }else{
            System.out.println("error");
        }
        //cdb.close();
      return r;
    }
    
    public static Trabajador encontrarTrabajadorExterno(int rut) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
        
        Trabajador trabajador=null;
        
        cdb.un_sql = "select rut, nombre, rol, telefono, estado, num_contrato"
                + " from trabajador_Externo, trabajador where estado not like 'eliminado' and rut="+rut+ " and reftrabajador=rut";
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if(cdb.resultado!=null){
            while(cdb.resultado.next()){
                rut = cdb.resultado.getInt("rut");
                String nombre = cdb.resultado.getString("nombre");
                String rol = cdb.resultado.getString("rol");
                int telefono  =cdb.resultado.getInt("telefono");
                int num_contrato  = cdb.resultado.getInt("num_contrato");              
                trabajador = ControladorTrabajador.crearTrabajadorExterno(rut, nombre, rol, telefono, "subContratado", num_contrato);
            }
        }else{
            System.out.println("error");
        }
        //cdb.close();
        return trabajador;    
    }
    
    /*
    public static ArrayList buscarTrabajadorExterno(int rut) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        ArrayList r = null;
        
        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
        /**
         * estado para trabajador:  
         * estado para 
        cdb.un_sql = "select rut, nombre,rol, telefono, estado, num_contrato"
                + " from trabajador_Externo, rut where folio=refrut";

        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if(cdb.resultado!=null){
            r = new ArrayList();
            while(cdb.resultado.next()){
                rut= cdb.resultado.getInt("folio");
                String nombre = cdb.resultado.getString("nombre");
                String rol = cdb.resultado.getString("rol");
                int telefono = cdb.resultado.getInt("telefono");
                String estado = cdb.resultado.getString("estado");
                int num_contrato = cdb.resultado.getInt("num_contrato");
                r.add(ControladorTrabajador.crearTrabajadorExterno(rut, nombre, rol, telefono, estado, num_contrato));

            }
        }else{
            System.out.println("error");
        }
    //    cdb.close();
      return r;
    }
*/
=======
=======
    public static ArrayList buscarContrato( String estado,
            String  inicio, String termino, String nombre, int rut, int sueldo,
            String nom_empresa) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        ArrayList r = null;

        Conexion cdb = SingletonConexion.getInstancia().getConexiondb();
        
        cdb.un_sql = "select folio, fechainicio,fechatermino, rut, nombre, sueldo,estado, nombreempresa"
                + " from trabajadorexterno, contrato where folio=refcontrato ";
        
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
            cdb.un_sql+= " and estado like '"+estado+"'";
        }
        if(!nom_empresa.equals("")){
            cdb.un_sql += " and nombreempresa like '%"+nom_empresa+"%'";
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
                String nombreEmpresa = cdb.resultado.getString("nombreempresa");
                r.add(ControladorContrato.crearContrato(folio, "externo", estado_t, fechaInicio, fechaTermino, nombre_t, rut_t, sueldo_t, nombreEmpresa));

            }
        } else {
           }
        //    cdb.close();
        return r;
    }
>>>>>>> Desarrollo
    
>>>>>>> Desarrollo
}
