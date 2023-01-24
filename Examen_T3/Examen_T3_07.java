package examen_t3_07;
import java.lang.*;
import java.util.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Examen_T3_07 {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        int num;
        
        System.out.println("Dime 3 valores de numeros enteros");
        
        for(int x=0; x<3; x++){
            num = new Scanner(System.in). nextInt();
            lista.add(num);
        }
        //primer manera
        System.out.println(lista.toString());
        
        //segunda manera
        for(int x=0; x<lista.size(); x++){
            System.out.print(lista.get(x)+" ");
        }
        //tercera forma
        lista.forEach(valor -> System.out.println(valor));
    }
    
}
