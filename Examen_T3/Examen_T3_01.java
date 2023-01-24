package examen_t3_01;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Examen_T3_01 {
    public static void main(String[] args) {
        int suma=0;
        int suma2=0, contador=1;
        int suma3=0, contador2=1;
        
        //Primera manera con el for.
        
        for (int x = 5; x <= 50; x += 5){
            suma += x;
        }
        System.out.println("La suma es de "+suma);
        
        //Segunda manera con el while.
        while(contador<=10){
            suma2 += contador * 5;
            contador++;
        }
        System.out.println("La suma es de "+suma2);
        
        //Tercera manera con el do/while.
        
        do{
            suma3 += contador2 * 5;
            contador2++;
        }while(contador2<=10);
        System.out.println("La suma es de "+suma3);
    }
    
}
