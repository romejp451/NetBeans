package tema2_ej42;

import java.util.Random;
import static java.util.Random.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej42 {
    public static void main(String[] args) {
        int x=29;
        int y=65;
        Random a= new Random();
        int  random=a.nextInt(y - x + 1)+ x;
        System.out.println(random);
    }
    
}
