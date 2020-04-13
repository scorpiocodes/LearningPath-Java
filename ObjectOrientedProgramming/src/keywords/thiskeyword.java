package keywords;

/**
 *
 * @author scorpiocodes
 */
class test {
    String name;
    test(String name)
    {
        this.name = name;
    }
    
    String getName(){
        return name;
    }
}
public class thiskeyword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        test t = new test("nani");
        System.out.println(t.getName());
    }

}
