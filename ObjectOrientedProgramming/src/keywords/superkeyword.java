package keywords;

/**
 *
 * @author scorpiocodes
 */
class A {
    public String name = "john";
}

class B extends A {
    public String name = "nani";
    
    public void display()
    {
        System.out.println(super.name);
    }
}
public class superkeyword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        B b1 = new B();
        b1.display();
    }

}
