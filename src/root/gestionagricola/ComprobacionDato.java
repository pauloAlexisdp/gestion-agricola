
package root.gestionagricola;

import java.util.Date;



/**
 * Validar datos de entrada.
 * @author Los Lanzas
 */
public class ComprobacionDato {
   
    /**
     * Este metodo permite verificar la correctitud de un rut en base a un dato tipo <String>
     * @param rut Se espera un <String> formato xxxxxxxx-x
     * @return Retorna <true> si el digito verificador corresponde al RUT o
     * <false> en caso contrario.
     */
    public static Boolean verificacionRut(String rut){
        int serieNumerica = 2;
        int verificador = 0;  
        int sumaProducto = 0;
        
        for (int iteradorRut = (rut.length() - 2); iteradorRut >= 0; iteradorRut --){
            if (!((rut.charAt(iteradorRut) == '.')|| (rut.charAt(iteradorRut) == '-'))){
                sumaProducto += Character.getNumericValue(rut.charAt(iteradorRut)) * serieNumerica;
                if (serieNumerica == 7){
                serieNumerica = 2;
                }
                else{
                    serieNumerica += 1;
                }
            }            
        }
        
        verificador = 11 - (sumaProducto %11);
        if ((verificador == 11 && Character.getNumericValue(rut.charAt(rut.length() - 1)) == 0) || 
            (verificador == 10 && rut.charAt(rut.length() - 1) == 'k') || 
            (verificador == 10 && rut.charAt(rut.length() - 1) == 'K') || 
            (Character.getNumericValue(rut.charAt(rut.length() - 1)) == verificador)){
            return true; 
        }
        
        return false;
    }
    
    /**
     * Metodo para validar coherencia de fechas, fecha de inicio anterior
     * a la de termino.
     * @param fechaDeTermino Se es espera un <Date> que representa la fecha de 
     * termino del contrato.
     * @param fechaDeInicio Se espera un <Date> que representa a la fecha de 
     * inicio del contrato
     * @return Retorna <true> si la fecha de inicio es anterior a la de termino,
     * <false> en caso contrario.
     */
    public static boolean verificacionFecha(Date fechaDeTermino, Date fechaDeInicio){
        if (!fechaDeTermino.after(fechaDeInicio)){
            return false;
        }
        return true;
    }

    /**
     * Metodo para validar si el folio y sueldo son numeros.
     * @param cadena Se espera un <String> con el folio o el sueldo.
     * @return Retorna <true> si es un Integer, <false> en caso contrario.
     */
    public static boolean esNumero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } 
        catch (NumberFormatException e) {
            return false;
        }
    }
    
    /**
     * Metodo para validar rango de sueldo coherente.
     * @param sueldo Se espera un <int> con el sueldo.
     * @return true si el sueldo es valido y  False si el sueldo es 
     */
    public static boolean verificacionSueldo(int sueldo){
        return (sueldo > 0 && sueldo < 100000000);
    }
    
    /**
     * Metodo para validar que el nombre de la empresa ingresado por el 
     * usuario y el largo del nombre de dicha empresa solo contenga 
     * caracteres validos, considerando como caracteres validos letras 
     * mayusculas y minusculas, caracteres especiales y numeros.
     * @param nombreEmpresa Se espera un <String> con el nombre de la empresa.
     * @return Retorna <true> si los caracteres son aceptados, <false> en
     * caso contrario.
     */
    public static boolean verificarNombreEmpresa(String nombreEmpresa){
        if (nombreEmpresa.length() <= 30){
            for (int i = 0; i < nombreEmpresa.length(); i ++) {
                if (!((65<= nombreEmpresa.codePointAt(i) &&  nombreEmpresa.codePointAt(i) <= 90  ) 
                        || (97<= nombreEmpresa.codePointAt(i) && nombreEmpresa.codePointAt(i) <= 122) 
                        || (nombreEmpresa.codePointAt(i) == 32) || (nombreEmpresa.codePointAt(i) == 225)
                        || (nombreEmpresa.codePointAt(i) == 209) || (nombreEmpresa.codePointAt(i) == 243)
                        || (nombreEmpresa.codePointAt(i) == 241) || (nombreEmpresa.codePointAt(i) == 250)
                        || (nombreEmpresa.codePointAt(i) == 237) || (nombreEmpresa.codePointAt(i) == 233)
                        || (nombreEmpresa.codePointAt(i) == 64) || (58 <= nombreEmpresa.codePointAt(i) && nombreEmpresa.codePointAt(i) <= 63)
                        || (nombreEmpresa.codePointAt(i) == 123) || (nombreEmpresa.codePointAt(i) == 125)
                        || (nombreEmpresa.codePointAt(i) == 40) || (nombreEmpresa.codePointAt(i) == 41)
                        || (44<=(nombreEmpresa.codePointAt(i)) && (nombreEmpresa.codePointAt(i) <= 57)))){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /**
     * Metodo para validar que el nombre ingresado por el usuario
     * contenga caracteres validos, considerando como caracteres validos
     * letras mayusculas y minusculas, caracteres especiales como á,é,í,ó,ú,Ñ y ñ
     * @param nombre Se espera un <String> con el nombre ingresado por el usuario.
     * @return Retorna <true> si los caracteres son aceptados, <false> en caso
     * contrario.
     */
    public static Boolean verificaNombre(String nombre){
        for (int i = 0; i < nombre.length(); i++) {
            if (!((65 <= nombre.codePointAt(i) &&  nombre.codePointAt(i) <= 90) 
                    || (97 <= nombre.codePointAt(i) && nombre.codePointAt(i) <= 122) 
                    || (nombre.codePointAt(i) == 32) || (nombre.codePointAt(i) ==225)
                    || (nombre.codePointAt(i) == 209) || (nombre.codePointAt(i) == 243)
                    || (nombre.codePointAt(i) == 241) || (nombre.codePointAt(i) == 250)
                    || (nombre.codePointAt(i) == 237) || (nombre.codePointAt(i) == 233))){
                return false;
            } 
        }
        return true;
    }
    
    /**
     * Metodo para verificar el cambio de clave de cuenta.
     * @param claveNueva Se espera un <String> con la clave de la cuenta.
     * @param claveNuevaConfirmacion Se espera un <String> con la verificacion
     * de la clave de cuenta.
     * @return Retorna <true> si las claves son iguales.
     */
    public static boolean verificacionContraseña(String claveNueva, String claveNuevaConfirmacion){
        return (claveNueva.compareTo(claveNuevaConfirmacion) == 0);
    }    
}
