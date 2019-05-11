/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.gestionagricola;

import java.util.*;

/**
 *clase que gestiona los contratos
 * @author Miguel
 */
public class Contrato {
    private int folio;
    private Date fechaInicio;
    private Date fechaTermino;
    
    public Contrato(int folio, Date fechaInicio, Date fechaTermino){
        this.folio = folio;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
    }
    public Contrato(int folio, Date fechaInicio){
        this.folio = folio;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = null;
        
        
    }
    public Contrato(){
        this.folio=0;
        this.fechaInicio=null;
        this.fechaTermino=null;
    }

    /**
     * @return the folio
     */
    public int getFolio() {
        return folio;
    }

    /**
     * @param folio the folio to set
     */
    public void setFolio(int folio) {
        this.folio = folio;
    }

    /**
     * @return the fechaInicio
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaTermino
     */
    public Date getFechaTermino() {
        return fechaTermino;
    }

    /**
     * @param fechaTermino the fechaTermino to set
     */
    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }
}
