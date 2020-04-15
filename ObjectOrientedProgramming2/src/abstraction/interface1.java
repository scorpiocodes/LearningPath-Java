package abstraction;

/**
 *
 * @author scorpiocodes
 */

interface Animal {
    //by default public static final
    void eat();
    void color();
    void weight();
}

class Lion implements Animal {
    @Override
    public void eat(){
        System.out.println("Lion eats meat.");
    }
    
    @Override
    public void color() {
        System.out.println("Lion is brown.");
    }
    
    @Override
    public void weight() {
        System.out.println("Lion weight is 100KG.");
    }
}
public class interface1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lion l = new Lion();
        l.eat();l.color();l.weight();
    }

}
