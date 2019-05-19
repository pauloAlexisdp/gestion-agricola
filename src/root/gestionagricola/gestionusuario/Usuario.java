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
    
    
    /**
     * Constructor de la clase Usuario.
     * @param nombreUsuario Tipo <String> nombre del usuario.
     * @param contrasena Tipo<String> Único en la BD.
     * @param tipoCuenta Tipo <String> para el tipo de cuenta del usuario (Supervisor, Dueño , Administrador).
     */
   
    public Usuario(String nombreUsuario, String contrasena, String tipoCuenta){
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
     * Permite modificar el nombre de un Usuario.
     * No se recomienda su uso, debido a que con el mismo nombre se pueden modificar los demás nombres que coincidan.
     * @param nombreUsuario Recibe un <String> con el nuevo nombre del Usuario.
     */
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    
    /**
     * Permite obtener el tipo de cuenta que tiene un Usuario.
     * @return el tipo de cuenta que tiene un Usuario(Supervisor, Dueño, Administrador).
     */
    public String getTipoCuenta() {
        return tipoCuenta;
    }
    
    /**
     * Permite modificar el tipo de cuenta que posee un Usuario.
     * @param tipoCuenta Recibe un <String> con el nuevo nombre de la cuenta del Usuario.
      */
    
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    /**
     * 
     * @return la contraseña asociada a un Usuario en particular.
     */
    public String getContrasena() {
        return contrasena;
    }

    
    /**
     * 
     * @param contrasena Recibe un <String> con la nueva contraseña para la cuenta de Usuario.
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
  
    
    
    
}
