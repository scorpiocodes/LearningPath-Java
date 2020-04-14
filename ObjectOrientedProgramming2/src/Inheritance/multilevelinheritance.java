package Inheritance;

/**
 *
 * @author scorpiocodes
 */
class school1 {
    String name;
    
    school1()
    {
        name = "chs";
    }
}

class student1 extends school1 {
    String sname = "harshith";
    int rollno = 26;
}

class parents extends student1 {
    String fathername = "ramana";
    String mothername = "laxmi";
}

public class multilevelinheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        parents p = new parents();
        System.out.println(p.name);
    }

}
