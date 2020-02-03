/**
 *
 * @author scorpiocodes
 */

package javaloops;

import java.util.Scanner;

//This program illustrates an example for for-loop

public class Loops1{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        int n = s.nextInt();
        System.out.println("Printing natural numbers upto "+ n);
        for(int i=1;i<=n;i++)
            System.out.println(i);
    }
}