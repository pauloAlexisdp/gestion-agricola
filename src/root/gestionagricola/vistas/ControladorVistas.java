
package root.gestionagricola.vistas;

import root.gestionagricola.Cuenta;
import root.gestionagricola.vistas.administrador.Administrador;
import root.gestionagricola.vistas.dueño.Dueño;
import root.gestionagricola.vistas.dueño.GenerarReportes;
import root.gestionagricola.vistas.dueño.GestionDeContratos;
import root.gestionagricola.vistas.supervisor.Asistencia;
import root.gestionagricola.vistas.supervisor.Supervisor;

/**
 *
 * @author Javier
 */
public class ControladorVistas {
    private Busqueda busqueda;
    private FramePrincipal frame_principal;
    private Login login;
    private ResultadoBusqueda resultado_busqueda;
    private Administrador admin;
    private Dueño dueño;
    private GenerarReportes reportes;
    private GestionDeContratos contratos;
    private Asistencia asistencia;
    private Supervisor supervisor;
    
    
    public ControladorVistas(Busqueda busqueda, FramePrincipal frameprincipal,Login 
            login,ResultadoBusqueda resulbusqueda, Administrador admin,Dueño dueno,
            GenerarReportes reportes,GestionDeContratos contratos, Asistencia asistencia,Supervisor supervisor){
        
        this.busqueda = busqueda;
        this.frame_principal = frameprincipal;
        this.login = login;
        this.resultado_busqueda = resulbusqueda;
        this.admin = admin;
        this.dueño = dueno;
        this.reportes = reportes;
        this.contratos = contratos;
        this.asistencia = asistencia;
        this.supervisor = supervisor;
    }    
    
    /*
       Metodo para seleccionar el panel que se mostrara al realizar una accion.
    */
    public void SeleccionarPanel(String panel){
        switch(panel){
            case "login"://se carga el panel de login
                this.frame_principal.setContentPane(this.login);
                this.frame_principal.actualizarpantalla();
                break;
            case "busqueda"://volver al panel de busqueda
                this.frame_principal.setContentPane(this.busqueda);
                this.frame_principal.actualizarpantalla();
                break;
                
            case "busqueda_supervisor"://cargar el panel de busqueda desde supervisor
                this.frame_principal.setContentPane(this.busqueda);
                this.busqueda.setPanel_anterior("busquedasupervisor");//se setea que fue desde supervisor
                this.frame_principal.actualizarpantalla();
                break;
            case "busqueda_dueño"://cargar el panel de busqueda desde dueño
                this.frame_principal.setContentPane(this.busqueda);
                this.busqueda.setPanel_anterior("busquedadueño");//se setea que fue desde dueño
                this.frame_principal.actualizarpantalla();
                break;
            case "resultadobusqueda"://cargar panel de resultadoBusqueda
                this.frame_principal.setContentPane(this.resultado_busqueda);
                this.frame_principal.actualizarpantalla();
                break;
            case "admin"://cargar panel de administrador
                this.frame_principal.setContentPane(this.admin);
                this.frame_principal.actualizarpantalla();
                break;
            case "reportes"://cargar panel de reportes
                this.frame_principal.setContentPane(this.reportes);
                this.frame_principal.actualizarpantalla();
                break;
            case "dueño"://cargar panel del dueño
                this.frame_principal.setContentPane(this.dueño);
                this.frame_principal.actualizarpantalla();
                break;
            case "contratos"://carga el panel de contratos
                this.frame_principal.setContentPane(this.contratos);
                this.frame_principal.actualizarpantalla();
                break;
            case "asistencia"://carga el panel de asistencia
                this.frame_principal.setContentPane(this.asistencia);
                this.frame_principal.actualizarpantalla();
                break;
            case "supervisor"://carga el panel de supervisor
                this.frame_principal.setContentPane(this.supervisor);
                this.frame_principal.actualizarpantalla();
                break;
                
        }
    }

    public Busqueda getBusqueda() {
        return busqueda;
    }

    public FramePrincipal getFrame_principal() {
        return frame_principal;
    }

    public Login getLogin() {
        return login;
    }

    public ResultadoBusqueda getResultado_busqueda() {
        return resultado_busqueda;
    }

    public Administrador getAdmin() {
        return admin;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public GenerarReportes getReportes() {
        return reportes;
    }

    public GestionDeContratos getContratos() {
        return contratos;
    }

    public Asistencia getAsistencia() {
        return asistencia;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }
    
    
    
}
