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
     * @param cadena Cadena que sera recibida en un texfield.
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

}
