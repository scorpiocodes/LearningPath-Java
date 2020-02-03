/**
 *
 * @author scorpiocodes
 */

package javacontrolstatements;

import java.util.Scanner;

//This program illustrates an example for switch

public class Conditions4 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two positive integers:");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("Choose the operation to be performed:");
        System.out.println("1 : Addition");
        System.out.println("2 : Substraction");
        System.out.println("3 : Multiplication");
        System.out.println("4 : Division");
        System.out.println("Enter your choice:");
        int choice = s.nextInt();
        
        switch(choice){
            case 1: System.out.println("Sum is : "+(a+b));
                    break;
            case 2: System.out.println("Difference is : "+ Math.abs(a-b));
                    break;
            case 3: System.out.println("Product is : "+(a*b));
                    break;       
            case 4: System.out.println("Division result is : "+ Math.abs(a/b));
                    break;        
            default: System.out.println("Please select valid operation");
        }
    }
}
    