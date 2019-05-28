package root.gestionagricola.vistas;

import java.util.Random;
import root.gestionagricola.SingletonCuenta;
import root.gestionagricola.vistas.administrador.Administrador;
import root.gestionagricola.vistas.dueño.Dueño;
import root.gestionagricola.vistas.dueño.GenerarReportes;
import root.gestionagricola.vistas.dueño.GestionDeContratos;
import root.gestionagricola.vistas.supervisor.Busqueda;
import root.gestionagricola.vistas.supervisor.VistaAsistencia;
import root.gestionagricola.vistas.supervisor.Supervisor;

/**
 * Permite gestionar las vistas de usuarios.
 * @author Los Lanzas
 */
public class ControladorVistas {

    private Busqueda busqueda;
    private FramePrincipal frame_principal;
    private Login login;
    private Administrador admin;
    private Dueño dueño;
    private GenerarReportes reportes;
    private GestionDeContratos contratos;
    private VistaAsistencia asistencia;
    private Supervisor supervisor;
    private final static int LENGTH_PASS = 10;

    /**
     * Constructor del controlador de vistas.
     * @param busqueda Se espera un objeto tipo <Busqueda> con la vista de
     * busqueda.
     * @param frameprincipal Se espera un <FramePrincipal> con el frame 
     * principal.
     * @param login Se espera un <Login> con la vista del login.
     * @param admin Se espera un <Administrador> con la vista del admin.
     * @param dueno Se espera un <Dueño> con la vista del dueño.
     * @param reportes Se espera un <GenerarReportes> con la vista de reportes.
     * @param contratos Se espera un <GestionDeContratos> con la vista para
     * gestionar contratos.
     * @param asistencia Se espera un <VistaAsistencia> con la vista de
     * asistencias.
     * @param supervisor Se espera un <Supervisor> con la vista del supervisor.
     */
    public ControladorVistas(Busqueda busqueda, FramePrincipal frameprincipal, Login login, Administrador admin, Dueño dueno,
            GenerarReportes reportes, GestionDeContratos contratos, VistaAsistencia asistencia, Supervisor supervisor) {

        this.busqueda = busqueda;
        this.frame_principal = frameprincipal;
        this.login = login;
        this.admin = admin;
        this.dueño = dueno;
        this.reportes = reportes;
        this.contratos = contratos;
        this.asistencia = asistencia;
        this.supervisor = supervisor;
    }

    /**
     * Metodo para decidir el panel en base a la cuenta.
     * @param panel Se espera un <String> con el nombre del panel.
     */
    public void SeleccionarPanel(String panel) {
        switch (panel) {
            case "login"://se carga el panel de login
                SingletonCuenta.downInstance();
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

    /**
     * Permite obtener el frame de busqueda.
     * @return Retorna un frame de busqueda.
     */
    public Busqueda getBusqueda() {
        return busqueda;
    }
    
    /**
     * Permite obtener la vista principal
     * @return Retorna el frame de la vista principal.
     */
    public FramePrincipal getFrame_principal() {
        return frame_principal;
    }

    /**
     * permite obtener la vista login.
     * @return Retorna un frame con la vista de login.
     */
    public Login getLogin() {
        return login;
    }

    /**
     * Permite obtener la vista del admin.
     * @return Retorna un frame con la vista del admin.
     */
    public Administrador getAdmin() {
        return admin;
    }

    /**
     * permite obtener la vista del dueño.
     * @return Retorna un frame con la vista del dueño.
     */
    public Dueño getDueño() {
        return dueño;
    }

    /**
     * Permite obtener un frame de la vista de reportes.
     * @return Retorna un frame con la vista de reportes.
     */
    public GenerarReportes getReportes() {
        return reportes;
    }

    /**
     * Permite obtener la vista contratos.
     * @return Retorna el frame con la vista contratos.
     */
    public GestionDeContratos getContratos() {
        return contratos;
    }

    /**
     * permite obtener la vista de asistencias.
     * @return Retorna un frame con la vista de asistencias.
     */
    public VistaAsistencia getAsistencia() {
        return asistencia;
    }

    /**
     * Permite obtener la vista de supervisor.
     * @return Retorna un frame con la vista del supervisor.
     */
    public Supervisor getSupervisor() {
        return supervisor;
    }

    /**
     * Permite generar una clave de usuario aleatoria, considera minusculas,
     * mayusculas y numeros.
     *
     * @return Retorna un <String> con la nueva clave de usuario.
     */
    public static String createRandomPassword() {
        String pass = "";
        Random r = new Random();
        int disc;
        for (int i = 0; i < ControladorVistas.LENGTH_PASS; i++) {
            disc = r.nextInt(3);
            if (disc == 0) {
                pass += (char)(r.nextInt(26) + 65);
            } else if (disc == 1) {
                pass += (char)(r.nextInt(26) + 97);
            } else {
                pass += (char)(r.nextInt(9) + 49);
            }
        }
        return pass;
    }
}
