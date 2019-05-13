
package root.gestionagricola.vistas;

import root.gestionagricola.vistas.administrador.Administrador;
import root.gestionagricola.vistas.dueño.Dueño;
import root.gestionagricola.vistas.dueño.GenerarReportes;
import root.gestionagricola.vistas.dueño.GestionDeContratos;
import root.gestionagricola.vistas.dueño.GestionTrabajadorExterno;
import root.gestionagricola.vistas.dueño.GestionTrabajadorInterno;
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
    private GestionTrabajadorExterno trabajador_externo;
    private GestionTrabajadorInterno trabajador_interno;
    private Asistencia asistencia;
    private Supervisor supervisor;
    
    
    
    public ControladorVistas(Busqueda busqueda, FramePrincipal frameprincipal,Login 
            login,ResultadoBusqueda resulbusqueda, Administrador admin,Dueño dueno,
            GenerarReportes reportes,GestionDeContratos contratos,GestionTrabajadorExterno trabajador_externo
            ,GestionTrabajadorInterno trabajador_interno, Asistencia asistencia,Supervisor supervisor){
        
        this.busqueda = busqueda;
        this.frame_principal = frameprincipal;
        this.login = login;
        this.resultado_busqueda = resulbusqueda;
        this.admin = admin;
        this.dueño = dueno;
        this.reportes = reportes;
        this.contratos = contratos;
        this.trabajador_externo = trabajador_externo;
        this.trabajador_interno = trabajador_interno;
        this.asistencia = asistencia;
        this.supervisor = supervisor;
    }
    
    
    private void SeleccionarPanel(String panel){
        switch(panel){
            case "login":
                break;
            case "busqueda":
                break;
            case "resultadoBusqueda":
                break;
            case "admin":
                break;
            
        }
    }
    
    
}
