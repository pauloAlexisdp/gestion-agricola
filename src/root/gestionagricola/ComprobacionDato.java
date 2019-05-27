package root.gestionagricola;

import java.util.Date;



/**
 *  Validar datos de entrada.
 * @author Los lanzas
 */
public class ComprobacionDato {
   
    /**
     * Este metodo permite verificar la correctitud de un rut en base a un dato tipo <String>
     * @param rut Se espera un <String> formato xxxxxxxx-x
     * @return true cuando es valido el rut
     * y false en caso contrario.
     */
    public static Boolean verificacionRut(String rut){
        int serieNumerica=2;
        int verificador=0;  
        int sumaProducto=0; // esta varaible almacenara la suma resultante de multiplicar un numero de la serie
        for(int iteradorRut=(rut.length() -2); iteradorRut>=0; iteradorRut--){
            if(!((rut.charAt (iteradorRut)=='.')|| (rut.charAt (iteradorRut)=='-'))){
                sumaProducto+= Character.getNumericValue(rut.charAt (iteradorRut))*serieNumerica;
                if(serieNumerica ==7){
                serieNumerica =2;
                }else{
                    serieNumerica += 1;
                }
            }            
        }
        verificador = 11 - (sumaProducto %11);
        if((verificador == 11 && Character.getNumericValue( rut.charAt(rut.length()-1))==0)||(verificador ==10 &&  rut.charAt(rut.length()-1) == 'k')||( Character.getNumericValue( rut.charAt(rut.length()-1)) == verificador)){
            return true; 
        }
        return false;
    }
    
    /**
     * Metodo para validar  que las fechas indicadas en el contrato sean coherentes, 
     * es decir que la fecha de termino de un contrato sea posterior a la de inicio.
     * @param fechaDeTermino Date que representa la fecha de termino del contrato.
     * @param fechaDeInicio Date que representa a la fecha de inicio del contrato
     * @return Verdadero la fecha de termino es posterior a la fecha de inicio del contrato ingresada
     */
    public static boolean verificacionFecha(Date fechaDeTermino, Date fechaDeInicio){
        if(!fechaDeTermino.after(fechaDeInicio)){
            return false;
        }
        return true;
    }

    /**
     * Metodo para validar Si el folio y sueldo son numeros.
     * @param cadena String Cadena que sera recibida en un texfield.
     * @return true si es un numero, False si no es un numero.
     */
    public static boolean esNumero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    /**
     * Metodo para validar Squr el sueldo es valido.
     * @param sueldo int numero que representara al sueldo ingresado.
     * @return true si el sueldo es valido y  False si el sueldo es 
     */
    public static boolean verificacionSueldo(int sueldo){
        if(sueldo>0 && sueldo <100000000){
            return true;
        }
        return false;
    }
    
    /**
     *Metodo para validar que el nombre de la empresa ingresado por el usuario y el largo del nombre de dicha empresa
     * solo contenga caracteres validos, considerando como caracteres validos
     * letras mayusculas y minusculas, caracteres especiales como á,é,í,ó,ú,Ñ y ñ, @?.-/;,: { } ( ) <> = y los numeros del 0 al 9
     * @param nombreEmpresa String que representa al nombre de la empresa ingresado por el usuario
     * @return true si los caracteres son validos acorde al nombre de la empresa  y false en caso contrario
     */
    public static boolean verificarNombreEmpresa(String nombreEmpresa){
        if( nombreEmpresa.length() <= 30){
            for (int i = 0; i < nombreEmpresa.length(); i++) {
                if(!((65<= nombreEmpresa.codePointAt(i) &&  nombreEmpresa.codePointAt(i)<=90  ) 
                        ||(97<= nombreEmpresa.codePointAt(i) && nombreEmpresa.codePointAt(i) <=122) 
                        ||(nombreEmpresa.codePointAt(i)== 32) || (nombreEmpresa.codePointAt(i)==225)
                        ||(nombreEmpresa.codePointAt(i)== 209) || (nombreEmpresa.codePointAt(i)== 243)
                        ||(nombreEmpresa.codePointAt(i)== 241) || (nombreEmpresa.codePointAt(i)== 250)
                        ||(nombreEmpresa.codePointAt(i)== 237) || (nombreEmpresa.codePointAt(i)== 233)
                        ||(nombreEmpresa.codePointAt(i)== 64)||(58<= nombreEmpresa.codePointAt( i) && nombreEmpresa.codePointAt( i)<=63)
                        ||(nombreEmpresa.codePointAt(i) ==123) || (nombreEmpresa.codePointAt(i)== 125)
                        ||(nombreEmpresa.codePointAt(i) ==40)||(nombreEmpresa.codePointAt(i)==41)
                        ||(44<=(nombreEmpresa.codePointAt( i)) &&(nombreEmpresa.codePointAt(i)<=57)))){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /**
     *Metodo para validar que el nombre ingresado por el usuario
     * solo contenga caracteres validos, considerando como caracteres validos
     * letras mayusculas y minusculas, caracteres especiales como á,é,í,ó,ú,Ñ y ñ
     * @param nombre String que representa al nombre ingresado por el usuario
     * @return true si los caracteres son validos acorde al nombre y false en caso contrario
     */
    public static Boolean verificaNombre(String nombre){
        for (int i = 0; i < nombre.length(); i++) {
            if(!((65<= nombre.codePointAt(i) &&  nombre.codePointAt(i)<=90  ) 
                    || (97<= nombre.codePointAt(i) && nombre.codePointAt(i) <=122) 
                    || (nombre.codePointAt(i)== 32) || (nombre.codePointAt(i)==225)
                    ||(nombre.codePointAt(i)== 209) || (nombre.codePointAt(i)== 243)
                    ||(nombre.codePointAt(i)== 241) || (nombre.codePointAt(i)== 250)
                    ||(nombre.codePointAt(i)== 237) || (nombre.codePointAt(i)== 233))){
  
                return false;
            } 
        }
        return true;
    }
    
    /**
     *Metodo para verificar el cambio de contraseña
     * @param claveNueva String que representa la nueva contraseña del usuario.
     * @param claveNuevaConfirmacion String que representa la repeticion de la nueva contraseña de usuaio
     * para la confirmacion de esta
     * @return return true si ambas contraseñas coinciden y false en caso contrario
     */
    public static boolean verificacionContraseña(String claveNueva, String claveNuevaConfirmacion){
        if(claveNueva.compareTo(claveNuevaConfirmacion)==0){
            return true;
        }
        return false;
    }    
}
