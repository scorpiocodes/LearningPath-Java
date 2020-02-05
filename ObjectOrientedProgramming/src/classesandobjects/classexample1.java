/**
 *
 * @author scorpiocodes
 */

package classesandobjects;

public class classexample1 {
    
    int a=9,b=10;
    
    public void printvalues() {
        System.out.println("Value of a : "+a+" & b : "+b);
    }
    
    public static void main(String args[]) {
        classexample1 c = new classexample1();
        c.printvalues();
    }
}