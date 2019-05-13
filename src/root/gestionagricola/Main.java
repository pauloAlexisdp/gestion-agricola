
package root.gestionagricola;

import root.gestionagricola.vistas.Busqueda;
import root.gestionagricola.vistas.ControladorVistas;
import root.gestionagricola.vistas.FramePrincipal;
import root.gestionagricola.vistas.Login;
import root.gestionagricola.vistas.ResultadoBusqueda;
import root.gestionagricola.vistas.administrador.Administrador;
import root.gestionagricola.vistas.dueño.Dueño;
import root.gestionagricola.vistas.dueño.GenerarReportes;
import root.gestionagricola.vistas.dueño.GestionTrabajadorExterno;
import root.gestionagricola.vistas.dueño.GestionTrabajadorInterno;
import root.gestionagricola.vistas.dueño.GestionDeContratos;
import root.gestionagricola.vistas.supervisor.Asistencia;
import root.gestionagricola.vistas.supervisor.Supervisor;

/**
 *
 * @author Javier
 */
public class Main {
    
     public static void main(String[] args) {
         Busqueda busqueda = new Busqueda();
         FramePrincipal principal = new FramePrincipal();
         Login login = new Login();
         ResultadoBusqueda resultado_busqueda = new ResultadoBusqueda();
         Administrador administrador = new Administrador();
         Dueño dueño = new Dueño();
         GenerarReportes reportes = new GenerarReportes();
         GestionTrabajadorExterno trabajador_externo = new GestionTrabajadorExterno();
         GestionTrabajadorInterno trabajador_interno = new GestionTrabajadorInterno();
         GestionDeContratos contratos = new GestionDeContratos();
         Asistencia asistencia = new Asistencia();         
         Supervisor supervisor = new Supervisor();
         
         
         //se instancia el controlador con todas los paneles , para que trbaje con ellos.
         ControladorVistas controlador_vistas = new ControladorVistas(busqueda,principal,
         login,resultado_busqueda,administrador,dueño,reportes,contratos,trabajador_externo,trabajador_interno,
         asistencia,supervisor);
         
         //se setea el controlador de vistas en todas las vistas
         busqueda.setControladorVista(controlador_vistas);
         login.setControladorVista(controlador_vistas);
         resultado_busqueda.setControladorVista(controlador_vistas);
         administrador.setControladorVista(controlador_vistas);
         dueño.setControladorVista(controlador_vistas);
         reportes.setControladorVista(controlador_vistas);
         contratos.setControladorVista(controlador_vistas);
         trabajador_externo.setControladorVista(controlador_vistas);
         trabajador_interno.setControladorVista(controlador_vistas);
         asistencia.setControladorVista(controlador_vistas);
         supervisor.setControladorVista(controlador_vistas);
         
         //se hace visible el frame principal
         principal.setVisible(true);
         principal.setContentPane(login); //se selecciona como frame principal el login
     }
}
