/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.gestionagricola;

/**
 *
 * @author Miguel
 */
public class Trabajador {
    private int rut;
    private String nombre;
    private int telefono;
    private String estado;
    private Contrato contrato;
    
    public Trabajador(int rut, String nombre,int telefono, String estado, Contrato contrato ){
        this.rut = rut;
        this.nombre = nombre;
        this.telefono = telefono;
        this.estado= estado;
        this.contrato = contrato;
    }

    /**
     * @return the rut
     */
    public int getRut() {
        return rut;
    }

    /**
     * @param rut the rut to set
     */
    public void setRut(int rut) {
        this.rut = rut;
    }

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
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the contrato
     */
    public Contrato getContrato() {
        return contrato;
    }

    /**
     * @param contrato the contrato to set
     */
    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
    
    
    
}
