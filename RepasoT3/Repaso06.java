package repaso06;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Repaso06 {
    public static void main(String[] args) {
        
        for(int x=0; x<=100; x++){
            
            if(x%3==0 && x%5==0){
                System.out.print(" tres-cinco ");
            }else{
                if(x%5==0){
                    System.out.print(" cinco ");
                }else{
                    if(x%3==0){
                        System.out.print(" tres ");    
                    }else{
                        System.out.print(x+" ");
                    }
                }
            }
        }
    }
    
}
