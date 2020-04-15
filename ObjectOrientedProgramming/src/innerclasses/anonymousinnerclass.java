package innerclasses;

/**
 *
 * @author scorpiocodes
 */

class Animal {
    void eat(){
        System.out.println("Animal eats something.");
    }
    
    void color(){
        System.out.println("color of animal.");
    }
}

class Lion{
    Animal a = new Animal() {
        @Override
        void eat(){
            System.out.println("Lion eats meat.");
        }
    };
}
public class anonymousinnerclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lion l = new Lion();
        l.a.eat();
        l.a.color();
    }

}
