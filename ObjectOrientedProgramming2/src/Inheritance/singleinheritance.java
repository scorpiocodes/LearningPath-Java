package Inheritance;

/**
 *
 * @author scorpiocodes
 */

class school {
    String name;
    
    school()
    {
        name = "chs";
    }
}

class student extends school {
    String sname;
    int rollno;

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getSname() {
        return sname;
    }

    public int getRollno() {
        return rollno;
    }
}
public class singleinheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        student s = new student();
        s.setSname("harshith");
        s.setRollno(26);
        
        System.out.println(s.getSname());
        System.out.println(s.getRollno());
        System.out.println(s.name);
    }

}
