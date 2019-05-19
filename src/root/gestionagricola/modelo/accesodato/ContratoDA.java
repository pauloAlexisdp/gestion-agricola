/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.gestionagricola.modelo.accesodato;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import root.gestionagricola.Cuenta;
import root.gestionagricola.gestioncontrato.Contrato;
import root.gestionagricola.gestioncontrato.ControladorContrato;
import root.gestionagricola.modelo.Conexion;
import root.gestionagricola.modelo.FactoriaConexion;

/**
 * clase que gestiona los contratos de un trabajador 
 * @author len_win
 */
public class ContratoDA {
    Contrato contrato;
    
    public ContratoDA(Contrato contrato){
        this.contrato = contrato;
    }
    
    public ContratoDA(){}
    
    /**
     * guardo los datos de los contrato de los trabajadores   
     * @param folio
     * @param fechaInicio
     * @param fechaTermino
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException 
     */
    public static void guardar(int folio, String fechaInicio, String fechaTermino, String estado) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
        Date fecha_inicio = Date.valueOf(fechaInicio);
        Date fecha_termino = Date.valueOf(fechaTermino);
        
        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
        //modulo seguridad si ya hay una cuenta con ese nombre 
        cdb.un_sql = "select folio from contrato where folio = "+folio;
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if(cdb.resultado!=null){
           if(cdb.resultado.next()){
               /*cdb.un_sql = "UPDATE cuenta set contrasena='"+cuenta.getPassword()+"', tipo='"+cuenta.getTipo()+"'"+
                       "WHERE nombre='"+cuenta.getNombre()+"'";
                cdb.statement.executeUpdate(cdb.un_sql);
                System.out.println("Datos actualizados");*/
           }else{
               cdb.un_sql = "Insert into contrato values("+ folio +", "+fecha_inicio+", " +fecha_termino +",'"+estado+"'"+")";
               cdb.statement.executeUpdate(cdb.un_sql);
               System.out.println("Datos guardados");
               
           }
        }else{
               cdb.un_sql = "Insert into contrato values("+ folio +", "+fecha_inicio+", " +fecha_termino +")";
               cdb.statement.executeUpdate(cdb.un_sql);
        }
        //cdb.close();
    }
    
    
 
}
