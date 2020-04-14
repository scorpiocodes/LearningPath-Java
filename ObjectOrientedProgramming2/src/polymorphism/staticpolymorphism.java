package polymorphism;

/**
 *
 * @author scorpiocodes
 */

class arithmetic
{
    int add(int a, int b){
        return a+b;
    }
     
    int add(int a, int b, int c){
        return a+b+c;
    }
}
public class staticpolymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        arithmetic ar = new arithmetic();
        System.out.println(ar.add(1,2));
    }

}
