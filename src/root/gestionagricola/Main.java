
package root.gestionagricola;

import java.sql.SQLException;
import root.gestionagricola.modelo.accesodato.TemporadaDA;
import root.gestionagricola.vistas.supervisor.Busqueda;
import root.gestionagricola.vistas.ControladorVistas;
import root.gestionagricola.vistas.FramePrincipal;
import root.gestionagricola.vistas.Login;
import root.gestionagricola.vistas.administrador.Administrador;
import root.gestionagricola.vistas.dueño.Dueño;
import root.gestionagricola.vistas.dueño.GenerarReportes;
import root.gestionagricola.vistas.dueño.GestionDeContratos;
import root.gestionagricola.vistas.supervisor.VistaAsistencia;
import root.gestionagricola.vistas.supervisor.Supervisor;

/**
 * Clase principal para inicializar el programa.
 * @author Los Lanzas
 */
public class Main {
    
    /**
     * Inicializa las vistas, controladores y data access.
     * @param args
     * @throws ClassNotFoundException En caso de que no se encuentre la clase que
     * permite la conexion con la Base de Datos.
     * @throws InstantiationException En caso de que no se pueda realizar la
     * instanciacion de la Base de Datos.
     * @throws IllegalAccessException En caso de que no se pueda establecer 
     * conexion con la Base de Datos.
     * @throws SQLException En caso que la consulta realizada no sea soportada
     * por el lenguaje SQL.
     */
    public static void main(String[] args) throws SQLException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        /* Instancia de elementos */
        TemporadaDA.crear();
        Busqueda busqueda = new Busqueda();
        FramePrincipal principal = new FramePrincipal();
        Login login = new Login();
        Administrador administrador = new Administrador();
        Dueño dueño = new Dueño();
        GenerarReportes reportes = new GenerarReportes();
        GestionDeContratos contratos = new GestionDeContratos();
        VistaAsistencia asistencia = new VistaAsistencia();         
        Supervisor supervisor = new Supervisor();

        /* Instancia de controlador de paneles */
        ControladorVistas controlador_vistas = new ControladorVistas(busqueda,principal,
        login,administrador,dueño,reportes,contratos,
        asistencia,supervisor);
        
        /* Se agrega el controlador a las vistas */
        busqueda.setControladorVista(controlador_vistas);
        login.setControladorVista(controlador_vistas);
        administrador.setControladorVista(controlador_vistas);
        dueño.setControladorVista(controlador_vistas);
        reportes.setControladorVista(controlador_vistas);
        contratos.setControladorVista(controlador_vistas);
        asistencia.setControladorVista(controlador_vistas);
        supervisor.setControladorVista(controlador_vistas);

        /* Se ejecuta la vista de inicio */
        principal.setVisible(true);
        principal.setContentPane(login);
    }
}
