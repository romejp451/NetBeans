package repaso08;
import java.util.*;
import java.lang.*;
import java.util.Random;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Repaso08 {
    public static void main(String[] args) {
        
        Random random = new Random();
        int num_aleatorio ;
        ArrayList lista = new ArrayList();
        boolean continua = true;
        int posicion=0;
        
        for(int x=0; x<=20; x++){
            num_aleatorio = random.nextInt(100);
            lista.add(num_aleatorio);
        }
        
        while(posicion != 20){
            System.out.println("El numero en la posicion numero "+posicion
                    +" es el numero "+lista.get(posicion));
            posicion++;
        }
    }
    
}
