
package root.gestionagricola.gestioncontrato;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import root.gestionagricola.modelo.accesodato.*;


/**
 * Permite agregar funcionalidad a la gestion de reportes.
 * @author Los Lanzas
 */
public class ControladorContrato {
    
    private Contrato contrato;
    
    /**
     * Permite ingresar un nuevo contrato a la base de datos.
     * @param folio Se espera un <int> identificador del contrato (unico).
     * @param tipo Se espera un <String> con el tipo de contrato {Subcontrato, Planta}
     * @param estado Se espera un <String> con el estado del contrato {Renovado, Activo, Finalizado}
     * @param f_inicio Se espera un <Date> con la fecha de inicio del contrato.
     * @param f_termino Se espera un <Date> con la fecha de termino del contrato.
     * @param nombre Se espera un <String> con el nombre del asociado.
     * @param rut Se espera un <int> con el rut del asociado.
     * @param sueldo Se espera un <int> con el sueldo del asociado.
     * @param nom_empresa Se espera un <String> con el nombre de la empresa subcontratada.
     */
    public static void ingresarContrato(int folio, String tipo, String estado, 
            Date f_inicio, Date f_termino, String nombre, int rut, int sueldo,
            String nom_empresa) {
        
        /* Formateo de Fechas */
        String inicio = ControladorContrato.transformarDate(f_inicio);
        String termino = ControladorContrato.transformarDate(f_termino);
        
        /* Guardando Datos */
        try{
            ContratoDA.guardar(folio, inicio, termino, estado);
            if (nom_empresa.equals("")){
                TrabajadorInternoDA.guardar(rut, nombre, sueldo, folio);
            }
            else{
                TrabajadorExternoDA.guardar(rut, nombre, sueldo, folio, nom_empresa);
            }
        }
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception){}
        
    }
    
    /**
     * Permite buscar los contratos relacionados a los parametros ingresados.
     * @param tipo Se espera un <String> con el tipo de contrato {Subcontrato, Planta}
     * @param estado Se espera un <String> con el estado del contrato {Renovado, Activo, Finalizado}
     * @param f_inicio Se espera un <Date> con la fecha de inicio del contrato.
     * @param f_termino Se espera un <Date> con la fecha de termino del contrato.
     * @param nombre Se espera un <String> con el nombre del asociado.
     * @param rut Se espera un <int> con el rut del asociado.
     * @param sueldo Se espera un <int> con el sueldo del asociado.
     * @param nom_empresa Se espera un <String> con el nombre de la empresa subcontratada.
     * @return Retorna un <String[][]> con la informacion de los contratos encontrados,
     * <null> en caso de no encontrar informacion.
     */
    public static String[][] buscarContrato(String tipo, String estado, 
            Date f_inicio, Date f_termino, String nombre, int rut, int sueldo,
            String nom_empresa) {
        
        /* Formateo de Fechas */
        String inicio = ControladorContrato.transformarDate(f_inicio);
        String termino = ControladorContrato.transformarDate(f_termino);
        
        /* Match de contratos (Solo por fechas) */
        ArrayList<Contrato> contratos = new ArrayList<>();
        try{
            if(tipo.equals("planta")){
                contratos = TrabajadorInternoDA.buscarContrato(inicio, termino);
            }else{
                contratos = TrabajadorExternoDA.buscarContrato(inicio, termino);
            }
        } 
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception){}
        
        /* Cambio de estructura de datos */
        String[][] datos = new String[contratos.size()][9];
        for (int i = 0; i < contratos.size(); i ++){
            datos[i][0] = String.valueOf(contratos.get(i).getFolio());
            datos[i][1] = contratos.get(i).getTipo();
            datos[i][2] = contratos.get(i).getEstado();
            datos[i][3] = contratos.get(i).getF_inicio();
            datos[i][4] = contratos.get(i).getF_termino();
            datos[i][5] = contratos.get(i).getNombre();
            datos[i][6] = String.valueOf(contratos.get(i).getRut());
            datos[i][7] = String.valueOf(contratos.get(i).getSueldo());
            datos[i][8] = contratos.get(i).getNom_empresa();
        }
        
        if (contratos.isEmpty()){
            return null;
        }
        
        return datos;
    }
    
    /**
     * Permite obtener un contrato especifico.
     * @param folio Se espera un <int> con el numero unico de un contrato.
     * @return Retorna un <String[]> con la informacion del contrato.
     */
    public static String[] getContrato(int folio){
        
        // Llamada a la BD para obtener el contrato
        
        return null;
    }
    
    /**
     * Permite modificar los atributos de un contrato.
     * @param folio Se espera un <int> identificador del contrato (unico).
     * @param tipo Se espera un <String> con el tipo de contrato {Subcontrato, Planta}
     * @param estado Se espera un <String> con el estado del contrato {Renovado, Activo, Finalizado}
     * @param f_inicio Se espera un <Date> con la fecha de inicio del contrato.
     * @param f_termino Se espera un <Date> con la fecha de termino del contrato.
     * @param nombre Se espera un <String> con el nombre del asociado.
     * @param rut Se espera un <int> con el rut del asociado.
     * @param sueldo Se espera un <int> con el sueldo del asociado.
     * @param nom_empresa Se espera un <String> con el nombre de la empresa subcontratada.
     */
    public static void modificarContrato(int folio, String tipo, String estado, 
            Date f_inicio, Date f_termino, String nombre, int rut, int sueldo,
            String nom_empresa){
        
        /* Formateo de Fechas */
        String inicio = ControladorContrato.transformarDate(f_inicio);
        String termino = ControladorContrato.transformarDate(f_termino);
        
        /* Modificando Datos */
        try{
            ContratoDA.guardar(folio, inicio, termino, estado);
            if (nom_empresa.equals("")){
                TrabajadorInternoDA.guardar(rut, nombre, sueldo, folio);
            }
            else{
                TrabajadorExternoDA.guardar(rut, nombre, sueldo, folio, nom_empresa);
            }
        }
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception){}
    }
    
    /**
     * Permite eliminar un contrato especifico.
     * @param folio Se espera un <int> con el numero unico del contrato.
     */
    public static void eliminarContrato(int folio){
        
    }
    
    /**
     * Permite crear una instancia para usar en Data Access.
     * @param folio Se espera un <int> identificador del contrato (unico).
     * @param tipo Se espera un <String> con el tipo de contrato {Subcontrato, Planta}
     * @param estado Se espera un <String> con el estado del contrato {Renovado, Activo, Finalizado}
     * @param f_inicio Se espera un <String> con la fecha de inicio del contrato formato 'DD-MM-AAAA'
     * @param f_termino Se espera un <String> con la fecha de termino del contrato formato 'DD-MM-AAAA'
     * @param nombre Se espera un <String> con el nombre del asociado.
     * @param rut Se espera un <int> con el rut del asociado.
     * @param sueldo Se espera un <int> con el sueldo del asociado.
     * @param nom_empresa Se espera un <String> con el nombre de la empresa subcontratada.
     * @return Retorna un objeto <Contrato> instanciado.
     */
    public static Contrato crearContrato(int folio, String tipo, String estado, 
            String f_inicio, String f_termino, String nombre, int rut, int sueldo,
            String nom_empresa){
        return new Contrato(folio, tipo, estado, f_inicio, f_termino, nombre, rut, sueldo, nom_empresa);
    }
    
    /**
     * Permite dar formato a una fecha.
     * @param fecha Se espera un <Date> con la fecha.
     * @return Retorna un <String> con la fecha formateada: '"DD-MM-AAAA"'.
     */
    public static String transformarDate(Date fecha){
        String inicio;
        
        if (fecha.getDate() < 10){
            inicio = '"' + "0" + fecha.getDate();
        }
        else{
            inicio = '"' + "" + fecha.getDate();
        }
        if (fecha.getMonth() < 9){
            inicio += "-0" + (fecha.getMonth() + 1);
        }
        else{
            inicio += "-" + (fecha.getMonth() + 1);
        }
        inicio += "-" + (fecha.getYear() + 1900) + '"';
        
        return inicio;
    }
}
