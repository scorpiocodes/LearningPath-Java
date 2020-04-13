package keywords;

/**
 *
 * @author scorpiocodes
 */

class demo
{
    public final String name = "nani";
}
public class finalkeyword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        demo d = new demo();
        System.out.println(d.name);
        //d.name = "john"; // this is an error
    }

}
