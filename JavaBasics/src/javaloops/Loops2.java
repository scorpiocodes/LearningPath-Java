/**
 *
 * @author scorpiocodes
 */

package javaloops;

import java.util.Scanner;

//This program illustrates an example for while-loop

public class Loops2{
    
    public static void main(String args[]){
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number < 20:");
        int number = s.nextInt();
        System.out.println("Printing numbers from "+number+" to 1:");
        while(number!=0)
        {
            System.out.println(number);
            number--;
        }
    }
}
