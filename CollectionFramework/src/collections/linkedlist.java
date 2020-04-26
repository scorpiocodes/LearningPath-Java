package collections;
/**
 *
 * @author scorpiocodes
 */
import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList list = new LinkedList();
        list.add("Java");
        list.add("Python");
        list.addFirst("C");
        list.addLast("GO");
        list.add(2,"PHP");
        
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
