/**
 *
 * @author scorpiocodes
 */

package javaloops;

import java.util.Scanner;

//This program illustrates an example for do-while-loop

public class Loops3 {
    
    public static void main(String args[]) {
        
        Scanner s = new Scanner(System.in);
        do
        {
            System.out.println("Enter two positive integers:");
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println("Choose the operation to be performed:");
            System.out.println("1 : Addition");
            System.out.println("2 : Substraction");
            System.out.println("3 : Multiplication");
            System.out.println("4 : Division");
            System.out.println("5 : Exit");
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
            case 5: System.exit(0);
            default: System.out.println("Please select valid operation");
        }
        }while(true);
    }
}