/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.gestionagricola.vistas;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import root.gestionagricola.conexion.Conexion;
import root.gestionagricola.conexion.FactoriaConexion;
import root.gestionagricola.negocio.Cuenta;

/**
 *
 * @author len_win
 */
public class Main {
       
    public static void main(String[] args){
        
       Conexion cdb = null;
       String driver="";
       
        try {
            cdb = FactoriaConexion.getInstancia().getConexiondb();
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Error en la conexion con jdbc : "+cdb.getDriver());
            System.exit(-1);
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Conectado a postgres");
        Cuenta c = new Cuenta("miguel","1234", "admin" );
        try {
            ArrayList r = c.cargar();
            for(int i=0;i<r.size();i++){
                System.out.println(r.get(i));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
      
/*        
            ArrayList r = c.cargar();
            c.grabar();
            
            for(int i = 0;i<r.size();i++){
                System.out.println(r.get(i));
            }
            
        }       
     */
}
