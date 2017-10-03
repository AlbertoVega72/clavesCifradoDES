
package des;
/**
 *
 * @author Alberto Vega
 * @version 1.0
 * @see https://github.com/AlbertoVega72
 */

import java.util.Scanner;

public class DES {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        Llaves valores = new Llaves();
        Scanner leer = new Scanner(System.in);
        String clave;                
        
        //Petición
        System.out.println("Por favor ingrese la clave a procesar:");
        clave = leer.next();
        
        //Constructor
        Proceso cons = new Proceso();
        cons.conversion(clave);        
        cons.calcCyD();
        cons.otrasCyD();
        for (int i = 0; i < 17; i++) {
            cons.cuentaK(i);
        }
        cons.consulta();
    }    
    
    
}
