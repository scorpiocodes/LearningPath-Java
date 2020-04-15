package innerclasses;

/**
 *
 * @author scorpiocodes
 */
class OuterClass {
    class InnerClass {
        void f1(){
            System.out.println("Inner Class.");
        }
    }
}

public class innerclasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OuterClass out = new OuterClass();
        OuterClass.InnerClass in = out.new InnerClass();
        in.f1();
    }

}
