package generics;

/**
 *
 * @author scorpiocodes
 */

class example<T> {
    T i;

    public void setI(T i) {
        this.i = i;
    }

    public T getI() {
        return i;
    }
    
}


public class genericclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        example<Integer> e = new example<>();
        example<String> e1 = new example<>();
        
        e.setI(10);
        System.out.println(e.getI());
        e1.setI("java");
        System.out.println(e1.getI());
        
    }

}
