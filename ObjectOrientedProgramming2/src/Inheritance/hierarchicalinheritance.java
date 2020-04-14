package Inheritance;

/**
 *
 * @author scorpiocodes
 */
class school2 {
    String name;
    
    school2()
    {
        name = "chs";
    }
}

class student2 extends school2 {
    String sname = "harsh";
    int rollno = 26;
}

class teacher extends school2 {
    String teachername = "John";
    int salary = 3000;
}
public class hierarchicalinheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student2 s = new student2();
        teacher t = new teacher();
        
        System.out.println(s.sname);
        System.out.println(s.name);
        System.out.println(t.teachername);
        System.out.println(t.name);
        System.out.println(t.salary);
        
    }

}
