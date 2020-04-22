package wrapperclasses;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author scorpiocodes
 */
public class boxing {
    
    public static int evenNumberSum(List<Integer> list){
        int sum=0;
        for(Integer i: list){
            if(i%2==0){
                sum += i;
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Integer> list = new ArrayList();
        
        for(int i=0;i<10;i++){
            list.add(i);
        }
        
        int res = evenNumberSum(list);
        
        System.out.println(res);
    }

}
