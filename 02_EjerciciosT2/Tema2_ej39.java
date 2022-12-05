package tema2_ej39;
import java.lang.*;
import static java.lang.System.getProperty;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej39 {
    public static void main(String[] args) {
        String nombre= System.getProperty("os.name");
        String version= System.getProperty("os.version");
        String arc= System.getProperty("os.arch");
        String usuario= System.getProperty("user.name");
        String archivo= System.getProperty("user.home");
        
        System.out.println("Información sobre el ordenador:");
        System.out.println("Sistema Operativo es: "+nombre);
        System.out.println("La version del Sistema Operativo es "+version);
        System.out.println("La arquitectura del Sistema Operativo es: "+arc);
        System.out.println("El nombre del usuario es: "+usuario);
        System.out.println("Carperta de archivos temporales: "+archivo);
        
        
    }
    
}
