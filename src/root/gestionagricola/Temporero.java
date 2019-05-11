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
public class Temporero extends Trabajador {
    private int cantidadRecolectada;
    private int cantidadLimpiada;

    public Temporero(int rut, String nombre, int telefono, String estado, Contrato contrato) {
        super(rut, nombre, telefono, estado, contrato);
        this.cantidadLimpiada =0;
        this.cantidadRecolectada=0;
    }
    public Temporero(int rut, String nombre, int telefono, String estado, Contrato contrato, int recolectada, int limpiada) {
        super(rut, nombre, telefono, estado, contrato);
        this.cantidadLimpiada =limpiada;
        this.cantidadRecolectada=recolectada;
    }
    public Temporero(int rut, String nombre, int telefono, String estado, Contrato contrato, int limpiada) {
        super(rut, nombre, telefono, estado, contrato);
        this.cantidadLimpiada =limpiada;
        this.cantidadRecolectada=0;
    }

    /**
     * @return the cantidadRecolectada
     */
    public int getCantidadRecolectada() {
        return cantidadRecolectada;
    }

    /**
     * @param cantidadRecolectada the cantidadRecolectada to set
     */
    public void setCantidadRecolectada(int cantidadRecolectada) {
        this.cantidadRecolectada = cantidadRecolectada;
    }

    /**
     * @return the cantidadLimpiada
     */
    public int getCantidadLimpiada() {
        return cantidadLimpiada;
    }

    /**
     * @param cantidadLimpiada the cantidadLimpiada to set
     */
    public void setCantidadLimpiada(int cantidadLimpiada) {
        this.cantidadLimpiada = cantidadLimpiada;
    }
    
    
    
}
