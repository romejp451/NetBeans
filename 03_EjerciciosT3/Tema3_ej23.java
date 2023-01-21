package tema3_ej23;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema3_ej23 {
    public static void main(String[] args) {
        boolean continua = true;
        int contador, num, posicion;
        ArrayList lista = new ArrayList();
        String frase, comprobacion;
        
        
        while(continua){
            System.out.println("Menu; ");
            System.out.println("1. Añadir mensaje a la lista");
            System.out.println("2. Consultar el numero de mensaje de la lista");
            System.out.println("3. Consultar mmensaje");
            System.out.println("4. Comprobar mmensaje");
            System.out.println("5. Consultar todos los mensajes");
            System.out.println("6. Borrar toda la lista");
            System.out.println("7. Salir");
            num = new Scanner (System.in). nextInt();
            
            switch(num){
                case 1:
                    System.out.println("Introduzca una frase");
                    frase = new Scanner (System.in). nextLine();
                    lista.add(frase);
                    break;
                case 2: 
                    System.out.println("EL numero total de elementos de la lista "
                            + "es de "+lista.size());
                    break;
                case 3:
                    if(lista.size()==0){
                        System.out.println("La lista no tiene ningun elemento "
                                + "introducido");
                    }
                    else{
                        System.out.println("En que posicion esta el mensaje que"
                                + " quiere que se muestre, tenemos mensajes desde "
                                + "la posicion 0 hasta "+((lista.size())-1));
                        posicion = new Scanner (System.in). nextInt();
                        if(posicion<0 || posicion>lista.size()){
                            System.out.println("El numero introducido no entra "
                                    + "dentro de el limite que le explique");
                        }
                        else{
                            System.out.println("El mensaje que pidio es : "
                                    + "\n"+lista.get(posicion));
                        }                    
                    }
                    break;
                case 4:
                    System.out.println("Dime el mensaje que quieres que compruebe");
                    comprobacion = new Scanner (System.in). nextLine();
                    if(lista.contains(comprobacion)){
                        System.out.println("El mensaje que introdujiste se encuentra "
                                + "en la lista y esta en la poscicion: "
                                +lista.indexOf(comprobacion));
                    }
                    else{
                        System.out.println("El mensaje que pusiste no se encuentra en la lista");
                    }
                    break;
                case 5: 
                    for(int x=0; x<lista.size(); x++){
                        System.out.println("El mensaje de la posicion "+x+" es: "+lista.get(x));
                    }
                    break;
                case 6:
                    for(int x=0; x<lista.size(); x++){
                        lista.remove(x);
                    }
                    break;
                case 7:
                    continua=false;
                    break;
                default:
                    System.out.println("El numero que introdujo no encaja.");
            }
        }
        System.out.println("Programa terminado");
    }
    
}
