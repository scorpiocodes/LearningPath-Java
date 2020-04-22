package javaarrays;

/**
 *
 * @author scorpiocodes
 */

import java.util.Scanner;

public class arrays3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        int [][]a = new int[2][2];
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.println("Enter "+i+","+j+" element of array:");
                a[i][j] = s.nextInt();
            }
        }
        
        System.out.println("The matrix is:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        
        
    }

}
