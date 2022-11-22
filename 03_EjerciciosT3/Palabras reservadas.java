package pruebas2.pkg0;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Pruebas20 {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        lista.add("abstract");
        lista.add("continue");
        lista.add("for");
        lista.add("new");
        lista.add("switch");
        lista.add("assert");
        lista.add("default");
        lista.add("goto");
        lista.add("package");
        lista.add("synchronized");
        lista.add("boolean");
        lista.add("do");
        lista.add("if");
        lista.add("private");
        lista.add("this");
        lista.add("break");
        lista.add("double");
        lista.add("implements");
        lista.add("protected");
        lista.add("throws");
        lista.add("byte");
        lista.add("else");
        lista.add("import");
        lista.add("public");
        lista.add("thows");
        lista.add("case");
        lista.add("enum");
        lista.add("instanceof");
        lista.add("return");
        lista.add("transient");
        lista.add("catch");
        lista.add("extends");
        lista.add("int");
        lista.add("short");
        lista.add("try");
        lista.add("char");
        lista.add("final");
        lista.add("interface");
        lista.add("static");
        lista.add("void");
        lista.add("class");
        lista.add("finally");
        lista.add("long");
        lista.add("strictfp");
        lista.add("volatile");
        lista.add("const");
        lista.add("abstract");
        lista.add("float");
        lista.add("native");
        lista.add("super");
        lista.add("while");
        
        
        String java = JOptionPane.showInputDialog("Ingrese las palabras reservadas de java y cuando haya acertado las 50 palabras pulse enter: ");
        while (lista.size() != 1){
            if(lista.contains(java)){
                lista.remove(java);
            }else{
                JOptionPane.showMessageDialog(null, "La palabra que pusiste no es una palabra reservada o se ha repetido");
            }
        java = JOptionPane.showInputDialog("Ingrese otra palabra reservadas de java: ");
    }if (lista.size() ==1){
        JOptionPane.showMessageDialog(null, "Ya lo has conseguido campeón");
        }
    }
}
