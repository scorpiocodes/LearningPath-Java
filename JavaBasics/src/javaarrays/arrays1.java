package javaarrays;

/**
 *
 * @author scorpiocodes
 */
import java.util.Scanner;

public class arrays1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        int a[] = new int[5];
        
        Scanner s = new Scanner(System.in);
        
        for(int i=0;i<a.length;i++){
            System.out.println("Enter "+ (i+1) +"th number:");
            a[i] = s.nextInt();
        }
        
        
        System.out.println("Numbers in the array are:");
        for(int i:a){
            System.out.println(i);
        }
    }

}
