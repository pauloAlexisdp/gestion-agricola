/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.gestionagricola;

/**
 *
 * @author len_win
 */
public class Supervisor extends Trabajador {
    private int horas;

    public Supervisor(int rut, String nombre, int telefono, String estado, Contrato contrato) {
        super(rut, nombre, telefono, estado, contrato);
    }
    
    public Supervisor(int rut, String nombre, int telefono, String estado, Contrato contrato, int horasTrabajadas) {
        super(rut, nombre, telefono, estado, contrato);
        this.horas = horasTrabajadas;
    }

    /**
     * @return the horas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    
    
    
}
