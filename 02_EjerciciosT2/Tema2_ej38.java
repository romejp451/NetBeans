package tema2_ej38;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej38 {
    public static void main(String[] args) {
        System.out.println("La ecuación es: x^2 - 5x +6");
        System.out.println("Cuanto vale la x?");
        double s1= ((5+(Math.sqrt(Math.pow(5, 2)-4*1*6)))/2);
        double s2= ((5-(Math.sqrt(Math.pow(5, 2)-4*1*6)))/2);
        System.out.println("Las posibles solucines son :"+s1+" y "+s2);
        
    }
    
}
