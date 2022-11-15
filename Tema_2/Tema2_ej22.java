package tema2_ej22;
import bpc.daw.objetos.*;
import java.util.Scanner;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej22 {
    public static void main(String[] args) {
        
        TarjetaCredito tc= null;
        System.out.println("Dime la contraseña para ver los datos de la tarjeta");
        int intento =new Scanner(System.in).nextInt();
        tc = new TarjetaCredito(5000,1111);
        
        try{
            tc.getSaldo(intento);
            System.out.println("La contraseña es correcta y tu saldo es de: "+tc.getSaldo(1111)+" euros.");
        }catch(Exception e){
            System.out.println("La contraseña es incorrecta");
        }
        System.out.println("Dime la contraseña para sacar 2000 euros de la tarjeta");
        int intento2 =new Scanner(System.in).nextInt();
        try{
            tc.sacarDinero(2000, intento2);
            System.out.println("La contraseña es correcta y tu saldo actual es de: "+tc.getSaldo(1111)+" euros.");
        }catch(Exception e){
            System.out.println("La contraseña es incorrecta");
        }
        
        
        
    }
    
}
