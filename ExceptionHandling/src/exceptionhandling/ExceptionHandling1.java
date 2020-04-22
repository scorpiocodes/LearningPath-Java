package exceptionhandling;

/**
 *
 * @author scorpiocodes
 */
public class ExceptionHandling1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 10;
        try{
            int b = a/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }

}
