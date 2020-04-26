package collections;
/**
 *
 * @author scorpiocodes
 */
import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList list = new ArrayList();
        list.add("Java");
        list.add("C");
        list.add("Ruby");
        list.add("Python");
        list.add("C++");
        System.out.println(list.size());
        for(Object i:list){
            System.out.println(i);
        }
        
        System.out.print("\n\n\n\n\n\n");
        list.add(2,"COBOL");
        System.out.println(list.size());
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }

}
