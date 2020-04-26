package collections;

/**
 *
 * @author scorpiocodes
 */
import java.util.Iterator;
import java.util.Vector;

public class vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vector<Integer> list = new Vector<Integer>(30);
        list.add(67);
        list.add(7465);
        list.add(43);
        
        
        System.out.println(list.size());
        System.out.println(list.capacity());
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }

}
