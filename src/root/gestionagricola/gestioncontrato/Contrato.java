
package root.gestionagricola.gestioncontrato;

/**
 * Entidad que permite la instancia datos de un Contrato.
 * @author Los Lanzas
 */
public class Contrato {
    
    private int folio;
    private String tipo;
    private String estado;
    private String f_inicio;
    private String f_termino;
    private String nombre;
    private int rut;
    private int sueldo;
    private String nom_empresa;

    /**
     * Constructor de la clase Contrato.
     * @param folio Valor <int> unico en la BD.
     * @param tipo Tipo <String> valores: {Subcontrato, Planta}.
     * @param estado Tipo <String> valores: {Renovado, Activo, Finalizado}.
     * @param f_inicio Tipo <String> formato: 'DD-MM-AAAA' (inicio de contrato).
     * @param f_termino Tipo <String> formato: 'DD-MM-AAAA' (fin de contrato).
     * @param nombre Tipo <String>, nombre del asociado.
     * @param rut Tipo <int> DNI del asociado.
     * @param sueldo Tipo <int> sueldo del asociado.
     * @param nom_empresa Se espera un <int> con el nombre de la empresa subcontratada.
     */
    public Contrato(int folio, String tipo, String estado, String f_inicio, 
            String f_termino, String nombre, int rut, int sueldo, String nom_empresa) {
        this.folio = folio;
        this.tipo = tipo;
        this.estado = estado;
        this.f_inicio = f_inicio;
        this.f_termino = f_termino;
        this.nombre = nombre;
        this.rut = rut;
        this.sueldo = sueldo;
        this.nom_empresa = nom_empresa;
    }

    /**
     * Permite obtener el # de Folio del contrato.
     * @return Retorna un <int> con el folio del contrato.
     */
    public int getFolio() {
        return folio;
    }

    /**
     * Permite obtener el tipo de un contrato {Subcontrato, Planta}.
     * @return Retorna un <String> con el tipo del contrato.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Permite obtener el estado de un contrato {Renovado, Activo, Finalizado}.
     * @return Retorna un <String> con el estado de un contrato.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Permite obtener la fecha de inicio de un contrato.
     * @return Retorna un <String> con la fecha, formato: 'DD-MM-AAAA'.
     */
    public String getF_inicio() {
        return f_inicio;
    }

    /**
     * Permite obtener la fecha de termino del contrato.
     * @return Retorna un <String> con la fecha del contrato, formato: 'DD-MM-AAAA'.
     */
    public String getF_termino() {
        return f_termino;
    }

    /**
     * Permite obtener el nombre del asociado.
     * @return Retorna un <String> con el nombre del asociado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite obtener el DNI del asociado.
     * @return Retorna un <int> con el DNI del asociado.
     */
    public int getRut() {
        return rut;
    }

    /**
     * Permite obtener el sueldo del asociado al contrato.
     * @return Retorna un <int> con el sueldo del asociado.
     */
    public int getSueldo() {
        return sueldo;
    }
    
    /**
     * Permite obtener el nombre de la empresa subcontratada.
     * @return Retorna un <String> con el nombre de la empresa.
     */
    public String getNom_empresa() {
        return nom_empresa;
    }    
}
