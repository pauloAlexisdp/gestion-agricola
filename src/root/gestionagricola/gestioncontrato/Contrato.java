
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
    }

    /**
     * Permite obtener el # de Folio del contrato.
     * @return Retorna un <int> con el folio del contrato.
     */
    public int getFolio() {
        return folio;
    }

    /**
     * Permite modificar el valor del folio de un contrato.
     * No se recomienda su uso.
     * @param folio Recibe un <int> con el nuevo valor de folio.
     */
    public void setFolio(int folio) {
        this.folio = folio;
    }

    /**
     * Permite obtener el tipo de un contrato {Subcontrato, Planta}.
     * @return Retorna un <String> con el tipo del contrato.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Permite modificar el valor de tipo de un contrato.
     * @param tipo Se espera un <String> con los valores: {Subcontrato, Planta}.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Permite obtener el estado de un contrato {Renovado, Activo, Finalizado}.
     * @return Retorna un <String> con el estado de un contrato.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Permite modificar el estado de un contrato.
     * @param estado Se espera un <String> con los valores: {Renovado, Activo, Finalizado}.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Permite obtener la fecha de inicio de un contrato.
     * @return Retorna un <String> con la fecha, formato: 'DD-MM-AAAA'.
     */
    public String getF_inicio() {
        return f_inicio;
    }

    /**
     * Permite modificar la fecha de inicio del contrato.
     * @param f_inicio Se espera un <String> con el formato: 'DD-MM-AAAA'.
     */
    public void setF_inicio(String f_inicio) {
        this.f_inicio = f_inicio;
    }

    /**
     * Permite obtener la fecha de termino del contrato.
     * @return Retorna un <String> con la fecha del contrato, formato: 'DD-MM-AAAA'.
     */
    public String getF_termino() {
        return f_termino;
    }

    /**
     * Permite modificar la fecha de termino del contrato.
     * @param f_termino Se espera un <String> con el formato: 'DD-MM-AAAA'.
     */
    public void setF_termino(String f_termino) {
        this.f_termino = f_termino;
    }

    /**
     * Permite obtener el nombre del asociado.
     * @return Retorna un <String> con el nombre del asociado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite modificar el nombre del asociado.
     * @param nombre Se espera un <String> con el nombre del asociado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Permite obtener el DNI del asociado.
     * @return Retorna un <int> con el DNI del asociado.
     */
    public int getRut() {
        return rut;
    }

    /**
     * Permite modificar el DNI del asociado.
     * @param rut Se espera un <int> con el DNI del asociado.
     */
    public void setRut(int rut) {
        this.rut = rut;
    }

    /**
     * Permite obtener el sueldo del asociado al contrato.
     * @return Retorna un <int> con el sueldo del asociado.
     */
    public int getSueldo() {
        return sueldo;
    }

    /**
     * Permite modificar el sueldo del asociado al contrato.
     * @param sueldo Se espera un <int> con el sueldo del asociado.
     */
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    /**
     * Permite obtener el nombre de la empresa subcontratada.
     * @return Retorna un <String> con el nombre de la empresa.
     */
    public String getNom_empresa() {
        return nom_empresa;
    }

    /**
     * Permite modificar el nombre de una empresa subcontrada.
     * @param nom_empresa Se espera un <String> con el nuevo nombre de la empresa.
     */
    public void setNom_empresa(String nom_empresa) {
        this.nom_empresa = nom_empresa;
    }
    
}
