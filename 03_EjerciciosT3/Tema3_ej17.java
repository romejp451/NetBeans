package tema3_ej17;
import java.io.IOException;
import java.util.*;
import java.lang.*;
import java.time.Duration;
import java.time.Instant;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema3_ej17 {
    public static void main(String[] args) {
        Duration duracion;
        Instant t1, t2;
        InetAddress direccion;
        boolean sigue = true;
        
        while(sigue){
            System.out.println("Dime una direccion IP y un numero entero");
            String IP = new Scanner(System.in). nextLine();
            int num = new Scanner(System.in). nextInt();
            for(int i = 0; i<num; i++){
                try{
                    t1 = Instant.now();
                    direccion = InetAddress.getByName(IP);
                    System.out.println("Ping hacia : "+direccion);
                    t2 = Instant.now();
                    System.out.println(direccion.getHostAddress()+" tiempo: "
                            +Duration.between(t1,t2).toMillis()+
                            " ms");
                }
                catch(UnknownHostException e){
                    System.out.println("Error "+e.getMessage());
                }
            }
            sigue=false; 
        }
    }
    
}
