package javaarrays;

/**
 *
 * @author scorpiocodes
 */

import java.util.Arrays;

public class arrays2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arr[] = {1,4,56,3535,5465,324};
        
        Arrays.sort(arr);
        
        System.out.println("Sorted array:");
        for(int i:arr){
            System.out.println(i);
        }
            
        int res = Arrays.binarySearch(arr, 324);
        System.out.println("answer is at position: "+ res);
        }
    }
