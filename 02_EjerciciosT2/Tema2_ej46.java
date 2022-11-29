package tema2_ej46;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej46 {
    public static void main(String[] args) {
        Instant inicio = Instant.now();
        Random random = new Random();
        int segundos = random.nextInt(10);
        System.out.println("Pausa de " + segundos + " segundos");

        try {
            Thread.sleep(segundos * 1000);
        } catch (Exception e) {
            System.out.println("Error");
        }

        Instant fin = Instant.now();
        Duration duration = Duration.between(inicio, fin);
        System.out.println("La pausa ha durado " + duration.getSeconds() + " segundos");
        
    }
    
}
