package repaso05;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Repaso05 {
    public static void main(String[] args) {
         int n1=0,n2=1,n3;
         
        System.out.print(n1+" "+n2);
        for(int i=2;i<50;i++) {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
        }
    }
}

