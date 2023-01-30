package tema4_ej01;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class DNI {
    private int num;
    private char letra;
    private String completo;
    
    DNI(int numeros, char letras){
        num=numeros;
        letra=letras;
    };
    DNI(String dni){
        String aux;
        completo = dni;
        letra = dni.charAt((dni.length()-1));
        aux = dni.substring(0, 7);
        num = Integer.parseInt(aux);
    };
    
    //GETTERS
    public int getNumDNI(){
        return num;
    };
    public char getLetraDNI(){
        return letra;
    };
    @Override
    public String toString(){
        return completo;
    };
}
