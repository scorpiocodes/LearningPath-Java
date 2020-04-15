package polymorphism;

/**
 *
 * @author scorpiocodes
 */

class A {
    void sum() {
        System.out.println(10);
    }
}
    
class B extends A {
    @Override
    void sum() {
        System.out.println(15);
    }
}

class C extends A {
    @Override
    void sum() {
        System.out.println(20);
    }
}

class D extends A {
    
}


public class dynamicpolymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        A a;
        a = new B();
        a.sum();
        a = new C();
        a.sum();
        a = new D();
        a.sum();
    }

}
