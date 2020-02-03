/**
 *
 * @author scorpiocodes
 */

package javacontrolstatements;

import java.util.Scanner;

//This program illustrates an example for if-else

public class Conditions2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = s.nextInt();
        if(age>18){
            System.out.println("You are eligible to vote.");
        }
        else{
            System.out.println("You are not eligible to vote.");
        }
    }
    
}
