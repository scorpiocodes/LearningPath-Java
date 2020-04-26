package collections;

/**
 *
 * @author scorpiocodes
 */
import java.util.Iterator;
import java.util.Stack;

public class stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Stack s = new Stack();
        s.push(12);
        s.push(23);
        s.push(8756);
        
        s.pop();
        Iterator it = s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }

}
