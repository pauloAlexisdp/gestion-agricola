/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.gestionagricola.modelo.accesodato;

import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.SimpleFormatter;
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
     * @param rut rut del trabajador
     * @param nombre nombre del trabajador
     * @param sueldo que gana el trabajador
     * @param folio numero de contrato de trabajo
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException 
     */
    public static void guardar(int rut, String nombre, int sueldo,  int folio) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
       
        
        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
        //modulo seguridad si ya hay una cuenta con ese nombre 
        cdb.un_sql = "select rut from trabajadorInterno where rut = "+rut;
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if(cdb.resultado!=null){
           if(cdb.resultado.next()){
               /*cdb.un_sql = "UPDATE cuenta set contrasena='"+cuenta.getPassword()+"', tipo='"+cuenta.getTipo()+"'"+
                       "WHERE nombre='"+cuenta.getNombre()+"'";
                cdb.statement.executeUpdate(cdb.un_sql);
                System.out.println("Datos actualizados");*/
           }else{
               cdb.un_sql = "Insert into trabajadorInterno values("+rut +", '"+nombre+"', " +sueldo+", "+folio +")";
               cdb.statement.executeUpdate(cdb.un_sql);
               System.out.println("Datos guardados");
               
           }
        }else{
               cdb.un_sql = "Insert into trabajadorInterno values("+rut +", '"+nombre+"', " +sueldo+", "+folio +")";
               cdb.statement.executeUpdate(cdb.un_sql);
        }
        //cdb.close();
    }
    
    /**
     * cargo una lista de todos los contratos registrados
     * @return una lista de todas los contratos 
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException 
     **/
    public static ArrayList cargarContrato() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        ArrayList r = null;
        
        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
        /**
         * estado para trabajador:  
         * estado para 
         */
        cdb.un_sql = "select folio, fechainicio,fechatermino, rut, nombre, telefono, estado "
                + "from trabajadorinterno, contrato where folio=refcontrato";
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if(cdb.resultado!=null){
            r = new ArrayList();
            while(cdb.resultado.next()){
                String fechaInicio = cdb.resultado.getString("fechainicio");
                String fechaTermino = cdb.resultado.getString("fechatermino");
                int folio  =cdb.resultado.getInt("folio");
                int rut = cdb.resultado.getInt("rut");
                String nombre = cdb.resultado.getString("nombre");
                int sueldo  = cdb.resultado.getInt("sueldo");
                String estado = cdb.resultado.getString("estado");
                
                r.add(ControladorContrato.crearContrato(folio, "planta", estado,fechaInicio, fechaTermino, nombre, rut, sueldo, ""));
            }
        }else{
            System.out.println("error");
        }
        //cdb.close();
      return r;
    }
    
    /**
     * cargo una lista de todos los contratos registrados
     * @param inicio
     * @param termino
     * @return una lista de todas los contratos  que coincidan con las fechas correspondiente
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException 
     **/
    public static ArrayList buscarContrato(String inicio, String termino) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        ArrayList r = null;
        
        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
        /**
         * estado para trabajador:  
         * estado para 
         */
        cdb.un_sql = "select folio, fechainicio,fechatermino, rut, nombre, telefono, estado "
                + "from trabajadorinterno, contrato where folio=refcontrato and fechainicio>="+inicio+" and fechatermino<="+termino;
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if(cdb.resultado!=null){
            r = new ArrayList();
            while(cdb.resultado.next()){
                String fechaInicio = cdb.resultado.getString("fechainicio");
                String fechaTermino = cdb.resultado.getString("fechatermino");
                int folio  =cdb.resultado.getInt("folio");
                int rut = cdb.resultado.getInt("rut");
                String nombre = cdb.resultado.getString("nombre");
                int sueldo  = cdb.resultado.getInt("sueldo");
                String estado = cdb.resultado.getString("estado");
                
                r.add(ControladorContrato.crearContrato(folio, "planta", estado,fechaInicio, fechaTermino, nombre, rut, sueldo, ""));
            }
        }else{
            System.out.println("error");
        }
        //cdb.close();
      return r;
    }
    
}
