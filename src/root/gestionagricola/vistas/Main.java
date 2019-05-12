/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.gestionagricola.vistas;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import root.gestionagricola.Cuenta;
import root.gestionagricola.modelo.seguridad.CuentaDA;
import root.gestionagricola.modelo.Conexion;
import root.gestionagricola.modelo.Conexion_Postgres;
import root.gestionagricola.modelo.FactoriaConexion;


/**
 *
 * @author len_win
 */
public class Main {
       
    public static void main(String[] args){
        Conexion cdb  = null;
        String driver="";
        
        
        try {
            cdb = FactoriaConexion.getInstancia().getConexiondb();
            
        } catch (ClassNotFoundException ex) {
            driver = cdb.getDriver();
            System.out.println("Ocurrio un problema");
            System.out.println("conector jdbc "+driver);
            System.exit(-1);
            
        } catch (InstantiationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Conectado a la base de datos");
        Cuenta cuenta = new Cuenta("miguel", "123", "administrador");
        try {
            cuenta.guardar();
            System.out.println("Guardado");
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}
