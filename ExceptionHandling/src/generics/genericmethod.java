package generics;

/**
 *
 * @author scorpiocodes
 */
public class genericmethod {

    public static <T> void demo(T[] a){
       for(T i: a){
           System.out.println(i);
       }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] arr = {1,2,5,3,3,3,5,6,0};
        demo(arr);
        String[] str = {"harsh","ravi","manan"};
        demo(str);
    }

}
