
package root.gestionagricola.gestiontrabajador;

/**
 * Clase que permite instanciar los datos de la entidad Trabajador.
 * @author Los Lanzas
 */
public class Trabajador {
    
    private int rut;
    private String nombre;
    private String rol;
    private int telefono;
    private String estado;
    private int num_contrato;
    
    //Se utiliza para crear un trabajador sin parametros.
    public Trabajador(){    
    }
    /**
     * Constructor para un trabajador en general, ya sea interno o externo.
     * @param rut Se espera un <int> con el DNI del asociado.
     * @param nombre Se espera un <String> con el nombre del asociado.
     * @param rol Se espera un <String> que detalle la funcion del trabajador.
     * @param telefono Se espera un <int> con el telefono del asociado.
     * @param estado Se espera un <String> con el estado del asociado {Subcontratado, Planta}.
     * @param num_contrato Se espera un <int> con el folio del contrato.
     */
    public Trabajador(int rut, String nombre, String rol, int telefono, String estado, int num_contrato) {
        this.rut = rut;
        this.nombre = nombre;
        this.rol = rol;
        this.telefono = telefono;
        this.estado = estado;
        this.num_contrato = num_contrato;
    }
    
    /**
     * Constructor para un trabajador interno de la empresa.
     * @param rut Se espera un <int> con el DNI del asociado.
     * @param nombre Se espera un <String> con el nombre del asociado.
     * @param telefono Se espera un <int> con el telefono del asociado.
     * @param estado Se espera un <String> con el estado del asociado {Subcontratado, Planta}.
     * @param num_contrato Se espera un <int> con el folio del contrato.
     */
    public Trabajador(int rut, String nombre, int telefono, String estado, int num_contrato) {
        this.rut = rut;
        this.nombre = nombre;
        this.telefono = telefono;
        this.estado = estado;
        this.num_contrato = num_contrato;
    }

    /**
     * Contructor para un trabajador subcontratado.
     * @param rut Se espera un <int> con el DNI del asociado.
     * @param nombre Se espera un <String> con el nombre del asociado.
     * @param rol Se espera un <String> con el rol del asociado.
     * @param num_contrato Se espera un <int> con el folio del contrato.
     */
    public Trabajador(int rut, String nombre, String rol, int num_contrato) {
        this.rut = rut;
        this.nombre = nombre;
        this.rol = rol;
        this.num_contrato = num_contrato;
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
     * Permite obtener el nombre del asociado.
     * @return Retorna un <String> con el nombre del asociado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite modificar el nombre del asociado.
     * @param nombre Se espera un <String> con el nuevo nombre del asociado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Permite obtener el Rol de un asociado subcontratado.
     * @return Retorna un <String> con el rol del asociado.
     */
    public String getRol() {
        return rol;
    }

    /**
     * Permite modificar el rol de un asociado subcontratado.
     * @param rol Se espera un <String> con el rol del asociado.
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * Permite obtener el telefono del asociado.
     * @return Retorna un <int> con el telefono del asociado.
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Permite modificar el telefono del asociado.
     * @param telefono Se espera un <int> con el telefono del asociado.
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Permite obtener el estado del asociado {Subcontratado, Planta}.
     * @return Retorna un <String> con el estado del asociado.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Permite modificar el estado del asociado.
     * @param estado Se espera un <String> con el estado del asociado {Subcontratado, Planta}.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Permite obtener el folio asociado al contrato del trabajador.
     * @return Retorna un <int> con el folio del contrato.
     */
    public int getNum_contrato() {
        return num_contrato;
    }

    /**
     * Permite modificar el folio asociado al contrato del trabajador.
     * No es sugerible su uso.
     * @param num_contrato Se espera un <int> con el folio del contrato.
     */
    public void setNum_contrato(int num_contrato) {
        this.num_contrato = num_contrato;
    }
    
}
