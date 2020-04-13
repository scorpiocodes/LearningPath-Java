package keywords;

/**
 *
 * @author scorpiocodes
 */

class student
{
    private String name;
    private int rollNo;
    public static String SchoolName;
    
    student(String name,int rollNo)
    {
        this.name = name;
        this.rollNo = rollNo;
    }
    
    static {
        
        SchoolName = "chs";
    }
    
    public static void information()
    {
        System.out.println("Best School");
    }
}
public class staticexample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        student s = new student("John", 26);
        System.out.println(student.SchoolName);
    }

}
