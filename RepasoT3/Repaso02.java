package repaso02;
import java.util.*;
import java.lang.*;
import java.util.ArrayList;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Repaso02 {
    public static void main(String[] args) {
        String cuadros = "*  *  *  *  *  *  *  *";
        boolean continua = true;
        int contador = 0;
        
        while(continua){
            System.out.println(cuadros);
            contador++;
            if(contador==8){
                continua=false;
            }
        }
    }
    
}
