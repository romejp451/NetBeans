package tema3_ej05;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema3_ej05 {
    public static void main(String[] args) {
        boolean programa = true;
        int piezas = 0;
            System.out.println("Cuantas piezas va ha cazar hoy? El limite es de 30 piezas");
            while (piezas < 30){
                System.out.println("Cuantas son la piezas que conseguiste?");
                int caza = new Scanner (System.in). nextInt();
                if(caza>0){
                piezas += caza;
                System.out.println("Llevas "+piezas+" piezas cazadas de 30");
                    }else{
                    System.out.println("El numero introducido es negativo");
                    }
            }
            System.out.println("La cacería a terminado por hoy");
            if(piezas >30){
                System.out.println("Debido a que se ha excedido del numero de "
                        + "piezas cazadas por dia se le amonestara por ello, gracias.");
            }
        
    }
    
}
