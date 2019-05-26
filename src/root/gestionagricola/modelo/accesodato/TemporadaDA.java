/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.gestionagricola.modelo.accesodato;

import java.sql.SQLException;
import java.util.Date;
import root.gestionagricola.modelo.Conexion;
import root.gestionagricola.modelo.FactoriaConexion;

/**
 *  adminsitrao la temporada
 * @author len_win
 */
public class TemporadaDA {
    
    /**
     * 
     * @param id id de la temporada 
     * @param fecha
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException 
     */
    public static void guardarTemporada(String id, String fecha) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
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
    
    
    
    
    
}
