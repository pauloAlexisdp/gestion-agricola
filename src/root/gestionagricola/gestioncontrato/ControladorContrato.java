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
     *
     * @param folio Se espera un <int> identificador del contrato (unico).
     * @param tipo Se espera un <String> con el tipo de contrato {Subcontrato,
     * Planta}
     * @param estado Se espera un <String> con el estado del contrato {Renovado,
     * Activo, Finalizado}
     * @param f_inicio Se espera un <Date> con la fecha de inicio del contrato.
     * @param f_termino Se espera un <Date> con la fecha de termino del
     * contrato.
     * @param nombre Se espera un <String> con el nombre del asociado.
     * @param rut Se espera un <int> con el rut del asociado.
     * @param sueldo Se espera un <int> con el sueldo del asociado.
     * @param nom_empresa Se espera un <String> con el nombre de la empresa
     * subcontratada.
     */
    public static void ingresarContrato(int folio, String tipo, String estado,
            Date f_inicio, Date f_termino, String nombre, int rut, int sueldo,
            String nom_empresa) {

        /* Formateo de Fechas */
        String inicio = ControladorContrato.transformarDate(f_inicio);
        String termino = ControladorContrato.transformarDate(f_termino);

        /* Guardando Datos */
        try {
            ContratoDA.guardar(folio, inicio, termino, estado);
            if (nom_empresa.equals("")) {
                TrabajadorInternoDA.guardar(rut, nombre, sueldo, folio);
                HistorialDA.guardarhistorial(rut, folio, inicio, termino, estado);
            } 
            else {
                TrabajadorExternoDA.guardar(rut, nombre, sueldo, folio, nom_empresa);
                HistorialDA.guardarhistorial(rut, folio, inicio, termino, estado);
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception) {
        }

    }

    /**
     * Permite buscar los contratos relacionados a los parametros ingresados.
     *
     * @param tipo Se espera un <String> con el tipo de contrato {Subcontrato,
     * Planta}
     * @param estado Se espera un <String> con el estado del contrato {Renovado,
     * Activo, Finalizado}
     * @param f_inicio Se espera un <Date> con la fecha de inicio del contrato.
     * @param f_termino Se espera un <Date> con la fecha de termino del
     * contrato.
     * @param nombre Se espera un <String> con el nombre del asociado.
     * @param rut Se espera un <int> con el rut del asociado.
     * @param sueldo Se espera un <int> con el sueldo del asociado.
     * @param nom_empresa Se espera un <String> con el nombre de la empresa
     * subcontratada.
     * @return Retorna un <String[][]> con la informacion de los contratos
     * encontrados,
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
        try {
            if (tipo.equals("Planta")) {
                contratos = TrabajadorInternoDA.buscarContrato(inicio, termino);
            } else {
                contratos = TrabajadorExternoDA.buscarContrato(inicio, termino);
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception) {
        }

        /* Cambio de estructura de datos */
        String[][] datos = new String[contratos.size()][9];
        for (int i = 0; i < contratos.size(); i++) {
            datos[i][0] = String.valueOf(contratos.get(i).getFolio());
            datos[i][1] = contratos.get(i).getTipo();
            datos[i][2] = contratos.get(i).getEstado();
            datos[i][3] = contratos.get(i).getF_inicio();
            datos[i][4] = contratos.get(i).getF_termino();
            datos[i][5] = contratos.get(i).getNombre();
            datos[i][6] = ControladorContrato.parseRUTtoString(contratos.get(i).getRut());
            datos[i][7] = String.valueOf(contratos.get(i).getSueldo());
            datos[i][8] = contratos.get(i).getNom_empresa();
        }

        if (contratos.isEmpty()) {
            return null;
        }

        return datos;
    }

    /**
     * Permite obtener un contrato especifico.
     * @param folio Se espera un <int> con el numero unico de un contrato.
     * @return Retorna un <String[]> con la informacion del contrato.
     */
    public static String[] getContrato(int folio) {
        Contrato contrato;
        String[] datos = new String[9];
        try {
            if (TrabajadorExternoDA.encontrarContrato(folio) != null) {
                contrato = TrabajadorExternoDA.encontrarContrato(folio);
                datos[0] = String.valueOf(contrato.getFolio());
                datos[1] = contrato.getTipo();
                datos[2] = contrato.getEstado();
                datos[3] = contrato.getF_inicio();
                datos[4] = contrato.getF_termino();
                datos[5] = contrato.getNombre();
                datos[6] = ControladorContrato.parseRUTtoString(contrato.getRut());
                datos[7] = String.valueOf(contrato.getSueldo());
                datos[8] = contrato.getNom_empresa();
                return datos;
            }
            if (TrabajadorInternoDA.encontrarContrato(folio) != null) {
                contrato = TrabajadorInternoDA.encontrarContrato(folio);
                datos[0] = String.valueOf(contrato.getFolio());
                datos[1] = contrato.getTipo();
                datos[2] = contrato.getEstado();
                datos[3] = contrato.getF_inicio();
                datos[4] = contrato.getF_termino();
                datos[5] = contrato.getNombre();
                datos[6] = ControladorContrato.parseRUTtoString(contrato.getRut());
                datos[7] = String.valueOf(contrato.getSueldo());
                datos[8] = contrato.getNom_empresa();
                return datos;
            } else {
                return null;
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception) {}

        return null;
    }

    /**
     * Permite modificar los atributos de un contrato.
     * @param folio Se espera un <int> identificador del contrato (unico).
     * @param tipo Se espera un <String> con el tipo de contrato {Subcontrato,
     * Planta}
     * @param estado Se espera un <String> con el estado del contrato {Renovado,
     * Activo, Finalizado}
     * @param f_inicio Se espera un <Date> con la fecha de inicio del contrato.
     * @param f_termino Se espera un <Date> con la fecha de termino del
     * contrato.
     * @param nombre Se espera un <String> con el nombre del asociado.
     * @param rut Se espera un <int> con el rut del asociado.
     * @param sueldo Se espera un <int> con el sueldo del asociado.
     * @param nom_empresa Se espera un <String> con el nombre de la empresa
     * subcontratada.
     */
    public static void modificarContrato(int folio, String tipo, String estado,
            Date f_inicio, Date f_termino, String nombre, int rut, int sueldo,
            String nom_empresa) {

        /* Formateo de Fechas */
        String inicio = ControladorContrato.transformarDate(f_inicio);
        String termino = ControladorContrato.transformarDate(f_termino);

        /* Modificando Datos */
        try {

            ContratoDA.guardar(folio, inicio, termino, estado);

            if (nom_empresa.equals("")) {
                TrabajadorInternoDA.guardar(rut, nombre, sueldo, folio);
                HistorialDA.guardarhistorial(rut, folio, inicio, termino, estado);
            } else {

                TrabajadorExternoDA.guardar(rut, nombre, sueldo, folio, nom_empresa);
                HistorialDA.guardarhistorial(rut, folio, inicio, termino, estado);
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception) {
        }
    }

    /**
     * Permite eliminar un contrato especifico.
     * @param folio Se espera un <int> con el numero unico del contrato.
     */
    public static void eliminarContrato(int folio) {
        try {
            ContratoDA.eliminar(folio);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exception) {
        }
    }

    /**
     * Permite crear una instancia para usar en Data Access.
     * @param folio Se espera un <int> identificador del contrato (unico).
     * @param tipo Se espera un <String> con el tipo de contrato {Subcontrato,
     * Planta}
     * @param estado Se espera un <String> con el estado del contrato {Renovado,
     * Activo, Finalizado}
     * @param f_inicio Se espera un <String> con la fecha de inicio del contrato
     * formato 'DD-MM-AAAA'
     * @param f_termino Se espera un <String> con la fecha de termino del
     * contrato formato 'DD-MM-AAAA'
     * @param nombre Se espera un <String> con el nombre del asociado.
     * @param rut Se espera un <int> con el rut del asociado.
     * @param sueldo Se espera un <int> con el sueldo del asociado.
     * @param nom_empresa Se espera un <String> con el nombre de la empresa
     * subcontratada.
     * @return Retorna un objeto <Contrato> instanciado.
     */
    public static Contrato crearContrato(int folio, String tipo, String estado,
            String f_inicio, String f_termino, String nombre, int rut, int sueldo,
            String nom_empresa) {
        return new Contrato(folio, tipo, estado, f_inicio, f_termino, nombre, rut, sueldo, nom_empresa);
    }

    /**
     * Permite dar formato a una fecha.
     * @param fecha Se espera un <Date> con la fecha.
     * @return Retorna un <String> con la fecha formateada: '"DD-MM-AAAA"'.
     */
    public static String transformarDate(Date fecha) {
        if (fecha == null){
            return "";
        }
        String inicio;

        if (fecha.getDate() < 10) {
            inicio = "'" + "0" + fecha.getDate();
        } else {
            inicio = "'" + "" + fecha.getDate();
        }
        if (fecha.getMonth() < 9) {
            inicio += "-0" + (fecha.getMonth() + 1);
        } else {
            inicio += "-" + (fecha.getMonth() + 1);
        }
        inicio += "-" + (fecha.getYear() + 1900) + "'";

        return inicio;
    }
    
    /**
     * Permite convertir el formato de un rut desde String a int
     * @param rut Se espera un <String> con el rut que se convertira.
     * @return Retorna un int del rut sin el digito verificador.
     */
    public static int parseRUTtoINT(String rut){
        rut = rut.replace(".", "");
        try{
            return Integer.parseInt(rut.split("-")[0]);
        }
        catch(NumberFormatException e){
            return -1;
        }
    }
    
    /**
     * Permite parsear un rut desde Integer a String, agrega el digito
     * verificador.
     * @param rut Se espera un <int> con el rut sin el digito verificador.
     * @return Retorna un <String> con el digito verificador y sin puntos.
     */
    public static String parseRUTtoString(int rut){
        String dni = String.valueOf(rut);
        int ver = 0;
        
        for (int i = (dni.length() - 1); i >= 0; i --){
            ver += (Integer.parseInt(String.valueOf(dni.charAt(i))) * ((((dni.length() - 1) - i) % 6) + 2));
        }
        
        ver = (11 - (ver % 11));
        
        if (ver == 10){
            return dni + "-K";
        }
        else if (ver == 11){
            return dni + "-0";
        }
        else{
            return dni + "-" + ver;
        }
    }
}
