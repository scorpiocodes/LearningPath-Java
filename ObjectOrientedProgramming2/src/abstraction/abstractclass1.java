package abstraction;

/**
 *
 * @author scorpiocodes
 */

abstract class person {
    void display() {
        System.out.println("Hello World!");
    }
}

class me extends person {
    
}

public class abstractclass1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        me m = new me();
        m.display();
    }

}
