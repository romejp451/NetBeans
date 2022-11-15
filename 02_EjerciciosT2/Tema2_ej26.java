package tema2_ej26;

import java.util.Scanner;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej26 {
    public static void main(String[] args) {
        System.out.println("Cuantos segundos quiere esperar (numero entero)?");
        int segundos =new Scanner(System.in).nextInt();
        int ms= (segundos*1000);
        try{
            Thread tiempo= new Thread();
            tiempo.sleep(ms);
        }catch(InterruptedException e){
            System.out.println("ERROR"+e.getMessage());
        }
        System.out.println("Programa finalizado.");
        
        
    }
    
}
