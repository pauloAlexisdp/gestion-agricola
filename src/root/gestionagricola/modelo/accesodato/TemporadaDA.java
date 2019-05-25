/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.gestionagricola.modelo.accesodato;

import java.sql.SQLException;
import root.gestionagricola.modelo.Conexion;
import root.gestionagricola.modelo.FactoriaConexion;

/**
 *  adminsitrao la temporada
 * @author len_win
 */
public class TemporadaDA {
    
    public static void guardarTemporada(int id, String fecha) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
        //modulo seguridad si ya hay una cuenta con ese nombre

        cdb.un_sql ="select id from instanciatemporada where id = "+id;
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if(cdb.resultado != null){

           if(cdb.resultado.next()){
               cdb.un_sql = "UPDATE instanciatemporada set fecha="+fecha+
                       " WHERE id="+id;
                cdb.statement.executeUpdate(cdb.un_sql);
                System.out.println("Datos InstanciaTemporada actualizados");
           }else{
               cdb.un_sql = "Insert into instanciatemporada values("+id+","+fecha+")";
               cdb.statement.executeUpdate(cdb.un_sql);
               System.out.println("Datos guardados");
               
           }
        }else{
            cdb.un_sql = "Insert into instanciatemporada values("+id+","+fecha+")";
            cdb.statement.executeUpdate(cdb.un_sql);
        }
//        cdb.close();
    }
    
    
    public static 
    
    
    
    
}
