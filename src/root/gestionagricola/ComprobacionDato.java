package root.gestionagricola;



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
         /**serieNumerica
        * almacenara los numeros establecidos para obtener el digito verificador
        * de un Rut en chile. 
        **/
        int serieNumerica=2;
        int verificador=0;  
        int sumaProducto=0; // esta varaible almacenara la suma resultante de multiplicar un numero de la serie
        for(int iteradorRut=(rut.length() -3); iteradorRut>=0; iteradorRut--){
            sumaProducto+= Character.getNumericValue(rut.charAt (iteradorRut))*serieNumerica;
            if(serieNumerica ==7){
                serieNumerica =2;
            }else{
                serieNumerica += 1;
            }
        }
        verificador = 11 - (sumaProducto %11);
        if((verificador == 11 && Character.getNumericValue( rut.charAt(rut.length()-1))==0)||(verificador ==10 &&  rut.charAt(rut.length()-1) == 'k')||( Character.getNumericValue( rut.charAt(rut.length()-1)) == verificador)){
            return true; 
        }
        return false;
    }

}
