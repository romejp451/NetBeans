package tema2_ej48;
import bpc.daw.objetos.MarcadorMejorado;
import java.lang.Object;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema2_ej48 {
    public static void main(String[] args) {
        String Granada = "Granada";
        String Estudiantes = "Estudiantes";
        
        
        MarcadorMejorado m = new MarcadorMejorado(Granada,Estudiantes);
        int granada = MarcadorMejorado.CANASTA_LOCAL;
        int estudiante = MarcadorMejorado.CANASTA_VISITANTE;
        int triple= MarcadorMejorado.TRIPLE;
        int tirolibre= MarcadorMejorado.TIRO_LIBRE;
        int tironormal= MarcadorMejorado.NORMAL;
        
        m.anotarCanasta(estudiante,tironormal);
        m.anotarCanasta(granada,triple);
        m.anotarCanasta(estudiante,tironormal);
        m.anotarCanasta(granada,tironormal);
        m.anotarCanasta(granada,triple);
        m.anotarCanasta(estudiante,tirolibre);
        m.anotarCanasta(estudiante,triple);
        m.anotarCanasta(granada,tironormal);
        
        System.out.println("El marcador es de "+m.getPuntosLocal()+" puntos "+
                "para el equipo de "+m.getNombreLocal()+" y de "+
                m.getPuntosVisitante()+" puntos para los "+
                m.getNombreVisitante()+".");
        System.out.println("Ganando: "+m.getNombreEquipoGanador());
        System.out.println("Perdiendo: "+m.getNombreEquipoPerdedor());
        
        
        
        
    }
    
}
