package tema3_ej03;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema3_ej03 {
    public static void main(String[] args) {
        int num;
        boolean fun = true;
        while(fun == true){
            num = (int) (Math.random()*10+1);
            System.out.println(num);
            if(num == 10){
                fun = false;
            }
        }
            System.out.println("Ya llego al 10");
    }
    
}
