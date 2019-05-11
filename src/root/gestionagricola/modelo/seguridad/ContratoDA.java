/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.gestionagricola.modelo.seguridad;

import java.sql.SQLException;
import java.util.ArrayList;
import root.gestionagricola.Contrato;
import root.gestionagricola.modelo.Conexion;
import root.gestionagricola.modelo.FactoriaConexion;

/**
 *
 * @author Miguel
 */
public class ContratoDA {
    private Contrato contrato;
    
    public ContratoDA(Contrato c){
        this.contrato = c;
    }
    
    public void guardar() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
        cdb.un_sql = "select folio from contrato where folio="+contrato.getFolio();
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if(cdb.resultado!=null){
            if(cdb.resultado.next()){
                cdb.un_sql="UPDATE contrato set fechatermino="+contrato.getFechaTermino()+" where folio="+contrato.getFolio();
                cdb.statement.executeUpdate(cdb.un_sql);
                System.out.println("Datos Actualizados");
            }else{
                cdb.un_sql ="Insert into contrato values("+contrato.getFolio()+","+contrato.getFechaInicio()+","+contrato.getFechaTermino()+")";
                cdb.statement.executeUpdate(cdb.un_sql);
                System.out.println("Datos guardados");
            }
        }else{
            cdb.un_sql ="Insert into contrato values("+contrato.getFolio()+","+contrato.getFechaInicio()+","+contrato.getFechaTermino()+")";
                cdb.statement.executeUpdate(cdb.un_sql);
                System.out.println("Datos guardados");
        }
    }
    
    public ArrayList cargar() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException{
        ArrayList r=null;
        Contrato c;
        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
        cdb.un_sql = "select * from contrato";
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if(cdb.resultado!=null){
            r = new ArrayList();
            while(cdb.resultado.next()){
                c = new Contrato();
               
                c.setFolio(cdb.resultado.getInt("folio"));
                c.setFechaInicio(cdb.resultado.getDate("fechainicio"));
                c.setFechaTermino(cdb.resultado.getDate("fechaTermino"));   
                r.add(c);
            }
        }else{
            System.out.println("No hay datos");
        }
        return r;
    }
    
}
