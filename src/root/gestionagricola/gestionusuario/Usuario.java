/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.gestionagricola.gestionusuario;

/**
 * Entidad que permite la insticia de la gestión de un Usuario.
 * @author ignacioburgos
 */
public class Usuario {
    
    private String nombreUsuario;
    private String tipoCuenta;
    private String contrasena;
    
    public Usuario(){}
    
    /**
     * Constructor de la clase Usuario.
     * @param nombreUsuario Tipo <String> nombre del usuario.
     * @param contrasena Tipo<String> Único en la BD.
     * @param tipoCuenta Tipo <String> para el tipo de cuenta del usuario (Supervisor, Dueño , Administrador).
     */
    protected Usuario(String nombreUsuario, String contrasena, String tipoCuenta){
    this.nombreUsuario = nombreUsuario;
    this.tipoCuenta = tipoCuenta;
    this.contrasena = contrasena;
    }
    
    /**
     * Permite obtener el nombre del Usuario.
     * @return el nombre del Usuario ingresado previamente.
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    
    /**
     * Permite obtener el tipo de cuenta que tiene un Usuario.
     * @return el tipo de cuenta que tiene un Usuario(Supervisor, Dueño, Administrador).
     */
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * 
     * @return la contraseña asociada a un Usuario en particular.
     */
    public String getContrasena() {
        return contrasena;
    }
}
