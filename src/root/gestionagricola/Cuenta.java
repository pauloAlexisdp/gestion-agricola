/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package root.gestionagricola;

import java.sql.SQLException;

/**
 * 
 * @author len_win
 */
public class Cuenta {
    private String nombre;
    private String password;
    private String tipo;
    
    
    public Cuenta(String nombre, String password, String tipo){
        this.nombre = nombre;
        this.password = password;
        this.tipo = tipo;
    }
    public Cuenta(){}

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;  
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * 
     * @param nombre
     * @param password
     * @return retorna el tipo de usuario que es 
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException 
     */
    public String BuscarUsuario(String nombre, String password) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        CuentaDA cda = new CuentaDA(this);
        Cuenta c = cda.buscar(nombre, password);
        this.nombre=c.getNombre();
        this.password = c.getPassword();
        this.tipo = c.getTipo();
        System.out.println("Nombre "+this.nombre+" paa "+this.password+" tipo "+this.tipo);
        if(this.tipo == null){
            return "0";
        }else{
            return this.tipo;
        }
    }
    
 
    
    /**
     * 
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws SQLException 
     */
    public void guardar() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException{
        CuentaDA cda = new CuentaDA(this);
        cda.guardar();
        System.out.println("Guardado");
    }    
}
