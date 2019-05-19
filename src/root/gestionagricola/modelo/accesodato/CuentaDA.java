/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.gestionagricola.modelo.accesodato;

import root.gestionagricola.modelo.*;
import java.sql.SQLException;
import java.util.ArrayList;
import root.gestionagricola.Cuenta;
import root.gestionagricola.Cuenta;

/**
 *
 * @author len_win
 */
public class CuentaDA {
    private Cuenta cuenta;
    
    public CuentaDA(Cuenta cuenta){
        this.cuenta = cuenta;
    }
    
    /**
     * guardo los datos de los usuarios en la tabla con el objeto cuenta que es pasado desde mi vista
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException 
     */
    public void guardar() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
        //modulo seguridad si ya hay una cuenta con ese nombre 
        cdb.un_sql = "select nombre from cuenta where nombre = '"+cuenta.getNombre()+"'";
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if(cdb.resultado!=null){
           if(cdb.resultado.next()){
               cdb.un_sql = "UPDATE cuenta set contrasena='"+cuenta.getPassword()+"', tipo='"+cuenta.getTipo()+"'"+
                       "WHERE nombre='"+cuenta.getNombre()+"'";
                cdb.statement.executeUpdate(cdb.un_sql);
                System.out.println("Datos actualizados");
           }else{
               cdb.un_sql = "Insert into cuenta values('"+cuenta.getNombre()+"','"+cuenta.getPassword()+"','"+cuenta.getTipo()+"')";
               cdb.statement.executeUpdate(cdb.un_sql);
               System.out.println("Datos guardados");
               
           }
        }else{
            cdb.un_sql = "Insert into cuenta values ('"+cuenta.getNombre()+"','"+cuenta.getPassword()+"','"+cuenta.getTipo()+"')";
            cdb.statement.executeUpdate(cdb.un_sql);
        }
        cdb.close();
    }
    
    /**
     * cargo una lista de todos los usuarios registrados en mi cuenta
     * @return una lista de todas las cuentas que tengo en la tabla cuenta
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException 
     */
    public ArrayList cargar() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        ArrayList r = null;
        Cuenta c;
        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
        cdb.un_sql = "select * from cuenta";
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if(cdb.resultado!=null){
            r = new ArrayList();
            while(cdb.resultado.next()){
                c = new Cuenta();
                c.setNombre(cdb.resultado.getString("nombre"));
                c.setPassword(cdb.resultado.getString("contrasena"));
                c.setTipo(cdb.resultado.getString("tipo"));
                r.add(c);
            }
        }else{
            System.out.println("error");
        }
        cdb.close();
      return r;
    }
    /**
     * 
     * @param nombre nombre de usuario
     * @param password password para comprobar si el usuario ingresado es valido
     * @return retorn la cuenta rescatada de la base de datos, debe ser solo una fila como respuesta
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException 
     */
    public Cuenta buscar(String nombre, String password) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
        Conexion cdb = FactoriaConexion.getInstancia().getConexiondb();
        
        cdb.un_sql = "select nombre,contrasena, tipo from cuenta where nombre like '"+nombre+"' and contrasena like '"+password+"'";
        cdb.resultado = cdb.statement.executeQuery(cdb.un_sql);
        if(cdb.resultado!=null){
        while(cdb.resultado.next()){
            cuenta.setNombre(cdb.resultado.getString("nombre"));
            cuenta.setPassword(cdb.resultado.getString("contrasena"));
            cuenta.setTipo(cdb.resultado.getString("tipo"));
            System.out.println("Nombre "+cuenta.getNombre()+" tipo "+cuenta.getTipo());
        }
        }else{
        }
      //  cdb.close();
        return cuenta;
    }
}
