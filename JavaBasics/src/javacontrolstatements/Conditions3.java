/**
 *
 * @author scorpiocodes
 */

package javacontrolstatements;

import java.util.Scanner;

//This program illustrates an example for if-else-if

public class Conditions3 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any of the following commands:");
        System.out.println("L : Left");
        System.out.println("R : Right");
        System.out.println("U : U-turn");
        char command = s.next().charAt(0);
        if(Character.toUpperCase(command) == 'L')
            System.out.println("Turn Left");
        else if(Character.toUpperCase(command) == 'R')
            System.out.println("Turn Right");
        else if(Character.toUpperCase(command) == 'U')
            System.out.println("Take U-turn");
    }
    
}
