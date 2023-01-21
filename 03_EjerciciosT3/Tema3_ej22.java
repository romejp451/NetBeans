package tema3_ej22;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema3_ej22 {
    public static void main(String[] args) {

        ArrayList alumnos = new ArrayList();
        boolean continua = true;
        int num;
        double media1=(9+5+4+3)/4, media2=(4+8+6+5)/4, media3=(2+5+10+2)/4,
                media4=5/4, media5=(10+10+10+9)/4;
        alumnos.add("Pepe \nProgramacion: 9. \nBase de Datos: 5. "
                + "\nSistemas: 4. \nFOL: 3.");
        alumnos.add("Ana \nProgramacion: 4. \nBase de Datos: 8. "
                + "\nSistemas: 6. \nFOL: 5.");
        alumnos.add("Juan \nProgramacion: 2. \nBase de Datos: 5. "
                + "\nSistemas: 10. \nFOL: 2.");
        alumnos.add("Guillermo \nProgramacion: 0. \nBase de Datos: 0. "
                + "\nSistemas: 5. \nFOL: 0.");
        alumnos.add("Roberta \nProgramacion: 10. \nBase de Datos: 10. "
                + "\nSistemas: 10. \nFOL: 9.");
        
        while(continua){
            System.out.println("Dime el el numero de alumno que quieres que te muestre:");
            System.out.println("1. Pepe");
            System.out.println("2. Ana");
            System.out.println("3. Juan");
            System.out.println("4. Guillermo");
            System.out.println("5. Roberta");
            num = new Scanner (System.in). nextInt();
            switch(num){
                case 1:
                    System.out.println(alumnos.get((num)-1)+" \nY su nota media de las asignaturas es de "+media1);
                    break;
                case 2:
                    System.out.println(alumnos.get((num)-1)+" \nY su nota media de las asignaturas es de "+media2);
                    break;
                case 3:
                    System.out.println(alumnos.get((num)-1)+" \nY su nota media de las asignaturas es de "+media3);
                    break;
                case 4:
                    System.out.println(alumnos.get((num)-1)+" \nY su nota media de las asignaturas es de "+media4);
                    break;
                case 5:
                    System.out.println(alumnos.get((num)-1)+" \nY su nota media de las asignaturas es de "+media5);
                    break;
                default:
                    System.out.println("El numero que introdujo no esta entre los alumnos");
            }
            continua=false;   
            
        }
        
        
    }
    
}
